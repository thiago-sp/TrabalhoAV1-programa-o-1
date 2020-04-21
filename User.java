package trabalho.av1programacao;

//Criação da classe Usuário
public class User {
    
    //Composição da Classe Address
    //atriubtos Visibilidade privada
    private Address address;
    
    //atriubtos Visibilidade privada
    private String registration;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private Address userAddress;
    
    //Método construtor gets e sets
    //Encapsulamento gets e sets
    //visilibilidade pública
    public String getRegistration() {
        return registration;
    }
    
    //visilibilidade pública
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    
    //visilibilidade pública
    public String getName() {
        return name;
    }
    
    //visilibilidade pública
    public void setName(String name) {
        this.name = name;
    }
    
    //visilibilidade pública
    public String getLast_name() {
        return last_name;
    }
    
    //visilibilidade pública
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    //visilibilidade pública
    public String getEmail() {
        return email;
    }
    
    //visilibilidade pública
    public void setEmail(String email) {
        this.email = email;
    }
    
    //visilibilidade pública
    public String getPassword() {
        return password;
    }
    
    //visilibilidade pública
    public void setPassword(String password) {
        this.password = password;
    }
    
    //visilibilidade pública
    public Address getUserAddress() {
        return userAddress;
    }
    
    //visilibilidade pública
    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    } 
}
