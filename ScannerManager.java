import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//작성자 배준혁
//작성일 2023.09.11
//최종수정일 2023.09.13
public class ScannerManager {

    private static Scanner scanner;

    public static void Initialize(){scanner = new Scanner(System.in);}

    public static int Scan()
    {
        int num = 0;

        try {
            System.out.print("메뉴를 선택해주세요: ");

            num = scanner.nextInt();
            scanner.nextLine();
            try{TimeUnit.SECONDS.sleep(1);}
            catch (InterruptedException e) {
                System.out.println("지연에 이상이 생겼습니다.");
            }
        } catch (NoSuchElementException e) {
            scanner.nextLine();
            System.out.println("입력이 잘못되었습니다.");
        }
        return num;
    }

    public static String ScanName()
    {
        String name = null;

        try {
            System.out.print("이름을 입력해주세요: ");

            name = scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("입력이 잘못되었습니다.");
        }
        return name;
    }

}
