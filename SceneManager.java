

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
    private final Scene godungeon = new GoDungeon();
    private final Scene restaurant = new Restaurant();
    private final Scene war= new War();
    private final Dungeon dungeon= new Dungeon();

    public GoVillage getVillage() {return (GoVillage)village;}
    public GoPub getPub() {return (GoPub)pub;}
    public GoSmith getSmith() {return (GoSmith)smith;}
    public GoDungeon getGoDungeon() {return (GoDungeon)godungeon;}
    public Restaurant getRestaurant() {return (Restaurant)restaurant;}
    public War getWar() {return (War)war;}
    public Dungeon getDungeon() {return dungeon;}

    public Scene VillageMoveSelect() {
        int id = ScannerManager.Scan();
        switch (id) {
            case 1:
                return getPub().FirstChoose();
            case 2:
                return getSmith().FirstChoose();
            case 3:
                return getGoDungeon().FirstChoose();
            default:
                System.out.println("잘못 입력 하였습니다.");
                break;
        }
        return getVillage().Choose();
    }

    public Scene DungeonMoveSelect() {
        switch (ScannerManager.Scan()) {
            case 1:
                getDungeon().GoblinD();
                break;
            case 2:
                getDungeon().OrkD();
                break;
            case 3:
                getDungeon().ElfD();
                break;
            case 4:
                getDungeon().LichD();
                DialogManager.getInstance().TrueEnding();
                System.exit(0);
                break;
            case 5:
                break;
            default:
                DialogManager.getInstance().WrongDialog();
                break;
        }
        return getVillage().FirstChoose();
    }


}