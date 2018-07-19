package ru.vood.admplugin.infrastructure.generateCode.impl.createFiles

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import ru.vood.admplugin.infrastructure.generateCode.impl.GenCodeCommonFunctionKT
import ru.vood.admplugin.infrastructure.generateCode.impl.TypeOfGenClass
import ru.vood.admplugin.infrastructure.generateCode.impl.intf.GenAnyPartKT
import ru.vood.admplugin.infrastructure.spring.entity.VBdTableEntity
import java.io.File

@Component
class GeterateFile {

    @Autowired
    @Qualifier("genClassServiceKT")
    lateinit var genAnyPartKT: GenAnyPartKT<VBdTableEntity>

    lateinit var genCodeCommonFunctionKT: GenCodeCommonFunctionKT

    @JvmOverloads
    fun getFile(tableEntity: VBdTableEntity, typeOfGenClass: TypeOfGenClass = TypeOfGenClass.ENTITY_CLASS): File {
        val packageName = genCodeCommonFunctionKT.getPackageName(typeOfGenClass)


        val generatedClass = genAnyPartKT.genCode(tableEntity, typeOfGenClass)

        return File("")
    }

    /*private*/ fun createDirs(packageName: String): File {
        val beginDir = File("C:\\temp\\1")
        //Files.createDirectories()

        val dirs = packageName.replace(".", "\\")// .split(".")
        println(dirs)
        //   dirs.asSequence().reduce { s1, s2-> {} }
        return File("")
    }

}