public class NodoCola<tipoDato> {
    
    private tipoDato dato;
    private NodoCola<tipoDato> siguiente;

    public NodoCola(tipoDato dato) {
        setDato(dato);
        setSiguiente(null);
    }

    public tipoDato getDato() {
        return dato;
    }

    public void setDato(tipoDato dato) {
        this.dato = dato;
    }

    public NodoCola<tipoDato> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola<tipoDato> siguiente) {
        this.siguiente = siguiente;
    }
    
}
