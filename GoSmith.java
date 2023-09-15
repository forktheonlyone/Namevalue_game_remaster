// 작성자 : 송한올
// 23.09.14
// indev 1.0.6

public class GoSmith extends Scene {

    private static GoSmith instance = null;
    public static GoSmith getInstance() {
        if (instance == null) {
            instance = new GoSmith();
        }
        return instance;
    }

    private int[][] gear =
            {
                    {4, 1},
                    {6, 2},
                    {8, 3}
            };
    private int[][] upgradesGold =
            {
                    {50, 30},
                    {100, 60},
                    {150, 90}
            };

    private int swordUpLv = 0;
    private int armorUpLv = 0;

    @Override
    public void Menu() {
        if (swordUpLv == 3)
        {
            System.out.println("무기 강화 최대치");
        }
        else
        {
            System.out.println("1. 무기 강화 ( " + upgradesGold[swordUpLv][0] + " )");
        }
        if (armorUpLv == 3)
        {
            System.out.println("방어구 강화 최대치");
        }
        else
        {
            System.out.println("2. 방어구 강화 ( " + upgradesGold[armorUpLv][1] + " )");
        }
        System.out.println("3. 마을로 돌아가기");
    }

    @Override
    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan()) {
            case 1:
                if (swordUpLv == 3) {
                    System.out.print("\n");
                    System.out.println("대장장이 : 내 능력으로는 더 이상 강화가 불가능하네.");
                }
                else if (Player.getPlayer().getGold()>= upgradesGold[swordUpLv][0])
                {
                    Player.getPlayer().setGold(Player.getPlayer().getGold() - upgradesGold[swordUpLv][0]);
                    Player.getPlayer().setAtk(gear[swordUpLv][0]);
                    swordUpLv++;
                    SwordUpgradeDialog();
                }
                else {
                    poorhomeless();
                }
                return Choose();
            case 2:
                if (armorUpLv == 3) {
                    System.out.print("\n");
                    System.out.println("대장장이 : 내 능력으로는 더 이상 강화가 불가능하네.");
                }
                else if ( Player.getPlayer().getGold() >= upgradesGold[armorUpLv][1])
                {
                    Player.getPlayer().setGold(Player.getPlayer().getGold() - upgradesGold[armorUpLv][1]);
                    Player.getPlayer().setDef(gear[armorUpLv][1]);
                    armorUpLv++;
                    ArmorUpgradeDialog();
                }
                else
                {
                    poorhomeless();
                }
                return Choose();
            case 3:
                return Govillage.getInstance().FirstChoose();
            default:
                System.out.println("잘못 입력하셨습니다.");
                return Choose();
        }
    }
    @Override
    public Scene FirstChoose() {
        System.out.print("\n");
        System.out.println("용암의 열기가 느껴지는 대장간이다.");
        System.out.println("철이 부딪히는 소리가 반복적으로 들려온다.");
        System.out.print("\n");
        System.out.println("대장장이 : 도움이 필요한가?");
        System.out.print("\n");
        return Choose();
    }


    private void SwordUpgradeDialog()
    {
        System.out.print("\n");
        System.out.println("강화가 완료되었습니다.");
        System.out.println("==================== ");
        System.out.println("현재 공격력 : " + Player.getPlayer().getAtk());
        System.out.println("==================== ");
    }
    private void ArmorUpgradeDialog()
    {
        System.out.print("\n");
        System.out.println("강화가 완료되었습니다.");
        System.out.println("==================== ");
        System.out.println("현재 방어력 : " + Player.getPlayer().getAtk());
        System.out.println("==================== ");
    }

    private void poorhomeless()
    {
        System.out.println("===============");
        System.out.println("골드가 부족합니다.");
        System.out.println("===============");
    }
}




