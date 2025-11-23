package org.ldv.music_ecom.service

import org.ldv.music_ecom.model.dao.GenreDAO
import org.ldv.music_ecom.model.entity.Genre
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataInitializer (
    private val genreDAO: GenreDAO,
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        // Vérifie si la base contient déjà des données
        if (genreDAO.count() > 0) {
            println("ℹ️ Données déjà présentes, initialisation ignorée.")
            return
        }
        println("🚀 Initialisation des données...")

        val genreRap = Genre(pictureBaseUrl = "https://cdn-images.dzcdn.net//images//misc//5c27115d3b797954afff59199dad98d1//1000x1000-000000-80-0-0.jpg", description = "C'est le best", title = "Rap")

        genreDAO.save(genreRap)

    }

}