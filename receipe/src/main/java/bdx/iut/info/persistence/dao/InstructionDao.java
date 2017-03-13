package bdx.iut.info.persistence.dao;

import bdx.iut.info.persistence.domain.Receipe;
import bdx.iut.info.persistence.domain.Step;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by jnvarzea on 13/03/17.
 */
@Singleton
public class InstructionDao {
    @Inject
    private Provider<EntityManager> entityManager;

    private static final Logger logger = LoggerFactory.getLogger(InstructionDao.class);

    @Transactional
    public Step create(Step step) {
        logger.info("Try to save " + toString());
        logger.info("Entity Manager" + this.entityManager);
        logger.info("Entity Manager.get" + this.entityManager.get());
        this.entityManager.get().persist(step);
        logger.info("Saved as " + step.getId());
        return step;
    }

    @Transactional
    public Step read(Long id) {
        return this.entityManager.get().find(Step.class, id);
    }

    @Transactional
    public Step update(Step t) {
        return this.entityManager.get().merge(t);
    }

    @Transactional
    public void delete(Step step) {
        step = this.entityManager.get().merge(step);
        this.entityManager.get().remove(step);
    }

    @Transactional
    public List<Receipe> findAll() {
        StringBuilder query = new StringBuilder("from ");
        query.append(Receipe.class.getName());
        List<Receipe> receipes = this.entityManager.get().createQuery(query.toString()).getResultList();
        logger.debug("{} ingredients found", receipes);
        return receipes;
    }


    @Transactional
    public List<Receipe> findByName(final String name) {
        StringBuilder query = new StringBuilder("from ");
        query.append(Receipe.class.getName());
        query.append(" where title = \'" + name +"\'");

        List<Receipe> receipes = this.entityManager.get().createQuery(query.toString()).getResultList();
        logger.debug("{} receipess found", receipes);
        return receipes;
    }

}
