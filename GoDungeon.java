// 박세진 , 2023.09.11

public class GoDungeon extends Scene {

    private static GoDungeon instance = null;
    public static GoDungeon getInstance() {
        if (instance == null) {
            instance = new GoDungeon();
        }
        return instance;
    }

    Dungeon D = new Dungeon();

    public void Menu() {
        System.out.println("1.고블린 소굴");
        System.out.println("2.오크의 전초기지");
        System.out.println("3.나이트 엘프의 숲");
        System.out.println("4.얼어붙은 설산");
        System.out.println("5.마을로 돌아가기 ");
    }

    public Scene Choose() {
        Menu();
        setDungeon(new Dungeon());
        switch (ScannerManager.Scan()) {
            case 1:
                D.GoblinD();
                break;
            case 2:
                D.OrkD();
                break;
            case 3:
                D.ElfD();
                break;
            case 4:
                D.LichD();
                System.out.println("세계는 평화를 되찾았고 우리의 수도인 스톰윈드에 내려졌던 언데드의 저주도 해제되었고\n도시와 마을 곳곳에는 아이들의 웃음소리가 다시 들려오기 시작했다. \n" +
                        "\n" +
                        "이 비극이 두번다시 되는것을 막기위해 나는 설산으로 향했다.\n" +
                        "\n" +
                        "True Ending");
                System.exit(0);
                break;
            case 5:
                break;
            default:
                System.out.println("그런 번호는 없습니다.");
                break;
        }
         return Govillage.getInstance().FirstChoose();
    }

    public Scene FirstChoose() {
        return Choose();
    }

    public void setDungeon(Dungeon D){
        this.D = D;
    }
}
