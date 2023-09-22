package Manager;

import Scene.*;
import Scene.Menu;

public class SceneManager {
    // 싱글톤
    private static SceneManager instance = null;
    public static SceneManager getInstance()
    {
        if(instance == null)
            instance = new SceneManager();

        return instance;
    }

    // 현재 장소(scene)을 저장하는 멤버 변수
    private Scene sceneState = null;
    // ??? 게임의 턴 제한
    public int firstTurn = 24;
    // 현재 남은 턴
    public int turn = firstTurn;

//------------------------ turn의 getter,setter ------------------------
    public int getTurn() {return turn; }
    public void setTurn(int turn) { this.turn = turn; }
//----------------------------------------------------------------------

    // 입력받은 id로 현재 장소(scene)를 바꾸는 멤버 메소드
    public void setScene(int Id) {
        switch (Id) {
            case 0:
                // 현재 장소(scene)를 Menu으로 바꿔줌
                sceneState = new Menu();
                break;

            case 1:
                System.out.println("                                            학교에 갑니다.");
                // 현재 장소(scene)를 EducationCenter로 바꿔줌
                this.sceneState = new EducationCenter();
                break;

            case 2:
                System.out.println("                                          아르바이트를 갑니다.");
                // 현재 장소(scene)를 ParttimeJob으로 바꿔줌
                this.sceneState = new ParttimeJob();
                break;

            case 3:
                System.out.println("                                           파티에 참석합니다.");
                // 현재 장소(scene)를 Party로 바꿔줌
                this.sceneState = new Party();
                break;

            case 4:
                System.out.println("                                             외출을 합니다.");
                // 현재 장소(scene)를 Out으로 바꿔줌
                this.sceneState = new Out();
                break;

            case 5:
                System.out.println("                                           상태확인을 합니다.");
                // user의 상태창 출력
                GameManager.getInstance().getUser().render();
                // user에게 남은 턴 출력
                GameManager.getInstance().getUser().turnRender();
                break;

            case 6:
                // 현재 장소(scene)를 Intro로 바꿔줌
                sceneState = new Intro();
                // 게임 설명을 하나의 턴으로 소모하지만,
                // 게임의 턴 제한인 24턴에 포함되지 않도록 해줌
                GameManager.getInstance().getUser().turnUp();
                break;

        }
        // 현재 scene의 user, scanner 초기화
        this.sceneState.initialize();
    }

    // 현재 scene의 update 사용
    public void update() {
        sceneState.update();
    }

    // 현재 scene의 render 사용
    public void render(){
        sceneState.render();
    }
}