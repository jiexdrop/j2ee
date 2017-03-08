package bdx.iut.info.persistence.dao;

import bdx.iut.info.persistence.domain.Receipe;
import com.google.inject.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by rgiot on 06/02/17.
 *
 * TODO Complete this class / code and decorations are missing
 */
public class ReceipeDao {
private Provider<EntityManager> entityManager;

    private static final Logger logger = LoggerFactory.getLogger(IngredientDao.class);

    public Receipe create(Receipe t) {
        // TODO implement
        return null;
    }

    public Receipe read(Long id) {
        // TODO implemnet
        return null;
    }

    public Receipe update(Receipe t) {
        //TODO implement
        return null;
    }

    public void delete(Receipe t) {
        //TODO implement
    }

    public List<Receipe> findAll() {
        //TODO implement
        return null;
    }


    public List<Receipe> findByName(final String name) {
        // TODO implement
        return null;
    }

}
