package rt2;

public class Main extends ReadPdf {

	
	public static void main(String[] args) throws Exception {
		
	
		Total t = new Total();
		Day d = new Day();
		Course crs = new Course();
		SOC s = new SOC();
		Asignment2 a = new Asignment2();
		
		
	
		Thread t1 = new Thread(t);
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t2 = new Thread(d);
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t3 = new Thread (crs);
		t3.start();
		try {
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t4 = new Thread (s);
		t4.start();
		try {
			t4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	
		Thread t5 = new Thread (a);
		t5.start();
		try {
			t5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}