package ru.vood.admplugin.admPlugin.sql.sqlInterfaces;

import ru.vood.admplugin.admPlugin.spring.except.CoreExeption;

public interface SQLFistrLoadShemeInterface {

    void getSQL() throws CoreExeption;
/*    QueryTable getSQLForCreate(String owner, String storage, String tableName, String context);

    QueryTable getSQLForCreate();

     QueryTable getSQLForInsertData(String owner, String tableName);

     QueryTable getSQLForInsertData();*/

}
