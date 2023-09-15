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
        int reHp = hp + recover;
        if(reHp>maxHp) {reHp = maxHp;}
        hp = reHp;
        System.out.println(nickName + "(이)가 Hp를 "
                + recover + "만큼 회복했습니다. ");
        System.out.println(nickName + "의 현재 HP : " + hp);
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
