package taller3.televisores;

public class TV {

	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;

		this.estado = estado;

	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Marca getMarca() {
		return marca;

	}

	public void setControl(Control control) {
		this.control = control;
	}

	public Control getControl() {
		return control;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setCanal(int canal) {
		if (estado) {
			if (canal <= 120 && canal >= 1) {
				this.canal = canal;
			}
		}

	}

	public int getCanal() {
		return canal;
	}

	public void turnOn() {
		if (estado) {
			return;
		} else {
			estado = true;
		}
	}

	public void turnOff() {
		if (!estado) {
			return;
		} else {
			estado = false;
		}

	}

	public boolean getEstado() {
		return estado;
	}

	public void canalUp() {
		if (estado) {

			if (canal == 120) {
				return;
			} else {
				canal = canal + 1;
			}
		}
	}

	public void canalDown() {
		if (estado) {

			if (canal == 1) {
				return;
			} else {
				canal = canal - 1;
			}
		}
	}

	public void volumenUp() {
		if (estado) {

			if (canal == 7) {
				return;
			} else {
				volumen = volumen + 1;
			}
		}
	}

	public void volumenDown() {
		if (estado) {
			if (volumen == 1) {
				return;
			} else {
				volumen = volumen - 1;
			}
		}
	}

}
