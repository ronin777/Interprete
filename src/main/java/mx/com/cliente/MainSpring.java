package mx.com.cliente;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.beans.Traductor;

public class MainSpring {

	public static void main(String[] args) {
		//se crear una instancia de la fabrica de spring del archivo applicationContext.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//se pide el traductor de tipo español y ha si se evita el inteprete por clase
		Traductor traductorSpanish = (Traductor) factory.getBean("traductorSpanish");
		traductorSpanish.hablar();
		
		Traductor traductorEnglish = (Traductor) factory.getBean("traductorEnglish");
		traductorEnglish.hablar();
	}
	
}
