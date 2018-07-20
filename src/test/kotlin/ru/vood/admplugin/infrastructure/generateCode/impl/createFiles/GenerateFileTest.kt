package ru.vood.admplugin.infrastructure.generateCode.impl.createFiles

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import ru.vood.admplugin.infrastructure.generateCode.impl.GenCodeCommonFunctionKT
import ru.vood.admplugin.infrastructure.generateCode.impl.TypeOfGenClass
import ru.vood.admplugin.infrastructure.generateCode.impl.intf.GenAnyPartKT
import ru.vood.admplugin.infrastructure.spring.entity.VBdTableEntity

@RunWith(SpringRunner::class)

class GenerateFileTest {


    @MockBean
    lateinit var genCodeCommonFunctionKT: GenCodeCommonFunctionKT

    @MockBean
    lateinit var genAnyPartKT: GenAnyPartKT<VBdTableEntity>


    @Test
    fun createDirs() {
        val vBdTableEntity = VBdTableEntity()
        vBdTableEntity.code = "TTT_QQQ"

        Mockito.`when`(genAnyPartKT.genCode(vBdTableEntity, TypeOfGenClass.ENTITY_CLASS)).thenReturn(StringBuilder("this is code"))
        Mockito.`when`(genCodeCommonFunctionKT.getPackageName(TypeOfGenClass.ENTITY_CLASS)).thenReturn(StringBuilder("ru.vood." + TypeOfGenClass.ENTITY_CLASS))
        Mockito.`when`(genCodeCommonFunctionKT.getClassName(vBdTableEntity, TypeOfGenClass.ENTITY_CLASS)).thenReturn(StringBuilder("TTT_QQQ.kt"))

        val generateFile = GenerateFile(genAnyPartKT, genCodeCommonFunctionKT)
        generateFile.getFile(vBdTableEntity)
    }
}

