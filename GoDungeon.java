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
        DialogManager.getInstance().DungeonMenuDialog();
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
                DialogManager.getInstance().TrueEnding();
                System.exit(0);
                break;
            case 5:
                break;
            default:
                DialogManager.getInstance().WrongDialog();
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
