import java.awt.*;
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
            DialogManager.getInstance().SelectMenuDialog();
            num = scanner.nextInt();
            scanner.nextLine();
            try{TimeUnit.SECONDS.sleep(1);}
            catch (InterruptedException e) {
                DialogManager.getInstance().ErrorDelayDialog();
            }
        } catch (NoSuchElementException e) {
            scanner.nextLine();
            DialogManager.getInstance().WrongDialog();
        }
        return num;
    }

    public static String ScanName()
    {
        String name = null;

        try {
            DialogManager.getInstance().InputName();
            name = scanner.nextLine();
        } catch (NoSuchElementException e) {
            DialogManager.getInstance().WrongDialog();
        }
        return name;
    }

}
