public class Dog extends Animals {

    public static int count = 0;

    public Dog(String name) {
        super(name);
        this.count++;
    }

    @Override
    public void run(int a) {
        if(a <= 500) {
            System.out.println(name + " has run " + a);
        }
        else
        {
            System.out.println(name + " has run about 500m and сдох");
        }
    }
    @Override
    public void swim(int a)
    {
        if(a <= 10)
        {
            System.out.println(name + " has swum about " + a);
        }
        else
        {
            System.out.println(name + " has dead in the swamp");
        }
    }
    @Override
    public void info()
    {
        super.info();
        System.out.println("Всего псов: " + this.count);
    }
}
