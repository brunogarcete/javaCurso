
package unidad2;
import java.text.NumberFormat;
import java.util.Locale;

public class Utilidades {
    public static String formatearNumero(int num) {
        String texto;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
        texto = nf.format(num);
        return texto;
    }
}
