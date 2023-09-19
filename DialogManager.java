// 작성자 : 송한올
// 23.09.18
// Indev v1.0.6
public class DialogManager {
    private static DialogManager instance = null;
    public static DialogManager getInstance() {
        if (instance == null) {
            instance = new DialogManager();
        }
        return instance;
    }

    public void TitleDialog()
    {
        System.out.println
                (
                                "   ■     ■  ■■■■■   ■     ■     ■  \n" +
                                "   ■     ■      ■   ■  ■■■■■■■  ■  \n" +
                                "   ■     ■      ■   ■    ■■■    ■  \n" +
                                "   ■     ■      ■   ■   ■■■■■   ■  \n" +
                                "   ■■ ■■■■  ■■■■■   ■  ■■   ■■  ■■■\n" +
                                "  ■■■    ■  ■       ■  ■■   ■■  ■  \n" +
                                " ■■■■■   ■  ■       ■   ■■■■■   ■  \n" +
                                "■■■  ■■  ■  ■       ■    ■■■    ■  \n" +
                                "■■    ■  ■  ■■■■■■■ ■    ■      ■  \n" +
                                "         ■          ■    ■■■■■■■■  \n" +
                                "\n NameValue's Text RPG \n "+
                                "'Frostmourne Sword'\n");

        System.out.println("1. 게임 시작");
        System.out.println("'이 외의 정수를 입력하면 게임이 종료됩니다'");
    }
    public void InputName() {
        System.out.print("이름을 입력해주세요: ");
    }
    public void WrongDialog()
    {
        System.out.println("잘못 입력 하였습니다.");
    }
    public void SelectMenuDialog()
    {
        System.out.print("\n");
        System.out.print("메뉴를 선택해주세요: ");
    }
    public void ErrorDelayDialog()
    {
        System.out.println("지연에 문제가 생겼습니다, 다시 시도해주세요.");
    }
    public void GameStoryDialog()
    {
        System.out.print("\n");
        System.out.println("==================== 게임 배경 =====================");
        System.out.println("이 게임은 가상의 판타지 중세시대를 배경으로 이루어져 있습니다.");
        System.out.println("===================================================");
        System.out.print("\n");
        System.out.println("리치왕의 침공과 저주로 이웃나라들의 몰락 소식이 곳곳에서 들려온다.");
        System.out.println("물론 우리 가문도 피해를 면치 못했다.");
        System.out.println("나는 황급히 몸을 숨기고자 외진 시골마을로 출발했다.집안 대대로 내려오는 명검 '화도일문자' ");
        System.out.println("긴박한 상황속에서 내가 챙긴것은 집안 대대로 내려오는 명검 '화도일문자' 한자루다.");
        System.out.print("\n");
        System.out.println("집안에서 내려오는 이야기에 의하면 '화도일문자' 는 저주받은 검 '서리한' 에 대항할 유일한 대책이라니");
        System.out.println("비록 지금은 닳고 낡아빠진 볼품없는 검으로 밖에 보이지 않지만 ..");
        System.out.println("지금 당장은 이 검이 유일한 희망인것 같다.");
        System.out.println("어서 바삐 움직여야 한다.");
        System.out.print("\n");
    }
    public void GameStoryMenu()
    {
        System.out.println("1. 다음");
        System.out.println("'이 외의 정수를 입력하면 게임이 종료됩니다'");
    }
    public void PoorDialog()
    {
        System.out.print("\n");
        System.out.println("===============");
        System.out.println("골드가 부족합니다.");
        System.out.println("===============");
        System.out.print("\n");
    }
    public void VillageBackGround()
    {
        System.out.print("\n");
        System.out.println("마을 사람들이 부지런히 움직이고 있다.");
        System.out.print("\n");
    }
    public void VillageMenuDialog()
    {
        System.out.println("1.여관으로 이동");
        System.out.println("2.대장간으로 이동");
        System.out.println("3.던전으로 이동");
        System.out.println("이동할 장소를 선택해 주세요.");
    }
    public void PubBackGround()
    {
        System.out.print("\n");
        System.out.println("맥주잔이 부딪히는 소리, 바드의 악기 연주 소리가 들린다.");
        System.out.print("\n");
    }
    public void PubMenuDialog()
    {
        System.out.println("1. 음식 주문하기 ( 음식을 이용해 체력을 회복하세요. )");
        System.out.println("2. 방을 빌려 침대에서 잠에 들기 ( -15 Gold )");
        System.out.println("3. 마을로 돌아가기");
    }
    public void GoBackTownDialog()
    {
        System.out.println("3. 마을로 돌아간다.");
    }
    public void FoodMenuDialog()
    {
        System.out.println("1. 빵 ( -3 Gold ) / ( +5 HP )");
        System.out.println("2. 스튜 ( -6 Gold ) / ( +10 HP )");
        System.out.println("3. 돼지고기 통구이 ( -9 Gold ) / ( +15 HP )");
        System.out.println("4. 취소");
    }
    public void RestaurantBackGround()
    {
        System.out.print("\n");
        System.out.println("여관 주인 앞 바 테이블에 앉았다.");
        System.out.print("\n");
    }
    public void SmithBackGround()
    {
        System.out.print("\n");
        System.out.println("용암의 열기가 느껴지는 대장간이다.");
        System.out.println("철이 부딪히는 소리가 반복적으로 들려온다.");
        System.out.print("\n");
        System.out.println("대장장이 : 도움이 필요한가?");
        System.out.print("\n");
    }
    public void BSmithCannotDialog()
    {
        System.out.print("\n");
        System.out.println("대장장이 : 내 능력으로는 더 이상 강화가 불가능하네.");
    }
    public void SmithUpgradeMenu()
    {
        if (Player.getInstance().getAtk()>=8)
            System.out.println("무기 강화 최대치");
        else
            System.out.println("1. 무기 강화 / 가격 : " +
                    SceneManager.getInstance().getSmith().upgradeGold[0][SceneManager.getInstance().getSmith().Lv[0]]);

        if (Player.getInstance().getDef()>=3)
            System.out.println("방어구 강화 최대치");
        else
            System.out.println("2. 방어구 강화 / 가격 : " +
                    SceneManager.getInstance().getSmith().upgradeGold[1][SceneManager.getInstance().getSmith().Lv[1]]);

    }
    public void SmithUpgradeDialog(int i)
    {
        int j = 0;
        if (i==0) {
            j = Player.getPlayer().getAtk();
            System.out.print("\n");
            System.out.println("강화가 완료되었습니다.");
            System.out.println("==================== ");
            System.out.println("현재 공격력 : " + j);
            System.out.println("==================== ");
            System.out.print("\n");
        }
        else {
            j = Player.getPlayer().getDef();
            System.out.print("\n");
            System.out.println("강화가 완료되었습니다.");
            System.out.println("==================== ");
            System.out.println("현재 방어력 : " + j);
            System.out.println("==================== ");
            System.out.print("\n");
        }
    }
    public void WarMenuDialog()
    {
        System.out.println("1.공격하기 ");
        System.out.println("2.막기 ");
        System.out.println("3.도망가기 ");
    }

