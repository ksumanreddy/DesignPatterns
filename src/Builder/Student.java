package Builder;

import Builder.StudentHelper;

public class Student {
    private int age;
    private String name;
    private String phone;
    private String batchId;
    private String email;
    private String address;
    private String city;
    private String country;
    private String pincode;

    public Student(StudentHelper sh) throws Exception{
        if(sh.getAge()<18){
            throw new Exception("Age should be greater than 18 ");
        }

        if(sh.getBatchId().length()<=0){
            throw new Exception("Must eneter batch id");
        }
        this.name=sh.getName();
        this.age=sh.getAge();
        this.batchId=sh.getBatchId();
        this.email=sh.getEmail();
        this.phone=sh.getPhone();
    }
    
}
