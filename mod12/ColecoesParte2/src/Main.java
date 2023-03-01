import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome-sexo separados por virgula (ex. Maycon-M,Camila-F)\n");
        String nomes = sc.nextLine();

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        String[] array = nomes.split(",");

        for(int i = 0; i < array.length; i++){
            String[] array2 = array[i].split("-");
            if(array2[1].equalsIgnoreCase("m"))
                masculino.add(array2[0]);
            else
                feminino.add(array2[0]);
        }

        System.out.println("-- Nomes Masculinos --");
        for(String nome : masculino)
            System.out.println(nome);

        System.out.println("-- Nomes Femininos -- ");
        for(String nome : feminino)
            System.out.println(nome);

    }

}
