package ru.vood.admplugin.infrastructure.sql.sqlFactory;

import ru.vood.admplugin.infrastructure.applicationConst.SupportedDBMS;
import ru.vood.admplugin.infrastructure.spring.context.LoadedCTX;
import ru.vood.admplugin.infrastructure.sql.oracle.SQLOra;
import ru.vood.admplugin.infrastructure.sql.sqlInterfaces.SQLInterface;
import ru.vood.admplugin.infrastructure.tune.PluginTunes;

import java.math.BigDecimal;


public class SQLFactory implements SQLInterface {
    private static SQLInterface sql;

    private SQLFactory() {
    }

    public static SQLInterface getInstance() {
        if (sql == null) {
            PluginTunes pluginTunes = LoadedCTX.getService(PluginTunes.class);
            if (pluginTunes.getDbmsType().equals(SupportedDBMS.ORACLE.getType())) {
                sql = new SQLOra();
            } else sql = null;
        }
        return sql;
    }

    public String getSQLForAddCollectionId(String tableShortName) {
        return sql.getSQLForAddCollectionId(tableShortName);
    }

    public String getSQLNextId() {
        return sql.getSQLNextId();
    }

    public BigDecimal getNextId() {
        return sql.getNextId();
    }

    public String getIsExistsQuery(Object o) {
        return sql.getIsExistsQuery(o);
    }
}
