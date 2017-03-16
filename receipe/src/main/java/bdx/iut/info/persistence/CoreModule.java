package bdx.iut.info.persistence;

import bdx.iut.info.persistence.dao.IngredientDao;
import bdx.iut.info.persistence.dao.InstructionDao;
import bdx.iut.info.persistence.dao.ReceipeDao;
import com.google.inject.AbstractModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by rgiot on 06/02/17.
 *
 * Binds the objets necerray for the DAO stuff.
 * To ease the work, we do not work with inmplementations/interfaces
 */
public class CoreModule extends AbstractModule {
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(CoreModule.class);

    @Override
    protected void configure() {
        logger.info("CoreModule configuration started...");

        logger.info("Install Ingredient Dao");
        bind(IngredientDao.class);


        logger.info("Install Ingredient ReceipeDao");
        bind(ReceipeDao.class);


        logger.info("Install Ingredient InstructionDao");
        bind(InstructionDao.class);

        logger.info("CoreModule configuration ended.");
    }
}
