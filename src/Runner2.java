public class Runner2 {
    public static void main(String[] args) {
        // Вывести на консоль в столбик произвольное количество аргументов, переданных
        //в качестве параметров в метод main

        //.fori
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }


        //.for
        System.out.println("==========================");

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
