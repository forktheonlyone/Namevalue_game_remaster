

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

    public GoVillage getVillage() {return (GoVillage)village;}
    public GoPub getPub() {return (GoPub)pub;}
    public GoSmith getSmith() {return (GoSmith)smith;}
    public GoDungeon getDungeon() {return (GoDungeon)dungeon;}

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
}