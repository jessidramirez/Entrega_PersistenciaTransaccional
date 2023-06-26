package Entidades;

public class Paises {
    private int PAIS_ID;
    private String PAIS_NOMBRE;

    public Paises(int id, String nombre) {
        this.PAIS_ID = id;
        this.PAIS_NOMBRE = nombre;
    }

    public int getPAIS_ID() {
        return PAIS_ID;
    }

    public void setPAIS_ID(int PAIS_ID) {
        this.PAIS_ID = PAIS_ID;
    }

    public String getPAIS_NOMBRE() {
        return PAIS_NOMBRE;
    }

    public void setPAIS_NOMBRE(String PAIS_NOMBRE) {
        this.PAIS_NOMBRE = PAIS_NOMBRE;
    }
    
    
}
