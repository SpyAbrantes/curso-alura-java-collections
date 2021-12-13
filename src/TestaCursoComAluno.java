import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Java Coleções", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 19));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rafael Abrantes", 34672);
        Aluno a2 = new Aluno("Camila Santana", 5617);
        Aluno a3 = new Aluno("Gabriel Abrantes", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

//        Set<Aluno> alunos = javaColecoes.getAlunos();
//
//        Aluno a4 = new Aluno("Davi Abrantes", 2313);
//        alunos.add(a4);
//
//        System.out.println(alunos);  // Não é possível, Recebemos uma exceção do tipo UnsupportedOperationException: Isso acontece pois o conjunto não pode ser modificado pois retornamos na classe Curso um Collections.unmodifiableSet(alunos).
    }
}
