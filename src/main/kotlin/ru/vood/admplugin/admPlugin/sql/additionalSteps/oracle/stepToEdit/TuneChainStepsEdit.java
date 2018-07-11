package ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToEdit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity;
import ru.vood.admplugin.admPlugin.sql.QueryTableNew;
import ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToEdit.abstr.StepsEditServise;
import ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToEdit.abstr.TuneChainStepsEditService;

@Component
public class TuneChainStepsEdit extends TuneChainStepsEditService {

    @Autowired
    @Qualifier("editTableImpl")
    private StepsEditServise table;

    public void runChain(VBdObjectEntity bdobjOld, VBdObjectEntity bdobjNew) {
        // Вызов первого, остальное пойдет по цепочке
        QueryTableNew queryTable = table.runSteps(bdobjOld, bdobjNew);
        runQueryes(queryTable);
    }
}
