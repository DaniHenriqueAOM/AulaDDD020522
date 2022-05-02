package fiap;

import javax.swing.JOptionPane;

public class PraticandoPalavra {

	public static void main(String[] args) {
		String frase;
		frase = JOptionPane.showInputDialog("Digite uma frase: ");
		JOptionPane.showMessageDialog(null, frase);
		
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, "Quandidade de caracteres: " + qtChar);
		
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		
		String palavra1, palavra2;
		palavra1 = JOptionPane.showInputDialog("Digite a palavra que deseja modificar: ");
		palavra2 = JOptionPane.showInputDialog("Digite a palavra que deseja colocar no lugar da anterior: ");
		String frase2 = frase.replace(palavra1, palavra2);
		JOptionPane.showMessageDialog(null, frase2);
		
		int qtChar2 = frase2.length();
		JOptionPane.showMessageDialog(null, "Quandidade de caracteres: " + qtChar2);
	}
}
