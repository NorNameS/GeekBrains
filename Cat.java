public class Cat extends Animals {

    public static int count = 0;

    public Cat(String name) {
        super(name);
        this.count++;
    }

    @Override
    public void swim(int a) {
        System.out.println("Cats can't swim");
    }

    @Override
    public void run(int a)
    {
        if(a <= 200)
        {
            System.out.println(name + " has run about " + a);
        }
        else
        {
            System.out.println(name + " didn't have much stamina and dead");
        }
    }

    @Override
    public void info()
    {
        super.info();
        System.out.println("Всего блохастых: " + this.count);
    }

}
