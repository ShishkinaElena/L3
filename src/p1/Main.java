package p1;

public class Main {
    public static void main(String[] args) {
  //+, -, * это бинарные операции
        int a = 10;
        int b = 7;
        int c = a+b;
        int d = 10+a;

// есть ньюансы
        int a1 = 20;
        int b1 = 5;
        int c1 = a1 / b1;
        System.out.println(c1); // результат 4

       /* int a1 = 20;
        int b1 =7;
        int c1 = a1 / b1;
        System.out.println(c1); // результат 2 -  всегда целое число в этом случае

        int g2 = 20;
        int h2=7;
        double j2 = g2/ h2;
        System.out.println(c1); //  результат 2.0 - т.к. double */

        int m = 20;
        double n =7;
        double v = m / n;
        System.out.println(c1); //  результат 2.857... будет дробное  - т.к. одна из перемееных double - в частности в b1

        int g1 = 20 ;
        float h1 =7 ;
        double j1 = g1 / h1 ;
        System.out.println(c1); //  результат 2.857... будет дробное  - т.к. одна из перемееных float , как  double

        int f = 33;
        int h = 5;
        int k = f % h;
        System.out.println(k);  // Получение остатка от деления, в данном случае ответ 3

        int q = 10;
        int x = ++q;
        System.out.println(q); // 11 потом присваиваем значение
        System.out.println(x); // 11 сначала увеличиваем префиксный инкремент / x=++q => q+1 x=q

        q = 10;
        x = q++;
        System.out.println(q); // 11 / сначала 10 кладётся в x > затем q увеличивается на 1 / x=++q => x=q  q=q+1
        System.out.println(x); // 10 постфиксный инкремент - сначала присваиваем значение потом увелтчиваем / x=++q => x=q  q=q+1

        // x++ приоритеты по убыванию
        // ++x
        // * / %
        // + -

        int rez = x + 5 * ++q; // 70 Сначала  выполняеься ++q (12), затем умножение, затем сложение
        System.out.println(rez);

       /* int rez = (x + 5) * ++q; // 180 можно расставить скобки, что бы поменять приоритет
        System.out.println(rez);

        double d2 = 2.0 - 1.1; // 0.8999999999999999 ошибка из за двоичной системы
        System.out.println(d2);

        // Логические операции с двоичными числами

        int z1 = 2;  // 010 это значение в двоичной системе исчисления
        int z2 = 5; // 101
        System.out.println(z1 & z2); // результат 0 Это логическое умножение */

        int z1 = 4; //100
        int z2 = 5; //101
        System.out.println(z1 & z2); // результат 4 ampersand(союз и)логическое умножение

        System.out.println(z1 | z2); //есть логическое сложение результат 5 или 101 в двоичной системе исчисления

        System.out.println(z1 ^ z2); // ^ -  это Циркумфлекс результат 1 - если одинаковые цыфры стоят, то 0, если разные то 1

        // Операции сравнения
        System.out.println(z1 == z2); // два знака равно это сравнение, в нашем случае результат fouls
        System.out.println(z1 != z2); //это сравнение неравенства одно не равно другому, в нашем случае это true
        System.out.println(z1 < z2); // это строгое неравенство  в нашем случае true
        System.out.println(z1 > z2); // , в нашем случае результат fouls

        System.out.println(z1 <= z2); // это не строгое неравенство , меньше или равно, в нашем случае это true
        System.out.println(z1 >= z2); // больше или равно, в нашем случае результат fouls

           // Логические операции
        System.out.println((z1>z2) | (z1==z2)); // в нашем случае результат fouls

        System.out.println((z1<z2) | (z1==z2)); // при одной палке считаются оба выражения и на их основе выводится результат
        System.out.println((z1<z2) || (z1==z2)); // вычисляется первая скобка и если она правильная true и если две палки, то вычисление дальше не производится

        System.out.println((z1<z2) & (z1==z2)); // в нашем случае результат fouls
        System.out.println((z1<z2) && (z1!=z2)); // объединение двух операций сравнения

        System.out.println(!(z1<z2)); // если стоит ! то это означает приставку не / в нашем случае результат fouls
        System.out.println((z1<z2) ^ (z1==z2)); // если хоть одно выражение true, то будет true

        int sd = 33; // это операция присваивания

        sd = sd + x; // это полная запись
        sd += x; // это тоже самое в сокращенном виде
        // -=, *=, /=, %=
        // &=, |=, ^=





    }
}