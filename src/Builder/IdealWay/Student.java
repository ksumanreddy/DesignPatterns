package Builder.IdealWay;

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

    private  Student(StudentBuilder sh) throws Exception{
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

    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder {
        private int age;
        private String name;
        private String phone;
        private String batchId;
        private String email;
    
        public int getAge(){
            return age;
        }
    
        public StudentBuilder setAge(int age){
           this.age = age;
           return this;
        }
        public String getName(){
            return name;
        }
    
        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }
    
        public String getPhone(){
            return phone;
        }
    
        public StudentBuilder setPhone(String phone){
            this.phone=phone;
            return this;
        }
    
        public String getBatchId(){
            return batchId;
        }
    
        public StudentBuilder setBatchId(String batchId){
            this.batchId=batchId;
            return this;
        }
    
        public String getEmail(){
            return email;
        }
        
        public StudentBuilder setEmail(String email){
            this.email = email;
            return this;
        }
    
        public Student build() throws Exception{
            return new Student(this);
        }
    }
    
}
