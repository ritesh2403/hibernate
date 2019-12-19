package hibconnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class StudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = sessionfactory.getCurrentSession();

		try {
			System.out.println("creating new student object");
			// create a student object
			Student student = new Student("jack", "sparrow", "sparrow@gmail.com");

			// start the transaction
			session.beginTransaction();

			// save the student object
			System.out.println("saving the student object");
			session.save(student);
			

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!!");
			
             

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionfactory.close();
		}

	}

}
