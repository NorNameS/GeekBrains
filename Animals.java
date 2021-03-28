public abstract class Animals {

    public static String name;
    public static int count = 0;

    public Animals(String name) {
        this.name = name;
        this.count++;
    }

    public abstract void swim(int a);
    public abstract void run(int a);

    public void info()
    {
        System.out.println("Всего животных: " + count);
    }
}

