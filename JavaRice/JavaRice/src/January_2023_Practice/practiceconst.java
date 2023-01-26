package January_2023_Practice;

public class practiceconst {

    public static Object printer;
    String firstname;
    String lastname;
    String sex;
    int age;


    public practiceconst(String firstname, String lastname, String sex, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;

        System.out.println("First Name" + firstname + "     Data Created");
        System.out.println("Last Name: " + lastname + "     Data Created");
        System.out.println("Sex: " + sex + "        Data Created");
        System.out.println("Age: " + age + "        Data Created");

    }
}

