package hashtables;

import java.util.HashMap;
import java.util.Map;

public class BorrarAbecedario {
    public String borrarAbecedario(String texto) {
        Map<Character, Integer> contadorLetras = new HashMap<>();

        // Contar la frecuencia de cada letra en el texto
        for (char letra : texto.toCharArray()) {
            contadorLetras.put(letra, contadorLetras.getOrDefault(letra, 0) + 1);
        }

        StringBuilder resultado = new StringBuilder();

        // Construir el nuevo string eliminando la primera aparición de cada letra
        for (char letra : texto.toCharArray()) {
            if (contadorLetras.containsKey(letra) && contadorLetras.get(letra) > 0) {
                resultado.append(letra);
                contadorLetras.put(letra, contadorLetras.get(letra) - 1);
            }
        }

        return resultado.toString();
    }

    public String encontrarStringAnteriorAlVacio(String texto) {
        String resultado = texto;
        String resultadoAnterior = texto;

        while (!resultado.isEmpty()) {
            resultadoAnterior = resultado;
            resultado = borrarAbecedario(resultado);
        }

        return resultadoAnterior;
    }

    public static void main(String[] args) {
        BorrarAbecedario borrador = new BorrarAbecedario();
        System.out.println(borrador.encontrarStringAnteriorAlVacio("aa")); // "a"
        System.out.println(borrador.encontrarStringAnteriorAlVacio("abacb")); // "ab"
        System.out.println(borrador.encontrarStringAnteriorAlVacio("abacba")); // "aba"
        System.out.println(borrador.encontrarStringAnteriorAlVacio("abaa")); // "a"
    }
}
