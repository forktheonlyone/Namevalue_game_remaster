public class Fight {

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

}
