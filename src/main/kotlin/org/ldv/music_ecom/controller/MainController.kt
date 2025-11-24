package org.ldv.music_ecom.controller

//import ch.qos.logback.core.model.Model
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.ui.Model

@Controller
class MainController {
    /**
     * Méthode permettant d'afficher la page d'accueil de l'application.
     * @return le chemin vers le template a partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/music_ecom")
    fun home():String{
        return "index"
    }

    @GetMapping("/test_produits")
    fun produits():String{
        return "pagesVisiteur/test_produits"
    }

//    @GetMapping("/music_ecom/login")
//    fun login(@RequestParam error: Boolean?, model: Model): String {
//        // Ajoute un attribut "error" au modèle si la requête contient une erreur
//        model.addAttribute("error", error == true)
//        return "pagesVisiteur/login"
//    }
//
//
//
//    @GetMapping("/music_ecom/profile")
//    fun profile(authentication: Authentication): String {
//
//        // Récupération des rôles (authorities) de l’utilisateur connecté
//        val roles = authentication.authorities.map { it.authority }
//
//        // Si l'utilisateur est admin → redirection
//        if ("ROLE_ADMIN" in roles) {
//            return "redirect:/music_ecom/admin/dashboard"
//        }
//
//        // Sinon → on affiche la page profile
//        return "pagesClient/profile"
//    }






}