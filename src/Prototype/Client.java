package Prototype;

public class Client {
    public static void main(String args[]){
        Student student1 = StudentRegistery.fillRegistory();

       // System.out.println("Stuent S1 " + student1);
        System.out.println(student1.getName());

        Student studentCopy = StudentRegistery.getStudentByKey("STUDENT_1").clone();
        studentCopy.setName("Suman");
        System.out.println(studentCopy.getName());
    }
}
