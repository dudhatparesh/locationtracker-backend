package com.enggdream.test.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class DemoController {
    @GetMapping("/")
    fun indexPage(): String {
        return "index"
    }
    @GetMapping("/track")
    fun track(): String{
        return "track"
    }
}