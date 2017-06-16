/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springhibernateswingcrud;

import static java.util.Collections.list;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arefin
 */
@Repository
public class HibernateDAO {
    
    private Employee emp;
    private List< Employee> DaoAllEmp;
    
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public  List< Employee> getEmployee() {
        List list = getSessionFactory().openSession().createCriteria(Employee.class).list();
        return list;
    }
    
    public Employee getId(int id){
        return (Employee) getSessionFactory().getCurrentSession().get(Employee.class, id);
    }
    
    @Transactional
    public void saveEmployee(Employee emp) {
        getSessionFactory().getCurrentSession().save(emp);
    }
    
    @Transactional
    public void updateEmployee(Employee emp) {
        getSessionFactory().getCurrentSession().update(emp);
    }
    
    @Transactional
    public void deleteEmployee(int id) {
        getSessionFactory().getCurrentSession().delete(getId(id));
    }
    
    @Transactional
    public List<Employee> AllEmp() {
        Session session = getSessionFactory().openSession();
        try {
            session.beginTransaction();
            DaoAllEmp = session.createCriteria(Employee.class).list();
            int count = DaoAllEmp.size();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.close();
        return DaoAllEmp;
    }
}
