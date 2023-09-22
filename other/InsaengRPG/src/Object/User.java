package Object;

import Manager.SceneManager;

public class User {
    // 각 스텟의 최대, 최소(현재 사용 X)
    final int MAX = 100;
    final int MIN = 0;
//-------------------------------- 스텟 --------------------------------
    int Intel = 0;          // 지성
    int Wealth = 100;       // 골드
    int Sociability =  0;   // 사교성
    int Morality =  100;    // 도덕성
    int Artistry =  0;      // 예술성
    int PTSD =  0;          // 스트레스

    // 기본 생성자
    public User(){}

    // 넣은 값대로 user의 스텟을 초기화(현재 사용X)
    public User(int Intel, int Wealth, int Sociability, int Morality, int Artistry, int PTSD) {
        this.Intel = Intel;
        this.Wealth = Wealth;
        this.Sociability=Sociability;
        this.Morality=Morality;
        this.Artistry=Artistry;
        this.PTSD=PTSD;
    }

//---------------------------- 각 스텟의 getter, setter --------------------------------
    public int getIntel() { return Intel; }
    public void setIntel(int intel) { this.Intel = intel; }

    public int getWealth() { return Wealth; }
    public void setWealth(int wealth) { this.Wealth = wealth; }

    public int getSociability() { return Sociability; }
    public void setSociability(int sociability) { this.Sociability = sociability; }

    public int getMorality() { return Morality; }
    public void setMorality(int morality) { this.Morality = morality; }

    public int getArtistry() { return Artistry; }
    public void setArtistry(int artistry) { this.Artistry = artistry; }

    public int getPTSD() { return PTSD; }
    public void setPTSD(int PTSD) { this.PTSD = PTSD; }
// ---------------------------------------------------------------------------------------------

    // 행동을 취소하거나 돈이 없어 행동을 할 수 없는 경우(+ 인트로)가
    // 24턴에 들어가는 것 막기 위한 멤버 메소드
    public int turnUp(){
        // SceneManger의 남은 턴 수 가지고 옴
        int turn = SceneManager.getInstance().getTurn();
        // 의미없이 소비했던 턴 수 다시 회복
        turn +=1;
        // SceneManger의 남은 턴 수 회복
        SceneManager.getInstance().setTurn(turn);
        return 0;
    }

    // 현재 남은 턴 수 출력
    public void turnRender(){
        try {
            // 남은 턴 수 출력
            Thread.sleep(1000);
            System.out.println("                                    ༻✦༺ 　༺༻현재" + SceneManager.getInstance().getTurn() +"턴 남았습니다.༺༻　༻✦༺");
            Thread.sleep(1000);
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
            System.out.println("\n");
            System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
        }// 시간 지연 에러 출력문
        catch (InterruptedException e) {e.printStackTrace();}
    }

    // User의 상태창 출력
    public void render(){
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
        System.out.println("                                              골드 : " + getWealth());
        System.out.println("                                              지성 : " +getIntel());
        System.out.println("                                              스트레스 : " + getPTSD());
        System.out.println("                                              도덕성 : " + getMorality());
        System.out.println("                                              사교성 : "+ getSociability());
        System.out.println("                                              예술성 : " + getArtistry());
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺ ༻✦༺");
    }
}