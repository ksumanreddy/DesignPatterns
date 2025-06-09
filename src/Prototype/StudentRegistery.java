package Prototype;

import java.util.*;

public class StudentRegistery {
    private static Map<String,Student> sudentRegistery = new HashMap<>();

    public static void registerStudnet(Student student, String constName){
       if(!sudentRegistery.containsKey(constName)){
        sudentRegistery.put(constName,student);
       }
    }

    public static Student getStudentByKey(String name){
        return sudentRegistery.get(name);
    }

    public static Student fillRegistory(){
        Student student = new Student();
        student.setBatchName("2015-2019");
        student.setInstructor("Suman");
        sudentRegistery.put("STUDENT_1",student);
        return student;
    }
}
