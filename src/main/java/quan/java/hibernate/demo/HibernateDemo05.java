package quan.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import quan.java.hibernate.pojo.Degree;
import quan.java.hibernate.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuquan on 2017/11/4.
 */
public class HibernateDemo05 {

    public static void main(String[] args){
        testAnnotation_OneToManyForList();
    }

    public static void testAnnotation_OneToManyForList(){
        SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("test");

        List<Degree> degreeList = new ArrayList<Degree>();
        degreeList.add(new Degree("1",1));
        degreeList.add(new Degree("3",3));

        employee.setDegrees(degreeList);

        session.save(employee);
        transaction.commit();

        System.out.println(employee.toString());
        session.close();
    }
}
