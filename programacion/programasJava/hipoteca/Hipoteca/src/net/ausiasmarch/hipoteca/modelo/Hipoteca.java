package net.ausiasmarch.hipoteca.modelo;

/**
 * Calcular una hipoteca
 * @author Programador
 */

public class Hipoteca {

  // VARIABLES (Propiedades) ............................................
    private double ingresosMensuales;
    private double importePrestamo;
    private double euribor;
    private double diferencial;
    private int anyos;
    private int edad;
    private boolean funcionario;
    private boolean contratadoSeguroVida;
    private boolean contratadoNomina;
    private boolean contratadoTarjeta;
    private boolean contratadoPension;
    private String mensaje;
    private StringBuilder sb;

    // MÉTODOS (Funciones) set (poner) / get (obtener) las propiedades
    
    /**
     * Obtiene mensaje
     * @return mensaje
     */
    public String getMensaje(){
        return mensaje;
    }
    /**
     * Establece el mensaje
     * @param mensaje
     */
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    /**
     * Obtiene los Ingresos Mensuales
     * @return Los Ingresos Mensuales
     */
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    /**
     * Establece los IngresosMensuales
     * @param ingresosMensuales Los Ingresos Mensuales
     */
    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    /**
     * Obtiene la edad
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad
     * @param edad La edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene si la persona que solicita la hipoteca es funcionaria
     * @return Si la persona es funcionaria.
     */
    public boolean isFuncionario() {
        return funcionario;
    }

    /**
     * Establece si la persona que solicita la hipoteca es funcionaria
     * @param funcionario Si la persona es funcionaria.
     */
    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * Obtiene el importe que se solicita de préstamo
     * @return El importe que se solicita de préstamo
     */
    public double getImportePrestamo() {
        return importePrestamo;
    }

    /**
     * Establece el importe que se solicita de préstamo
     * @param importePrestamo El importe que se solicita de préstamo
     */
    public void setImportePrestamo(double importePrestamo) {
        this.importePrestamo = importePrestamo;
    }

    /**
     * Obtiene el valor del Euribor
     * @return El valor del Euribor
     */
    public double getEuribor() {
        return euribor;
    }

    /**
     * Establece el valor del Euribor
     * @param euribor El valor del Euribor
     */
    public void setEuribor(double euribor) {
        this.euribor = euribor;
    }

    /**
     * Obtiene el diferencial que aplica el banco al euribor
     * @return el diferencial que aplica el banco al euribor
     */
    public double getDiferencial() {
        return diferencial;
    }

    /**
     * Establece el diferencial que aplica el banco al euribor
     * @param diferencial El diferencial que aplica el banco al euribor
     */
    public void setDiferencial(double diferencial) {
        this.diferencial = diferencial;
    }

    /**
     * Obtiene el nº de años a devolver el préstamo
     * @return el nº de años a devolver el préstamo
     */
    public int getAnyos() {
        return anyos;
    }

    /**
     * Establece el nº de años a devolver el préstamo
     * @param anyos El nº de años a devolver el préstamo
     */
    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    /**
     * Obtiene si se ha contratado el Seguro de Vida
     * @return Si se ha contratado el Seguro de Vida
     */
    public boolean isContratadoSeguroVida() {
        return contratadoSeguroVida;
    }

    /**
     * Establece si se ha contratado el Seguro de Vida
     * @param contratadoSeguroVida Si se ha contratado el Seguro de Vida
     */
    public void setContratadoSeguroVida(boolean contratadoSeguroVida) {
        this.contratadoSeguroVida = contratadoSeguroVida;
    }

    /**
     * Obtiene si se ha contratado la Nomina
     * @return si se ha contratado la Nomina
     */
    public boolean isContratadoNomina() {
        return contratadoNomina;
    }

    /**
     * Establece si se ha contratado la Nomina
     * @param contratadoNomina Si se ha contratado la Nomina
     */
    public void setContratadoNomina(boolean contratadoNomina) {
        this.contratadoNomina = contratadoNomina;
    }

    /**
     * Obtiene si se ha contratado la tarjeta de crédito
     * @return Si se ha contratado la tarjeta de crédito
     */
    public boolean isContratadoTarjeta() {
        return contratadoTarjeta;
    }

    /**
     * Establece si se ha contratado la tarjeta de crédito
     * @param contratadoTarjeta Si se ha contratado la tarjeta de crédito
     */
    public void setContratadoTarjeta(boolean contratadoTarjeta) {
        this.contratadoTarjeta = contratadoTarjeta;
    }

    /**
     * Obtiene si se ha contratado el plan de pensiones
     * @return Si se ha contratado el plan de pensiones
     */
    public boolean isContratadoPension() {
        return contratadoPension;
    }

    /**
     * Establece si se ha contratado el plan de pensiones
     * @param contratadoPension Si se ha contratado el plan de pensiones
     */
    public void setContratadoPension(boolean contratadoPension) {
        this.contratadoPension = contratadoPension;
    }

  /***************************************************************************
   * METODOS (Funciones)
   ***************************************************************************/

   // Método para reglas de validación ......................................

