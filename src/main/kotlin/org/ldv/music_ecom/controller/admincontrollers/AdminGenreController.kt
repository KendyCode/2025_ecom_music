package org.ldv.music_ecom.controller.admincontrollers

import org.ldv.music_ecom.model.dao.GenreDAO
import org.ldv.music_ecom.model.entity.Genre
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class AdminGenreController(val genreDAO: GenreDAO) {
    @GetMapping("music-ecom/admin/genres")
    fun index(model: Model) : String{
        var genresList = genreDAO.findAll()
        model.addAttribute("genres",genresList)

        return "pagesAdmin/genre/indexGenre"


    }
    @GetMapping("music-ecom/admin/genres/{id}")
    fun show(@PathVariable id:Int, model:Model):String{
        val aGenre = genreDAO.findById(id).orElseThrow()
        model.addAttribute("genre",aGenre)
        return "pagesAdmin/genre/showGenre"
    }

    @GetMapping("music-ecom/admin/genres/create")
    fun create(model:Model): String{
        var newGenre = Genre(title = "", description = "", pictureBaseUrl = "")
        return "pagesAdmin/genre/showGenre"

    }



}