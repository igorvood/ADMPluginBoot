package ru.vood.admplugin.infrastructure.spring.intf;

import ru.vood.admplugin.infrastructure.spring.entity.VBdColumnsEntity;
import ru.vood.admplugin.infrastructure.spring.entity.VBdTableEntity;
import ru.vood.admplugin.infrastructure.spring.except.CoreExeption;

import java.util.List;

public interface VBdColomnsEntityService /*extends  ParentForAllServise/*extends VBdObjectEntityService*/ {

    VBdColumnsEntity save(VBdColumnsEntity entity);

    void delete(VBdColumnsEntity entity);

    List<VBdColumnsEntity> findByParent(VBdTableEntity parent);

    VBdColumnsEntity findColomn(VBdTableEntity parent, String code) throws CoreExeption;
    //List<VBdObjectEntity> findByTypeObjectCodeIn(String... codeS);

}
