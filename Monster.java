//작성자 홍주형
//작성일 2023.09.11
//최종수정일 2023.09.12

public class Monster extends Charactor {

    public void setMonster (String nickName, int hp, int atk, int def, int speed) {
        this.nickName=nickName;
        this.hp=hp;
        this.atk=atk;
        this.def=def;
        this.speed=speed;

    }

    private static Charactor instance = null;

    public static Charactor getInstance(){
        if(instance == null)
            instance = new Monster();
        return instance;
    }
}