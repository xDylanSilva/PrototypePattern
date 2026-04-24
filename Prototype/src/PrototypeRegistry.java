import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Prototype> prototipos = new HashMap<>();

    public void agregarPrototipo(String llave, Prototype prototipo) {
        prototipos.put(llave, prototipo);
    }

    public Prototype obtenerClon(String llave) {
        Prototype prototipo = prototipos.get(llave);
        if (prototipo != null) {
            return prototipo.clone();
        }
        return null;
    }
}