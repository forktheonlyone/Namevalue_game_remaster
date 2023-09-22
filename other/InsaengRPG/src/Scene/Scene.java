package Scene;

import Manager.GameManager;
import Object.User;
import java.util.Scanner;

public abstract class Scene {
        // 게임의 주인공이 되는 user
        protected User user = null;
        // 해당 scene에서의 스텟 증가량 (지성, 골드, 사교성, 도덕성, 예술성, 스트레스)
        protected int sceneIntel, sceneWealth, sceneSociability, sceneMorality, sceneArtistry, scenePTSD;
        // 해당 scene의 이름
        protected String sceneName;

        // ??? ScanManager가 있음에도 따로 사용
        protected Scanner scanner = null;

        // scene의 기본 생성자 (멤버 변수 초기화 + user 가져오기)
        public Scene()
        {
                sceneName = "";
                sceneWealth = 0;
                sceneSociability = 0;
                scenePTSD = 0;
                sceneMorality = 0;
                sceneIntel = 0;
                sceneArtistry = 0;

                user = GameManager.getInstance().getUser();
        }

        // ??? scanner와 (생성할 때 초기화 됨에도) user를 초기화
        public abstract void initialize();
        // scene 선택과 행동 선택 (switch 문)
        public abstract int update();
        // 출력용(엔딩 장면, 게임 설명, 장소 메뉴)
        public abstract void render();

}

