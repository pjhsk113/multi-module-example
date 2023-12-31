package io.study.demo.storage.db.main.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainDataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "multi-module-example.datasource.main")
    public HikariConfig mainHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public HikariDataSource mainDataSource(@Qualifier("mainHikariConfig") HikariConfig config) {
        return new HikariDataSource(config);
    }
}
