package fiap;

import javax.swing.JOptionPane;

public class ComparaString {

	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha:");
		
		// equals
		if (senha.equals("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Acesso autorizado.");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso negado.");
		}

		// equalsIgnoreCase
		if (senha.equalsIgnoreCase("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Acesso concedido.");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso impedido.");
		}
		
	}
}
