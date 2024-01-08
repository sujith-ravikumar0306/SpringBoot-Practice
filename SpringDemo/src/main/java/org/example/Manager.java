package org.example;
//Annotation based configuration (Dependency Injection).

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class Manager implements Designation, BeanNameAware {

    @Override
   public String toString(){
       return "Doc with experience :"+this.experience +" years";
   }
    private int experience;

    public void duty()
    {
        System.out.println("My duty is to manage.");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    //Below are the Bean lifecycle methods
    @Override
    public void setBeanName(String name) {
            System.out.println("setBeanName() method is called!");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("postConstruct() method is called!");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("preDestroy() method is called !");
    }
}