    /**
     * Obtiene si la hipoteca está o no concedida.
     * @return Retorna 0 si la hipoteca está concedida o un valor entre 1 y 10
     * si no lo está, según los las siguientes reglas de validación:
     * 1: La suma de tus años y el tiempo de la hipoteca supera los 80
     * 2: Los años de la hipoteca no pueden ser menor que 1
     * 3: La edad no puede ser menor que 18
     * 4: El 40% de tu sueldo es menor que la cuota mensual
     * 5: El 30% de tu sueldo es menor que la cuota mensual
     * 6: Si tiene más de 50 años debe contratar el seguro de vida
     * 7: El diferencial no puede ser menor de 0,6
     * 8: El Euribor no puede ser menor de 3
     * 9: Tienes que contratar por lo menos 1 producto
     *10: Tienes que contratar por lo menos 2 productos
     */
    public boolean validate() {
        sb = new StringBuilder();
        //1: La suma de los años y el tiempo de la hipoteca superan los 80.
        if (edad + anyos > 80) {
           // mensaje = "La suma de tus años y el tiempo de la hipoteca supera"
             //       + " los 80";
            //return 1;
            sb.append("La suma de tus años y el tiempo de la hipoteca supera\n");
        }

        //2: Los años de la hipoteca no pueden ser menor que 1
        if (anyos < 1) {
            //mensaje = "Los años de la hipoteca no pueden ser menor que 1";
            //return 2;
            sb.append("Los años de la hipoteca no pueden ser menor que 1\n");
        }
           
        //3: La edad no puede ser menor que 18 años
       if(edad < 18) {
           //mensaje = "La edad no puede ser menor que 18 años";
           //return 3;
           sb.append("La edad no puede ser menor que 18 años\n");
       }
                
        // 4: Si es funcionario, el 40% de tu saldo es menor que la cuota mensual.
       if(funcionario){
           double porcentajeMensual= getIngresosMensuales() * 0.4;
           if (porcentajeMensual < getCuotaMensual()){
           //mensaje = "Si es funcionario, el 40% de tu saldo es menor que la"
             //      + "cuota mensual.";   
           //return 4;
               sb.append("Si es funcionario, el 40% de tu saldo es menor que la cuota mensual.\n");
           }      
       }
       // 5: si NO es funcionario,el 30% de tu saldo es menor que la cuota mensual.
       else{
           double porcentajeMensual= getIngresosMensuales() * 0.3;
           if (porcentajeMensual < getCuotaMensual()){
           //mensaje = "si NO es funcionario,el 30% de tu saldo es menor que la"
             //      + " cuota mensual.";   
           //return 5;
               sb.append("si NO es funcionario,el 30% de tu saldo es menor que la cuota mensual\n");
           }
       }

       //6: Si tienes más de 50 años es obligatorio el seguro de vida.
       if(edad > 50 && !contratadoSeguroVida){
           //mensaje = "Si tienes más de 50 años es obligatorio el"
             //      + " seguro de vida.";
           //return 6;
           sb.append("Si tienes más de 50 años es obligatorio el seguro de vida\n");
       }

       //7: El diferencial nunca puede ser menor de 0,6
       if (diferencial < 0.6){
           //mensaje = "El diferencial nunca puede ser menor de 0,6";
           //return 7;
            sb.append("El diferencial nunca puede ser menor de 0,6\n");
       }
       
       //8: El Euribor nunca puede ser menor o igual que 0
       
       if (euribor <= 0){
           //mensaje = "El Euribor nunca puede ser menor o igual que 0";
           //return 8;
           sb.append("El Euribor nunca puede ser menor o igual que 0\n");
       } 

       // Obtener numContratados (numero de productos contratados)
        

       // 9: Si eres funcionario tienes que contratar por lo menos 1 producto.
       int numContratados = 0;//Contador
        if(contratadoSeguroVida){
            numContratados++;
        }
        if(contratadoNomina){
            numContratados++;
        }
        if(contratadoTarjeta){
            numContratados++;
        }
        if(contratadoPension){
            numContratados++;
        }
        
        if(funcionario && numContratados < 1){
            //mensaje = "Si eres funcionario tienes que contratar por lo menos"
              //      + " 1 producto.";
            //return 9;
            sb.append("Si eres funcionario tienes que contratar por lo menos 1 producto\n");
        }
        
        // 10: Si No eres funcionario hay que contratar por lo menos 2 productos.
        if(!funcionario && numContratados < 2){
            //mensaje = "Si No eres funcionario hay que contratar por lo menos"
              //      + " 2 productos.";
            //return 10;
            sb.append("Si No eres funcionario hay que contratar por lo menos 2 productos\n");
        }

        //return 0;  // devuelve 0 si todos los datos son validos
        
        mensaje = sb.toString();
        return mensaje.isEmpty();
    }

    
   // Metodos para cálculos ..................................................

    /**
     * Obtiene el importe a pagar mensualmente por el préstamo.
     * @return El importe a pagar mensualmente por el préstamo.
     */
    public double getCuotaMensual() {
    
        // Calcula la cuota mensual
        return (importePrestamo* (getInteresAnual()/12)) /
        (100 * (1 - Math.pow(1 + (getInteresAnual()/1200), - (anyos*12) )));
    }
    
     /**
     * Obtiene el % interes anual que aplicará a la hipoteca, sumando al  
     * euribor el diferencial real
     * @return El % interes anual
     */
    public double getInteresAnual() {
        // Calcula el interes anual
        return euribor + getDiferencialReal();       
    }
    
     /**
     * Obtiene el diferencial real para el calculo de los intereses
     * @return El diferencial real
     */
    public double getDiferencialReal() {      
        double diferencialReal = diferencial;
        
        //calculo del diferencial real en funcion de los productos contratados
        if (contratadoSeguroVida) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoNomina) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoTarjeta) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoPension) {
            diferencialReal = diferencialReal - 0.1;
        }
        
        return diferencialReal;
    }


}// fin class Hipoteca
