package ru.vood.admplugin.admPlugin.spring.intf;

import ru.vood.admplugin.admPlugin.spring.entity.VBdIndexedColomnsEntity;

import java.math.BigDecimal;
import java.util.List;

public interface VBdIndexedColomnsEntityService {

    VBdIndexedColomnsEntity save(VBdIndexedColomnsEntity entity);

    void delete(VBdIndexedColomnsEntity entity);

    List<VBdIndexedColomnsEntity> findByCollectionId(BigDecimal collectionId);

    List<VBdIndexedColomnsEntity> findByCollectionIdIn(List<BigDecimal> collectionId);
}
