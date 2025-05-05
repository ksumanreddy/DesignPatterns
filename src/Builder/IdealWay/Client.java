package Builder.IdealWay;

import Builder.IdealWay.Student;

public class Client {
    public static void main(String[] args) throws Exception{
      // StudentBuilder sh =  Studnet.getStudentBuilder();
       //sh.setAge(19);
      // sh.setBatchId("BATCH1");
     //  sh.setEmail("youremail@email.com");
     //  sh.setName("Suman");
     //  sh.setPhone("6789876523");   


    // One way , Where StudentBuilder is a separte class 
    //  StudentBuilder builder = Student.getStudentBuilder();
     // Student sh =  builder.setAge(20)
     // .setBatchId("batch")
    //  .setEmail("youremail@email.com")
    //  .setName("Suman").setPhone("9877777777").build();

    // Beautify the code 

    Student s = Student.getStudentBuilder().setAge(20)
    .setBatchId("batch")
    .setEmail("youremail@email.com")
    .setName("Suman")
    .setPhone("9877777777")
    .build();
     
    System.out.println("Student : " + s );
    }
}
