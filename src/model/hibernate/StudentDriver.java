import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentDriver {

	public static void main(String[] args) {

		Student students = new Student(4, "S213213c", 130);
		Configuration cfg = new Configuration();

		SessionFactory sFactory = cfg.configure().buildSessionFactory();
		Session session = sFactory.openSession();
		session.beginTransaction();
		session.delete(students);
		session.getTransaction().commit();

	}
}
