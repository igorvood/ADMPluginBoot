package ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToDrop.abstr

import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity
import ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.ChainQueryServise

abstract class TuneChainStepsDropService : ChainQueryServise() {

    abstract fun runChain(bdobj: VBdObjectEntity)

}