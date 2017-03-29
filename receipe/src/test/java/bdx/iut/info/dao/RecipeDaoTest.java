package bdx.iut.info.dao;

/**
 * Created by jnvarzea on 08/03/17.
 */
import bdx.iut.info.dao.guice.AbstractDaoTest;
import bdx.iut.info.persistence.dao.IngredientDao;
import bdx.iut.info.persistence.dao.InstructionDao;
import bdx.iut.info.persistence.dao.ReceipeDao;
import bdx.iut.info.persistence.domain.Ingredient;
import bdx.iut.info.persistence.domain.Receipe;
import bdx.iut.info.persistence.domain.Step;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
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

    @Test
    public void findAllRecipes() {

        Receipe receipe0 = new Receipe("Meringues au Chocolat");
        Receipe receipe1 = new Receipe("Lapin saumoné au poivre du Mexique");
        Receipe receipe2 = new Receipe("Pattes à la Californienne");

        ReceipeDao dao = this.getReceipeDao();
        dao.create(receipe0);
        dao.create(receipe1);
        dao.create(receipe2);
        List<Receipe> saved = dao.findAll();

        assertThat(saved.get(2)).isNotNull();
        assertEquals("Lapin saumoné au poivre du Mexique",saved.get(1).getTitle());
    }

    @Test
    public void stepTextRecipes() {

        Receipe receipe0 = new Receipe("Meringues au Chocolat");
        Receipe receipe1 = new Receipe("Lapin saumoné au poivre du Mexique");
        Receipe receipe2 = new Receipe("Pattes à la Californienne");

        Step step0 = new Step();
        step0.setStepText("Bonjour");

        Step step1 = new Step();
        step1.setStepText("Cuire");

        ReceipeDao dao = this.getReceipeDao();
        dao.create(receipe0);
        dao.create(receipe1);
        dao.create(receipe2);

        InstructionDao idao = this.getInstructionDao();

        idao.create(step0);
        idao.create(step1);

        receipe0.addInstruction(step0);
        receipe0.addInstruction(step1);


        List<Receipe> saved = dao.findAll();

        assertEquals("Bonjour",receipe0.getSteps().get(0).getStepText());
        assertEquals("Cuire",receipe0.getSteps().get(1).getStepText());
    }

    @Test
    public void deleteRecipes() {
        Receipe receipe = new Receipe("Meringues");

        ReceipeDao receipeDao = this.getReceipeDao();
        receipeDao.create(receipe);

        assertEquals(1, receipeDao.findAll().size());

        receipeDao.delete(receipeDao.findByName("Meringues"));

        assertEquals(0, receipeDao.findAll().size());

    }


    @Test
    public void recipesIngredients() {
        Receipe receipe = new Receipe("Meringues");
        Ingredient ingredient1 = new Ingredient("Blancs");
        Ingredient ingredient2 = new Ingredient("Sucre");
        IngredientDao ingredientDao = getIngredientDao();
        ingredientDao.create(ingredient1);
        ingredientDao.create(ingredient2);

        receipe.addIngredient(ingredient1);
        receipe.addIngredient(ingredient2);



        ReceipeDao receipeDao = this.getReceipeDao();
        receipeDao.create(receipe);

        //for(Receipe receipes : receipeDao.findAll()){
        //    System.out.println(receipes.getIngredientsText());
        //}

    }


    private IngredientDao getIngredientDao() {
        return this.injector.getInstance(IngredientDao.class);
    }

    private ReceipeDao getReceipeDao() {
        return this.injector.getInstance(ReceipeDao.class);
    }

    private InstructionDao getInstructionDao() {
        return this.injector.getInstance(InstructionDao.class);
    }
}
