package WithSpring;
import java.lang.Object;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trainee implements TraineeInterface{
	
	TrainerInterface tt;
	LibraryInterface lt;
	KhanaDedoInterface kt;
	SportsInterface st;
	
//	Trainee(TrainerInterface tt){
//		this.tt=tt;
//	}
	
	public void message() {
		System.out.println("I will get a book myself");
	}
	
	public void setSt(SportsInterface st) {
		this.st = st;
	}

	public void userTrainerService() {
		tt.teach();
		lt.IssueBook();
		kt.KhanaDedo();
		st.khelahobe();
	}
	
	public void setKt(KhanaDedoInterface kt) {
		this.kt = kt;
	}

	public void setTt(TrainerInterface tt) {
		this.tt = tt;
	}
	
	public void setlt(LibraryInterface lt) {
		this.lt = lt;
	}

	public static void main(String[] args) {
		
//		TrainerInterface t1 = new Trainer();
//		//Trainee t = new Trainee(t1);
//		Trainee t = new Trainee();
//		t.setTt(t1);
//		t.userTrainerService();
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("abc.xml");
		Trainee t = (Trainee)ctx.getBean("a2");
         t.userTrainerService();
	}

}
