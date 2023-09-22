package Main.Manager;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ScanManager {
    private static Scanner scanner;

    // ??? 만들 필요 없음
    public ScanManager() {}

    // 싱글톤
    public static void Initialize() {
        scanner = new Scanner(System.in);
    }

    // 숫자 입력받기
    public static int Scan() {
        int num = 0;
        try {
            System.out.println("숫자를 입력해주세요 : ");
            num = scanner.nextInt();
            scanner.nextLine();
        }
        catch (NoSuchElementException var2) {
            System.out.println("입력이 잘못되었습니다.");
        }
        return num;
    }

    // 문자 입력받기
    public static String ScanString(String str) {
        String Str = "";
        try {
            System.out.println("타이핑을 해주세요 : ");
            Str = scanner.nextLine();
        }
        catch (NoSuchElementException var2) {
            System.out.println("입력이 잘못되었습니다.");
        }
        return Str;
    }
}
