package mx.com.beans;

public class Traductor {

	private InterpreteSpanish interprete;
	private String nombre;
	
	public void hablar(){
		this.interprete.saludar();
		System.out.println(nombre);
		this.interprete.despedirse();
	}

	public InterpreteSpanish getInterprete() {
		return interprete;
	}

	public void setInterprete(InterpreteSpanish interprete) {
		this.interprete = interprete;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
