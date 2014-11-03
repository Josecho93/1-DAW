package net.ausiasmarch.hipoteca.modelo;

/**
 *
 * @author Luis
 */
public class Nif {

    private String nifnie;
    private String mensaje;

    public Nif(String nifnie) {
        this.nifnie = nifnie;
    }

    public boolean isNifValid() {
        final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        final String regExp = "^X(-|\\s)?\\d{7}(-|\\s)?[A-Za-z]|\\d?\\d{7}(-|\\s)?[A-Za-z]$";
        int dni;
        char letra;
        String cadenas[];

        if (nifnie.matches(regExp) == false) {
            mensaje = "NIF/NIE con formato no valido";
            return false;
        }

        if (nifnie.startsWith("X")) {     // es un NIE
            if (nifnie.charAt(1) == ' ' || nifnie.charAt(1) == '-') {
                nifnie = nifnie.substring(2);
            } else {
                nifnie = nifnie.substring(1);
            }
        }
        if (nifnie.indexOf('-') != -1 || nifnie.indexOf(' ') != -1) { // es un NIF
            cadenas = nifnie.split("-|\\s");
            dni = Integer.parseInt(cadenas[0]);
        } else {
            dni = Integer.parseInt(nifnie.substring(0, nifnie.length() - 1));
        }

        letra = letras.charAt(dni % 23);
        nifnie = nifnie.toUpperCase();

        if (nifnie.endsWith(" " + letra) || nifnie.endsWith("-" + letra) || nifnie.endsWith("" + letra)) {
            return true;
        } else {
            mensaje = "La letra del NIF/NIE no es valida";
            return false;
        }
    }

    public String getMensaje() {
        return mensaje;
    }
    
    
}
