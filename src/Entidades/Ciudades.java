
package Entidades;

public class Ciudades {
    private int CIUD_ID;
    private String CIUD_NOMBRE;
    private int PAISES_PAIS_ID;

    public Ciudades(int CIUD_ID, String CIUD_NOMBRE, int PAISES_PAIS_ID) {
        this.CIUD_ID = CIUD_ID;
        this.CIUD_NOMBRE = CIUD_NOMBRE;
        this.PAISES_PAIS_ID = PAISES_PAIS_ID;
    }

    public int getCIUD_ID() {
        return CIUD_ID;
    }

    public void setCIUD_ID(int CIUD_ID) {
        this.CIUD_ID = CIUD_ID;
    }

    public String getCIUD_NOMBRE() {
        return CIUD_NOMBRE;
    }

    public void setCIUD_NOMBRE(String CIUD_NOMBRE) {
        this.CIUD_NOMBRE = CIUD_NOMBRE;
    }

    public int getPAISES_PAIS_ID() {
        return PAISES_PAIS_ID;
    }

    public void setPAISES_PAIS_ID(int PAISES_PAIS_ID) {
        this.PAISES_PAIS_ID = PAISES_PAIS_ID;
    }
    
}
