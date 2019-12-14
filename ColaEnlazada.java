package estructurasdinamicas;

public class ColaEnlazada<tipoDato> {
    
    private int cantidadElementos;
    private NodoCola<tipoDato> primerElemento, ultimoElemento;

    public ColaEnlazada() {
        setPrimerElemento(null);
        setUltimoElemento(null);
        setCantidadElementos(0);
    }
    
    public void agregarALaCola(tipoDato dato) {
        NodoCola<tipoDato> nuevoNodo = new NodoCola<tipoDato>(dato);
        if (getPrimerElemento() == null) {
            setPrimerElemento(nuevoNodo);
            setUltimoElemento(nuevoNodo);
        } else {
            getUltimoElemento().setSiguiente(nuevoNodo);
            setUltimoElemento(nuevoNodo);
        }
        setCantidadElementos(getCantidadElementos() + 1);
    }
    
    public tipoDato quitarDeLaCola() {
        tipoDato datoARetornar = null;
        if (getPrimerElemento() != null) {
            datoARetornar = getPrimerElemento().getDato();
            setPrimerElemento(getPrimerElemento().getSiguiente());
            setCantidadElementos(getCantidadElementos() - 1);
        }
        return datoARetornar;
    }
    
    public tipoDato verPrimerElemento() {
        tipoDato datoARetornar = null;
        if (getPrimerElemento() != null) {
            datoARetornar = getPrimerElemento().getDato();
        }        
        return datoARetornar;
    }
    
    public tipoDato verUltimoElemento() {
        tipoDato datoARetornar = null;
        if (getUltimoElemento() != null) {
            datoARetornar = getUltimoElemento().getDato();
        }        
        return datoARetornar;
    }    
    
    public boolean estaVacia() {
        return cantidadElementos == 0;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public NodoCola<tipoDato> getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(NodoCola<tipoDato> primerElemento) {
        this.primerElemento = primerElemento;
    }

    public NodoCola<tipoDato> getUltimoElemento() {
        return ultimoElemento;
    }

    public void setUltimoElemento(NodoCola<tipoDato> ultimoElemento) {
        this.ultimoElemento = ultimoElemento;
    }
    
}
