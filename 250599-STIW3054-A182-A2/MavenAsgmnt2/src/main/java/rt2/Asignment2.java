package rt2;

public class Asignment2 extends ReadPdf implements Runnable{

	public void run() {
		Thread t5 = new Thread(new Asignment2());
		t5.setName("\nThread 5 --->");
		super.run();
		
			try {	
				System.out.println(t5.getName( )+ lines[getLineByLine("STIW3054")]);
				Thread.sleep(2000);
			} catch (Exception e) {
				e.getStackTrace();
			}
			
		}	
	
	}
