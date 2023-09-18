//작성자 배준혁
//작성일 2023.09.11
//최종수정일 2023.09.15
public class Player extends Charactor{
    int gold;
    int maxHp;

    public int getGold() {return gold;}
    public void setGold(int gold) {this.gold = gold;}

    public int getMaxHp() {return maxHp;}
    public void setMaxHp(int maxHp) {this.maxHp = maxHp;}
    
    private static Charactor instance = null;

    public static Charactor getInstance(){
        if(instance==null) {instance = new Player(ScannerManager.ScanName());}
        return instance;
    }

    public static Player getPlayer(){
        return (Player)Player.getInstance();
    }

    public Player(String nickName) {
        super.nickName = nickName;
        hp = 30;
        atk = 2;
        def = 0;
        speed = 10;
        gold = 0;
        maxHp = 30;
    }

    public void hpRecovery(int recover){
        if(hp + recover > maxHp)
            hp = maxHp;
        else
            hp += recover;
        System.out.println(nickName + "(이)가 Hp를 " + recover + "만큼 회복했습니다. ");
        System.out.println(nickName + "의 현재 HP : " + hp);
    }

    public boolean GoldCost(int cost){
        if (gold < cost) {
            System.out.println("골드가 부족합니다.");
            return false;
        }
        else {
            gold = gold - cost;
            System.out.println(nickName + "의 현재 Gold : " + gold);
            return true;
        }
    }

    public void GetGold(int gold) {
        System.out.println(gold + "골드를 획득하였습니다.");
        this.gold += gold;
    }

    public void Status(){
        System.out.println("===========정보창============");
        System.out.println("이름 : " + nickName);
        System.out.println("체력 : " + hp+" / "+maxHp);
        System.out.println("공격력 : " + atk);
        System.out.println("방어력 : " + def);
        System.out.println("골드 : " + gold);
        System.out.println("=============================");
    }
}
