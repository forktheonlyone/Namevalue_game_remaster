package Main.Scene;
import Main.Object.Object;
import Main.Manager.ObjectManager;

public abstract class Scene {
//----------------------------- user 스텟 가져오기 -----------------------------
    Object user = ObjectManager.getInstance().getUser();
    int HP = user.getHP();
    int EXP = user.getEXP();
    int ATK = user.getATK();
    int Money = user.getMoney();
    int Level = user.getLevel();
    int MaxHp = user.getMaxHp();
    int time = user.getTime();
    int Day = user.getDay();
//---------------------------- enemy 스텟 가져오기 ----------------------------
    Object enemy = ObjectManager.getInstance().getEnemy();
    int HP_e = enemy.getHP();
    int ATK_e = enemy.getATK();
    int Money_e = enemy.getMoney();
    int EXP_e = enemy.getEXP();
//---------------------- scene의 이름과 그 getter,setter ----------------------
    // ??? TrainingCenter에서만 한 번 사용
    protected String name; // 아마도 scene의 이름

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
//----------------------------------------------------------------------------
    // scene의 이름을 결정하는 생성자
    public Scene(String name) {this.name = name;}
    // scene의 기본 생성자
    public Scene(){ }

    // 입장 시 출력문 + 숙소 비용 내기
    public abstract void initialize();
    // 행동 선택 (switch 문) + 행동 메뉴(상점,훈련소)
    public abstract void update();
    // 행동 메뉴 or 입장 출력문(훈련소)
    public abstract void render();
}
