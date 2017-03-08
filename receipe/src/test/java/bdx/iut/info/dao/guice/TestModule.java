package bdx.iut.info.dao.guice;

import bdx.iut.info.dao.PersistenceStarter;
import com.google.inject.AbstractModule;

/**
 * Guice Module used for test (only)
 */
public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PersistenceStarter.class);

    }
}
