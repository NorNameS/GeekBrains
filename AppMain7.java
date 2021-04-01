public class AppMain7 {
    public static void main(String[] args)
    {
        Cat cat[] = new Cat[3];
        cat[0] = new Cat("Барсик", 3);
        cat[1] = new Cat("Котяра", 10);
        cat[2] = new Cat("Лосяра", 88);
        Plate plate = new Plate(10);
        plate.info();
        int i = 0;
        while(!cat[cat.length - 1].getHungry())
        {
            if(!cat[i].getHungry())
            {
                if(cat[i].getAppetite() > plate.getFood())
                {
                    plate.increaseFood(100);
                    continue;
                }
                else
                {
                    cat[i].eat(plate);
                    System.out.println("Покормили " + cat[i].getName());
                }
            }
            ++i;
        }

    }
}
