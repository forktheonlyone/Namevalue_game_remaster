//작성자 홍주형
//작성일자 2023.09.11
//최종수장 2023.09.12


public class Govillage extends Scene {

    private static Govillage instance = null;

    public static synchronized Govillage getInstance(){
        if(instance == null)
            instance = new Govillage();
        return instance;
    }




    @Override
    public void Menu()
    {
        DialogManager.getInstance().VillageDialog();
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
        DialogManager.getInstance().VillageBackGround();
        return Choose();
    }
}