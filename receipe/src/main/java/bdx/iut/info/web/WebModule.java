package bdx.iut.info.web;

import bdx.iut.info.web.servlet.MainServlet;
import bdx.iut.info.web.servlet.InitServlet;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fred on 08/03/15.
 */
public class WebModule extends ServletModule {
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(WebModule.class);

    @Override
    protected final void configureServlets() {




        logger.info("WebModule configureServlets started...");
        super.configureServlets();

        install(new JpaPersistModule("receipes-manager"));

        logger.info("   install servlet filter");
        filter("/*").through(PersistFilter.class);

        logger.info("Install filters.");

        serve("/admin/init").with(InitServlet.class);
        serve("/main").with(MainServlet.class);
        // TODO Add additional servlets


        logger.info("WebModule configureServlets ended.");
    }
}
