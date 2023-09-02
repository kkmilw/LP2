package aula2103;
import java.util.Arrays;

public class ExibirNomes {

    public static void main(String[] args) {
        
        String[] nomes = {"Ana", "João", "Lucas", "Maria", "Pedro"};
        
        Arrays.sort(nomes);
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}

