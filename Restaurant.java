// 작성자 : 송한올
// 23.09.15
// indev v1.0.2

public class Restaurant {

    public void InRestaurant()
    {
        PubFoodSelect();
        FoodMenu();
        SceneManager.getInstance().getPub().FirstChoose();
    }

    private void PubFoodSelect()
    {
        DialogManager.getInstance().FoodMenuDialog();
    }
    private void FoodMenu()
    {
        switch (ScannerManager.Scan())
        {
            case 1 :
                SceneManager.getInstance().getPub().Bill("퍽퍽한 밀빵 이다, 같이 나온 맥주를 안 마시면 안될것 같다." , 3, 5, "5 HP 회복 완료!");
                break;
            case 2 :
                SceneManager.getInstance().getPub().Bill("온갖 것들이 들어간 잡탕처럼 보인다.", 6, 10, "10 HP 회복 완료!");
                break;
            case 3 :
                SceneManager.getInstance().getPub().Bill("정말 큰 돼지다. 보기좋게 구워졌다", 9, 15, "15 HP 회복 완료!");
                break;
            case 4 :
                break;
        }
    }


}
