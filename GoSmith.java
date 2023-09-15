// 작성자 : 송한올
// 23.09.15
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
                    DialogManager.getInstance().BSmithCannotDialog();
                }
                else if (Player.getPlayer().getGold()>= upgradesGold[swordUpLv][0])
                {
                    Player.getPlayer().setGold(Player.getPlayer().getGold() - upgradesGold[swordUpLv][0]);
                    Player.getPlayer().setAtk(gear[swordUpLv][0]);
                    swordUpLv++;
                    SwordUpgradeDialog();
                }
                else {
                    DialogManager.getInstance().PoorDialog();
                }
                return Choose();
            case 2:
                if (armorUpLv == 3) {
                    DialogManager.getInstance().BSmithCannotDialog();
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
                    DialogManager.getInstance().PoorDialog();
                }
                return Choose();
            case 3:
                return Govillage.getInstance().FirstChoose();
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
    private void SwordUpgradeDialog()
    {
        DialogManager.getInstance().UpgradeSwordDialog();
    }
    private void ArmorUpgradeDialog()
    {
        DialogManager.getInstance().UpgradeArmorDialog();
    }
}




