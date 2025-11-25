package org.ldv.music_ecom.controller.admincontrollers

import org.ldv.music_ecom.model.dao.GenreDAO
import org.ldv.music_ecom.model.dao.ProjectDAO
import org.ldv.music_ecom.model.entity.Genre
import org.ldv.music_ecom.model.entity.Project
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDate

@Controller
class AdminProjectController(val projectDAO: ProjectDAO, val genreDAO: GenreDAO) {


    @GetMapping("music-ecom/admin/projects")
    fun index(model: Model): String{
        var projectsList = projectDAO.findAll()
        model.addAttribute("projects",projectsList)

        return "pagesAdmin/project/indexProject.html"
    }



    @GetMapping("music-ecom/admin/projects/create")
    fun create(model:Model): String{
        var newProject = Project(title = "Sincerly", coverBaseUrl = "url", explicitLyric = true, description = "mucha", realeaseDate = LocalDate.of(2025, 11, 25))
        var genres = genreDAO.findAll()
        model.addAttribute("genres",genres)
        model.addAttribute("project",newProject)

        return "pagesAdmin/project/createProject"

    }
}