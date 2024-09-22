package com.polarbookstore.catalogservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {


    @GetMapping("/")
    fun welcome(): String{
        return "Welcome to book catalog service."
    }
}