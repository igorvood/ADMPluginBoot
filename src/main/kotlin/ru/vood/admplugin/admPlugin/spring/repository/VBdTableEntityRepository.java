package ru.vood.admplugin.admPlugin.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectEntity;
import ru.vood.admplugin.admPlugin.spring.entity.VBdTableEntity;

import java.math.BigDecimal;
import java.util.List;

public interface VBdTableEntityRepository extends CrudRepository<VBdTableEntity, BigDecimal> {

    //------------------------------individual-----------------------------

    List<VBdTableEntity> findByCode(String code);

    List<VBdTableEntity> findByTypeObjectCodeIn(String... codeS);

    List<VBdTableEntity> findByParent(VBdObjectEntity parent);
}
