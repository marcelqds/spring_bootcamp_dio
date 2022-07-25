import com.mqds.dominio.*;
import java.time.LocalDate;

public class BootcampDio{
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

        System.out.println(curso);
        System.out.println(curso1);

        System.out.println(mentoria);
        System.out.println(mentoria1);
    }
}
