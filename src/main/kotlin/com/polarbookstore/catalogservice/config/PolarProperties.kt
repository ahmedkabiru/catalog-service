package com.polarbookstore.catalogservice.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "polar")
class PolarProperties {

    lateinit var greeting:String
}