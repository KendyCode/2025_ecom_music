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
import org.ldv.music_ecom.model.entity.Genre
import org.ldv.music_ecom.model.entity.User
import org.springframework.boot.CommandLineRunner
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import kotlin.Int

@Component
class DataInitializerComponent (
//    val passwordEncoder: PasswordEncoder,
    val explicitLyricDAO : ExplicitLyricDAO,
    val genreDAO: GenreDAO,
    val orderDAO: OrderDAO,
    val personDAO: PersonDAO,
    val productDAO: ProductDAO,
    val projectDAO: ProjectDAO,
    val roleDAO: RoleDAO,
    val trackDAO: TrackDAO,
    val userDAO: UserDAO,
    ) : CommandLineRunner{
    override fun run(vararg args: String?) {
//        val admin = User(
//            id = null,
//            password = passwordEncoder.encode("admin123"), // mot de passe hashé
//            email = "admin@admin.com",
//            isAdmin = true,
//            adress = "Rue du couchant",
//            name = "Super",
//            firstName = "Admin")
//
//        val client = User(
//            id = null,
//            password = passwordEncoder.encode("client123"), // mot de passe hashé
//            email = "client@client.com",
//            isAdmin = false,
//            adress = "Boulevard Saint Léonard",
//            name = "Jean",
//            firstName = "Client",
//
//
//        )
//
//        userDAO.saveAll(listOf(admin, client))

        val genreRap = Genre(
            pictureBaseUrl = "https://cdn-images.dzcdn.net//images//misc//5c27115d3b797954afff59199dad98d1//1000x1000-000000-80-0-0.jpg",
            description = "C'est le best",
            title = "Rap"
        )

        genreDAO.save(genreRap)

















    }




}