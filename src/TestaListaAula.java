import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArraysLists",21);
        Aula a2 = new Aula("Lista de objetos",15);
        Aula a3 = new Aula("Relacionamento de listas e Objetos",35);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

//        String s1 = "paulo";
//        String s2 = "silveira";
//        System.out.println(s1.compareTo(s2));

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

    }
}
