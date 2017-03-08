package bdx.iut.info.persistence.dao;

import bdx.iut.info.persistence.domain.Ingredient;
import bdx.iut.info.persistence.domain.Receipe;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rgiot on 06/02/17.
 * TODO Complete this class / code and decorations are missing
 */
@Singleton
public class ReceipeDao {
    @Inject
    private Provider<EntityManager> entityManager;

    private static final Logger logger = LoggerFactory.getLogger(IngredientDao.class);

    @Transactional
    public Receipe create(Receipe receipe) {
        logger.info("Try to save " + toString());
        logger.info("Entity Manager" + this.entityManager);
        logger.info("Entity Manager.get" + this.entityManager.get());
        this.entityManager.get().persist(receipe);
        logger.info("Saved as " + receipe.getId());
        return receipe;
    }

    @Transactional
    public Receipe read(Long id) {
        return this.entityManager.get().find(Receipe.class, id);
    }

    @Transactional
    public Receipe update(Receipe t) {
        return this.entityManager.get().merge(t);
    }

    @Transactional
    public void delete(Receipe receipe) {
        receipe = this.entityManager.get().merge(receipe);
        this.entityManager.get().remove(receipe);
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
