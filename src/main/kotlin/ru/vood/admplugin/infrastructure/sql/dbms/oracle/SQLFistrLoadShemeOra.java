package ru.vood.admplugin.infrastructure.sql.dbms.oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vood.admplugin.infrastructure.spring.except.CoreExeption;
import ru.vood.admplugin.infrastructure.sql.additionalSteps.oracle.stepFirstLoad.TuneChainStepsFirstLoad;
import ru.vood.admplugin.infrastructure.sql.sqlInterfaces.SQLFistrLoadShemeInterface;

@Component
public class SQLFistrLoadShemeOra implements SQLFistrLoadShemeInterface {

    @Autowired
    private TuneChainStepsFirstLoad runChain;

    @Override
    public void getSQL() throws CoreExeption {
        runChain.run();
    }
}
