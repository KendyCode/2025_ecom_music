package org.ldv.music_ecom.service


import org.ldv.music_ecom.model.dao.ExplicitLyricDAO
import org.ldv.music_ecom.model.dao.GenreDAO
import org.ldv.music_ecom.model.dao.OrderDAO
import org.ldv.music_ecom.model.dao.PersonDAO
import org.ldv.music_ecom.model.dao.ProductDAO
import org.ldv.music_ecom.model.dao.ProjectDAO
import org.ldv.music_ecom.model.dao.RoleDAO
import org.ldv.music_ecom.model.dao.TrackDAO
import org.ldv.music_ecom.model.dao.UserDAO
import org.ldv.music_ecom.model.entity.User
import org.springframework.boot.CommandLineRunner
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import kotlin.Int

@Component
class DataInitializerComponent (
    val explicitLyricDAO : ExplicitLyricDAO,
    val genreDAO: GenreDAO,
    val orderDAO: OrderDAO,
    val personDAO: PersonDAO,
    val productDAO: ProductDAO,
    val projectDAO: ProjectDAO,
    val roleDAO: RoleDAO,
    val trackDAO: TrackDAO,
    val userDAO: UserDAO,
    val passwordEncoder: PasswordEncoder) : CommandLineRunner{
    override fun run(vararg args: String?) {
        val admin = User(
            id = null,
            password = passwordEncoder.encode("admin123"), // mot de passe hashé
            email = "admin@admin.com",
            isAdmin = true,
            adress = "Rue du couchant",
            nom = "Super",
            prenom = "Admin")

        val client = User(
            id = null,
            password = passwordEncoder.encode("client123"), // mot de passe hashé
            email = "client@client.com",
            isAdmin = false,
            adress = "Boulevard Saint Léonard",
            nom = "Jean",
            prenom = "Client",


        )

        userDAO.saveAll(listOf(admin, client))















    }




}