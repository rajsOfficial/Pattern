package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class observable implements iObservable {

	List<Object> ls = new ArrayList<>();
	
	@Override
	public void add(iObserver A) {
		System.out.println("into add method");
		this.ls.add(A);
		notifier();
	}

	@Override
	public void remove(iObserver B) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifier() {
		
		for(Object obs : ls){
			((iObserver) obs).update();
		}
	}
}



interface iObservable {
	void add(iObserver A);
	void remove(iObserver B);
	void notifier();
	
}