package ru.vood.admplugin.infrastructure.sql.additionalSteps.oracle.stepToCreate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.vood.admplugin.infrastructure.spring.entity.VBdObjectEntity;
import ru.vood.admplugin.infrastructure.sql.QueryTableNew;
import ru.vood.admplugin.infrastructure.sql.additionalSteps.oracle.stepToCreate.abstr.StepsCreateAndDropServise;
import ru.vood.admplugin.infrastructure.sql.additionalSteps.oracle.stepToCreate.abstr.TuneChainStepsCreateServise;


@Service
public class TuneChainStepsCreate extends TuneChainStepsCreateServise {

    private StepsCreateAndDropServise table;

    @Autowired
    public TuneChainStepsCreate(@Qualifier("addTableImpl") StepsCreateAndDropServise table) {
        this.table = table;
    }

    public void runChain(VBdObjectEntity bdobj) {
        // Вызов первого, остальное пойдет по цепочке
        QueryTableNew queryTable = null;
        queryTable = table.runSteps(bdobj);
        runQueryes(queryTable);
    }
}
