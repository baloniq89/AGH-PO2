import java.util.ArrayList;

public class Wydzial {

    private ArrayList<Student> arrayOfStudents = new ArrayList();


    

    public void dodaj(Student s){

        if(arrayOfStudents.contains(s))
        {
            System.out.println("This Student is already on faculty");
        }else {
            arrayOfStudents.add(s);
        }

    }

    public void printAllStudents (){

        System.out.println("***Students***");
        for(Student student : arrayOfStudents)
        {
            student.printStudent();
        }

    }
    



}