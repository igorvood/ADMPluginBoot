package ru.vood.admplugin.admPlugin.generateCode.impl.intf.addingImport

import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity

interface AddAnyClassService {
    fun getFullNameClass(entity: VBdObjectEntity): String
    fun getCode(entity: VBdObjectEntity): String
}
