import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Homework {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается
     * <p>
     * <p>
     * <p>
     * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python, java]
     * > revert
     * > print
     * < [python, java]
     * > revert
     * > revert
     * > print
     * < []
     * > revert -> throw new NoSuchElementException
     */


    public static void main(String[] args) {

//        Stack<String> stack = new Stack<String>();
//        for (; ; ) {
//            Scanner in = new Scanner(System.in);
//            System.out.print("> ");
//            String input = in.nextLine();
//            if (input.equals("print")) {
//                Stack<String> stackPrint = new Stack<String>();
//                int size = stack.size();
//                for (int i = 0; i < size; i++) {
//                    stackPrint.push(stack.pop());
//                }
//                System.out.println(stackPrint);
//                for (int i = 0; i < size; i++) {
//                    stack.push(stackPrint.pop());
//                }
//            } else if (input.equals("revert")) {
//                stack.pop();
//            } else if (input.equals("exit")) {
//                break;
//            } else {
//                stack.push(input);
//            }
//        }

        Deque<String> deque = new ArrayDeque<String>();
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.print("> ");
            String input = in.nextLine();
            if (input.equals("print")) {
                System.out.println(deque);
            } else if (input.equals("revert")) {
                deque.pop();
            } else if (input.equals("exit")) {
                break;
            } else {
                deque.push(input);
            }
        }
    }
}
