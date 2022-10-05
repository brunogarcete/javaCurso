package tp_1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestVendedor {
    public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);
        Logger logger = Logger.getLogger(TestVendedor.class.getName());
        
        Vendedor[][] vendedorTienda = new Vendedor[20][12];
        
        for (int i = 0; i < vendedorTienda.length; i++) {
            for (int j = 0; j < vendedorTienda[0].length; j++) {
                logger.log( Level.INFO, "Total de ventas del vendedor : {0} : ", ( i + 1 ));
                logger.log( Level.INFO, "Mes nro : {0} : ", ( j + 1 ) );
                vendedorTienda[i][j] = new Vendedor(entrada.nextDouble());
            }
        }
        
        
        vendedorTienda[0][0] = new Vendedor(3000000); /* venta vendedor 1 mes de enero */
        
        logger.log( Level.INFO, "Monto mas comision vendedor 1 en el mes de enero es : {0} ", vendedorTienda[0][0].montoConComision() );
        logger.log( Level.INFO, "Comision vendedor 1 en el mes de enero es : {0} ", vendedorTienda[0][0].comision() );
        
    }
}
