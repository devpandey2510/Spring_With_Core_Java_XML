package WithSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Library implements LibraryInterface{
	
	TraineeInterface ti;

	public void setTi(TraineeInterface ti) {
		this.ti = ti;
	}

	public void IssueBook() {
		System.out.println("Book nahi milegi:");
		ti.message();
	}
	
	public static void main(String []args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("abc.xml");
		Library l = (Library)ctx.getBean("a3");
		l.IssueBook();
	}
	
}
