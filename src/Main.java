public class Main {
    public static void main(String[] args) {
        //ЗАДАЧА1
        System.out.println("Задача 1:");
        var dog = 8.0;
        System.out.println("dog = "+ dog);
        var cat = 3.6;
        System.out.println("cat = "+ cat);
        var paper = 763789;
        System.out.println("paper = "+ paper);
                                            //ЗАДАЧА2
        System.out.println("Задача 2:");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = "+ dog);
        System.out.println("cat = "+ cat);
        System.out.println("paper = "+ paper);
                                            //ЗАДАЧА3
        System.out.println("Задача 3:");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = "+ dog);
        System.out.println("cat = "+ cat);
        System.out.println("paper = "+ paper);
                                            //ЗАДАЧА4
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println("friend = "+ friend);
        friend += 2;
        System.out.println("friend = "+ friend);
        friend /= 7;
        System.out.println("friend = "+ friend);
                                            //ЗАДАЧА5
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println("frog = "+ frog);
        frog *= 10;
        System.out.println("frog = "+ frog);
        frog /= 3.5;
        System.out.println("frog = "+ frog);
        frog += 4;
        System.out.println("frog = "+ frog);
                                            //ЗАДАЧА6
        System.out.println("Задача 6:");
        var m1 = 78.2;
        var m2 = 82.7;
        var sm = m1+m2;
        System.out.println("Общая масса = " + sm);
        var rm = m2-m1;
        System.out.println("Разница масс = " + rm);
                                            //ЗАДАЧА7
        System.out.println("Задача 7:");
        var rm1 = m2 - m1;
        var rm2 = m2%m1;
        System.out.println("Разница масс = " + rm1);
        System.out.println("Разница масс = " + rm2);
                                            //ЗАДАЧА8.1
        System.out.println("Задача 8.1:");
        var ammountOfHours = 640;
        var hoursPerWorker = 8;
        var ammountOfWorkers = ammountOfHours/hoursPerWorker;
        System.out.println("Всего работников в компании - "+ ammountOfWorkers +  " человек");
                                            //ЗАДАЧА8.2
        System.out.println("Задача 8.2:");
        ammountOfWorkers += 94;
        ammountOfHours = ammountOfWorkers*hoursPerWorker;
        System.out.println("Если в компании работает "+ ammountOfWorkers + " человек, то всего " + ammountOfHours + " часов работы может быть поделено между сотрудниками");

    }
}