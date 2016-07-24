package com.rs.services.config;

import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by ravisharma on 7/23/2016.
 */

public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        this.packages("com.rs.services.api")
                .packages("com.rs.services.config")
                .register(MyObjectMapperProvider.class)
                .register(JacksonFeatures.class);
    }

}
