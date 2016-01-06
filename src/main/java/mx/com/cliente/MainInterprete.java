package mx.com.cliente;

import mx.com.beans.InterpreteSpanish;
import mx.com.beans.Traductor;

public class MainInterprete {

	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpreteSpanish interprete = new InterpreteSpanish();
		
		/**
		 * El interprete se inyecta de manera manual y solamente
		 * puede recibir un interprete en español
		 * no un interprete en ingles u otros idiomas.
		 */
		traductor.setInterprete(interprete);
		traductor.setNombre("Fredy Vazquez");
		traductor.hablar();
	}
}
