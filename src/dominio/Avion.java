package dominio;

import tads.ListaSimple;

public class Avion implements Comparable<Avion> {

    private String codigo;
    private int capacidadMax;
    private Aerolinea nomAerolinea;

    public Avion(String _codigo, int _capacidadMax, Aerolinea _nomAerolinea) {
        this.setCodigo(_codigo);
        this.setCapacidadMax(_capacidadMax);
        this.setNomAerolinea(_nomAerolinea);

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public String toString() {
        return this.getCodigo() + "-" + getCapacidadMax();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Avion avion = (Avion) obj;
        return codigo.equalsIgnoreCase(avion.codigo)
                && nomAerolinea.equals(avion.nomAerolinea);
    }

    public Aerolinea getNomAerolinea() {
        return nomAerolinea;
    }

    public void setNomAerolinea(Aerolinea nomAerolinea) {
        this.nomAerolinea = nomAerolinea;
    }

    @Override
    public int compareTo(Avion o) {
        return this.getCodigo().compareTo(o.getCodigo());
    }
}
