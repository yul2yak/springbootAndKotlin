package com.yul2ya.ykaChaos.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController {
    @GetMapping("/")
    fun ykaChaos(model: Model): String {
        model["title"] = "YkaChaos"
        return "메인페이지"
    }
}