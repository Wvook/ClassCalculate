import java.util.Scanner;

public class Input{
     static int getFirstValue(Scanner scan){
        System.out.println("첫 번째 수를 입력하세요: ");
        int first = scan.nextInt();
        System.out.println(first);
        return first;
    }
    static String getSymbolValue(Scanner scan){
        System.out.println("연산 기호를 입력하세요: ");
        String symbol = scan.next();
        System.out.println(symbol);
        return symbol;
    }
     static int getSecondValue(Scanner scan){
        System.out.println("다음 수를 입력하세요: ");
        int second = scan.nextInt();
        System.out.println(second);
        return second;
    }



}