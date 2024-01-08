package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        //Bean from xmlConfiguration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        //->creating the object using bean
//        //by specifying the class
//        Teacher t = context.getBean(Teacher.class);
//        //by specifying the id and typecasting to object
//        t.duty();
//        //the default value is injected in class
//        System.out.println(t.getQualification());
//        System.out.println(t.getStudent());
//
//        Student s = context.getBean(Student.class);
//        //Injecting the value for constructor through bean
//        System.out.println(s.getYear());


        //Bean from component-scan from XML
//        Manager m = context.getBean(Manager.class);
//        m.duty();
//        System.out.println(m.getExperience());

        //Bean from Java configuration
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Manager manager = context.getBean(Manager.class);
        manager.duty();
        manager.setExperience(5);
        System.out.println(manager);

//        Manager m2 = context.getBean(Manager.class);
//        System.out.println(m2);

    }
}