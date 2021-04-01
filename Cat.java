public class Cat {

    private String name;
    private int appetite;
    private boolean hungry = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p)
    {
        if(p.getFood() < this.appetite){
            return;
        }else {
            this.hungry = true;
            p.decreaseFood(appetite);
        }
    }

    public int getAppetite()
    {
        return this.appetite;
    }

    public boolean getHungry()
    {
        return this.hungry;
    }

    public String getName()
    {
        return name;
    }

}
