//작성자 배준혁
//작성일 2023.09.11
//최종수정일 2023.09.14
public class Dungeon{
    Monster m = (Monster)Monster.getInstance();

    public void GoblinD() {
        System.out.println("고블린 소굴에 입장하였습니다.");
        m.setAll("고블린", 10, 1, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("고블린", 10, 1, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("홉 고블린 마크노크", 14, 2, 0, 9);
        War.getInstance().FirstChoose();
        if (m.getHp()==0) {
            Player.getInstance().GetGold(30);
        }
    }

    public void OrkD(Charactor player) {
        System.out.println("오크의 전초기지에 입장하였습니다.");
        m.setAll("오크", 12, 3, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("오크", 12, 3, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("오크 족장 라흐라프", 26, 4, 0, 9);
        War.getInstance().FirstChoose();
        if (m.getHp()==0) {
            Player.getInstance().GetGold(30);
        }
    }
    public void ElfD(Charactor player) {
        System.out.println("나이트 엘프의 숲에 입장하였습니다.");
        m.setAll("나이트 엘프 정찰병", 12, 5, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("나이트 엘프 정찰병", 12, 5, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("나이트 엘프 정예병 퀴르귀스", 15, 6, 0, 9);
        War.getInstance().FirstChoose();
        m.setAll("나이트 엘프 장로 반스톰프", 20, 7, 0, 9);
        War.getInstance().FirstChoose();
        if (m.getHp()==0) {
            Player.getInstance().GetGold(30);
        }
    }
    public void LichD(Charactor player) {
        System.out.println("얼어붙은 설산에 입장하였습니다.");
        System.out.println("검이 빛나며 빛이 온몸을 감싼다...");
        System.out.println("얼어붙은 설산의 동굴 속 리치왕 아서스 메네실이 서리한을 집어든다.");
        m.setAll("리치왕 아서스 메놀드", 91, 9, 1, 11);
        Player.getInstance().setMaxHp(80);
        Player.getInstance().setHp(80);
        War.getInstance().FirstChoose();
        if (m.getHp()==0) {
            Player.getInstance().GetGold(30);
        }
    }
}
