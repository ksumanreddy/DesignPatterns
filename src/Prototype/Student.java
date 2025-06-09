package Prototype;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String email;
    private String pwd;
    private String instructor;
    private String batchName;

    public Student(){}
    public Student(Student old){
        this.age = old.age;
        this.name = old.name;
        this.email = old.email;
        this.pwd = old.pwd;
        this.instructor = old.instructor;
        this.batchName = old.batchName;
    }

    @Override
    public Student clone(){
        return new Student(this);
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPwd(){
        return this.pwd;
    }
    public void setPwd(String pwd){
       this.pwd = pwd;
    }
    public String getInstructor(){
       return this.instructor;
    }
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
    public String getBatchName(){
        return this.batchName;
     }
     public void setBatchName(String batchName){
         this.batchName = batchName;
     }
}

