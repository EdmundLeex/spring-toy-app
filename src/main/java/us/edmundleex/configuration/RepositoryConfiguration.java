package us.edmundleex.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "us.edmundleex.models" })
@EnableJpaRepositories(basePackages = { "us.edmundleex.repositories" })
@EnableTransactionManagement
public class RepositoryConfiguration {

}
