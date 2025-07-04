
import entity.User;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        // сразу получаем готовый SessionFactory и сразу создаем сессию
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();
        User user = new User();
        user.setPassword("111d");
        user.setUsername("Дятелf");
        user.setEmail("djdj@mail.comf");
        session.persist(user);
        session.getTransaction().commit();

        session.close();
        HibernateUtil.close();
    }

}
