package aula2103;
import java.util.HashSet;

public class ExibirInterseccao {

    public static void main(String[] args) {
        
        int[] conjunto1 = {1, 2, 3, 4, 5};
        int[] conjunto2 = {3, 4, 5, 6, 7};
        
        HashSet<Integer> conjuntoInterseccao = new HashSet<Integer>();

        for (int numero : conjunto1) {
            conjuntoInterseccao.add(numero);
        }
        
        for (int numero : conjunto2) {
            if (conjuntoInterseccao.contains(numero)) {
                System.out.println(numero);
            }
        }
    }

}


