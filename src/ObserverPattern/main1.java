package ObserverPattern;

public class main1 {

	public static void main(String[] args) {
		System.out.println("into the main method ");
		observable obj = new observable();
		iObserver a1 = new observerA(obj);
		iObserver a2 = new observerB(obj);
		
		
		obj.add(a1);
		obj.add(a2);
	}
}
