package trabalho.av1programacao;

//Classe Estudante herda da classe Usuário
//Criação da classe Estudante
public class Student extends User{
    
    //Classe Curso associoção a classe Estudante
    //atriubtos Visibilidade privada
    private Course course;
    private String year_registration;
    private String current_semester;
    
    //Encapsulamento gets e sets
    //visibilidade pública dos métodos get e set
    //Método construtor get
    public String getYear_registration() {
        return year_registration;
    }
    
    //visilibilidade pública
    public void setYear_registration(String year_registration) {
        this.year_registration = year_registration;
    }
    
    //visilibilidade pública
    public String getCurrent_semester() {
        return current_semester;
    }
    
    //visilibilidade pública
    public void setCurrent_semester(String current_semester) {
        this.current_semester = current_semester;
    }
}
