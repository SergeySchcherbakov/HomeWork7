import org.w3c.dom.ls.LSOutput;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Smith", "Doyle", "Pratt", "Spencer", "Spencer");
        List<String> smallnames = new ArrayList<>();
        smallnames = names.stream() 
                .filter(sd -> sd.length() < 6).collect(Collectors.toList());
        System.out.println("имен стстоящик из менее 5 букв   " + smallnames.stream().count());


        System.out.println(smallnames);
        System.out.println();
        System.out.println();
        ArrayList<String> names1 = new ArrayList<>();
        Collections.addAll(names, "Smith", "Doyle", "Pratt", "Spencer");
        List<String> longnames1 = new ArrayList<>();
        longnames1 = names.stream()
                .filter(s -> s.length() > 6).collect(Collectors.toList());

        System.out.println(longnames1);





        ArrayList<String> namessur = new ArrayList<>();
        Collections.addAll(namessur, "Joseph Smith", "David Mann", "Lee Padilla", "Samuel Shelton", "Joseph Smith");


        namessur.stream().distinct()
                .forEach(en -> System.out.print(en + "  "));

        System.out.println("                  ");
        System.out.println("                  ");


        ArrayList<String> namese = new ArrayList<>();
        Collections.addAll(namese, "Joseph Smith", "Thomas Doyle", "Wonald Pratt", "Thomas Spencer", "king Lee",
                "Gregory Smith", "Leroy Zimmerman", "Lee Smith", "Wichael Harrington", "Lee Daniels", "King Mann", "King Mann", "King Mann",
                "Eugene Williams", "Lee Terry", "Arnold Fowler", "Billy Harrison", "Lee Bennett", "Lee Evans",
                "Ronald Diaz", "Leonard King", "Timothy Smith", "George Lee", "King Mann", "Dean Wright",
                "Lee Richards", "Arthur Smith", "Gregory Moore", "Larry Hall", "Patrick Moore", "Ben Smith");

        namese.stream().distinct()
                .takeWhile(sl -> sl.contains("King"))
                .forEach(sl -> System.out.print(sl + ", "));

        namese.stream()
                .filter(sl -> sl.contains("King"))
                .forEach(sl -> System.out.print(sl + ", "));
        System.out.println("все люди с именем или фамилией King");
        System.out.println(
        );
        System.out.println();
        System.out.println();

        namese.stream().distinct()
                .filter(sl -> sl.contains("L"))
                .forEach(sl -> System.out.print(sl + ", "));
        System.out.println("имена или фамилии начинающиеся с буквы L");
        System.out.println(
        );
        System.out.println();
        System.out.println();

        namese.stream().distinct().sorted()
                .filter(sl -> sl.contains("W")).
                forEach(sl -> System.out.print(sl + ", "));

        System.out.println("имена или фамилии начинающиеся с буквы W");
        System.out.println(
        );
        System.out.println();
        System.out.println();

        ArrayList<String> namek = new ArrayList<>();
        Collections.addAll(namek, "Anthony K.", "Arthur K.", "Arthur S.", "Ben S.", "Bobby S.", "Bryan K.", "David K.",
                "David S.", "Frank K.", "Gregory S.", "Ivan K.", "Ivan S.", "James S.", "Jeff S.", "Jesse S.",
                "Joel S.", "John K.", "Jose S.", "Joseph S.", "Larry K.", "Lee S.", "Leonard K.", "Leroy S.",
                "Randy K.", "Robert K.", "Samuel S.", "Thomas S.", "Timothy S.", "William S.");

        namek.stream().distinct()
                .filter(sk -> sk.contains("S"))
                .forEach(sk -> System.out.print(sk + ", "));
        System.out.println("фамилии начинающиеся на S");
        System.out.println(
        );
        System.out.println();
        System.out.println();

        namek.stream().distinct()
                .filter(sk -> sk.contains("K")).
                forEach(sk -> System.out.print(sk + ", "));
        System.out.println("фамилии начинающиеся на k");

    }}















