package ru.vood.admplugin.infrastructure.sql.dbms.oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vood.admplugin.infrastructure.sql.additionalSteps.oracle.LimitingNameDBMS;
import ru.vood.admplugin.infrastructure.tune.PluginTunes;

@Service
public class AddPrimaryKeySql {

    @Autowired
    private PluginTunes tunes;

    @Autowired
    private LimitingNameDBMS nameDBMS;

    public String generateUserPK(String tableName) {
        return generate(tableName, tunes.getTableSpaseUserIndex());
    }

    public String generateSys(String tableName) {
        return generate(tableName, tunes.getTableSpaseSysIndex());
    }

    private String generate(String tableName, String tableSpace) {
        String nameConstraint = nameDBMS.getNameObj("PK#" + tableName);
        String s = "alter table " + tunes.getUser() + "." + tableName + "\n" +
                "  add constraint " + nameConstraint + " primary key (ID)\n" +
                "  using index tablespace \n" + tableSpace + tunes.getStorageIndex();
        return s;
    }
}