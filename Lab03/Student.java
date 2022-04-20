public class Student {


    private String name;
    private String surname;
    private int studentID;
    private static int count= 0;

    Student(int id,String sName, String sSurname ) {

        this.name = sName;
        this.surname = sSurname;
        this.studentID = id;
        this.count +=1 ;
        

    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getID() {
        return studentID;
    }
    


    public String printStudentByID(int ID) {

        if(getID() == ID)
        {
            return (getName() + " " + getSurname());
        }else {
            return ("I cannot find student with that ID");
        }

    }

    public int printStudentByID(String checkName, String checkSurname) {

        if(getName() == checkName && getSurname() == checkSurname )
        {
            return getID();
        }else {
            return 0;
        }

    }

    public void printStudent() {

        System.out.println(getID()+ " " + getName()+ " " + getSurname());

    }

    
    



    static int getNumberOfStudents (){
        return count;
    }

    




}