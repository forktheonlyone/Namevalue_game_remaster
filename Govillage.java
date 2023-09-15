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
        System.out.println("마을 사람들이 부지런히 움직이고 있다.");
        System.out.println("1.여관으로 이동");
        System.out.println("2.대장간으로 이동");
        System.out.println("3.던전으로 이동");
        System.out.println("이동할 장소를 선택해 주세요.");
    }

    @Override
    public void initialize() {

    }

    @Override
    public boolean update() {
        Menu();
        int id = ScannerManager.Scan();
        SceneManager.getInstance().setScen(id);

        if(this.Live){
            return true;}
        return false;
    }

    @Override
    public Scene Choose() {
        return null;
    }

    @Override
    public Scene FirstChoose() {
        return null;
    }
}

/*
    public void ActMenu(Charactor charactor,GoPub goPub,GoSmith goSmith,GoDungeon goDungeon) {

        while (true) {
            ((Player)charactor).Status();
            System.out.print("\n");
            System.out.println("마을 사람들이 부지런히 움직이고 있다.");
            System.out.print("\n");


            switch (ScannerManager.Scan()) {
                case 1:
                    goPub.PubMenu(charactor);
                    break;
                case 2:
                    goSmith.SmithMenu(charactor);
                    break;
                case 3:
                    goDungeon.Update(charactor);
                    break;
                default:
                    System.out.println("잘못된 선택지 입니다.");
                    System.out.println("다시 선택해주세요.");
                    break;
            }
        }
    }
*/