package lesson4;


import java.util.Random;
import java.util.Scanner;
public class lesson4 {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static int DOTS_PRE_WIN = 2;
    public static boolean WARNING = false;
    public static int aiX;
    public static int aiY;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if(WARNING) {aiThinkTurn(aiX,aiY);} else {aiTurn();}

            printMap();
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

    private static void aiThinkX(int x) {
        for (int y = 0; y < SIZE; y++) {
            if (map[x][y] == DOT_EMPTY ) {
                aiX = x;
                aiY = y;
            }
        }
    }

    public static boolean checkWin(char symb) {
        // Переменная для подсчета идущих подряд символов в ряду
        int preWin = 0;
        /*
            Проверка строк
         */
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (map[x][y] == symb) {
                    preWin++;
                    if (preWin == DOTS_TO_WIN) return true;
                    if (preWin == DOTS_PRE_WIN) {
                        WARNING = true;
                        aiThinkX(x);

                    }
                } else {
                    preWin = 0;
                }
            }
        }
        /*
            Проверка столбцов
         */
        preWin = 0;
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (map[x][y] == symb) {
                    preWin++;
                    if (preWin == DOTS_TO_WIN) return true;
                    if (preWin == DOTS_PRE_WIN) {
                        //WARNING = true;
                    }
                } else {
                    preWin = 0;
                }
            }
        }
        
        
        /*
            Проверка диагонали
         */
        preWin = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                preWin++;
                if (preWin == DOTS_TO_WIN) return true;
                if (preWin == DOTS_PRE_WIN) {
                    //WARNING = true;

                }
            } else {
                preWin = 0;
            }
        }
        preWin = 0;
        for (int i = 1; i < SIZE; i++) {
            if (map[i][SIZE - (i + 1)] == symb) {
                preWin++;
                if (preWin == DOTS_TO_WIN) return true;
                if (preWin == DOTS_PRE_WIN) {
                    //WARNING = true;

                }
            } else {
                preWin = 0;
            }
        }

        return false;

//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void aiThinkTurn(int x, int y) {
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

