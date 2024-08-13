import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoararia(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoararia(4);

        //polimorfismo
        //Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descricao mentoria em Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Boot Camp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaue = new Dev ();
        devCaue.setNome("Cauê");
        devCaue.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Caue" + devCaue.getConteudosInscritos());
        devCaue.progredir();
        devCaue.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Caue" + devCaue.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Caue" + devCaue.getConteudoConcluidos());
        System.out.println("XP" + devCaue.calcularTotalXp());


        System.out.println("--------------");

        Dev devJose = new Dev();
        devJose.setNome("José Felipe");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jose" + devJose.getConteudosInscritos());
        devJose.progredir();
        devCaue.progredir();
        devCaue.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Jose" + devJose.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Jose" + devJose.getConteudoConcluidos());
        System.out.println("XP" + devJose.calcularTotalXp());




    }
}