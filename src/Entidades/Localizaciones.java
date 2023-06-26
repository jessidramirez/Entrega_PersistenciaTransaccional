package Entidades;

public class Localizaciones {
    private int LOCALIZACIONES_ID;
    private String LOCALIZ_NOMBRE;
    private int CIUDADES_CIUD_ID;

    public Localizaciones(int id, String nombre, int ciudad_id) {
        this.LOCALIZACIONES_ID = id;
        this.LOCALIZ_NOMBRE = nombre;
        this.CIUDADES_CIUD_ID = ciudad_id;
    }

    public int getLOCALIZACIONES_ID() {
        return LOCALIZACIONES_ID;
    }

    public void setLOCALIZACIONES_ID(int LOCALIZACIONES_ID) {
        this.LOCALIZACIONES_ID = LOCALIZACIONES_ID;
    }

    public String getLOCALIZ_NOMBRE() {
        return LOCALIZ_NOMBRE;
    }

    public void setLOCALIZ_NOMBRE(String LOCALIZ_NOMBRE) {
        this.LOCALIZ_NOMBRE = LOCALIZ_NOMBRE;
    }

    public int getCIUDADES_CIUD_ID() {
        return CIUDADES_CIUD_ID;
    }

    public void setCIUDADES_CIUD_ID(int CIUDADES_CIUD_ID) {
        this.CIUDADES_CIUD_ID = CIUDADES_CIUD_ID;
    }
    
    
}
