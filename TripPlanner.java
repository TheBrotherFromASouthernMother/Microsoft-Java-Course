import java.util.*;
import java.net.*;
import java.io.*;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonParser;
//import com.google.gson.JsonElement;
import com.google.gson.*;

public class TripPlanner {

    public static void main(String args[]) {

        printConsole("Where do you live?");
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();


        String coordinates = "GREG";
        String[] cityFormat = city.split("");
        city = "";
        for (int i = 0; i < cityFormat.length; i ++) {
            if(cityFormat[i].equals(" ")) {
                city += "+";
            }
            else {
                city += cityFormat[i];
            }
        }
        System.out.println(Arrays.toString(cityFormat));
        System.out.println(city);



        JsonParser parser = new JsonParser();
        try {
            coordinates = getResponse("https://maps.googleapis.com/maps/api/geocode/json?address=" +  city + "&key=AIzaSyDISSLF38L075Nj2gbtI_JIvfHn_nQJ2-w");
            printConsole(coordinates);
        } catch (Exception error) {
            error.printStackTrace();
        }

        JsonElement jsonTree = parser.parse(coordinates);

        JsonObject jsonObject = jsonTree.getAsJsonObject();
        JsonArray results = jsonObject.getAsJsonArray("results");
        JsonObject location = results.get(0).getAsJsonObject().getAsJsonObject("geometry").getAsJsonObject("location");
        String latitutde = location.getAsJsonPrimitive("lat").toString();
        String longitude = location.getAsJsonPrimitive("lng").toString();
        System.out.println(latitutde.toString());
        System.out.println(longitude.toString());

        try {
           String timeZone = getResponse("https://maps.googleapis.com/maps/api/timezone/json?location=" + latitutde + "," + longitude + "&timestamp=1331161200&key=AIzaSyDISSLF38L075Nj2gbtI_JIvfHn_nQJ2-w");
           printConsole(timeZone);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void printConsole(String msg) {
        System.out.println(msg);
    }

    public static String getResponse(String link) throws Exception {
        //https://stackoverflow.com/a/1359702/8865999
        //https://alvinalexander.com/blog/post/java/java-how-read-from-url-string-text
        StringBuilder content = new StringBuilder();
        try {
            URL semesterAtSea = new URL(link);
            URLConnection sas = semesterAtSea.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(sas.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine + "\n");
            }
            in.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}

class Location {
    public String lat;
    public String lng;
}


