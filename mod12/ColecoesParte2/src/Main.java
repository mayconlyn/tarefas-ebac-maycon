import java.util.*;

public class Main {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome-sexo separados por virgula (ex. Maycon-M,Camila-F)\n");
        String nomes = sc.nextLine();
        Map<String, List<String>> listMap = new HashMap<>();

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

        listMap.put("M", masculino);
        listMap.put("F", feminino);

        imprimirNomePorSexo(listMap);

    }

    private static void imprimirNomePorSexo(Map<String, List<String>> listMap) {

        List<String> masc = listMap.get("M");
        List<String> fem = listMap.get("F");

        System.out.println("--- Lista Masculino ---");
       // masc.forEach(nome-> System.out.println(nome));
        masc.forEach(System.out::println);

        System.out.println("--- Lista Feminino ---");
       // fem.forEach(nome -> System.out.println(nome));
        fem.forEach(System.out::println);

    }

}
