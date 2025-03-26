package entity;

public class Client {
    private String nom;
    private String telephone;
    private String address;

    public Client(String nom, String telephone, String address) {
        this.nom = nom;
        this.telephone = telephone;
        this.address = address;
    }

    public Client() {
        this.nom = "";
        this.telephone = "";
        this.address = "";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String tochaine() {
        return "Client{" +
                "nom='" + nom + '\n' +
                ", telephone='" + telephone + '\n' +
                ", address='" + address + '\n' +
                '}';
    }

    public void copy(Client cl){
        nom= cl.getNom();
        telephone= cl.getTelephone();
        address = cl.getAddress();
    }

    public boolean egale(Client cl){
        return this.telephone.equals(cl.getTelephone()) && this.address.equals(cl.getAddress());
    }
}