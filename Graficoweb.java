
import javax.swing.*;

import java.awt.event.*;
import java.awt.Color;

public class Graficoweb extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcao1;
	private JMenuItem opcao2;	
	private JMenuItem opcao3;
	
	public Graficoweb() {
		
		setSize(700,500);

		setLocationRelativeTo(null);
		setTitle("CONVERSOR DE MOEDAS BRASIL");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel painel = new JPanel();
		painel.setBackground(new Color(190, 200, 230));
		main();
		painel.add(menuBar);
		add(painel);
}
	
	public void main (){
		menuBar = new JMenuBar();
		menu = new JMenu(" Escolha uma Opção ");
		opcao1 = new JMenuItem ("Conversor de Moedas");
		opcao2 = new JMenuItem ("Conversor de Medidas");
		opcao3 = new JMenuItem ("Sair");
		
		menu.add(opcao1);
		menu.add(opcao2);
		menu.add(opcao3);

		
		menuBar.add(menu);
		opcao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   	JOptionPane.showMessageDialog(null, "OK - Conversor de Moedas");
		    	Cambio.moeda();	
}
		});
		opcao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null, "OK - Conversor de Medidas");
		    	Distancias.medidas();
}
		});
		opcao3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sair do Conversor");
				System.exit(0);
}
		});
}
	public static void main(String[] args) {
		Graficoweb janela = new Graficoweb();
		janela.setVisible(true);
}

}
