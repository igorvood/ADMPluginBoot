package ru.vood.admplugin.admPlugin.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vood.admplugin.admPlugin.spring.entity.VBdIndexedColomnsEntity;

import java.math.BigDecimal;
import java.util.List;

public interface VBdIndexedColomnsEntityRepository extends CrudRepository<VBdIndexedColomnsEntity, BigDecimal> {

    List<VBdIndexedColomnsEntity> findByCollectionId(BigDecimal collectionId);

    List<VBdIndexedColomnsEntity> findByCollectionIdIn(List<BigDecimal> collectionId);
}
