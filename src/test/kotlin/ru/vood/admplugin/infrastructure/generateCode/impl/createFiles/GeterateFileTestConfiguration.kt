package ru.vood.admplugin.infrastructure.generateCode.impl.createFiles

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("ru.vood.admplugin")
class GeterateFileTestConfiguration {
    @Bean
    fun geterateFile() = GeterateFile()

}