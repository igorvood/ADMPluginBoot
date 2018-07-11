package ru.vood.admplugin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer

@SpringBootApplication
@EnableCaching
@PropertySource("classpath:DBProperty.properties")
open class AdmpluginApplication{
    @Bean
    fun configurer(): PropertySourcesPlaceholderConfigurer {
        return PropertySourcesPlaceholderConfigurer()
    }

}

fun main(args: Array<String>) {
    runApplication<AdmpluginApplication>(*args)

}
