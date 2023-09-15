//작성자 홍주형
//작성일자 2023.09.11
//최종수장 2023.09.12


import java.util.Scanner;

public class Govillage extends Scene {


    @Override
    public void Menu() {
        System.out.println("1.여관으로 이동");
        System.out.println("2.대장간으로 이동");
        System.out.println("3.던전으로 이동");
    }

    @Override
    public Scene Choose() {
        Menu();
        SceneManager.getInstance().sceneSelect();

        return null;
    }

    @Override
    public Scene FirstChoose() {
        Player.getPlayer().Status();
        System.out.println("마을 사람들이 부지런히 움직이고 있다.");
        System.out.print("\n");
        return Choose();
    }
}