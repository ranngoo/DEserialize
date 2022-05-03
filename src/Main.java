import com.google.gson.*;

import java.io.*;
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {

        File dok = new File(".\\src\\testjson.json");
        try {
            JsonElement fileElemnt = JsonParser.parseReader(new FileReader(dok));

            Gson gson = new Gson();                                                         //deserialize
            UserSimple userSimple = gson.fromJson(fileElemnt, UserSimple.class);
            System.out.println(userSimple);

           UserSimple userSimple1 = new UserSimple(             // zmienna ze zmienioną wartością
                    "kamila",
                    9,
                    "amd",
                    "nvidia",
                    false);
            System.out.println(userSimple1);

          //  try(FileWriter writer = new FileWriter(String.valueOf(dok)))
          //  {          // zapisywanie
          //      gson.toJson(userSimple1, writer);
          //     writer.flush();
          //  }



        } catch (JsonIOException | IOException e) {
            System.out.println("Blad wczytywania pliku");
        }catch(EmptyStackException e) {
            System.out.println("Sprawdz wartości");
        }


    }
}