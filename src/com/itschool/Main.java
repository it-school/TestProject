package com.itschool;

import java.util.Arrays;
import java.util.Random;

public class Main
{
/*

    public static void main(String[] args) {

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int s = br.read();
            System.out.println(s);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Cloner cloner1 = new Cloner(1);
        Cloner cloner2 = (Cloner) cloner1.clone();
        System.out.println(cloner1);
        System.out.println(cloner2);
        cloner1.value = 5;
        System.out.println(cloner1);
        System.out.println(cloner2);
*//*
 */
/*

        final int N = 10;
        for (int i = 1; i <= N; i++)
        {
            for (int j = 0; j < N-i; j++)
                System.out.print(' ');
            for (int j = 1; j < i*2; j++)
                System.out.print('*');
            System.out.println();
        }
        for (int i = 1; i < N; i++)
        {
            for (int j = 0; j < i; j++)
                System.out.print(' ');

            for (int j = 1; j < N*2-i*2; j++)
                System.out.print('*');

            System.out.println();
        }

        int k = 3, n = 4, x, kf=1;
        double result = 0;
        for (int i = 1; i <= 20; i++)
        {
            x = 1 + new Random().nextInt(10);
            kf = 1;
            for (k = 1; k <= n; k++)
            {
                kf*=k;
                result += (Math.pow(x, k) / kf);
            }
        }

        System.out.println(result);

        int [] a = {1,2,5,7,0};

        System.out.print('[');
        for (int q: a)
            System.out.print(q + ", ");
        System.out.println(']');

   //     Arrays.fill(a, 5);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        int v1 = 2, v2 = 3;
        v1 = v1 + v2; // v1 = 5, v2 = 3
        v2 = v1 - v2; // v2 = 2, v1 = 5
        v1 = v1 - v2; // v1 = 3, v2 = 2

        int t = v1;
        v1 = v2;
        v2 = t;

        final int N1 = 15;
        System.out.println("Exchange rates: ");
        double []rates = new double[N1];
        for (int i = 0; i < rates.length; i++)
            rates[i] = 26.5 + ((double)(new Random().nextInt(30))/100);
        System.out.println(Arrays.toString(rates));
        long time = System.currentTimeMillis();

        double tmp=0;
        for (int i = 0; i < rates.length /2; i++)
        {
            tmp = rates[i];
            rates[i] = rates[rates.length-1 - i];
            rates[rates.length-1 - i] = tmp;
        }
        System.out.println(Arrays.toString(rates));

//      Simple
//        Arrays.sort(rates);
//        double max = rates[rates.length-1], min = rates[0];

//         Fast
//        double max = rates[0], min = rates[0];
//        for (double element: rates)
//        {
//            if (element < min)
//                min = element;
//            if (element > max)
//                max = element;
//        }
//        System.out.println("min: " + min + "\tmax:" + max);
        System.out.println(System.currentTimeMillis()-time);

*//*

//
        public static void main(String[] args) {

            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            //task7();
            task8();
            task9();
        }


        private static void task1() {
            int[] a = new int[35];
            int sum = 0;
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(50) * 100;
                sum += a[i];
            }
            System.out.println(Arrays.toString(a));
            System.out.println("Общее число книг " + sum);
            System.out.println("Общее число книг есть 6 значное число = " + ((sum > 99999 && sum < 1000000) ? "Правда" : "Ложь"));
        }

        private static void task2() {
            int[] a = new int[10];
            int sum = 0;
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(45);
                sum += a[i];
            }
            System.out.println(sum + ((sum > 200) ? " Спортсмен вышел в этап" : " Спортсмен не вышел в этап"));
        }

        private static void task3() {
            int[] a = new int[18];
            int obz = 0, kor = 0, pro=0;
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(50);
            }
            for (int j = 0; j < a.length; j++) {
                if (j>=0 && j<7)obz+=a[j];
                if (j>6 && j<13)kor +=a[j];
                if (j>12 && j< a.length)pro +=a[j];
            }
            System.out.println("Обязательная " + obz);
            System.out.println("Короткая программа " + kor);
            System.out.println("Произвольная " + pro);
            if (obz > kor && obz > pro) System.out.println("Лучьше выступил в обязательной программе");
            if (kor > obz && kor > pro) System.out.println("Лучьше выступил в короткой программе");
            if (pro > obz && pro > kor) System.out.println("Лучьше выступил в произвольной программе");
        }

        private static void task4(){
            Random random = new Random();
            int[] a = new int[50];
            int cur=0, max=0;
            for (int i = 0; i < a.length; i++)
            {
                a[i]=-50+random.nextInt(100);
                if (a[i] > 0) cur++;
                else
                {
                    if (cur > max) max = cur;
                    cur=0;
                }
            }
            System.out.println(Arrays.toString(a));
            System.out.println("\nМаксимальная последовательность положительных чисел состоит из: " + max);
        }

        private static void task5() {
            int[] a = new int[50];
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(200);
                for ( int j =3; j<a[i]; j++) {
                    if (a[i] % j == 0) {
                        //System.out.println(a[i] +" "+ j);
                        a[i]=0;
                        break;
                    }
                }
                if(a[i]!=0) System.out.println(i);
            }
        }
        private static void task6() {
            int[] a = new int[50];
            int b=0,c=0;
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(45);
            }
            int x = a[1], y = a[1];
            for (int j =0; j<a.length; j++){
                if (a[j]>x){
                    x=a[j];
                    b=j;
                }
                if (a[j]<y) {
                    y=a[j];
                    c=j;
                }
            }
            System.out.println(Arrays.toString(a));
            a[b]=0;
            a[c]=0;
            System.out.println(Arrays.toString(a));
        }
        private static void task8(){
            Random random = new Random();
            int[] a = new int[50];
            int b=30, c=10, d=20;
            for (int i = 0; i < a.length; i++) {
                a[i] = -50 + random.nextInt(100);
            }
            System.out.println(Arrays.toString(a));
            for (int i = 0; i < a.length; i++) {
                if (a[i]<0)a[i]=0;
                if (a[i]>b)a[i]=0;
                if (a[i]>c && a[i]<d)a[i]=0;
            }
            System.out.println(Arrays.toString(a));
        }
        private static void task9(){
            Random random = new Random();
            int[] a = new int[50];
            int b=30, c=10, d=20;
            for (int i = 0; i < a.length; i++) {
                a[i] =random.nextInt(100);
            }
            System.out.println(Arrays.toString(a));
            for (int i = 0; i < a.length; i++){
                if (a[i]%2==0 && i%2 !=0)a[i]=0;
                if (a[i]%3 ==0 || a[i]%5==0)a[i]=0;
            }
            System.out.println(Arrays.toString(a));
        }
//    private static void task7() {
//        int[] a = new int[50];
//        int b=0;
//        Random random = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(50);
//        }
//        System.out.println(Arrays.toString(a));
//        for (int i=0; i< a.length; i++) {
//            b = a[i];
//            if (b != 0) {
//                for (int j = 0; j < a.length; j++) {
//                    if (b == a[j]) a[j] = 0;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }

    }
*/

