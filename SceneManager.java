

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
    private final Dungeon D = new Dungeon();

    public GoVillage getVillage() {return (GoVillage)village;}
    public GoPub getPub() {return (GoPub)pub;}
    public GoSmith getSmith() {return (GoSmith)smith;}
    public GoDungeon getDungeon() {return (GoDungeon)dungeon;}
    public War getWar() {return (War)war;}

    public Scene sceneSelect() {
        int id = ScannerManager.Scan();
        switch (id) {
            case 1:
                return SceneManager.getInstance().getPub().FirstChoose();
            case 2:
                return SceneManager.getInstance().getSmith().FirstChoose();
            case 3:
                return SceneManager.getInstance().getDungeon().FirstChoose();
            default:
                System.out.println("잘못 입력 하였습니다.");
                break;
        }
        return getVillage().Choose();
    }

    public Scene DungeonSelect() {
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
        return SceneManager.getInstance().getVillage().FirstChoose();
    }
}