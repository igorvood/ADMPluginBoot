package ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToCreate.abstr;

import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity;
import ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.ChainQueryServise;

public abstract class TuneChainStepsCreateServise extends ChainQueryServise {
    public abstract void runChain(VBdObjectEntity bdobj);
}
