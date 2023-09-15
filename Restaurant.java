// 작성자 : 송한올
// 23.09.14
// indev 1.0.2

public class Restaurant {

    public void InRestaurant()
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
        System.out.println("3. 돼지고기 통구이 ( -9 Gold ) / ( +15 HP )");
        System.out.println("4. 취소");
        System.out.print("\n");
    }
    private void FoodMenu()
    {
        switch (ScannerManager.Scan())
        {
            case 1 :
                GoPub.getInstance().Bill("퍽퍽한 밀빵 이다, 같이 나온 맥주를 안 마시면 안될것 같다." , 3, 5, "5 HP 회복 완료!");
                break;
            case 2 :
                GoPub.getInstance().Bill("온갖 것들이 들어간 잡탕처럼 보인다.", 6, 10, "10 HP 회복 완료!");
                break;
            case 3 :
                GoPub.getInstance().Bill("정말 큰 돼지다. 보기좋게 구워졌다", 9, 15, "15 HP 회복 완료!");
                break;
            case 4 :
                break;
        }
    }


}
