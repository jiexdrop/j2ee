package bdx.iut.info.dao;

import bdx.iut.info.dao.guice.AbstractDaoTest;
import bdx.iut.info.persistence.dao.IngredientDao;
import bdx.iut.info.persistence.domain.Ingredient;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class IngredientDaoTest extends AbstractDaoTest {

    @Test
    public void testPersistAndFindByName() {

        Ingredient ingredient = new Ingredient("TestRoom");

        IngredientDao dao = this.getIngredientDao();
        dao.create(ingredient);
        Ingredient saved = dao.findByName(ingredient.getName());

        assertThat(saved).isNotNull();
        assertThat(saved.getName()).isNotNull();
        assertThat(saved.getName()).isEqualTo(ingredient.getName());
    }


    private IngredientDao getIngredientDao() {
        return this.injector.getInstance(IngredientDao.class);
    }

}
