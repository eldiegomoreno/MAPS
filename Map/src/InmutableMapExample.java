import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InmutableMapExample {
    public static void main(String[] args) {
        // Crear un Map mutable
        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("1", "Alice");
        mutableMap.put("2", "Bob");

        // Convertirlo en un Map inmutable
        Map<String, String> inmutableMap = Collections.unmodifiableMap(mutableMap);

        // Intentar modificar el Map inmutable
        try {
            inmutableMap.put("3", "Charlie");
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar el Map inmutable: " + e);
        }
    }
}
