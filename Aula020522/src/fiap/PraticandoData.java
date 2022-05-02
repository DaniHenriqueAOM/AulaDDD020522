package fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class PraticandoData {

	public static void main(String[] args) {
		String dataIn, dataFi;
		
		dataIn = JOptionPane.showInputDialog("Digite a data 1:");
		dataFi = JOptionPane.showInputDialog("Digite a data 2:");
		
		DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dataFormatada3 = dataIn.formatted(dft2);
		String dataFormatada4 = dataFi.formatted(dft2);
		
		LocalDate data1 = LocalDate.parse(dataIn);
		LocalDate data2 = LocalDate.parse(dataFi);
		
		//formatando a data
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada1 = data1.format(dft);
		String dataFormatada2 = data2.format(dft);
		Period periodo = Period.between(data1, data2);
		
		
		JOptionPane.showMessageDialog(null, "Data Inicial: " + dataFormatada1 +
				"\nData Final: " + dataFormatada2 + 
				"\nEntre as datas forenecidas, existem: " + periodo.getYears() + " anos" +
				periodo.getMonths() + " meses" + periodo.getDays() + " dias");
		
		
	}
}
