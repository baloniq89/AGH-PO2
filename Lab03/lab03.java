public class lab03 {

    public static void main(String args[]){

        Wydzial faculty = new Wydzial();
        Student student1 = new Student(27236,"Jan", "Nowak");
        faculty.dodaj(student1);
        Student student2 = new Student(89347,"Ela", "Kowalska");
        faculty.dodaj(student2);
        Student student3 = new Student(9546,"Entomologia", "Motylkowska");
        faculty.dodaj(student3);
        faculty.printAllStudents();
        
        

    }


}
