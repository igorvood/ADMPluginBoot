package ru.vood.admplugin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import ru.vood.admplugin.infrastructure.generateCode.impl.createFiles.GeterateFile

@SpringBootApplication
@EnableCaching
@PropertySource("classpath:DBProperty.properties")
open class AdmpluginApplication{

    lateinit var applicationContext: ApplicationContext

    @Bean
    fun configurer(): PropertySourcesPlaceholderConfigurer {
        return PropertySourcesPlaceholderConfigurer()
    }

    @Autowired
    private fun applicationContextHolder(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext

        println(applicationContext)
        //applicationContext.getBean()
    }


}

fun main(args: Array<String>) {
    val context = runApplication<AdmpluginApplication>(*args)
    val bean = context.getBean(GeterateFile::class.java)
    println(bean)
}
