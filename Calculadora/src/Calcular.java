import javax.swing.JOptionPane;

public class Calcular {

	    double valor1;
	    double valor2;
	    double resultado;
	 
	    void menuCalculadora()
	   {
	         Calculadora calc = new Calculadora();
	        
	         int opcao;
	         String menu = "Escolha Uma Opera��o\n\n"+
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
	                          valor1 = lerValor("Digite o primeiro n�mero para Soma:");
	                          valor2 = lerValor("Digite o segundo n�mero Para Soma:");
	                          resultado = calc.somar(valor1, valor2);
	                          mostrarResultado("Somar");
	 
	                     case 2:  //subtrair
	                    	 valor1 = lerValor("Digite o primeiro n�mero para Subtra��o:");
	                          valor2 = lerValor("Digite o segundo n�mero para Subtra��o:");
	                          resultado = calc.subtrair(valor1, valor2);
	                          mostrarResultado("Subtrair");
	                          
	                     case 3:  //multiplicar
	                    	 valor1 = lerValor("Digite o primeiro n�mero para multiplica��o:");
	                          valor2 = lerValor("Digite o segundo n�mero para multiplica��o:");
	                          resultado = calc.multiplicar(valor1, valor2);
	                          mostrarResultado("Multiplicar");
	                          
	                     case 4:  //dividir
	                    	 valor1 = lerValor("Digite o primeiro n�mero para divis�o:");
	                          valor2 = lerValor("Digite o segundo n�mero para divis�o:");
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
	                     String.format("Resultado da Opera��o de %s:\n"+
	                                "%.2f e %.2f resulta em %.2f",
	                                operacao,valor1,valor2,resultado),
	                                "Resultado",JOptionPane.PLAIN_MESSAGE);

	   }
}

