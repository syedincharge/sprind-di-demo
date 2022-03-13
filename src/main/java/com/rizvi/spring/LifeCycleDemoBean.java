package com.rizvi.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBean(){
        System.out.println("##  I am in the Life Cycle Bean Constructor");
    }

    @Override
    public void destroy()  throws Exception{
        System.out.println("##  The Life Cycle Bean has been terminated");
    }

    @Override
    public void afterPropertiesSet()  throws Exception{
        System.out.println("##  The Life Cycle Bean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##  The Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("##   My Bean Name  is   "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##   The Application Context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("##  The Post Construct Annotated Method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("##  The Pre Destroy Annotated Method has been called ");
    }
    public void beforeInit(){
        System.out.println("##  The Before Init Method - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("##  The After Init Method - Called by Bean Post Processor");
    }

}
