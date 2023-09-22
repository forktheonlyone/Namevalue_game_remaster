package Main.Manager;
import Main.Scene.*;
public class SceneManager {
    // 싱글톤
    private static SceneManager instance = null;
    public static SceneManager getInstance()
    {
        if(instance == null)
            instance = new SceneManager();
        return instance;
    }

    // 현재 장소를 저장할 멤버 변수
    private Scene sceneState = null;

    // 기본 생성자
    private SceneManager() {}

    // 갈 장소의 번호를 받아 현재 장소로 바꿔줌
    public void setScene(int i) {
        switch(i)
        {
            case 0: // 마을
                this.sceneState = new Village();
                break;
            case 1: // 숙소
                this.sceneState = new Home();
                break;
            case 2: // 사냥터
                this.sceneState = new Dungeon();
                break;
            case 3: // 상점
                this.sceneState = new Store();
                break;
            case 4: // 훈련소
                this.sceneState = new TraningCenter();
                break;
            case 5: // 아르바이트
                this.sceneState = new WorkingCenter();
                break;
            case 6: // 카지노
                this.sceneState = new Slot();
                break;
            case 7: // 게임 종료
                System.out.println("게임을 종료합니다");
                System.exit(7);
                break;
        }
        // 다른 장소로 입장 시 출력문
        this.sceneState.initialize();
    }
    // 현재 장소(scene)의 update(행동 선택)
    public void update() {
        sceneState.update();
    }
    // 현재 장소(scene)의 render(메뉴)
    public void render(){
        sceneState.render();
    }
}
