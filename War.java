// 박세진 , 2023.09.11

public class War extends Scene {
    private static Scene instance = null;
    public static Scene getInstance() {
        if (instance == null) {
            instance = new War();
        }
        return instance;
    }

    public Scene Choose() {
        DialogManager.getInstance().WarMenuDialog();
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
                DialogManager.getInstance().WrongDialog();
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
            DialogManager.getInstance().BadEnding();
            System.exit(0);
            return null;
        } else if (Monster.getInstance().getHp() < 1) {
            return null;
        } else {
            return Choose();
        }
    }

    public void Menu() {
        DialogManager.getInstance().WarMenuDialog();
    }
    public Scene FirstChoose() {
        DialogManager.getInstance().MobEntranceDialog();
        return Choose();
    }

    public Scene NoRun() {
        if (Monster.getInstance().getNickName().equals("리치왕 아서스 메놀드")) {
            System.out.println("도망칠 수 없음");
            return Choose();
        }
        else
            return SceneManager.getInstance().getVillage().FirstChoose();
    }
}














