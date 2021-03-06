package ru.vood.admplugin.infrastructure.generateCode.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import ru.vood.admplugin.infrastructure.generateCode.impl.intf.GenAnnotationClassServiceKT
import ru.vood.admplugin.infrastructure.generateCode.impl.intf.GenAnyPartKT
import ru.vood.admplugin.infrastructure.generateCode.impl.intf.GenClassBodyServiceKT
import ru.vood.admplugin.infrastructure.generateCode.impl.intf.GenImportServiceKT
import ru.vood.admplugin.infrastructure.spring.entity.VBdObjectEntity
import ru.vood.admplugin.infrastructure.spring.entity.VBdTableEntity

@Component
class GenClassServiceKT(@Autowired
                        val commonFunction: GenCodeCommonFunctionKT,

                        @Autowired
                        @Qualifier("genPackageImplKT")
                        val genPackageImpl: GenAnyPartKT<VBdObjectEntity>,

                        @Autowired
                        val genImportService: GenImportServiceKT,

                        @Autowired
                        val classBodyService: GenClassBodyServiceKT,

                        @Autowired
                        val genAnnotationClassService: GenAnnotationClassServiceKT) : GenAnyPartKT<VBdTableEntity> {


    override fun genCode(entity: VBdTableEntity, typeOfGenClass: TypeOfGenClass): StringBuilder {
        val code = StringBuilder()

        code.append(genPackageImpl!!.genCode(entity, typeOfGenClass))

        val annotationClass = genAnnotationClassService.genCode(entity, typeOfGenClass)

        val clazz = "/*Наименование класса - ${entity.name}*/\n" +
                "open class " + commonFunction.getClassName(entity, typeOfGenClass) + commonFunction.getExtendsClassName(entity, typeOfGenClass)

        val body = classBodyService.genCode(entity, typeOfGenClass)

        val import = genImportService.genCode(entity, typeOfGenClass)

        code.append(import)
        code.append(annotationClass)
        code.append(clazz)
        code.append("{\n").append(body).append("}")

        return code
    }

}