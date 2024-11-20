package cal;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcu_Lv2 calcu_lv2 = new Calcu_Lv2();
        List list = new List();

        while (true) {
            System.out.println("두 정수 중 첫 번째 정수를 입력하세요");
            int firstNumber = scanner.nextInt();

            System.out.println("두 번째 정수를 입력하세요");
            int secondNumber = scanner.nextInt();

            scanner.nextLine();

            System.out.println("사칙연산 +, -, *, / 중 1개를 입력하세요");
            String operate = scanner.nextLine();
            //연산자 완료
            double result = calcu_lv2.calculate(operate,firstNumber, secondNumber);
            //결과 지정
            System.out.println(result); //결과보고

            list.addResult(result); //결과 저장

            System.out.println("이전 결과를 보고 싶으시면 \"result\"를 입력해주세요.\n제일 오래된 결과를 삭제하고 싶으시면 \" remove\"를 입력하세요.\n프로그램을 종료하려면 \"exit\"을 입력하세요.\n계속하시려면 아무거나 입력하세요.");
            String check = scanner.nextLine();
            if (check.equals("result")) {
            System.out.println("이전 결과를 보여드립니다.");
            System.out.println(list.getResultList());

            } else if (check.equals("remove")) {
            System.out.println("제일 오래된 결과를 삭제합니다.\n계속하시려면 아무거나 입력하세요.");
            System.out.println(list.removeResult());

            } else if (check.equals("exit")) {
            System.out.println("프로그램을 종료합니다.");
            break;
            }


            }
        }
    }

