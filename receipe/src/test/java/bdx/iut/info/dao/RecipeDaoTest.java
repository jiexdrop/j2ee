package bdx.iut.info.dao;

/**
 * Created by jnvarzea on 08/03/17.
 */
import bdx.iut.info.dao.guice.AbstractDaoTest;
import bdx.iut.info.persistence.dao.IngredientDao;
import bdx.iut.info.persistence.dao.ReceipeDao;
import bdx.iut.info.persistence.domain.Ingredient;
import bdx.iut.info.persistence.domain.Receipe;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class RecipeDaoTest extends AbstractDaoTest {

    @Test
    public void testPersist() {

        Receipe receipe0 = new Receipe("Meringues au Chocolat");
        Receipe receipe1 = new Receipe("Lapin saumoné au poivre du Mexique");
        Receipe receipe2 = new Receipe("Pattes à la Californienne");

        ReceipeDao dao = this.getReceipeDao();
        dao.create(receipe0);
        dao.create(receipe1);
        dao.create(receipe2);
        List<Receipe> saved = dao.findByName(receipe0.getTitle());

        assertThat(saved).isNotNull();
    }


    private ReceipeDao getReceipeDao() {
        return this.injector.getInstance(ReceipeDao.class);
    }

}
