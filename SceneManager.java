

public class SceneManager {

    private static SceneManager instance = null;

    public static SceneManager getInstance() {
        if (instance == null) {
            instance = new SceneManager();
        }
        return instance;
    }

    private final Scene village = new GoVillage();
    private final Scene pub = new GoPub();
    private final Scene smith = new GoSmith();
    private final Scene dungeon = new GoDungeon();
    private final Scene war = new War();
    private final Scene restaurant = new Restaurant();
    private final Dungeon D = new Dungeon();

    public GoVillage getVillage() {return (GoVillage)village;}
    public GoPub getPub() {return (GoPub)pub;}
    public GoSmith getSmith() {return (GoSmith)smith;}
    public GoDungeon getDungeon() {return (GoDungeon)dungeon;}
    public Restaurant getRestaurant() {return (Restaurant)restaurant;}
    public War getWar() {return (War)war;}
    public Dungeon getD() {return D;}

    public void VillageMoveSelect() {
        switch (ScannerManager.Scan()) {
            case 1:
                getPub().FirstChoose();
                return;
            case 2:
                getSmith().FirstChoose();
                return;
            case 3:
                getDungeon().FirstChoose();
                return;
            default:
                System.out.println("잘못 입력 하였습니다.");
                break;
        }
        getVillage().Choose();
    }

    public void DungeonSelect() {
        switch (ScannerManager.Scan()) {
            case 1:
                getD().GoblinD();
                break;
            case 2:
                getD().OrkD();
                break;
            case 3:
                getD().ElfD();
                break;
            case 4:
                getD().LichD();
                DialogManager.getInstance().TrueEnding();
                System.exit(0);
                break;
            case 5:
                break;
            default:
                DialogManager.getInstance().WrongDialog();
                break;
        }
        getVillage().FirstChoose();
    }
}