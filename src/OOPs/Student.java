package OOPs;

// class 1
  class  School {
      int Rollno;
      String Studentname;

 };




// main class
public class Student {
    public static void  main(String[] args) {

        // object 1
        School obj1 = new School();
        obj1.Rollno = 1095;
        obj1.Studentname = "Bhagirath Rai";

        System.out.println("Student name: "+obj1.Studentname);
        System.out.println("Student Rollno: "+obj1.Rollno);
        System.out.println();


        // object 2
        School obj2 = new School();
        obj2.Rollno = 1126;
        obj2.Studentname = "Gyandeep Pal";

        System.out.println("Student name: "+obj2.Studentname);
        System.out.println("Student Rollno. : "+obj2.Rollno);


    }
}
