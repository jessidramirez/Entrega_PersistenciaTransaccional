
package Entidades;


public class Departamentos {
    private int DPTO_ID;
    private String DPTO_NOMBRE;
    private int DPTO_LOCALIZ_ID;

    public Departamentos(int DPTO_ID, String DPTO_NOMBRE, int DPTO_LOCALIZ_ID) {
        this.DPTO_ID = DPTO_ID;
        this.DPTO_NOMBRE = DPTO_NOMBRE;
        this.DPTO_LOCALIZ_ID = DPTO_LOCALIZ_ID;
    }

    public int getDPTO_ID() {
        return DPTO_ID;
    }

    public void setDPTO_ID(int DPTO_ID) {
        this.DPTO_ID = DPTO_ID;
    }

    public String getDPTO_NOMBRE() {
        return DPTO_NOMBRE;
    }

    public void setDPTO_NOMBRE(String DPTO_NOMBRE) {
        this.DPTO_NOMBRE = DPTO_NOMBRE;
    }

    public int getDPTO_LOCALIZ_ID() {
        return DPTO_LOCALIZ_ID;
    }

    public void setDPTO_LOCALIZ_ID(int DPTO_LOCALIZ_ID) {
        this.DPTO_LOCALIZ_ID = DPTO_LOCALIZ_ID;
    }
    
}
