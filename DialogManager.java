import java.rmi.activation.ActivationGroup_Stub;

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
        System.out.println("2. 종료");
    }
    public void WrongDialog()
    {
        System.out.println("잘못 입력 하였습니다.");
    }
    public void PoorDialog()
    {
        System.out.print("\n");
        System.out.println("===============");
        System.out.println("골드가 부족합니다.");
        System.out.println("===============");
    }
    public void VillageBackGround()
    {
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
    }
    public void PubMenuDialog()
    {
        System.out.print("\n");
        System.out.println("1. 음식 주문하기 ( 음식을 이용해 체력을 회복하세요. )");
        System.out.println("2. 방을 빌려 침대에서 잠에 들기 ( -15 Gold )");
        System.out.println("3. 마을로 돌아가기");
        System.out.print("\n");
    }
    public void GoBackTownDialog()
    {
        System.out.println("마을로 돌아간다.");
    }
    public void FoodMenuDialog()
    {
        System.out.print("\n");
        System.out.println("1. 빵 ( -3 Gold ) / ( +5 HP )");
        System.out.println("2. 스튜 ( -6 Gold ) / ( +10 HP )");
        System.out.println("3. 돼지고기 통구이 ( -9 Gold ) / ( +15 HP )");
        System.out.println("4. 취소");
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
    public void UpgradeSwordDialog()
    {
        System.out.print("\n");
        System.out.println("강화가 완료되었습니다.");
        System.out.println("==================== ");
        System.out.println("현재 공격력 : " + Player.getPlayer().getAtk());
        System.out.println("==================== ");
    }
    public void UpgradeArmorDialog()
    {
        System.out.print("\n");
        System.out.println("강화가 완료되었습니다.");
        System.out.println("==================== ");
        System.out.println("현재 방어력 : " + Player.getPlayer().getAtk());
        System.out.println("==================== ");
    }
}
