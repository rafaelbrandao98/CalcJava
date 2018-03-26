import javax.swing.JOptionPane;

public class Calcular {

	    double valor1;
	    double valor2;
	    double resultado;
	 
	    void menuCalculadora()
	   {
	         Calculadora calc = new Calculadora();
	        
	         int opcao;
	         String menu = "Escolha Uma Operação\n\n"+
	                                "1-Somar\n"+
	                                "2-Subtrair\n"+
	                                "3-Multiplicar\n"+
	                                "4-Dividir\n";
	        
	         opcao=1;
	         while (opcao != 5 )
	         {
	               opcao = Integer.parseInt(
	                          JOptionPane.showInputDialog(null,
	                          menu,"Calculadora InstaShop",
	                          JOptionPane.QUESTION_MESSAGE));
	              
	               switch (opcao)
	               {
	                     case 1:  
	                          valor1 = lerValor("Digite o primeiro número para Soma:");
	                          valor2 = lerValor("Digite o segundo número Para Soma:");
	                          resultado = calc.somar(valor1, valor2);
	                          mostrarResultado("Somar");
	 
	                     case 2:  //subtrair
	                    	 valor1 = lerValor("Digite o primeiro número para Subtração:");
	                          valor2 = lerValor("Digite o segundo número para Subtração:");
	                          resultado = calc.subtrair(valor1, valor2);
	                          mostrarResultado("Subtrair");
	                          
	                     case 3:  //multiplicar
	                    	 valor1 = lerValor("Digite o primeiro número para multiplicação:");
	                          valor2 = lerValor("Digite o segundo número para multiplicação:");
	                          resultado = calc.multiplicar(valor1, valor2);
	                          mostrarResultado("Multiplicar");
	                          
	                     case 4:  //dividir
	                    	 valor1 = lerValor("Digite o primeiro número para divisão:");
	                          valor2 = lerValor("Digite o segundo número para divisão:");
	                          resultado = calc.dividir(valor1, valor2);
	                          mostrarResultado("Dividir");
	 
	               }
	         }
	                    
	   }
  
	    double lerValor(String mensagem) {
	         double valor;
	         String strValor;
	         strValor = JOptionPane.showInputDialog(null,
	                     mensagem,"Entrada de Dados...",
	                     JOptionPane.QUESTION_MESSAGE);
	         valor = Double.parseDouble(strValor);
	         return valor;
	   }
	  
	    void mostrarResultado(String operacao){
	         JOptionPane.showMessageDialog(null,
	                     String.format("Resultado da Operação de %s:\n"+
	                                "%.2f e %.2f resulta em %.2f",
	                                operacao,valor1,valor2,resultado),
	                                "Resultado",JOptionPane.PLAIN_MESSAGE);

	   }
}

