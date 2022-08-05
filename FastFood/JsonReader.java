package FastFood;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReader extends AbstractReader {
    @Override
    protected boolean validate() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Order read(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}
