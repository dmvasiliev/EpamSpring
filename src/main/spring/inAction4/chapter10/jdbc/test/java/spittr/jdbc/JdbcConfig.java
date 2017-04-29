package inAction4.chapter10.jdbc.test.java.spittr.jdbc;

import inAction4.chapter10.jdbc.spittr.db.SpitterRepository;
import inAction4.chapter10.jdbc.spittr.db.SpittleRepository;
import inAction4.chapter10.jdbc.spittr.db.jdbc.JdbcSpitterRepository;
import inAction4.chapter10.jdbc.spittr.db.jdbc.JdbcSpittleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


@Configuration
public class JdbcConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScripts("classpath:mySpring/inAction4/chapter10/jdbc/resources/spittr/db/jdbc/schema.sql", "classpath:mySpring/inAction4/chapter10/jdbc/test/resources/spittr/db/jdbc/test-data.sql")
                .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public SpitterRepository spitterRepository(JdbcTemplate jdbcTemplate) {
        return new JdbcSpitterRepository(jdbcTemplate);
    }

    @Bean
    public SpittleRepository spittleRepository(JdbcTemplate jdbcTemplate) {
        return new JdbcSpittleRepository(jdbcTemplate);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
