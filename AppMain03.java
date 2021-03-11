import java.util.Scanner;

public class AppMain3 {

    public static void main(String[] args)
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        task2(words);

    }

    private static void task2(String[] words)
    {
        String str;
        char[] ans = new char[15];
        Scanner scanner = new Scanner(System.in);
        boolean end = true;

        while(end == true) {

            int pos = (int) (Math.random() * words.length);

            while (true) {

                System.out.println("Enter the correct word: ");
                str = scanner.nextLine();

                if (str.equals(words[pos]))
                {
                    System.out.println("This is correct word! Congretulations, you are the winner!");
                    end = end();
                    break;
                } else {

                    for (int i = 0; i < ans.length; ++i)
                    {
                        if (i < str.length() && words[pos].length() > i && str.charAt(i) == words[pos].charAt(i) )
                        {
                            ans[i] = str.charAt(i);
                        } else {
                            ans[i] = '#';
                        }
                    }
                    for (int i = 0; i < ans.length; i++) {
                        System.out.print(ans[i]);
                    }
                    System.out.println("");
                }
            }

        }
        scanner.close();
    }

    private static boolean end()
    {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Do you want to try again? YES/NO");

            String str = scanner.nextLine();

            if (str.equals("YES")) {
                return true;
            }
            else if(str.equals("NO"))
            {
                System.out.println("OK, see you!");
                return false;
            }
        }

    }

}
