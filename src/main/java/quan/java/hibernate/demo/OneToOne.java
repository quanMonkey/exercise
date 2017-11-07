package quan.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import quan.java.hibernate.pojo.House;
import quan.java.hibernate.pojo.Street;

/**
 * House 、 Street 一对一外键关联
 * 保存外键的表 在配置时需要使用many-to-one 
 * @author issuser
 *
 */
public class OneToOne {
	
	public static void main(String[] args) {
//		saveHouse();
//		updateHouse();
//		saveStreet();
		queryStreet();
		
	}
	
	/**
	 * 单向关联
	 * 采用多对一将外键设置为唯一实现一对一
	 * 需要设置联级操作
	 */
	public static void saveHouse(){
        SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Street street = new Street();
        street.setRegion("洪山区");
        street.setStreetName("珞南街道");
        
        House house = new House();
        house.setArea(98.2);
        house.setApartmentLayout("三室一厅");
        house.setStreet(street);
        
        session.save(house);
        
        transaction.commit();
        session.close();
    }
	
	/**
	 * 单向关联
	 * 采用多对一将外键设置为唯一实现一对一
	 * 需要设置联级操作
	 */
	public static void updateHouse() {
		SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        House house = (House)session.get(House.class, 1L);
        house.setApartmentLayout("两室一厅");
//        house.getStreet().setStreetName("桂园路");
        
        session.update(house);
        
        transaction.commit();
        session.close();
	}
	
	/**
	 * 双向关联
	 */
	public static void saveStreet() {
		SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Street street = new Street();
        street.setRegion("江夏区");
        street.setStreetName("武大园路");
        
        House house = new House();
        house.setArea(78.2);
        house.setApartmentLayout("二室一厅");
        
        //关联关系由House维护，故当缺少此语句时外键列无值，即需要自己维护外键列的值
        house.setStreet(street);
        
        street.setHouse(house);
        
        session.save(street);
        //需要设置联级操作，若不设置联级属性则需单独保存house
//        session.save(house);
        
        transaction.commit();
        session.close();
	}
	
	public static void queryStreet() {
		SessionFactory sessionFactory = new HibernateUtils().getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Street street = (Street)session.get(Street.class, 15L);
        
        transaction.commit();
        session.close();
	}
	
	
}
