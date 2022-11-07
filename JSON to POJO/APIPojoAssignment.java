package apiconnection;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;

public class APIPojoAssignment {
    List<JSONPOJO> list=new ArrayList<JSONPOJO>();
    public static void main(String[] args) {
        APIPojoAssignment obj = new APIPojoAssignment();
        obj.connection();
    }

    public void connection() {
        URL url;

        try {
            url = new URL("https://reqres.in/api/users?page=2");
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("GET");
            connect.connect();
            InputStreamReader read = new InputStreamReader(connect.getInputStream());
            BufferedReader buff = new BufferedReader(read);
            String jsonString = buff.readLine();
            Object object = new JSONParser().parse(jsonString);
            JSONObject obj = (JSONObject) object;
            JSONArray arr = (JSONArray) obj.get("data");

            ObjectMapper mapper = new ObjectMapper();
            for (int i = 0; i < arr.size(); i++) {
                String temp = arr.get(i).toString();
                JSONPOJO pojo = mapper.readValue(temp, JSONPOJO.class);
                list.add(pojo);
                pojo.printData();
            }
            
             PojoDisplay display=new PojoDisplay();
            display.displayList(list);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
