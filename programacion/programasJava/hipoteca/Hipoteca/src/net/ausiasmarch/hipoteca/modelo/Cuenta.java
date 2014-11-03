package net.ausiasmarch.hipoteca.modelo;

/**
 *
 * @author Luis
 */
public class Cuenta {
    private String banco;
    private String sucursal;
    private String dc;
    private String cuenta;
    private String ccc;
    private String mensaje;

    public Cuenta(String ccc) {
        this.ccc = ccc;
        banco = ccc.substring(0, 4);
        sucursal = ccc.substring(4, 8);
        dc = ccc.substring(8, 10);
        cuenta = ccc.substring(10, 20);
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    /*
     * Valida la cuenta 
     */
    public int validate() {
       


        
        
        return 0;
    }
    
    
    /* 
     * Obtiene el digito de control calculado
     */ 
    public String getDCCalculado(){
        String dcCalculado = null;
        
        // Obtencion del primer digito de control
        int dc1 = 0;
        dc1 = dc1 + Integer.parseInt(banco.substring(0, 1)) * 4;
        dc1 = dc1 + Integer.parseInt(banco.substring(1, 2)) * 8;
        dc1 = dc1 + Integer.parseInt(banco.substring(2, 3)) * 5;
        dc1 = dc1 + Integer.parseInt(banco.substring(3, 4)) * 10;
        dc1 = dc1 + Integer.parseInt(sucursal.substring(0, 1)) * 9;
        dc1 = dc1 + Integer.parseInt(sucursal.substring(1, 2)) * 7;
        dc1 = dc1 + Integer.parseInt(sucursal.substring(2, 3)) * 3;
        dc1 = dc1 + Integer.parseInt(sucursal.substring(3, 4)) * 6;

        dc1 = dc1 % 11;
        dc1 = 11 - dc1;
        if (dc1 == 10) {
            dc1 = 1;
        }
        if (dc1 == 11) {
            dc1 = 0;
        }
        


        
        
        
      
        
        
        
        
        
        
        return dcCalculado;   
    }
}
