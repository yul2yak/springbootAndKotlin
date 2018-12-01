package com.yul2ya.ykaChaos.controller

import main.kotlin.htmlBuilder.*
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RandomController {

    @GetMapping("/random")
    fun random(): String {
        val result = "<html>" +
                "<head><title>yka chaos</title></head>" +
                "<body>" +
                "<button name='button' type='button'>버튼입니다</button>" +
                "</body>" +
                "</html>"
        return result
    }
}