    public void MobEntranceDialog()
    {
        System.out.println(Monster.getInstance().getNickName() + "(이)가 나타났다!");
    }
    public void DungeonMenuDialog()
    {
        System.out.println("1.고블린 소굴");
        System.out.println("2.오크의 전초기지");
        System.out.println("3.나이트 엘프의 숲");
        System.out.println("4.얼어붙은 설산");
        System.out.println("5.마을로 돌아가기 ");
    }
    public void EnterGoblinDialog()
    {
        System.out.println("고블린 소굴에 입장하였습니다.");
    }
    public void EnterOrkDialog()
    {
        System.out.println("오크의 전초기지에 입장하였습니다.");
    }
    public void EnterNightElf()
    {
        System.out.println("나이트 엘프의 숲에 입장하였습니다.");
    }
    public void EnterSnowMountainDialog()
    {
        System.out.println("얼어붙은 설산에 입장하였습니다.");
        System.out.println("검이 빛나며 빛이 온몸을 감싼다...");
        System.out.println("얼어붙은 설산의 동굴 속 리치왕 아서스 메네실이 서리한을 집어든다.");
    }
    public void EarnGold30()
    {
        System.out.println("30골드를 획득하였습니다.");
    }
    public void EarnGold45()
    {
        System.out.println("45골드를 획득하였습니다.");
    }
    public void EarnGold60()
    {
        System.out.println("60골드를 획득하였습니다.");
    }
    public void BadEnding()
    {
        System.out.println(Player.getInstance().getNickName() + "(은)는 픽 쓰러졌다.\n\n" +
                "더 이상 일어설 힘도 나지 않고 눈은 점점 감긴다.\n" +
                "누군가가 도움을 줬으면 했다.\n\n" +
                "하지만 아무도 오지 않았다.\n\n" +
                "Bad Ending");
    }
    public void TrueEnding()
    {
        System.out.println
                (
                        "세계는 평화를 되찾았고 우리의 수도이자 내 고향인 스톰윈드에 내려졌던 언데드의 저주도 해제되었고\n" +
                        "도시와 마을 곳곳에는 아이들의 웃음소리가 다시 들려오기 시작했다. \n" +
                        "\n" + "이 비극이 두번다시 되는것을 막기위해 나는 설산으로 향했다.\n" +
                        "\n" + "True Ending");
    }
}
