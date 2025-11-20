package org.ldv.music_ecom.service

import org.ldv.music_ecom.model.dao.UserDAO
import org.springframework.security.core.userdetails.User

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service


@Service
class MyUserDetailsService(private val userDAO: UserDAO) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        val user = userDAO.findByEmail(username)
            ?: throw UsernameNotFoundException("User not found")


        var leRole= ""
        if (user.isAdmin == true){
             leRole = "ADMIN"
        }
        else{
             leRole = "USER"
        }

        val passwordEncoder = BCryptPasswordEncoder()
        val rawPassword = user.password
        val encodedPassword = passwordEncoder.encode(rawPassword)

        val userDetails: UserDetails =
            User.withUsername(user.email)         // .withUsername()
                .password(encodedPassword)          // .password() (déjà encodé BCrypt!)
                .roles(leRole)            // .roles()
                .build()
        return userDetails
    }

}