import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomFileResolver customFileResolver = new CustomFileResolver();
//        customFileResolver.createFile("example.txt");
        customFileResolver.readFileBasic("example.txt");

        List<Person> people = customFileResolver
                .createCollectionFromFile("example.txt");

        for (Person p: people) {
            System.out.println(p);
//            System.out.println(p.getEmail());
        }
    }
}