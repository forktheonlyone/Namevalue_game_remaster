// 작성자 : 송한올
// 23.09.14
// indev 1.0.1

public class Restaurant {

    public void InRestaurant(Charactor chr)
    {
        PubFoodSelect();
        FoodMenu();
        GoPub.getInstance().Choose();
    }

    private void PubFoodSelect()
    {
        System.out.print("\n");
        System.out.println("1. 빵 ( -3 Gold ) / ( +5 HP )");
        System.out.println("2. 스튜 ( -6 Gold ) / ( +10 HP )");
        System.out.println("3. 칠면조 구이 ( -9 Gold ) / ( +15 HP )");
        System.out.println("4. 취소");
        System.out.print("\n");
    }
    private void FoodMenu()
    {
        switch (ScannerManager.Scan())
        {
            case 1 :
                GoPub.getInstance().Bill(3, 5, "5 HP 회복 완료!");
                break;
            case 2 :
                GoPub.getInstance().Bill(6, 10, "10 HP 회복 완료!");
                break;
            case 3 :
                GoPub.getInstance().Bill(9, 15, "15 HP 회복 완료!");
                break;
            case 4 :
                break;
        }
    }


}
