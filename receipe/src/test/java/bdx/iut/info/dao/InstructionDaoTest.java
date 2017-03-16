package bdx.iut.info.dao;

import bdx.iut.info.dao.guice.AbstractDaoTest;
import bdx.iut.info.persistence.dao.IngredientDao;
import bdx.iut.info.persistence.dao.InstructionDao;
import bdx.iut.info.persistence.domain.Ingredient;
import bdx.iut.info.persistence.domain.Step;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by jnvarzea on 16/03/17.
 */
public class InstructionDaoTest extends AbstractDaoTest {

    @Test
    public void testPersistAndFindByName() {

        Step step = new Step();

        step.setStepText("Faire chauffer une poêle antiadhésive et la huiler très légèrement. Y verser une louche de pâte, la répartir dans la poêle puis attendre qu'elle soit cuite d'un côté avant de la retourner. Cuire ainsi toutes les crêpes à feu doux.");

        InstructionDao dao = this.getInstructionDao();
        dao.create(step);
        Step saved = dao.read(step.getId());

        assertThat(saved).isNotNull();

    }


    private InstructionDao getInstructionDao() {
        return this.injector.getInstance(InstructionDao.class);
    }
}
