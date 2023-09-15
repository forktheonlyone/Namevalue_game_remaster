//작성자 홍주형
//작성일자 2023.09.11
//최종수장 2023.09.12


import java.util.Scanner;

public class Govillage extends Scene {

    private static Govillage instance = null;

    public static synchronized Govillage getInstance(){
        if(instance == null)
            instance = new Govillage();
        return instance;
    }




    @Override
    public void Menu() {

        System.out.println("1.여관으로 이동");
        System.out.println("2.대장간으로 이동");
        System.out.println("3.던전으로 이동");
        System.out.println("이동할 장소를 선택해 주세요.");
    }

    @Override
    public Scene Choose() {
        Menu();
        switch(ScannerManager.Scan()){
            case 1:
                GoPub.getInstance().FirstChoose();
                break;
            case 2:
                GoSmith.getInstance().FirstChoose();
                break;
            case 3:
                GoDungeon.getInstance().FirstChoose();
                break;
            default:
                System.out.println("잘못 입력 하였습니다.");
                break;

        }
        return Choose();
    }

    @Override
    public Scene FirstChoose() {
        Player.getPlayer().Status();

        System.out.println("마을 사람들이 부지런히 움직이고 있다.");
        System.out.print("\n");

        return Choose();
    }
}