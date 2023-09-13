//작성자 홍주형
//작성일 2023.09.11
//최종수정일 2023.09.12

public class Monster extends Charactor {

    public Monster (String nickName, int hp, int atk, int def, int speed) {
        this.nickName=nickName;
        this.hp=hp;
        this.atk=atk;
        this.def=def;
        this.speed=speed;

    }



    @Override
    public void Attack(Charactor enemy) {
        int damage = atk - enemy.def;
        if(damage<1){damage=1;}
        if(enemy.getHp() <= damage)
        {
            System.out.println(enemy.nickName + "의 현재 HP : 0");
            System.out.println(enemy.nickName +"(은)는 픽 쓰러졌다.\n\n" +
                    "더 이상 일어설 힘도 나지 않고 눈은 점점 감긴다.\n" +
                    "누군가가 도움을 줬으면 했다.\n\n" +
                    "하지만 아무도 오지 않았다.\n\n" +
                    "Bad Ending");
            System.exit(0);
        }
        else {enemy.setHp(enemy.getHp() - damage);}
        System.out.println(getNickName()+"(이)가 "+enemy.getNickName()+"에게 "+damage+"만큼 데미지를 주었습니다.");
        System.out.println(enemy.nickName+"의 현재 HP : "+enemy.hp);
    }



}