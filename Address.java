package trabalho.av1programacao;

//Criação da classe Endereço
public class Address {
    
    //atriubtos Visibilidade privada
    private String idAddress;
    private String cep;
    private String uf;
    private String public_place;
    private String city;
    
    //visilibilidade pública
    //Método construtor get
    //Encapsulamento gets e sets
    public String getIdAddress() {
        return idAddress;
    }
    
    //visilibilidade pública
    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }
    
    //visilibilidade pública
    public String getCep() {
        return cep;
    }
    
    //visilibilidade pública
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    //visilibilidade pública
    public String getUf() {
        return uf;
    }
    
    //visilibilidade pública
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    //visilibilidade pública
    public String getPublic_place() {
        return public_place;
    }
    
    //visilibilidade pública
    public void setPublic_place(String public_place) {
        this.public_place = public_place;
    }
    
    //visilibilidade pública
    public String getCity() {
        return city;
    }
    
    //visilibilidade pública
    public void setCity(String city) {
        this.city = city;
    }
    
    
}
