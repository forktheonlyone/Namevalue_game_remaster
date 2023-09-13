//작성자 배준혁
//작성일 2023.09.11
//최종수정일 2023.09.13
public class Player extends Charactor{
    int gold;
    int maxHp;

    public int getGold() {return gold;}
    public void setGold(int gold) {this.gold = gold;}

    public int getMaxHp() {return maxHp;}
    public void setMaxHp(int maxHp) {this.maxHp = maxHp;}

    public Player(String nickName) {
        super.nickName = nickName;
        hp = 30;
        atk = 2;
        def = 0;
        speed = 10;
        gold = 0;
        maxHp = 30;
    }

    @Override
    public void Attack(Charactor enemy) {
        int dmg = atk - enemy.getDef();
        if(dmg<1) {dmg=1;}

        if(enemy.getHp() < atk) {enemy.setHp(0);}
        else {enemy.setHp(enemy.getHp() - dmg);}

        System.out.println(nickName + "(이)가 " + enemy.nickName + "에게 "
                + dmg + "만큼 데미지를 주었습니다. ");
        System.out.println(enemy.nickName + "의 현재 HP : " + enemy.hp);
    }

    public void Deffence(Charactor enemy){
        int dmg = (enemy.atk - def + 1)/2;
        if(dmg<1) {dmg=1;}
        System.out.println(enemy.nickName + "(이)가 " + nickName + "에게 "
                + dmg + "만큼 데미지를 주었습니다. ");

        if(hp > dmg) {hp -= dmg;}
        else{
            System.out.println(nickName + "의 현재 HP : 0");
            System.out.println(nickName+"(은)는 픽 쓰러졌다.\n\n" +
                    "더 이상 일어설 힘도 나지 않고 눈은 점점 감긴다.\n" +
                    "누군가가 도움을 줬으면 했다.\n\n" +
                    "하지만 아무도 오지 않았다.\n\n" +
                    "Bad Ending");
            System.exit(0);
        }
        System.out.println(nickName + "의 현재 HP : " + hp);
    }

    public void hpRecovery(int recover){
        int reHp = hp + recover;
        if(reHp>maxHp) {reHp = maxHp;}
        hp = reHp;
        System.out.print(nickName + "(이)가 Hp를 "
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
