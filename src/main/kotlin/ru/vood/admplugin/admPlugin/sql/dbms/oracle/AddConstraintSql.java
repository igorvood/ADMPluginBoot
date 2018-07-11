package ru.vood.admplugin.admPlugin.sql.dbms.oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vood.admplugin.admPlugin.sql.additionalSteps.oracle.LimitingNameDBMS;
import ru.vood.admplugin.admPlugin.tune.PluginTunes;

@Service
public class AddConstraintSql {

    @Autowired
    private PluginTunes pluginTunes;

    @Autowired
    private LimitingNameDBMS limitingNameDBMS;

    public String getSql(String tableName, String colomn, String refTableName, String refColomn) {
        String s = "alter table " + pluginTunes.getUser() + "." + tableName + "\n" +
                "  add constraint " + limitingNameDBMS.getNameObj("FK#" + tableName + "_" + colomn + "_" + refTableName) + " foreign key (" + colomn + ")\n" +
                "  references " + pluginTunes.getUser() + "." + refTableName + " (" + refColomn + ")\n";
        return s;
    }

    public String getSqlAndAddPrefix(String tableName, String colomn, String refTableName, String refColomn) {
        String s = "alter table " + pluginTunes.getUser() + "." + pluginTunes.getPrefixTable() + tableName + "\n" +
                "  add constraint " + limitingNameDBMS.getNameObj("FK#" + pluginTunes.getPrefixTable() +
                tableName + "_" + colomn + "_" + pluginTunes.getPrefixTable() + refTableName) + " foreign key (" + colomn + ")\n" +
                "  references " + pluginTunes.getUser() + "." + pluginTunes.getPrefixTable() + refTableName + " (" + refColomn + ")\n";
        return s;
    }
}
