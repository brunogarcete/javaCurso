package tp_1;

public class Vendedor {
    private double montoSinComision;
    private double comision;

    // Metodos Constructores
    public Vendedor() {
    }

    public Vendedor(double montoSinComision) {
        this.montoSinComision = montoSinComision;
    }


    public Vendedor(double montoSinComision, double comision) {
        this.montoSinComision = montoSinComision;
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getMontoSinComision() {
        return montoSinComision;
    }

    public void setMontoSinComision(double montoSinComision) {
        this.montoSinComision = montoSinComision;
    }

    
    public double comision() {
        if ( montoSinComision >= 0 && montoSinComision < 3000000 ) {
            return ( montoSinComision * (0.02) );
        }
        
        if ( montoSinComision >= 3000000 && montoSinComision < 6000000 ) {
            return ( montoSinComision * (0.04) );
        }

        if ( montoSinComision <= 6000000 ) {
            return ( montoSinComision * (0.06) );
        }   
        return 0;
    }
    
    public double montoConComision(){
        if ( montoSinComision >= 0 && montoSinComision < 3000000 ) {
            return (montoSinComision + montoSinComision * (0.02) );
        }
        
        if ( montoSinComision >= 3000000 && montoSinComision < 6000000 ) {
            return ( montoSinComision + montoSinComision * (0.04) );
        }

        if ( montoSinComision <= 6000000 ) {
            return ( montoSinComision + montoSinComision * (0.06) );
        } 
        return 0;
    }
    
}
