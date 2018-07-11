package ru.vood.admplugin.admPlugin.generateCode.impl.intf

import ru.vood.admplugin.admPlugin.generateCode.impl.TypeOfGenClass
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity

interface GenAnyPartKT<Q : VBdObjectEntity> {

    fun genCode(entity: Q, typeOfGenClass: TypeOfGenClass = TypeOfGenClass.ENTITY_CLASS): StringBuilder = genCode()

    fun genCode(): StringBuilder {
        return StringBuilder()
    }

}