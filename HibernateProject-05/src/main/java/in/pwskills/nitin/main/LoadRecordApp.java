package in.pwskills.nitin.main;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.pwskills.nitin.bean.Student;
import in.pwskills.nitin.util.HibernateUtil;

public class LoadRecordApp {

	public static void main(String[] args) {

		Session session = null;
		Scanner scanner = null;
		Student std1 = null;
		Integer sid = null;

		try {
			session = HibernateUtil.getSession();
			scanner = new Scanner(System.in);

			if (session != null && scanner != null) {
				System.out.print("Enter the sid value :: ");
				sid = scanner.nextInt();

				// performing read operation on database
				std1 = session.load(Student.class, sid); // Select Query :: DB to L1 cache
				System.out.println(std1);
			}

		} catch (HibernateException he) {
			System.out.println("Record not found for the id :: " + sid);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (session != null) {
				session.close();
			}
		}
	}

}
