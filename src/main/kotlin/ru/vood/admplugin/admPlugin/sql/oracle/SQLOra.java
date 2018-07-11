package ru.vood.admplugin.admPlugin.sql.oracle;

import ru.vood.admplugin.admPlugin.spring.context.LoadedCTX;
import ru.vood.admplugin.admPlugin.spring.intf.CommonFunctionService;
import ru.vood.admplugin.admPlugin.sql.sqlInterfaces.SQLInterface;
import ru.vood.admplugin.admPlugin.tune.PluginTunes;
import ru.vood.admplugin.applicationConst.SystemObject;


import java.math.BigDecimal;

public class SQLOra implements SQLInterface {


    public String getSQLForAddCollectionId(String tableShortName) {
        StringBuffer sb = new StringBuffer();
        PluginTunes pluginTunes = LoadedCTX.getService(PluginTunes.class);
        sb.append("alter table " + pluginTunes.getOwner() + "." + pluginTunes.getPrefixTable() + tableShortName +
                " add " + COLLECTION + " NUMBER");
        return sb.toString();
    }

    public String getSQLNextId() {
        StringBuffer sb = new StringBuffer();
        sb.append("select " + SystemObject.SEQ_ID.getNameInDB() + ".nextval from dual");
        return sb.toString();
    }


    public BigDecimal getNextId() {
        CommonFunctionService commonFunctionService = LoadedCTX.getService(CommonFunctionService.class);
        return commonFunctionService.nextId();
    }

    @Override
    public String getIsExistsQuery(Object o) {
  /*      if (o.getClass()== Allclass.class || o.getClass()== ExtAllClass.class) {
            return SQLAllClassFactory.getInstance().getIsExistsQuery((Allclass) o);
        }else if (o.getClass()== ClassProperty.class || o.getClass()== ExtClassProperty.class) {
            return SQLClassPropertyFactory.getInstance().getIsExistsQuery((ClassProperty) o);
        }
        return null;
*/
        return null;
    }

}
