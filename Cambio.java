
import javax.swing.JOptionPane;

public class Cambio {	
	public static void moeda() {
	while (true ) {
	String opcao2 = JOptionPane.showInputDialog ("Escolha a opção de moeda para a qual deseja fazer conversão:"
			+ "\n1 - De real para dolar "
			+ "\n2 - De real para libra esterlina"
			+ "\n3 - De real para peso argentino"
			+ "\n4 - De real para peso chileno "
			+ "\n5 - De real para euro "
			+ "\n6 - De pesos argentinos para real"
			+ "\n7 - De pesos chileno para real "
			+ "\n8 - De libra esterlina para real "
			+ "\n9 - De euro para real"
			+ "\n10 - De dolar para real");
	
	int escolheMoeda = Integer.parseInt(opcao2);
	double valorRecebido = Double.parseDouble (JOptionPane.showInputDialog("Insira um valor"));   { 
		
	final double dolar = 5.00;
	final double libraEsterlina = 6.87;
	final double pesoArgentino = 0.05;
	final double pesoChileno = 0.06;
	final double euro = 5.80;
	final double real = 0.50;
 
	switch (escolheMoeda) {
	case 1: 
		double realDolar= valorRecebido / dolar;
		realDolar = (double) Math.round(realDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá $"  + realDolar);
		break;
	case 2:
		double realLibraEsterlina = valorRecebido / libraEsterlina;
		realLibraEsterlina = (double) Math.round(realLibraEsterlina* 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá $"  + realLibraEsterlina);
		break;
	case 3:
		double realPesoArgentino= valorRecebido / pesoArgentino;
		realPesoArgentino= (double) Math.round(realPesoArgentino * 100d)/100;
		JOptionPane.showMessageDialog(null,  "Você terá $" + realPesoArgentino);
		break;
	case 4:
		double realPesoChileno = valorRecebido / pesoChileno ;
		realPesoChileno = (double) Math.round(realPesoChileno * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá $ " + realPesoChileno );
		break;
	case 5:
		double realEuro= valorRecebido / euro;
		realEuro = (double) Math.round(realEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá € " + realEuro);
		break;
	case 6:
		double pesoArgentinoReal = valorRecebido / real;
		pesoArgentinoReal = (double) Math.round(pesoArgentinoReal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá R$ " + pesoArgentinoReal );
		break;
	case 7:
		double pesoChilenoReal = valorRecebido / real;
		pesoChilenoReal = (double) Math.round(pesoChilenoReal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá R$ " + pesoChilenoReal);
		break;
	case 8:									
		double libraEsterlinaReal = valorRecebido / real;
		libraEsterlinaReal = (double) Math.round(libraEsterlinaReal* 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá R$ " + libraEsterlinaReal);
		break;
	case 9:					
		double euroReal = valorRecebido / real;
		euroReal = (double) Math.round(euroReal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá R$ " + euroReal )	;
		break;
	case 10:						
		double dolarReal = valorRecebido / real ;
		dolarReal = (double) Math.round(dolarReal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você terá R$ " + dolarReal );
		break;
	default:
		JOptionPane.showMessageDialog(null, "Opção inválida!");
		break;
	}
	return;
	}
	}
	}
	}
