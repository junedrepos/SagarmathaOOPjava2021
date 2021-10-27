package np.edu.scst.corepackage;
import java.util.Random;
public class Ludo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
                                                //0-5
            int output = random.nextInt(6)+1;
            System.out.println(output);
        }
    }
}
