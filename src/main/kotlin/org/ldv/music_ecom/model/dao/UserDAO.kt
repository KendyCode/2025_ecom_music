package org.ldv.music_ecom.model.dao

import org.ldv.music_ecom.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserDAO : JpaRepository<User, Int> {
    @Query("select u from User u where u.email = ?1")
    fun findByEmail(email: String): User
}