package Builder;

public class Client {
    public static void main(String[] args) throws Exception{
        StudentHelper sh = new StudentHelper();
        sh.setAge(19);
        sh.setBatchId("BATCH1");
        sh.setEmail("youremail@email.com");
        sh.setName("Suman");
        sh.setPhone("6789876523");

        Student s1 = new Student(sh);

        System.out.println("S1: " + s1);

        
    }
}
