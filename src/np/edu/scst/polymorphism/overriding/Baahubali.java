package np.edu.scst.polymorphism.overriding;

public class Baahubali extends ShivagamiDevi{
    @Override
    public void gift(){
        System.out.println("Devsena");
    }
    public static void main(String[] args) {
        Baahubali baahu = new Baahubali();
        baahu.gift();
    }
}
