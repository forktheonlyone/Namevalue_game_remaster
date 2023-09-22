package Scene;

import Manager.GameManager;
import Manager.SceneManager;
import Utility.ScanManager;

public class Menu extends Scene { // Scene 클래스 상속

    @Override
    public void initialize() {} // Scene을 상속 받아서 추상메서드 재정의

    @Override
    public int update() { // Scene을 상속 받아서 추상메서드 재정의
        int id = ScanManager.Scan(); // id에 ScanManager 클래스의 Scan 메서드 대입
        GameManager.getInstance().getUser().turnUp(); // User 클래스의 turnUp 메서드 호출
        SceneManager.getInstance().setScene(id); // SceneManager 클래스의 setScene 메서드 호출
        return 0;                                // 매개변수에는 위에서 입력받은 id 값이 들어감
    }

    @Override
    public void render() { // Scene을 상속 받아서 추상메서드 재정의
        System.out.println("                                           메뉴를 선택해주세요!");
        System.out.println("                                 ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺");
        System.out.println("                                              1. 학교");
        System.out.println("                                              2. 알바");
        System.out.println("                                              3. 파티");
        System.out.println("                                              4. 외출");
        System.out.println("                                              5. 상태");
    }
}