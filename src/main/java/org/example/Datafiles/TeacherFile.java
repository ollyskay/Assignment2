
package org.example.FileIO; import org.ex;
        package org.example.FileIO;

        import org.example.Student;
        import org.example.Teacher;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {

//
//
        String path = "/Users/mac/IdeaProjects/Assignment1/src/main/java/org/example/Datafiles/Student.csv;
        String line = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null){
// String[] values = line.split(",");
                System.out.println( line);


            }

        }catch (IOException ex){
            System.out.println("");
        }
        System.out.println("\n");
        Student std = new Student("020","Olumide","Kolawole","Java Stack week 2","ollyskay@gmail.com","Great Job as java developer","bad habit");
        Teacher tea = new Teacher("5456","Ollyskay","Olumide","week Two");


        std.toString();
        System.out.println(std.toString());
        System.out.println(tea.toString());
    }
}




