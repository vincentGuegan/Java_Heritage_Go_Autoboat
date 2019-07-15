public abstract class Vehicle {

    // Attributs
    private String brand;
    private int kilometers;

    //Constructeur
    public Vehicle(String brand){
        this.brand = brand;
        this.kilometers = 0;
    }

    // accesseurs et mutateurs 
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // Méthode abstraite 
    public abstract String doStuff();
}