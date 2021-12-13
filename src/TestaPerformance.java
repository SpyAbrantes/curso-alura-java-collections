import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaPerformance {

    public static void main(String[] args) {

        //Collection<Integer> numeros = new ArrayList<>();
        Collection<Integer> numeros = new HashSet<>(); //



        for (int i = 0; i < 50000; i++){
            numeros.add(i);
        }

        long inicio = System.currentTimeMillis();

        for (Integer numero: numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long execucao = fim - inicio;

        System.out.println(execucao);



    }
}
