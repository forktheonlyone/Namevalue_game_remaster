package Main.Object;

public abstract class Object {
//-------------------------------- 개체의 스텟 --------------------------------
    protected String name; // 이름
    protected int HP; // 체력
    protected int DF; // 방어력
    protected int EXP; // 경험치
    protected int ATK; // 공격력
    protected int Money; // 돈
    protected int Level; // 레벨
    protected int MaxHp; // 최대 체력
    protected int time; // 게임 상의 현재 시간(주인공만 사용)
    protected int Day; // 게임 상의 현재 날짜(주인공만 사용)
    public boolean Game; // ???

//------------------------ 개체의 스텟의 getter, setter ------------------------
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getHP() {return HP;}
    public void setHP(int HP) {this.HP = HP;}

    public int getEXP() {return EXP;}
    public void setEXP(int EXP) {this.EXP = EXP;}

    public int getATK() {return ATK;}
    public void setATK(int ATK) {this.ATK = ATK;}

    public int getMoney() {return Money;}
    public void setMoney(int money) {Money = money;}

    public int getLevel() {return Level;}
    public void setLevel(int level) {Level = level;}

    public int getMaxHp() {return MaxHp;}
    public void setMaxHp(int maxHp) {this.MaxHp = maxHp;}

    public int getTime() {return time;}
    public void setTime(int time){this.time = time;}

    public int getDay() {return Day;}
    public void setDay(int day) {Day = day;}

    public int getDF() {return DF;}
    public void setDF(int DF) {this.DF = DF;}
//------------------------------------------------------------------
    // 개체의 스텟 초기화(기본값 설정)
    public abstract void initialize();
    // user와 마왕의 전투, enemy의 상태창 출력
    public abstract void update();
    // user와 마왕의 상태창 출력
    public abstract void render();
}
