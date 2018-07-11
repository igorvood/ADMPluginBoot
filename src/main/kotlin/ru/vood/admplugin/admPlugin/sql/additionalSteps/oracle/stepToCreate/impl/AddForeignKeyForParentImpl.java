package ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToCreate.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity;
import ru.vood.admplugin.admPlugin.spring.entity.VBdTableEntity;
import ru.vood.admplugin.admPlugin.spring.referenceBook.ObjectTypes;
import ru.vood.admplugin.admPlugin.spring.referenceBook.RootObjects;
import ru.vood.admplugin.admPlugin.sql.QueryTableNew;
import ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepToCreate.abstr.StepsCreateAndDropServise;
import ru.vood.admplugin.admPlugin.sql.dbms.oracle.AddConstraintSql;
import ru.vood.admplugin.admPlugin.tune.PluginTunes;

@Component
public class AddForeignKeyForParentImpl implements StepsCreateAndDropServise {

    @Autowired
    @Qualifier("addArrayImpl")
    private StepsCreateAndDropServise nextStep;


    @Autowired
    private PluginTunes pluginTunes;

    @Autowired
    private AddConstraintSql constraintSql;


    public QueryTableNew createDDL(VBdObjectEntity bdObject) {

        if (!(bdObject instanceof VBdTableEntity)) {
            return null;
        }
        QueryTableNew queryTable = new QueryTableNew();

        VBdTableEntity bdTable = (VBdTableEntity) bdObject;
        if (bdTable.getParent() != null && !bdTable.getParent().equals(RootObjects.getTABLE()) && bdTable.getTypeObject().equals(ObjectTypes.getTABLE())) {
            String pref = pluginTunes.getPrefixTable();
            String forKey = constraintSql.getSql(pref + bdTable.getCode(), "ID", pref + bdTable.getParent().getCode(), "ID");
            queryTable.add(forKey);
        }

        return queryTable;

    }

    public StepsCreateAndDropServise getNextStep() {
        return nextStep;
    }
}
