package ru.vood.admplugin.admPlugin.generateCode.impl.intf.addingImport.Message

import org.springframework.context.ApplicationListener

@Deprecated(message = "Class для тестов")
class AddImportEventListener : ApplicationListener<AddImportEvent> {

    override fun onApplicationEvent(event: AddImportEvent) {

        val msgEvt = event
        //println("Received: " + msgEvt.getMessage())
    }
}