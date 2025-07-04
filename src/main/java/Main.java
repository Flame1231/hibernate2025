
import entity.User;
import lombok.extern.log4j.Log4j2;

import org.hibernate.Session;
@Log4j2
public class Main {

    public static void main(String[] args) {

        // сразу получаем готовый SessionFactory и сразу создаем сессию
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();
        log.info("ааааа");
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
