public class AppMain2 {

    public static void main(String[] args) {
        System.out.println("задание 1: ");
        task1();
        System.out.println("задание 2: ");
        task2();
        System.out.println("задание 3: ");
        task3();
        System.out.println("задание 4: ");
        task4();
        System.out.println("задание 5: ");
        task5();
        System.out.println("задание 6: ");

        int[] masTask6 = {2, 1, 1, 1, 2, 2, 10, 1};

        System.out.println(task6(masTask6));

        System.out.println("задание 7: ");

        int[] masTask7 = {3, 5, 6, 1};
        int nTask7 = -2;
        task7(masTask7, nTask7);

    }

    public static void toString(int[] mas) {
        for (int i = 0; i < mas.length; ++i) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
    }


    public static void task1() {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mas.length; ++i) {
            if (mas[i] == 1) {
                mas[i] = 0;
                continue;
            } else {
                mas[i] = 1;
                continue;
            }
        }
        toString(mas);
    }

    public static void task2() {
        int[] mas = new int[8];
        mas[0] = 0;

        for (int i = 1; i < mas.length; ++i) {
            mas[i] = 3 * i;
        }
        toString(mas);
    }

    public static void task3() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] *= 2;
            }
        }
        toString(mas);
    }

    public static void task4() {
        int n = 5;
        int[][] mas = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = 0;
            }
            mas[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void task5() {
        int[] mas = {1, 2, 3, 4, 2, 3};
        int max = mas[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; ++i) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Массив: ");
        toString(mas);
        System.out.println("Max: " + max + "\n" + "Min: " + min);
    }

    public static boolean task6(int[] mas) {

        for (int i = 0; i < mas.length; ++i) {
            for (int j = 1; j < mas.length; ++j) {
                int sumR = 0, sumL = 0,  r = 0;
                for (int l = 0; l <= j - r;) {
                    if(sumL >= sumR)
                    {
                        sumR += mas[j-r];
                        ++r;
                    }
                    else
                    {
                        sumL += mas[l];
                        ++l;
                    }
                }
                if(sumL == sumR)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void task7(int[] mas, int n)
    {
        if(n < 0)
        {
            while(n < -mas.length)
            {
                n += mas.length;
            }
            n = mas.length + n;
        }

        while(n > mas.length)
        {
            n -= mas.length;
        }

        if(mas.length == n)
        {
            toString(mas);
            return;
        }

        int buf;

        buf = mas[0];

        if(n % 2 == 0)
        {
            for(int i = 0; i < mas.length; ++i)
            {
                if(i+1 == mas.length)
                {
                    mas[0] = buf;
                    break;
                }
                int a = mas[i+1];
                mas[i+1] = buf;
                buf = a;
            }
            --n;
        }

        int jump = n, newJump = jump*2;

        if(newJump > mas.length)
        {
            newJump -= mas.length;
        }

        buf = mas[0];

        for (int i = 0; i < mas.length; i++) {

            int a = mas[newJump-1];
            mas[newJump-1] = buf;
            buf = a;

            jump = newJump;
            newJump += n;

            if(newJump > mas.length)
            {
                newJump -= mas.length;
            }

        }

        toString(mas);
    }
}
