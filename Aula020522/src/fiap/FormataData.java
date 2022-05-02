package fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class FormataData {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate FimDosTempos = LocalDate.parse("2012-12-21");
		
		// obtendo período de tempo entre as datas.
		Period periodo = Period.between(dataAtual, FimDosTempos);
		JOptionPane.showMessageDialog(null, periodo.getYears() + " anos");
		JOptionPane.showMessageDialog(null, periodo.getMonths() + " meses");
		JOptionPane.showMessageDialog(null, periodo.getDays() + " dias");
		
		// Formatando a data no padrão dia-mês-ano
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = FimDosTempos.format(dft);
		JOptionPane.showMessageDialog(null, dataFormatada);
		
	}
}
