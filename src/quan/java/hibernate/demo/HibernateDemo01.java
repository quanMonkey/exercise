package quan.java.hibernate.demo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import quan.java.hibernate.pojo.IdCard;
import quan.java.hibernate.pojo.Person;

import java.util.List;

/**
 * Created by liuquan on 2017/7/12.
 */
public class HibernateDemo01 {

    public static void testOneToOne_OneWay(){
        SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setPersonName("student_014");
        IdCard idCard = new IdCard();
        idCard.setIdName("014");
        idCard.setPerson(person);
        person.setIdCard(idCard);

        session.save(idCard);
        session.save(person);
        transaction.commit();

        System.out.println(person.getPersonId());
        session.close();
    }

    public static void testHQL(){
        SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String idName = (String)session.createQuery("select idName from IdCard where idCardNo=30").iterate().next();
        System.out.println(idName);
        String idName2 = (String)session.createQuery("select idName from IdCard where idCardNo=30").iterate().next();
        System.out.println(idName2);


    }

    public static void main(String[] args){
//        testOneToOne_OneWay();
//        testHQL();
        testSave();
    }

    public static void testSave(){
        SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Person.class);

        List<Person> list = criteria.add(Restrictions.like("personName","student_013")).list();
        System.out.println(list.size());
//        transaction.commit();
        session.close();
    }
}
