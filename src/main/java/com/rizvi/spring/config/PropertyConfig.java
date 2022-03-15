package com.rizvi.spring.config;

import com.rizvi.spring.examplebeans.FakeDataSource;
import com.rizvi.spring.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


//      @PropertySource("classpath:datasource.properties"),
//      @PropertySource("classpath:jms.properties")})
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//@PropertySources({
@Configuration
public class PropertyConfig {

    @Value("${rizvi.username}")
    String user;
    @Value("${rizvi.password}")
    String password;
    @Value("${rizvi.url}")
    String url;

    @Value("${rizvi.jms.username}")
    String jmsUsername;
    @Value("${rizvi.jms.password}")
    String jmsPassword;
    @Value("${rizvi.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){

        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        System.out.println(" Fake data Base   " +user +"    Password   "+password +"    Url    "+ url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){

        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        System.out.println(" Fake JMS Broker   " +jmsUsername +  "    Password  "+jmsPassword +"   Url   "+ jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;

    }
}
