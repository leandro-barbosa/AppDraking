package auxiliar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constante {
	public static final String VERSAO = "1.0.0";
	public static String obterDataFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
        return df.format(data);
	}

}
