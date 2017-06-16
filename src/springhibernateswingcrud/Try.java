/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springhibernateswingcrud;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Arefin
 */
public class Try {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springhibernateswingcrud/spring-jdbc.xml");
        HibernateDAO hd = (HibernateDAO) context.getBean(HibernateDAO.class);
//        hd.deleteEmployee(5);
//        hd.updateEmployee(new Employee(5,"Sonu",3100));
       List<Employee> emplist = hd.getEmployee();
        for (Employee e: emplist) {
            System.out.println(e.getId()+" " +e.getName()+" " +e.getSalary());
        }
    }
}
