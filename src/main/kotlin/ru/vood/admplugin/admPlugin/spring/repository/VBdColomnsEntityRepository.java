package ru.vood.admplugin.admPlugin.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vood.admplugin.admPlugin.spring.entity.VBdColomnsEntity;
import ru.vood.admplugin.admPlugin.spring.entity.VBdTableEntity;

import java.math.BigDecimal;
import java.util.List;

public interface VBdColomnsEntityRepository extends CrudRepository<VBdColomnsEntity, BigDecimal> {


    //------------------------------individual-----------------------------

    List<VBdColomnsEntity> findByCode(String code);

    List<VBdColomnsEntity> findByParent(VBdTableEntity parent);

}
