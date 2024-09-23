package com.polarbookstore.catalogservice.web

import com.polarbookstore.catalogservice.config.PolarProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(private val polarProperties: PolarProperties) {


    @GetMapping("/")
    fun welcome(): String{
        return polarProperties.greeting
    }
}