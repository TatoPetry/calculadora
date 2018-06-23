package teste.java.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.calculadora.Soma;

public class CalculadoraTeste {
     public int valorX, valorY, resposta;
     
     @Before
     public void atribuiValores() {
    	 valorX = 10;
    	 valorY = 6;
    	 resposta = 15;
     }
     @After
     public void exibeValores() {
    	 Soma soma = new Soma();
    	 
    	 System.out.println("esperado : "+ valorX+" + "+ valorY+" = "+resposta);
    	 System.out.println("Gerado: "+valorX+" + "+ valorY+" = "+soma.Calc(valorX, valorY));
     }
     @Test
     public void somarValorXValorY() {
    	 Soma soma = new Soma();
    	 
    	 assertEquals(resposta, soma.Calc(valorX, valorY));
     }
}
