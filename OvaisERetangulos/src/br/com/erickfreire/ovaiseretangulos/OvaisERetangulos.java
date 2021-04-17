package br.com.erickfreire.ovaiseretangulos;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha Ovais e Retangulos
 * @author Erick Freire
 * @version 1 - Criado em 17-04-2021 as 15:18
 */

public class OvaisERetangulos extends JPanel {
	
	private int escolha;
	
	public OvaisERetangulos(int escolhaDoUsuario) {
		escolha = escolhaDoUsuario;
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(int i = 0; i < 10; i++) {
			
			switch (escolha)
			{
			
			case 1:
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
				
			case 2:
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			
			}
			
			
		}
		
	}

}