    public static void main(String[] args)
    {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task7();
//        task8();
//        task9();
    }


    private static void task1()
    {
        int[] a = new int[35];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(50) * 100;
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Общее число книг " + sum);
        System.out.println("Общее число книг есть 6 значное число = " + ((sum > 99999 && sum < 1000000) ? "Правда" : "Ложь"));
    }

    private static void task2()
    {
        int[] a = new int[10];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(45);
            sum += a[i];
        }
        System.out.println(sum + ((sum > 200) ? " Спортсмен вышел в этап" : " Спортсмен не вышел в этап"));
    }

    private static void task3()
    {
        int[] a = new int[18];
        int obz = 0, kor = 0, pro = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(50);
        }
        for (int j = 0; j < a.length; j++)
        {
            if (j >= 0 && j < 7)
            {
                obz += a[j];
            }
            if (j > 6 && j < 13)
            {
                kor += a[j];
            }
            if (j > 12 && j < a.length)
            {
                pro += a[j];
            }
        }
        System.out.println("Обязательная " + obz);
        System.out.println("Короткая программа " + kor);
        System.out.println("Произвольная " + pro);
        if (obz > kor && obz > pro)
        {
            System.out.println("Лучше выступил в обязательной программе");
        }
        if (kor > obz && kor > pro)
        {
            System.out.println("Лучше выступил в короткой программе");
        }
        if (pro > obz && pro > kor)
        {
            System.out.println("Лучше выступил в произвольной программе");
        }
    }

    private static void task4()
    {
        Random random = new Random();
        int[] a = new int[50];
        int cur = 0, max = 0;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = -50 + random.nextInt(100);
            if (a[i] > 0)
            {
                cur++;
            }
            else
            {
                if (cur > max)
                {
                    max = cur;
                }
                cur = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("\nМаксимальная последовательность положительных чисел состоит из: " + max);
    }

    private static void task5()
    {
        int[] a = new int[50];
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(200);
            for (int j = 3; j < a[i]; j++)
            {
                if (a[i] % j == 0)
                {
                    //System.out.println(a[i] +" "+ j);
                    a[i] = 0;
                    break;
                }
            }
            if (a[i] != 0)
            {
                System.out.println(i);
            }
        }
    }

    private static void task6()
    {
        int[] a = new int[50];
        int b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(45);
        }
        int x = a[1], y = a[1];
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] > x)
            {
                x = a[j];
                b = j;
            }
            if (a[j] < y)
            {
                y = a[j];
                c = j;
            }
        }
        System.out.println(Arrays.toString(a));
        a[b] = 0;
        a[c] = 0;
        System.out.println(Arrays.toString(a));
    }

    private static void task8()
    {
        Random random = new Random();
        int[] a = new int[50];
        int b = 30, c = 10, d = 20;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = -50 + random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
            {
                a[i] = 0;
            }
            if (a[i] > b)
            {
                a[i] = 0;
            }
            if (a[i] > c && a[i] < d)
            {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void task9()
    {
        Random random = new Random();
        int[] a = new int[50];
        int b = 30, c = 10, d = 20;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0 && i % 2 != 0)
            {
                a[i] = 0;
            }
            if (a[i] % 3 == 0 || a[i] % 5 == 0)
            {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void task7()
    {
  /*      int[] a = new int[10];
        int n = a.length - 1;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(6);
        }


        for (int i = 0; i <= n - 1; i++)
        {
            System.out.println("Before (" + n + "): " + Arrays.toString(a));
            System.out.println(a[i] + " " + a[i + 1]);
            if (i < n-1)
            {
                for (int k = i + 1; k < n; k++)
                {
                    //System.out.println(k + " " + i);
                    if (a[i] == a[k])
                    {
                        for (int j = k; j <= n - 1; j++)
                        {
                            a[j] = a[j + 1];
                        }
                        a[n] = 0;
                        n--;
                        k--;
                    }
                    System.out.println("After   (" + n + "):" + Arrays.toString(a));
                }
            }
        }

        for (int i = 0; i <= n; i++)
        {
            System.out.print(a[i] + ", ");
        }
*/
        System.out.println("\nСравнение двумерных массивов");

        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array2 = new int[3][3];
        // Заполнение массива
        Random random = new Random();
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                array2[i][j] = random.nextInt(10);
            }
        }

        System.out.println("\nArray1:");
        for (int[] a : array1)
        {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("\nArray2:");
        for (int[] a : array2)
        {
            System.out.println(Arrays.toString(a));
        }

        if (Arrays.equals(array1, array2))
        {
            System.out.println("Массивы равны!");
        }
        else
        {
            System.out.println("Массивы не равны!");
        }


        System.out.println("Клонируем содержимое одного массива:");
/*        for(int r = 0; r < array1.length; r++)
            for(int c = 0; c < array1[r].length; c++)
                array1[r][c] = array2[r][c];
*/
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = array2[i].clone();
        }

        System.out.println("\nArray1:");
        for (int[] a : array1)
        {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("\nArray2:");
        for (int[] a : array2)
        {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("\nПри обычном сравнении через equals двумерный массив - это экземпляр Object[], а не int[][]");
        if (Arrays.equals(array1, array2))
        {
            System.out.println("Массивы равны!");
        }
        else
        {
            System.out.println("Массивы не равны!");
        }

        System.out.println("\nПоэтому сравнивать нужно через deepEquals:");
        if (Arrays.deepEquals(array1, array2))
        {
            System.out.println("Массивы равны!");
        }
        else
        {
            System.out.println("Массивы не равны!");
        }


        int[][] incomes =
                {
                        {1230, 1250, 2000, 2300, 300},
                        {1123, 1232, 7654, 234567, 5},
                        {1234, 5567, 8765}
                };

        System.out.println("Зубчатый двумерный массив : ");

        // Во внешнем цикле выполняется проход по всем вложенным массивам.
        for (int[] ar2 : incomes)
        {
            int[] arr = ar2.clone();
            Arrays.sort(arr);
            System.out.println(Arrays.binarySearch(arr, 7654));

            // Во внутреннем цикле выполняется обращение к каждому элементу вложенного массива.
            for (int j : ar2)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[] inc = new int[incomes.length];
        for (int i = 0; i < incomes.length; i++)
        {
//            for (int j = 0; j < incomes[i].length; j++)
//                inc[i]+=incomes[i][j];

            for (int j : incomes[i])
            {
                inc[i] += j;
            }
        }

        int[] t = inc.clone();
        Arrays.sort(t);
        System.out.println(t[t.length - 1]);
        for (int i = 0; i < inc.length; i++)
        {
            if (inc[i] == t[t.length - 1])
            {
                System.out.println(i);
            }
        }

        String s = "1q2w3e4r5t6y7u8i9o0p";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.substring(5, 10));
        System.out.println(s.startsWith("12"));

        String login = "user";
        String userlogin = "User";

        System.out.println(login.toLowerCase().equals(userlogin.toLowerCase()) ? "Accepted" : "Get away");
        System.out.println(login + userlogin);
        System.out.println(login.concat(userlogin));
        System.out.println(login);
        StringBuilder login2 = new StringBuilder("user-");
        login2.append(login);
        System.out.println(login2);
        login2.replace(3, 5, "12345");
        System.out.println(login2);

        String text = "Adding an existing project to GitHub using the command line→" +
                "Putting your existing work on GitHub can let you share and collaborate in lots of great ways.";

        System.out.println(text.toLowerCase().contains("using github".toLowerCase()));
        String[] splitted_text = text.split(" ");
        for (String word : splitted_text)
        {
            System.out.println(word);
        }

        char[] chars = text.toCharArray();
        for (char letters : chars)
        {
            System.out.println(letters);
        }
    }
}