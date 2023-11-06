package lessons;

import java.util.List;
import java.util.Random;

public class MyStudentsList {
    public static void main(String[] args) {
        List<String> students = List.of(
//                "Anna Glovatska",
//                "Artem Avanian",
//                "Ihor Kulyomza",
//                "Kateryna Artiushenko",
                "Kateryna Cheliadina",
//                "Konstantyn Hutsaliuk",
//                "Maksym Styosov",
//                "Mykhailo Volchanov",
                "Nikita Vengrin"
//                "Valentina Odnolko"
        );
        System.out.println(students.get(new Random().nextInt(students.size())));
        int[] arr = {2,2,5,6,7};
        int size = arr.length;
    }
}


