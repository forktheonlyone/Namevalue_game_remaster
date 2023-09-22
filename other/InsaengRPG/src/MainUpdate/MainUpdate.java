package MainUpdate;

import Manager.GameManager;
import Manager.SceneManager;
import Utility.ScanManager;
import java.util.Scanner;

public class MainUpdate {
    Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

    public void initialize() {
        ScanManager.Initialize(); // ScanManager의 Initialize 메서드 호출
        GameManager.getInstance().initialize(); // GameManager의 initialize 메서드 호출
        SceneManager.getInstance().setScene(GameManager.getInstance().intro ); // Scene을 intro로 설정
    }

    public void update() { // SceneManager의 update 메서드를 불러옴
        SceneManager.getInstance().update();
    }

    public void render() { // SceneManager의 render 메서드를 불러옴
        SceneManager.getInstance().render();
    }
}