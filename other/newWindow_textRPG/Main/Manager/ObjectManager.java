package Main.Manager;
import Main.Object.*;
import Main.Object.Object;
public class ObjectManager {
    // 싱글톤
    private static ObjectManager instance = null;

    public static ObjectManager getInstance()
    {
        if(instance == null)
            instance = new ObjectManager();
        return instance;
    }

//----------------------------- 개체(주인공,보스,몬스터) 설정 -----------------------------
    Object user = null;
    Object boss = null;
    Object enemy = null;

//-------------------------------- 개체의 getter,setter --------------------------------
    public Object getUser() { return user;}
    public void setUser(Object user) { this.user = user;}

    public Object getEnemy() { return enemy;}
    public void setEnemy(Object enemy) { this.enemy = enemy;}

    public Object getBoss() { return boss;}
    public void setBoss(Object boss) { this.boss = boss;}

//---------------------------------- 모든 개체의 초기화 ----------------------------------
    public void initialize(){
        this.user = new User();
        this.user.initialize();

        this.boss = new Boss();
        this.boss.initialize();

        this.enemy = new Enemy();
        this.enemy.initialize();
    }

    // user의 스텟, 상태 확인
    public void UserStatus(){this.user.render();}
}
