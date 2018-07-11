package ru.vood.admplugin.admPlugin.generateCode.impl.intf.addingImport

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity
import ru.vood.admplugin.admPlugin.tune.PluginTunes

@Component
open class AddAnyClass() : AddAnyClassService {

    @Autowired
    protected lateinit var pluginTunes: PluginTunes


    override fun getFullNameClass(entity: VBdObjectEntity): String {
        return "${pluginTunes.packageIn}.${entity.code}"
    }

    override fun getCode(entity: VBdObjectEntity): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}