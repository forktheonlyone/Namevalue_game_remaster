package Scene; // Scene 패키지에 속함

import Manager.GameManager; // Manager 패키지에 있는 GameManager 불러옴
import Manager.SceneManager; // Manager 패키지에 있는 SceneManager 불러옴
import javax.swing.*; // 자바 GUI swing 불러옴

public class Intro extends Scene{ // Scene을 상속받음

    @Override
    public void initialize() {}  // Scene을 상속받은 initialize 메서드

    @Override
    public int update() {
        // SceneManager의 Scene을 ( GameManager의 menu )로 설정
        SceneManager.getInstance().setScene(
                GameManager.getInstance().menu );
        return 0;
    }

    @Override
    public void render() {
        SwingUtilities.invokeLater(() -> { // 스레드에 해당 이벤트 등록
            new ImageDisplay("InsaengRPG/src/images/start.jpg", 400, 536).setVisible(true);
        });
        try {
            // 유니코드 𝑷𝒓𝒊𝒏𝒄𝒆𝒔𝒔 𝑴𝒂𝒌𝒆𝒓
            System.out.println("  ★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋\uD835\uDC77\uD835\uDC93\uD835\uDC8A\uD835\uDC8F\uD835\uDC84\uD835\uDC86\uD835\uDC94\uD835\uDC94 \uD835\uDC74\uD835\uDC82\uD835\uDC8C\uD835\uDC86\uD835\uDC93★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺֺ ๋ ̶̲★ ๋");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("  ★̶̲ .                                                                                                  ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖      공국력 1654년, 이웃 나라간의 전쟁에서 약세할 때 이름 모를 용사가 나타나 공국을 승리로 이끌어 주었다.      ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("  ★̶̲ . ˖               공국은 감사의 의미로 용사에게 백작의 지위를 내리고 용사는 공국으로 정착하게 되었다.           ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("   ★̶̲ . ˖                  그로부터 10년 뒤, 유난히 별이 밝던 밤 한 별이 용사에게로 다가온다.                    ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                                                                                                ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                            \"당신이 전쟁에서 활약한 날 부터 지켜봤습니다.                              ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("    ★̶̲ . ˖                        저의 이름은 비너스, 천계의 아이를 부탁하고 싶습니다.\"                          ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("★̶̲ . ˖                      별에서 부터 눈부신 빛이 나오더니 눈앞에 10세 정도의 아이가 나타난다.                  ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖               \"이 아이는 천계의 사람이라  2년 후 성인이 됩니다. 부디 올바른 길로 인도해 주세요.\"           ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                                   용사는 아이를 안아 집으로 데려간다.                                  ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("  ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖                                                                                                 ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            // 유니코드 𝑷𝒓𝒊𝒏𝒄𝒆𝒔𝒔 𝑴𝒂𝒌𝒆𝒓 출력
            System.out.println("★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋\uD835\uDC77\uD835\uDC93\uD835\uDC8A\uD835\uDC8F\uD835\uDC84\uD835\uDC86\uD835\uDC94\uD835\uDC94 \uD835\uDC74\uD835\uDC82\uD835\uDC8C\uD835\uDC86\uD835\uDC93★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ̶๋̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ .                                                                                                  ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("★̶̲ .                 게임 설명 : 이 게임은 24턴제 입니다. 24턴이 끝나면 게임이 종료됩니다.                      ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ .                          마지막 턴이 끝나는 시점에 엔딩(직업)이 정해집니다.                              ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("★̶̲ .                          24턴 안으로 활동을 통해 아이를 키워주세요!                                     ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println("   ★̶̲ .                                                                                                  ⭑ ֺ ๋ ̶̲★");
            Thread.sleep(1000); // 1000 millis 동안 구동을 강제정지후 재생
            System.out.println(" ★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲★̶̲ . ˖ ͘ ⭑ ֺ ๋★̶̲ . ˖ ˖  ๋  ๋★̶̲★̶̲ . ˖  ๋  ๋  ๋★̶̲. ˖ ͘   ̶̲★ . ˖ ͘ ⭑ֺ ̶̲★๋");
        }
        catch (InterruptedException e) {e.printStackTrace();} // 발생근원지를 찾아서 단계별로 에러를 출력
    }
}