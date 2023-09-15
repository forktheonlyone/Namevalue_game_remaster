public class Dungeon{

    Monster m = (Monster)Monster.getInstance();

    public void GoblinD() {
        System.out.println("고블린 소굴에 입장하였습니다.");
        m.setMonster("고블린", 10, 1, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("고블린", 10, 1, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("홉 고블린 마크노크", 14, 2, 0, 9);
        War.getInstance().FirstChoose();
        Player.getPlayer().setGold(Player.getPlayer().getGold()+30);
        System.out.println("30골드를 획득하였습니다.");
    }


    public void OrkD() {
        System.out.println("오크의 전초기지에 입장하였습니다.");
        m.setMonster("오크", 12, 3, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("오크", 12, 3, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("오크 족장 라흐라프", 26, 4, 0, 9);
        War.getInstance().FirstChoose();
        Player.getPlayer().setGold(Player.getPlayer().getGold()+45);
        System.out.println("45골드를 획득하였습니다.");
    }

    public void ElfD() {
        System.out.println("나이트 엘프의 숲에 입장하였습니다.");
        m.setMonster("나이트 엘프 정찰병", 12, 5, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("나이트 엘프 정찰병", 12, 5, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("나이트 엘프 정예병 퀴르귀스", 15, 6, 0, 9);
        War.getInstance().FirstChoose();
        m.setMonster("나이트 엘프 장로 반스톰프", 20, 7, 0, 9);
        War.getInstance().FirstChoose();
        Player.getPlayer().setGold(Player.getPlayer().getGold()+60);
        System.out.println("60골드를 획득하였습니다.");
    }

    public void LichD() {
        System.out.println("얼어붙은 설산에 입장하였습니다.");
        System.out.println("검이 빛나며 빛이 온몸을 감싼다...");
        System.out.println("얼어붙은 설산의 동굴 속 리치왕 아서스 메네실이 서리한을 집어든다.");
        m.setMonster("리치왕 아서스 메놀드", 91, 9, 1, 11);
        Player.getPlayer().setMaxHp(80);
        Player.getInstance().setHp(80);
        War.getInstance().FirstChoose();
    }
}
