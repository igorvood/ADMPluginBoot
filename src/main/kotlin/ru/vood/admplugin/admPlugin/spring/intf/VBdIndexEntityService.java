package ru.vood.admplugin.admPlugin.spring.intf;

import ru.vood.admplugin.admPlugin.spring.entity.VBdIndexEntity;
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity;
import ru.vood.admplugin.admPlugin.spring.except.CoreExeption;

import java.util.List;

public interface VBdIndexEntityService {

    VBdIndexEntity findByCode(String code) throws CoreExeption;

    VBdIndexEntity save(VBdIndexEntity entity);

    void delete(VBdIndexEntity entity);

    List<VBdIndexEntity> findByParent(VBdObjectEntity parent);

}
