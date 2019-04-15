import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula01 = "Conhecendo mais de listas";
        String aula02 = "Modelando a classe Aula";
        String aula03 = "Trabalhando com cursos e Sets";


        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula01);
        aulas.add(aula02);
        aulas.add(aula03);
        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);
        //Exemplo de foreach
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        //Exemplo de get()
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        System.out.println(aulas.size());
        System.out.println("------------------------------");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println(aulas.get(i));
        }

        System.out.println("------------------------------");
        for(String aula:aulas){
            System.out.println(aula);
        }
        System.out.println("------------------------------");

        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });

        System.out.println("------------------------------");
        Collections.sort(aulas);
        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });


    }
}
