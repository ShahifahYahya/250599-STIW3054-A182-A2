package rt2;

public class Total extends ReadPdf implements Runnable {

	@Override
	public void run() {
		Thread t1 = new Thread(new Total());
		t1.setName("\nThread-1 --->Total number of course: ");
		super.run();
		int i;
		int numCourse=0;
	
			for(i=1;i<text.length();i++){
				
				if(text.contains(i+".")) {
					numCourse++;
				
				}

			}
			try {
				System.out.println(t1.getName()+(numCourse));
				Thread.sleep(2000);
			} catch (Exception e) {
				e.getStackTrace();
			}
		
	
	}
}