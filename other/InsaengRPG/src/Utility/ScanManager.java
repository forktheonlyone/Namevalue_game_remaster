package Utility;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ScanManager {
    // 싱글톤
    private static Scanner scanner;
    public static void Initialize()
    {
        scanner = new Scanner(System.in);
    }

    // 숫자 1 ~ 5 입력받기
    public static int Scan()
    {
        int num = 0;
        // 1 ~ 5 사이 값을 입력할 때까지 반복
        while(num < 1 || 5 < num){
            try {
                System.out.print("                                              입력 : ");
                // 숫자 입력
                num = scanner.nextInt();
                scanner.nextLine();

                // 1 ~ 5 사이 값이 아닐 경우
                if(!(0 < num && num < 6))
                    System.out.println("                                       1 ~ 5 사이의 값을 입력해 주세요.");
            }// 입력 오류 시 출력문
            catch (InputMismatchException e ) {
                scanner.nextLine();
                System.out.println("                             숫자를 입력해주세요.");
            }
        }
        return num;
    }

}
