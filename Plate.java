public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info()
    {
        System.out.println("plate: " + food);
    }
    public void decreaseFood(int n)
    {
        food -= n;
    }
    public void increaseFood(int n)
    {
        System.out.println("В миску наложили еще " + n + " единиц корма");
        food += n;
    }
    public void setFood(int food)
    {
        this.food = food;
    }

    public int getFood()
    {
        return this.food;
    }
}
