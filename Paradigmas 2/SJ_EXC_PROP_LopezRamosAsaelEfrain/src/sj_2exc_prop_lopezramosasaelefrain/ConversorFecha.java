package sj_2exc_prop_lopezramosasaelefrain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorFecha {
    public Date convertirFecha(String fechaTexto) throws ParseException{
        Date fecha;
        
        fecha = SimpleDateFormat(fechaTexto);
        
        return fecha;
    }
}
