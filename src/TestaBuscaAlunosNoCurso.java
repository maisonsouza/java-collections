public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso( "Dominando as colections","Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayLists",25));
        javaColecoes.adiciona(new Aula("Crinado uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",21));

        Aluno a1 = new Aluno("Rodrigo Turini", 3652);
        Aluno a2 = new Aluno("Guilherme Silveira", 3653);
        Aluno a3 = new Aluno("Mauricio Aniche", 3654);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        Aluno aluno = javaColecoes.buscaMatriculado(3655);
        System.out.println("Aluno: "+aluno);

    }
}
