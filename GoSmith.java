// 작성자 : 송한올
// 23.09.15
// indev v1.0.6

public class GoSmith extends Scene {

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
        DialogManager.getInstance().GoBackTownDialog();
    }
    @Override
    public Scene Choose() {
        Menu();
        switch (ScannerManager.Scan()) {
            case 1:
                if (swordUpLv == 3) {
                    System.out.print("\n");
                    DialogManager.getInstance().BSmithCannotDialog();
                }
                else if (Player.getPlayer().getGold()>= upgradesGold[swordUpLv][0])
                {
                    Player.getPlayer().setGold(Player.getPlayer().getGold() - upgradesGold[swordUpLv][0]);
                    Player.getPlayer().setAtk(gear[swordUpLv][0]);
                    swordUpLv++;
                    DialogManager.getInstance().UpgradeSwordDialog();
                }
                else {
                    DialogManager.getInstance().PoorDialog();
                }
                return Choose();
            case 2:
                if (armorUpLv == 3) {
                    System.out.print("\n");
                    DialogManager.getInstance().BSmithCannotDialog();
                }
                else if ( Player.getPlayer().getGold() >= upgradesGold[armorUpLv][1])
                {
                    Player.getPlayer().setGold(Player.getPlayer().getGold() - upgradesGold[armorUpLv][1]);
                    Player.getPlayer().setDef(gear[armorUpLv][1]);
                    armorUpLv++;
                    DialogManager.getInstance().UpgradeArmorDialog();
                }
                else
                {
                    DialogManager.getInstance().PoorDialog();
                }
                return Choose();
            case 3:
                return SceneManager.getInstance().getVillage().FirstChoose();
            default:
                DialogManager.getInstance().WrongDialog();
                return Choose();
        }
    }
    @Override
    public Scene FirstChoose() {
        DialogManager.getInstance().SmithBackGround();
        return Choose();
    }
}




