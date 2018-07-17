package workshop;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("workshop")
@EnableTransactionManagement
public class PetclinicConfig {

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource("jdbc:sqlite:workshop.db");
    }
    @Bean
    public SessionFactory sessionFactory(DataSource ds) {
        LocalSessionFactoryBuilder builder
                = new LocalSessionFactoryBuilder(ds);

        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        properties.put("hibernate.show_sql", "true");

        builder.addProperties(properties);
        builder.scanPackages("workshop");
        return builder.buildSessionFactory();

    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager transactionManager(
            SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
