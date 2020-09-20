package proyecto1.Control;

import java.util.Observer;
import proyecto1.Modelo.ModeloEmpresa;

public class Control {

    public Control(ModeloEmpresa datos) {
        this.datos = datos;
    }

    public Control() {
        this(new ModeloEmpresa());
    }

    public void registrar(Observer obs) {
        datos.addObserver(obs);
    }

    private ModeloEmpresa datos;
}
