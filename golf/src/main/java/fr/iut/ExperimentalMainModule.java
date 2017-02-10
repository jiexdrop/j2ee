package fr.iut;

/**
 * Created by jnvarzea on 10/02/17.
 */

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created on 10/02/17.
 */
public class ExperimentalMainModule extends AbstractModule {
    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class).annotatedWith(Names.named("Putter")).to(ExperimentalPutter.class);
        bind(Club.class).annotatedWith(Names.named("Wood")).to(Wood.class);
    }
}