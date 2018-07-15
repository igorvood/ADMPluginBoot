package ru.vood.admplugin.infrastructure.sql.sqlInterfaces;

import ru.vood.admplugin.infrastructure.spring.except.CoreExeption;

public interface SQLFistrLoadShemeInterface {

    void getSQL() throws CoreExeption;
/*    QueryTable getSQLForCreate(String owner, String storage, String tableName, String context);

    QueryTable getSQLForCreate();

     QueryTable getSQLForInsertData(String owner, String tableName);

     QueryTable getSQLForInsertData();*/

}
