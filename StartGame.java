//작성자 홍주형
//작성일자 2023.09.12
//최종수정일자 2023.09.14

public class StartGame {
    public static void main(String[] args) {

        ScannerManager.Initialize();
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

        switch (ScannerManager.Scan())
        {
            case 1 :
                SceneManager.getInstance().getVillage().FirstChoose();
                break;
            case 2:
                break;
        }






    }
}
