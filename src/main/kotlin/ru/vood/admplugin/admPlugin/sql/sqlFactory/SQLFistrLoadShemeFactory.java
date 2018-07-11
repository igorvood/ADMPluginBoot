package ru.vood.admplugin.admPlugin.sql.sqlFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vood.admplugin.admPlugin.spring.except.CoreExeption;
import ru.vood.admplugin.admPlugin.sql.dbms.oracle.SQLFistrLoadShemeOra;
import ru.vood.admplugin.admPlugin.sql.sqlInterfaces.SQLFistrLoadShemeInterface;
import ru.vood.admplugin.admPlugin.tune.PluginTunes;


@Service
public class SQLFistrLoadShemeFactory implements SQLFistrLoadShemeInterface {

    private static SQLFistrLoadShemeInterface sql;
    @Autowired
    private PluginTunes pluginTunes;

    public SQLFistrLoadShemeInterface getInstance() {
        if (sql == null) {
            if (pluginTunes.getDbmsType().equals(ru.vood.Plugin.db.SupportedDBMS.ORACLE.getType())) {
                sql = new SQLFistrLoadShemeOra();
            } else sql = null;
        }
        return sql;
    }

    @Override
    public void getSQL() throws CoreExeption {
        sql.getSQL();
    }

}
