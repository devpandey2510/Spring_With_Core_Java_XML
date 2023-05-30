package com.DependencyInjection.WithCoreJava;

public class Trainee {
	
	TrainerInterface tt;
	
//	Trainee(TrainerInterface tt){
//		this.tt=tt;
//	}
	
	
	
	public void userTrainerService() {
		tt.teach();
	}

	public void setTt(TrainerInterface tt) {
		this.tt = tt;
	}

	public static void main(String[] args) {
		
		TrainerInterface t1 = new Trainer();
		//Trainee t = new Trainee(t1);
		Trainee t = new Trainee();
		t.setTt(t1);
		t.userTrainerService();

	}

}
