public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Java Coleções", "Paulo Silveira");

        System.out.println(javaColecoes.getAulas());

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
//        javaColecoes.getAulas().add(new Aula("Lista de Obejtos", 19));
//        javaColecoes.getAulas().add(new Aula("Relacionamento com coleções", 24));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Lista de Obejtos", 19));
        javaColecoes.adiciona(new Aula("Relacionamento com coleções", 24));

        System.out.println(javaColecoes.getAulas());

    }
}
