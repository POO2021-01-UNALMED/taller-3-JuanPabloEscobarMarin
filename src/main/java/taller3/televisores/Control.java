package taller3.televisores;

public class Control {
	
	TV tv;

	public void enlazar(TV tv){ 
		this.tv = tv;
		tv.setControl(this);
		}

	public void turnOff() {
		tv.turnOff();
		
	}

	public void setCanal(int i) {
		if (tv.estado) {
		tv.setCanal(i);
		}
	}

	public void canalUp() {
		if (tv.estado) {
		tv.canalUp();
		}
	}

	public void turnOn() {
		tv.turnOn();
				
	}

	public void volumenUp() {
		if (tv.estado) {
		tv.volumenUp();
		}
		
		
	}

	public void volumenDown() {
		if (tv.estado) {
		tv.volumenDown();
		}
		
		
	}
	public void canalDown() {
		if (tv.estado) {
		tv.canalDown();
		}
		
	}
	
	


	
	
	
	


	}

