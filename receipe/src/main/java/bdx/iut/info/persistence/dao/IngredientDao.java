package bdx.iut.info.persistence.dao;

import bdx.iut.info.persistence.domain.*;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by rgiot on 06/02/17.
 */
@Singleton
public class IngredientDao {
    @Inject
    private Provider<EntityManager> entityManager;

    private static final Logger logger = LoggerFactory.getLogger(IngredientDao.class);

    @Transactional
    public Ingredient create(Ingredient t) {
        logger.info("Try to save " + toString());
        logger.info("Entity Manager" + this.entityManager);
        logger.info("Entity Manager.get" + this.entityManager.get());
        this.entityManager.get().persist(t);
        logger.info("Saved as " + t.getId());
        return t;
    }

    @Transactional
    public Ingredient read(Long id) {
        return this.entityManager.get().find(Ingredient.class, id);
    }

    @Transactional
    public Ingredient update(Ingredient t) {
        return this.entityManager.get().merge(t);
    }

    @Transactional
    public void delete(Ingredient t) {
        t = this.entityManager.get().merge(t);
        this.entityManager.get().remove(t);
    }

    @Transactional
    public List<Ingredient> findAll() {

        StringBuilder query = new StringBuilder("from ");
        query.append(Ingredient.class.getName());
        List<Ingredient> ingredients = this.entityManager.get().createQuery(query.toString()).getResultList();
        logger.debug("{} ingredients found", ingredients);
        return ingredients;
    }

    @Transactional
    public Ingredient findByName(String name) {
        StringBuilder query = new StringBuilder("from ");
        query.append(Ingredient.class.getName());
        query.append(" where name = \'" + name +"\'");
        Ingredient ingredient = (Ingredient) this.entityManager.get().createQuery(query.toString()).getSingleResult();
        logger.debug("found Ingredient ", ingredient);
        return ingredient;
    }

    /**
     * Count the number of times the ingredient is used in various receipes.
     * The count number is obtained thanks to a JPQL query
     * @param ing Ingredient of interest
     * @return Number of times the ingredient of interest has been used
     */
    @Transactional
    public Integer countUsagesInReceipes(Ingredient ing) {
        StringBuilder query = new StringBuilder("from ");
        query.append(Receipe.class.getName());

        return 0;
    }

}
