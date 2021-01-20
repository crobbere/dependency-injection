package gipsy.springframework.dependencyinjection.config;

import gipsy.springframework.dependencyinjection.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {

    @Value("${gipsy.username}")
    String user;

    @Value("${gipsy.password}")
    String password;

    @Value("${gipsy.dburl}")
    String url;

    @Value("${gipsy.jms.username")
    String jmsUsername;

    @Value("${gipsy.jms.password")
    String jmsPassword;

    @Value("${gipsy.jms.url")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return fakeDataSource;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
