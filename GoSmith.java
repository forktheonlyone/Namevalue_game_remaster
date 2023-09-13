// 작성자 : 송한올
// 23.09.13
// indev 0.05

public class GoSmith {
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



    public void SmithMenu(Charactor chr)
    {
        ScannerManager.Initialize();
        System.out.println("용암의 열기가 느껴지는 대장간이다.");
        System.out.println("철이 부딪히는 소리가 반복적으로 들려온다.");
        System.out.println("대장장이 : 도움이 필요한가?");

        boolean repeat = true;
        while (repeat)
        {
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
            switch (ScannerManager.Scan())
            {
                case 1 :
                    if (swordUpLv == 3)
                    {
                        System.out.println("대장장이 : 내 능력으로는 더 이상 강화가 불가능하네.");
                    }
                    else if (((Player)chr).getGold() >= upgradesGold[swordUpLv][0])
                    {
                        ((Player)chr).setGold(((Player)chr).getGold() - upgradesGold[swordUpLv][0]);
                        chr.setAtk(gear[swordUpLv][0]);
                        swordUpLv++;
                        System.out.println("강화가 완료되었습니다.");
                        System.out.println("현재 공격력 : " + ((Player)chr).getAtk());
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
                    break;
                case 2 :
                    if (armorUpLv == 3)
                    {
                        System.out.println("대장장이 : 내 능력으로는 더 이상 강화가 불가능하네.");
                    }
                    else if (((Player)chr).getGold() >= upgradesGold[armorUpLv][1])
                    {
                        ((Player)chr).setGold(((Player)chr).getGold() - upgradesGold[armorUpLv][1]);
                        chr.setDef(gear[armorUpLv][1]);
                        armorUpLv++;
                        System.out.println("강화가 완료되었습니다.");
                        System.out.println("현재 방어력 : " + ((Player)chr).getDef());
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
                    break;
                case 3 :
                    repeat = false;
                    break;
            }
        }
    }
}