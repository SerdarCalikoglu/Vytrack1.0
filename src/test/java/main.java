import com.Cybertek.utilities.ConfigurationReader;
import com.Cybertek.utilities.Driver;



public class main {

    public static void main(String[] args) {

        Driver.get().get(ConfigurationReader.get("url"));



    }
}
