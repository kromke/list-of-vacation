package org.test.listofvacation.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
//@PropertySource("file:./config/application.yml")
public class DatabaseConfig {

    @Bean
    @Primary
    @ConfigurationProperties("database")
    public DataSourceProperties getDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource getDataSource(){
        return getDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
