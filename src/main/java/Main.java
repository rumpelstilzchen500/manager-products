import models.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();


        session.beginTransaction();

        User user = new User();
            user.setFirst_name("test_first_name2");
            user.setLast_name("test_last_name2");
            user.setPhone(932071888);
            user.setSex("man");
        //Save the employee in database
        session.save(user );

        //Commit the transaction
        session.getTransaction().commit();
        sessionFactory.close();

    }
}