public class ColaEnlazada<tipoDato> {
    
    private int cantidadNodos;
    private NodoCola<tipoDato> primerNodo, ultimoNodo;

    public ColaEnlazada() {
        setPrimerNodo(null);
        setUltimoNodo(null);
        setCantidadNodos(0);
    }
    
    public void agregarALaCola(tipoDato dato) {
        NodoCola<tipoDato> nuevoNodo = new NodoCola<>(dato);
        if (estaVacia()) {
            setPrimerNodo(nuevoNodo);
        } else {
            getUltimoNodo().setNodoSiguiente(nuevoNodo);
        }
        setUltimoNodo(nuevoNodo);
        setCantidadNodos(getCantidadNodos() + 1);
    }
    
    public tipoDato quitarDeLaCola() {
        tipoDato datoARetornar = null;
        if (getPrimerNodo() != null) {
            datoARetornar = getPrimerNodo().getDato();
            setPrimerNodo(getPrimerNodo().getNodoSiguiente());
            setCantidadNodos(getCantidadNodos() - 1);
        } 
        if (getPrimerNodo() == null)  {
            setUltimoNodo(null);
        }        
        return datoARetornar;
    }
    
    public tipoDato verPrimerElemento() {
        tipoDato datoARetornar = null;
        if (getPrimerNodo() != null) {
            datoARetornar = getPrimerNodo().getDato();
        }    
        return datoARetornar;
    }
    
    public tipoDato verUltimoElemento() {
        tipoDato datoARetornar = null;
        if (getUltimoNodo() != null) {
            datoARetornar = getUltimoNodo().getDato();
        }        
        return datoARetornar;
    }    
    
    public boolean estaVacia() {
        return cantidadNodos == 0;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void setCantidadNodos(int cantidadNodos) {
        this.cantidadNodos = cantidadNodos;
    }

    public NodoCola<tipoDato> getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(NodoCola<tipoDato> primerNodo) {
        this.primerNodo = primerNodo;
    }

    public NodoCola<tipoDato> getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(NodoCola<tipoDato> ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }
    
}
