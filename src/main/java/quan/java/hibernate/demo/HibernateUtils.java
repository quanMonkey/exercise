package quan.java.hibernate.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Created by liuquan on 2017/7/12.
 */
public class HibernateUtils {

    private static final SessionFactory sessionFactory =buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        Configuration configuration = new Configuration().configure();

        /****hibernate4.3之前版本的写法****/
        ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();

        /****hibernate4.3+版本的写法****/
//        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder()
//                .applySettings(configuration.getProperties());
//        ServiceRegistry serviceRegistry = standardServiceRegistryBuilder.build();
//
//
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);


        /****hibernate5.1版本的写法****/
//        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
//        SessionFactory sessionFactory = new MetadataSources(serviceRegistry)
//                .buildMetadata().buildSessionFactory() ;

            return sessionFactory;

    }

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
