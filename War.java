// 박세진 , 2023.09.11

public class War {
    public void Fight(Charactor c, int i){

        switch (i) {
            case 1 :
                System.out.println("고블린 소굴에 입장하였습니다.");
                MonsterManager.getInstance().GoblinList();
                break;
            case 2 :
                System.out.println("오크의 전초기지에 입장하였습니다.");
                MonsterManager.getInstance().OrkList();
                break;
            case 3 :
                System.out.println("나이트 엘프의 숲에 입장하였습니다.");
                MonsterManager.getInstance().ElfList();
                break;
            case 4 :
                System.out.println("얼어붙은 설산에 입장하였습니다.");
                System.out.println("검이 빛나며 빛이 온몸을 감싼다...");
                System.out.println("얼어붙은 설산의 동굴 속 리치왕 아서스 메네실이 서리한을 집어든다.");
                MonsterManager.getInstance().LastBoss();
                ((Player)c).setMaxHp(80);
                ((Player)c).hpRecovery(80);
                break;
        }


        boolean keep =true;

        while (MonsterManager.getInstance().size() > 0) {
            Monster m = MonsterManager.getInstance().getMonsterList(0);
            if(keep) {
                System.out.println(m.getNickName() + "(이)가 나타났다!");
            }
            while (m.getHp() > 0 && keep) {
                PlayActMenu();
                switch (ScannerManager.Scan()) {
                    case 1:
                        if (c.getSpeed() > m.getSpeed()) {
                            c.Attack(m);
                            if (m.getHp() > 0) {
                                m.Attack(c);
                            }
                        } else {
                            m.Attack(c);
                            if (c.getHp() > 0) {
                                c.Attack(m);
                            }
                        }
                        break;
                    case 2:
                        ((Player) c).Deffence(m);
                        break;
                    case 3:
                        if(i<4) { keep = false; }
                        else {
                            System.out.println("도망칠 수 없다!");
                        }
                        break;
                }
            }
            if(keep) {
                System.out.println(m.getNickName() + "(이)가 죽었습니다.");
            }
            MonsterManager.getInstance().remove();
        }

        if(keep) {
            switch (i) {
                case 1 :
                    GetGold(c,30);
                    break;
                case 2 :
                    GetGold(c,45);
                    break;
                case 3 :
                    GetGold(c,60);
                    break;
            }
        }

    }

    public void PlayActMenu() {
        System.out.println("1.공격하기 ");
        System.out.println("2.막기 ");
        System.out.println("3.도망가기 ");
    }

    public void GetGold(Charactor c,int gold) {
        System.out.println(gold + "골드를 획득하였습니다.");
        ((Player)c).setGold(((Player)c).getGold()+gold);
    }
}
