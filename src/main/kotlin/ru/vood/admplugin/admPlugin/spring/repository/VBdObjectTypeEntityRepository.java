package ru.vood.admplugin.admPlugin.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vood.admplugin.admPlugin.spring.entity.VBdObjectTypeEntity;

import java.math.BigDecimal;
import java.util.List;

public interface VBdObjectTypeEntityRepository extends CrudRepository<VBdObjectTypeEntity, BigDecimal> {


    //------------------------------individual-----------------------------

    List<VBdObjectTypeEntity> findByCodeIn(String... code);

    List<VBdObjectTypeEntity> findByCode(String code);

}
