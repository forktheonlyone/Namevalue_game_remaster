public class Dungeon{

    Monster m = (Monster)Monster.getInstance();

    public void GoblinD() {
        DialogManager.getInstance().EnterGoblinDialog();
        m.setMonster("고블린", 10, 1, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("고블린", 10, 1, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("홉 고블린 마크노크", 14, 2, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        Player.getPlayer().setGold(Player.getPlayer().getGold()+30);
        DialogManager.getInstance().EarnGold30();
    }

    public void OrkD() {
        DialogManager.getInstance().EnterOrkDialog();
        m.setMonster("오크", 12, 3, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("오크", 12, 3, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("오크 족장 라흐라프", 26, 4, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        Player.getPlayer().setGold(Player.getPlayer().getGold()+45);
        DialogManager.getInstance().EarnGold45();
    }

    public void ElfD() {
        DialogManager.getInstance().EnterNightElf();
        m.setMonster("나이트 엘프 정찰병", 12, 5, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("나이트 엘프 정찰병", 12, 5, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("나이트 엘프 정예병 퀴르귀스", 15, 6, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        m.setMonster("나이트 엘프 장로 반스톰프", 20, 7, 0, 9);
        SceneManager.getInstance().getWar().FirstChoose();
        Player.getPlayer().setGold(Player.getPlayer().getGold()+60);
        DialogManager.getInstance().EarnGold60();
    }

    public void LichD() {
        DialogManager.getInstance().EnterSnowMountainDialog();
        m.setMonster("리치왕 아서스 메놀드", 91, 9, 1, 11);
        Player.getPlayer().setMaxHp(80);
        Player.getInstance().setHp(80);
        SceneManager.getInstance().getWar().FirstChoose();
    }
}
