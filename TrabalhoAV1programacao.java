package trabalho.av1programacao;

import java.awt.Component;
import java.util.Scanner;

//Importaçaõ da biblioteca JOptionPane
import javax.swing.JOptionPane;
//QUESTAO 1.
public class TrabalhoAV1programacao {
    
//Criação dos objetos.
//Instaciação das classes Student, User, Address, Course.
//Alocação de memoria por meio do new.
//Utilização da biblioteca JOptionPane.
    public static void main(String[] args) {
        
        //Método Construtor
        Student student = new Student();
        Address address = new Address();
        Course course = new Course();
        
        //Utilização dos metedos get e set.
        //Leitura dos dados.
        //ESTUDANTE.
        student.setRegistration(JOptionPane.showInputDialog(null, "Cadastro: ", "Cadastro", 3));
        System.out.println(student.getRegistration());
        
        student.setName(JOptionPane.showInputDialog(null, "Digite seu 1º nome: ", "Cadastro", 3));
        System.out.println(student.getName());
        
        student.setLast_name(JOptionPane.showInputDialog(null, "Digite seu sobrenome: ", "Cadastro", 3));
        System.out.println(student.getLast_name());
        
        student.setEmail(JOptionPane.showInputDialog(null, "Digite seu E-mail: ", "Cadastro", 3));
        System.out.println(student.getEmail());
        
        student.setPassword(JOptionPane.showInputDialog(null, "Digite sua senha: ", "Cadastro", 3));
        System.out.println(student.getPassword());
        
        //ENDEREÇO.
        address.setIdAddress(JOptionPane.showInputDialog(null, "Digite número da residência: ", "Endereço", 3));
        System.out.println(address.getIdAddress());
        
        address.setCep(JOptionPane.showInputDialog(null, "Digite seu CEP: ", "Endereço", 3));
        System.out.println(address.getCep());
        
        address.setCity(JOptionPane.showInputDialog(null, "Digite sua cidade: ", "Endereço", 3));
        System.out.println(address.getCity());
        
        address.setPublic_place(JOptionPane.showInputDialog(null, "Digite nome da rua: ", "Endereço", 3));
        System.out.println(address.getPublic_place());
        
        address.setUf(JOptionPane.showInputDialog(null, "Digite UF: ", "Endereço", 3));
        System.out.println(address.getUf());
        
        //Atribuição da classe Endereço ao Estudante.
        student.setUserAddress(address);
        
        
        //CURSO.
        course.setCodeCourse(JOptionPane.showInputDialog(null, "Digite Código do Curso: ", "Curso", 3));
        System.out.println(course.getCodeCourse());
        
        course.setName(JOptionPane.showInputDialog(null, "Digite Nome do Curso: ", "Curso", 3));
        System.out.println(course.getName());
        
        student.setYear_registration(JOptionPane.showInputDialog(null, "Digite Ano de registro: ", "Curso", 3));
        System.out.println(student.getYear_registration());
        
        student.setCurrent_semester(JOptionPane.showInputDialog(null, "Semestre atual: ", "Curso", 3));
        System.out.println(student.getCurrent_semester());
        
    }
    
}
