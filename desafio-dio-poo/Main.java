import com.mqds.dominio.*;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("cursos sobre orientação a objeto em java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Php");
        curso1.setDescricao("cursos principios básicos com php");
        curso1.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("estrutura de projeto em java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria php");
        mentoria1.setDescricao("Criando projeto em php");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso);
        System.out.println(curso1);

        System.out.println(mentoria);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Super bootcamp de java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria1);

        Dev devUm = new Dev();
        devUm.setNome("Dev Um");
        devUm.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: "+ devUm.getConteudoInscritos());
        devUm.progredir();
        System.out.println("Conteúdos Concluídos: "+ devUm.getConteudoConcluidos());
        System.out.println("XP: "+ devUm.calcularTotalXp());

        Dev devDois = new Dev();
        devDois.setNome("Dev Dois");
        devDois.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: "+ devDois.getConteudoInscritos());
        devDois.progredir();
        System.out.println("Conteúdos Concluídos: "+ devDois.getConteudoConcluidos());
        System.out.println("XP: "+ devDois.calcularTotalXp());

    }
}
