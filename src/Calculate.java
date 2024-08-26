import java.util.Scanner;

public class Calculate {
    static int calculate(int first, String symbol, int second){
        int result = 0;

        if(symbol.equals("+")){
            result = first + second;
            System.out.println("덧셈 : " + result);
        }
        else if(symbol.equals("-")){
            result = first - second;
            System.out.println("뺄셈 : " + result);
        }
        else if(symbol.equals("*")){
            result = first * second;
            System.out.println("곱셈 : " + result);
        }
        else if(symbol.equals("/")){
            result = first / second;
            System.out.println("나눗셈 : " + result);
        }
        else{
            System.out.println("연산 기호가 아닙니다.");
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Input.getFirstValue(scan);
        int result = first;

        while(true){
            String symbol = Input.getSymbolValue(scan);

            if(symbol.equals("quit")){
                Output.print(result);
                break;
            }

            int second = Input.getSecondValue(scan);

            result = calculate(result, symbol, second);
        }

        scan.close();
    }
}