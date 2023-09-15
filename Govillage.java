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
        DialogManager.getInstance().VillageMenuDialog();
    }

    @Override
    public Scene Choose() {
        Menu();
        switch(ScannerManager.Scan()){
            case 1:
                return GoPub.getInstance().FirstChoose();
            case 2:
                return GoSmith.getInstance().FirstChoose();
            case 3:
                return GoDungeon.getInstance().FirstChoose();
            default:
                DialogManager.getInstance().WrongDialog();
                break;
        }
        return Choose();
    }

    @Override
    public Scene FirstChoose() {
        Player.getPlayer().Status();
        DialogManager.getInstance().VillageBackGround();
        return Choose();
    }
}