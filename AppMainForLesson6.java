public class AppMainForLesson6 {

    public static void main(String[] args)
    {
        Cat catBoris = new Cat("Борис");
        Dog dogBobik = new Dog("Бобик");
        Dog dogSharik = new Dog("Шарик");

        dogBobik.run(150);
        dogBobik.swim(9);
        catBoris.run(139);
        catBoris.swim(1999);
        dogSharik.run(1445);
        dogSharik.swim(129);
        catBoris.info();
        dogSharik.info();
    }
}
