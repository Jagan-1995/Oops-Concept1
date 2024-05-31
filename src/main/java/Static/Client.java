package Static;

public class Client {
    public static void main(String[] args) {
         Student s1 = new Student();
         Student s2 = new Student();

         Student.domainName = "Scaler.com";
         Student.univName = "Scaler School";
         Student.dressCode = "Blue Yellow";

        System.out.println(s1.domainName);
        System.out.println(s2.domainName);
        System.out.println(Student.domainName);

        Student.changeDomainName("SST.com");
        System.out.println(s1.domainName);
        System.out.println(s2.domainName);
        System.out.println(Student.domainName);
    }
}
