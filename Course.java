package trabalho.av1programacao;

//Criação da classe Curso
public class Course {
    
    //atriubtos Visibilidade privada
    private String codeCourse;
    private String name;
    
    //Encapsulamento gets e sets
    //visibilidade pública dos métodos get e set
    //Metodo construtor
    public String getCodeCourse() {
        return codeCourse;
    }
    //visilibilidade pública
    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }
    
    //visilibilidade pública
    public String getName() {
        return name;
    }
    
    //visilibilidade pública
    public void setName(String name) {
        this.name = name;
    }
    
}
