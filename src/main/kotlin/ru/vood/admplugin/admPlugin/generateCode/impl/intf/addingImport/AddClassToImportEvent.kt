package ru.vood.admplugin.admPlugin.generateCode.impl.intf.addingImport

import ru.vood.admplugin.admPlugin.generateCode.impl.intf.addingImport.Message.AddImportEvent

@Deprecated("fdsadasd")
interface AddClassToImportEvent {
    fun sendMessage(msg: AddImportEvent) {
        msg.fullNameClass
        println("AddClassToImportEvent.sendMessage    -> TODO(not implemented) ${msg.fullNameClass}")
    }
}