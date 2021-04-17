package br.com.erickfreire.ovaiseretangulos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OvaisERetangulosTeste {
	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Informe 1 para retangulos \n"
				+ "Informe 2 para Ovais\n");
		
		int escolha = Integer.parseInt(entrada);
		
		OvaisERetangulos painel = new OvaisERetangulos(escolha);
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(300,300);
		aplicacao.setVisible(true);
		
	}

}
