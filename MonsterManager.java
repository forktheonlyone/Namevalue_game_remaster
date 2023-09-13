// 작성자 홍주형
// 작성일자 2023.09.11
// 최종수정 2023.09.12


import java.util.LinkedList;
import java.util.List;

public class MonsterManager {

    private static MonsterManager instance = null;

    public static MonsterManager getInstance(){
        if(instance==null){
            instance = new MonsterManager();
        }
        return instance;
    }

     protected MonsterManager(){MonsterList = new LinkedList<>();}


    private List<Monster> MonsterList;

    protected void GoblinList()
    {
        // Monster creation
        MonsterList.add(new Monster("고블린", 10, 1, 0, 9));
        MonsterList.add(new Monster("고블린", 10, 1, 0, 9));
        MonsterList.add(new Monster("홉 고블린 마크노크", 14, 2, 0, 9));
    }

    protected void OrkList()
    {
        // Monster creation
        MonsterList.add(new Monster("오크", 12, 3, 0, 9));
        MonsterList.add(new Monster("오크", 12, 3, 0, 9));
        MonsterList.add(new Monster("오크 족장 라흐라프", 26, 4, 0, 9));
    }
    protected void ElfList()
    {
        // Monster creation
        MonsterList.add(new Monster("나이트 엘프 정찰병", 12, 5, 0, 9));
        MonsterList.add(new Monster("나이트 엘프 정찰병", 12, 5, 0, 9));
        MonsterList.add(new Monster("나이트 엘프 정예병 퀴르귀스", 15, 6, 0, 9));
        MonsterList.add(new Monster("나이트 엘프 장로 반스톰프", 20, 7, 0, 9));
    }
    protected void LastBoss()
    {
        // Monster creation
        MonsterList.add(new Monster("리치왕 아서스 메놀드", 91, 9, 1, 11));
    }


    public int size(){
        return MonsterList.size();
    }


    public Monster getMonsterList(int i) {
        return MonsterList.get(i);
    }

    public void remove(){MonsterList.remove(0);}
}
