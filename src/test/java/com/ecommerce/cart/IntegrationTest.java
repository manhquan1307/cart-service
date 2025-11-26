package com.ecommerce.cart;

import com.ecommerce.cart.config.AsyncSyncConfiguration;
import com.ecommerce.cart.config.EmbeddedElasticsearch;
import com.ecommerce.cart.config.EmbeddedKafka;
import com.ecommerce.cart.config.EmbeddedRedis;
import com.ecommerce.cart.config.EmbeddedSQL;
import com.ecommerce.cart.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CartServiceApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
