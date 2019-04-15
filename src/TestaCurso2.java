import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso( "Dominando as colections","Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayLists",25));
        javaColecoes.adiciona(new Aula("Crinado uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",21));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);

    }
}
