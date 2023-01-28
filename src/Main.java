import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso: Java");
        curso1.setDescricao("Descrição: Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso: Js");
        curso2.setDescricao("Descrição: Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());


/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAllyson = new Dev();
        devAllyson.setNome("Allyson");
        devAllyson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Allyson" + devAllyson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Allyson" + devAllyson.getConteudosConcluidos());

        Dev devJunior = new Dev();
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Junior" + devJunior.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Junior" + devJunior.getConteudosConcluidos());


    }
}