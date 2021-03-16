import java.util.Random;
import java.util.Scanner;

public class AppMain4Game {

    public static int DOT_TO_WINS = 4;
    public static int SIZE = 5;
    public static char[][] map;
    public static char DOT_EMPTY = '*';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] str)
    {
        fillInMap();
        showMap();
        while (true) {
            playerTurn();
            showMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            showMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void fillInMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void showMap()
    {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i  + " ");
        }
        System.out.println("");
        for (int i = 0; i < SIZE; i++) {
            System.out.print( (i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void playerTurn()
    {
        int x, y;
        do {
            System.out.println("Enter the correct possition(X/Y): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isTrueTurn(x,y));
        map[y][x] = DOT_X;
    }

    public static boolean isTrueTurn(int x, int y)
    {
        if(x >= SIZE || x < 0 || y >= SIZE || y < 0) return false;
        if(map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isTrueTurn(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb)
    {
        for(int i = 0; i < SIZE - DOT_TO_WINS + 1; ++i)
        {
            for (int j = 0; j < SIZE - DOT_TO_WINS + 1; j++)
            {
                if(map[i][j] == symb)
                {
                    if(checker(symb, j , i) == true)
                    {
                        return true;
                    }
                }
            }
        }
        for(int i = 0; i < SIZE - DOT_TO_WINS + 1; ++i)
        {
            for (int j = SIZE - 1; j > DOT_TO_WINS - 2; --j)
            {
                if(map[i][j] == symb)
                {
                    if(checkerL(symb, j , i) == true)
                    {
                        return true;
                    }
                }
            }
        }
        for(int i = 0; i < SIZE - DOT_TO_WINS + 1; ++i)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if(map[i][j] == symb)
                {
                    if(checkerD(symb, j , i) == true)
                    {
                        return true;
                    }
                }
            }
        }
        for(int i = 0; i < SIZE; ++i)
        {
            for (int j = 0; j < SIZE - DOT_TO_WINS + 1; j++)
            {
                if(map[i][j] == symb)
                {
                    if(checkerLine(symb, j , i) == true)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checker(char symb, int x, int y)
    {
        int count = 0;
        //System.out.println(x + " " + y);
        //условие по диагонали направо
        for (int i = 0; i < DOT_TO_WINS; i++)
        {
            if(map[y+i][x+i] == symb) ++count;
        }
        if(count == DOT_TO_WINS) return true;
        count = 0;

        return false;
    }

    public static boolean checkerL(char symb, int x, int y)
    {
        int count = 0;

        //условие по дигонали налево
            for (int i = 0; i < DOT_TO_WINS; i++) {
                if (map[y + i][x - i] == symb) ++count;
            }
            System.out.println(count);

        if(count == DOT_TO_WINS) return true;
        count = 0;

        return false;
    }

    public static boolean checkerD(char symb, int x, int y)
    {
        int count = 0;
        //условие по вертикали
        for(int i = y; i < y + DOT_TO_WINS; ++i)
        {
            if(map[i][x] == symb) ++count;
        }
        if(count == DOT_TO_WINS) return true;
        count = 0;
        return false;
    }

    public static boolean checkerLine(char symb, int x, int y)
    {
        int count = 0;
        //условие по горизонтали
        for(int i = x; i < x + DOT_TO_WINS; ++i)
        {
            if(map[y][i] == symb) ++count;
        }
        if(count == DOT_TO_WINS) return true;
        count = 0;

        return false;
    }

}
