package ObserverPattern;

interface iObserver { 
	void update();
	
}

class observerA implements iObserver{

	 iObservable observeObj;
		observerA(iObservable e){   // observable object is sent to the observer so that observer can get details from observable when its behaviour changes
		this.observeObj = e;
	}
	@Override
	public void update() {
		System.out.println("data printed by the ObserverA");
	}
	
	
}

class observerB implements iObserver{

	 observable observeObj;

	public observerB(observable e) {
		this.observeObj = e;
	}

	@Override
	public void update() {
		System.out.println("data printed by the observerB");
	}
	
}