package org.ldv.music_ecom.controller.admincontrollers

import org.ldv.music_ecom.model.dao.GenreDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminGenreController(val genreDAO: GenreDAO) {
    @GetMapping("music_ecom/admin/genres")
    fun index(model: Model) : String{
        var genresList = genreDAO.findAll()
        model.addAttribute("genres",genresList)

        return "pageAdmin/genre/indexGenre"


    }
}