package ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.stepFirstLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vood.admplugin.admPlugin.sql.QueryTableNew;
import ru.vood.admplugin.admPlugin.sql.dbms.oracle.AddConstraintSql;
import ru.vood.admplugin.admPlugin.sql.dbms.oracle.AddPrimaryKeySql;
import ru.vood.admplugin.admPlugin.tune.PluginTunes;

@Service
public class LIndex {

    protected final static String tableName = "V_BD_INDEX";

    @Autowired
    private PluginTunes pluginTunes;

    @Autowired
    private AddPrimaryKeySql primaryKeySql;

    @Autowired
    private AddConstraintSql constraintSql;

    public QueryTableNew additionOne() {

        QueryTableNew queryTable = new QueryTableNew();

        String s = "create table " + pluginTunes.getUser() + "." + tableName + "\n" +
                "(ID    NUMBER not null,\n" +
                "UNIQUE_I   VARCHAR2(1),\n" +
                "GLOBAL_I   VARCHAR2(1),\n" +
                "COLUMNS   NUMBER not null,\n" +
                "LIST_COLUMNS   VARCHAR2(250) --not null -- Старая колонка \n" +
                ") tablespace \n" + pluginTunes.getTableSpaseSysTable() + "\n" +
                pluginTunes.getStorageTable();
        queryTable.add(s);

        s = primaryKeySql.generateSys(tableName);
        queryTable.add(s);

        return queryTable;
    }

}
