public class MainApp5 {

    public static void main(String[] args)
    {
        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312311", 35000, 50);
        persArray[2] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 35);
        persArray[3] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        persArray[4] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 31);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].age > 40)
            {
                persArray[i].info();
            }
        }

    }
}
