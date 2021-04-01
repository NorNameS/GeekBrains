public class Worker {

    public int age;
    public String bIO;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;

    public Worker(String bIO, String post, String email, String phoneNumber, int salary, int age)
    {
        this.bIO = bIO;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info()
    {
        System.out.println(bIO);
        System.out.println(post);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary);
        System.out.println(age);
    }

}
