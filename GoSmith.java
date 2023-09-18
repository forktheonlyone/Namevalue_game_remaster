// 작성자 : 송한올
// 23.09.18
// indev v1.0.8

public class GoSmith extends Scene {

    public int[][] gear =
            {
                    {4, 1},
                    {6, 2},
                    {8, 3}
            };
    public int[][] upgradesGold =
            {
                    {50, 30},
                    {100, 60},
                    {150, 90}
            };

    public int swordUpLv = 0;
    public int armorUpLv = 0;

    @Override
    public void Menu() {
        DialogManager.getInstance().SmithUpgradeMenu();
        DialogManager.getInstance().GoBackTownDialog();
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
                    DialogManager.getInstance().UpgradeSwordDialog();
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




