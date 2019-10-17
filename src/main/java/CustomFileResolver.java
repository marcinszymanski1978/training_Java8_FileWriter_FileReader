import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileResolver {

    private static final String PATH_TO_FILE = "/home/marcin/IdeaProjects/weekend-two/";

    public void readFileBasic(String fileName) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader(PATH_TO_FILE + fileName));

            String line = bufferedReader.readLine();

            while (line != null) {
//                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void createFile(String fileName) {
        File file = new File(PATH_TO_FILE + fileName);

        try {
            //metoda createNewFile zwraca true/false
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is NOT created!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> createCollectionFromFile(String fileName) {

        BufferedReader bufferedReader = null;
        List<Person> people = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(
                    new FileReader(PATH_TO_FILE + fileName));

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                String[] lines = line.split(",");
                people.add(new Person(lines[0], lines[1]));
                line = bufferedReader.readLine();
            }

            System.out.println("End of collection's creation from file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       return people;
    }


}
