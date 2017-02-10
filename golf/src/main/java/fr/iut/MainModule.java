package fr.iut;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created on 10/02/17.
 */
public class MainModule extends AbstractModule {
    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class).annotatedWith(Names.named("Putter")).to(Putter.class);
        bind(Club.class).annotatedWith(Names.named("Wood")).to(Wood.class);
    }
}