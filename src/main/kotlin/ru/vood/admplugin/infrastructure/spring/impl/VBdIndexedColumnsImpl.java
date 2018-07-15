package ru.vood.admplugin.infrastructure.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vood.admplugin.infrastructure.spring.entity.VBdIndexedColumnsEntity;
import ru.vood.admplugin.infrastructure.spring.intf.VBdIndexedColumnsEntityService;
import ru.vood.admplugin.infrastructure.spring.repository.VBdIndexedColomnsEntityRepository;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

@Service//("jpaVBdIndexedColomnsService")
@Repository
@Transactional
public class VBdIndexedColumnsImpl implements VBdIndexedColumnsEntityService {

    @Autowired
    protected EntityManager em;
    @Autowired
    private VBdIndexedColomnsEntityRepository bdColomnsEntityRepository;

    @Override
    public VBdIndexedColumnsEntity save(VBdIndexedColumnsEntity entity) {
        return bdColomnsEntityRepository.save(entity);
    }

    @Override
    public void delete(VBdIndexedColumnsEntity entity) {
        bdColomnsEntityRepository.delete(entity);
    }

    @Override
    public List<VBdIndexedColumnsEntity> findByCollectionId(BigDecimal collectionId) {
        return bdColomnsEntityRepository.findByCollectionId(collectionId);
    }

    @Override
    public List<VBdIndexedColumnsEntity> findByCollectionIdIn(List<BigDecimal> collectionId) {
        /*Query query = em.createQuery("select a1 from VBdIndexedColumnsEntity a1 " +

                " where a1.collectionId in :collectionId " +
                //" order by a2.id " +
                "")
                .setParameter("collectionId", collectionId);
        List list = query.getResultList();*/
        List list = bdColomnsEntityRepository.findByCollectionIdIn(collectionId);
        return list;
    }
}
