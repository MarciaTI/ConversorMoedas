
import java.text.*;
import javax.swing.*;
public class Distancias {
	public static void medidas() {
	while (true) {
	String opcao3 = JOptionPane.showInputDialog ("Escolha a medida que você deseja converter"
			+ "\n1 - De metros para kilometros, "
			+ "\n2 - De kilometros para metros,");
	int escolheMedida = Integer.parseInt(opcao3);
	double valorMedida = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da medida que deseja converter"));{						 			
	    double metrosKm = valorMedida / 1000;
	    double KmMetros = valorMedida * 1000;
    switch (escolheMedida) {
    case 1:
    	JOptionPane.showMessageDialog(null, "A medida será de " + new DecimalFormat ("##.##").format(metrosKm) + " km");
    	return;
    case 2:
    	JOptionPane.showMessageDialog(null, "A medida será de " + new DecimalFormat ("##.##").format(KmMetros) + " m");
   	return;	
    default:
        JOptionPane.showMessageDialog(null, "Opção inválida!");
        break;
    }     	

        
    }			
}
	}
}

