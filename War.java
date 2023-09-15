// 박세진 , 2023.09.11

import java.sql.SQLOutput;

public class War extends Scene {
    private static Scene instance = null;
    public static Scene getInstance() {
        if (instance == null) {
            instance = new War();
        }
        return instance;
    }

    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan()) {
            case 1:
                AttackSquence(Player.getInstance(),Monster.getInstance());
                return Dead();
            case 2:
                Deffence(Player.getInstance(),Monster.getInstance());
                return Dead();
            case 3:
                NoRun();
            default:
                System.out.println("잘못 입력하였습니다.");
                return Choose();
        }
    }

    public void AttackSquence(Charactor player, Charactor enemy) {
        if (player.getSpeed() > enemy.getSpeed()) {
            Attack(player, enemy);
            if (enemy.getHp() > 0)
                Attack(enemy, player);
        }
        else {
            Attack(enemy, player);
            if (player.getHp() > 0)
                Attack(player, enemy);
        }
    }


    public void Attack(Charactor player, Charactor enemy) {
        int dmg = player.getAtk() - enemy.getDef();
        if (dmg < 1) {
            dmg = 1;
        }
        if (enemy.getHp() > dmg) {
            enemy.setHp(enemy.getHp() - dmg);
        }
        else{
                enemy.setHp(0);
            }
            System.out.println(player.getNickName() + "(이)가 " + enemy.getNickName() + "에게 "
                    + dmg + "만큼 데미지를 주었습니다. ");
            System.out.println(enemy.getNickName() + "의 현재 HP : " + enemy.getHp());

        }

    public void Deffence(Charactor player, Charactor enemy){
        int dmg = (enemy.atk - player.def + 1) / 2;
        if (dmg < 1) {dmg = 1;}
        if (player.getHp() > dmg) {
            player.setHp(player.getHp() - dmg);
        }
        else{
            player.setHp(0);
        }
        System.out.println(enemy.getNickName() + "(이)가 " + player.getNickName() + "에게 "
                + dmg + "만큼 데미지를 주었습니다. ");

    }

    public Scene Dead() {
        if (Player.getInstance().getHp() < 1) {
            System.out.println(Player.getInstance().getNickName() + "의 현재 HP : 0");
            System.out.println(Player.getInstance().getNickName() + "(은)는 픽 쓰러졌다.\n\n" +
                    "더 이상 일어설 힘도 나지 않고 눈은 점점 감긴다.\n" +
                    "누군가가 도움을 줬으면 했다.\n\n" +
                    "하지만 아무도 오지 않았다.\n\n" +
                    "Bad Ending");
            System.exit(0);
            return null;
        } else if (Monster.getInstance().getHp() < 1) {
            return null;
        } else {
            return Choose();
        }
    }

    public void Menu() {
        System.out.println("1.공격하기 ");
        System.out.println("2.막기 ");
        System.out.println("3.도망가기 ");
    }
    public Scene FirstChoose() {
        System.out.println(Monster.getInstance().getNickName() + "(이)가 나타났다!");
        return Choose();

    }

    public Scene NoRun() {
        if (Monster.getInstance().getNickName().equals("리치왕 아서스 메놀드")) {
            System.out.println("도망칠 수 없음");
            return Choose();
        }
        else
            return Govillage.getInstance().FirstChoose();
    }
}














