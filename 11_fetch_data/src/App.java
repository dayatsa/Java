import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
    public static void main(String[] args) throws Exception {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("src/example.json")) {
            Object obj = parser.parse(reader);

            JSONArray jsonArray = (JSONArray)obj;
            JSONObject jsonObject = (JSONObject)jsonArray.get(1);

            String name = jsonObject.get("gender").toString();
            int age = Integer.parseInt(jsonObject.get("age").toString());

            System.out.println(jsonObject);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
