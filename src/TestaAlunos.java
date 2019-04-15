import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sérgio Lopes");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");


        for(String aluno: alunos){
            System.out.println(aluno);
        }

        boolean temPaulo = alunos.contains("Paulo Silveira");
        alunos.remove("Sérgio Lopes");

        System.out.println(temPaulo);

        System.out.println(alunos);
        System.out.println(alunos.size());
        List<String> alunosemLista = new ArrayList<>(alunos);


    }
}
