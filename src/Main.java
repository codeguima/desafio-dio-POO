import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("--Dev 1--\n");

        Dev devJhonny = new Dev();
        devJhonny.setNome("Jhonny G.");
        devJhonny.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos jhonny: " + devJhonny.getConteudoInscritos());

        devJhonny.progredir();
        System.out.println("Progrediu....");

        System.out.println("Conteudos Inscritos jhonny: " + devJhonny.getConteudoInscritos());
        System.out.println("Conteudos Concluidos jhonny: " + devJhonny.getConteudoConcluidos() + "\n");
        System.out.println("XP: " + devJhonny.calcularTotalXp());


        System.out.println("--Dev 2--\n");


        Dev devjoao = new Dev();
        devjoao.setNome("João");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos joão: " + devjoao.getConteudoInscritos());

        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("Progrediu....");


        System.out.println("Conteudos Inscritos joão: " + devjoao.getConteudoInscritos());
        System.out.println("Conteudos Concluidos jhonny: " + devjoao.getConteudoConcluidos() + "\n");
        System.out.println("XP: " + devjoao.calcularTotalXp());

    }
}