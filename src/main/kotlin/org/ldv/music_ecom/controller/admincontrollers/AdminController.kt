package org.ldv.music_ecom.controller.admincontrollers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController {
    @GetMapping("/music_ecom/admin/dashboard")
    fun home(): String {
        return "pageAdmin/dashboard"
    }


}