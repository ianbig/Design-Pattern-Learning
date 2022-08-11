package FastFood;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader extends AbstractReader {
    @Override
    protected boolean validate() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Order read(String filepath) {
        String str = readFileToString(filepath);
        // TODO: add convert string to Json
        return new Order();
    }

    private String readFileToString(String filepath) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while( (line = br.readLine()) != null ) {
                sb.append(line);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
