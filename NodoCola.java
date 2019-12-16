public class NodoCola<tipoDato> {
    
    private tipoDato dato;
    private NodoCola<tipoDato> nodoSiguiente;

    public NodoCola(tipoDato dato) {
        setDato(dato);
        setNodoSiguiente(null);
    }

    public tipoDato getDato() {
        return dato;
    }

    public void setDato(tipoDato dato) {
        this.dato = dato;
    }

    public NodoCola<tipoDato> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoCola<tipoDato> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
    
}
