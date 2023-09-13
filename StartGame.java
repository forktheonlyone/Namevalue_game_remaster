public class StartGame {
    public static void main(String[] args) {

        ScannerManager.Initialize();
        System.out.println
                (
                                "□□□■□□□□□■□□■■■■■□□□■□□□□□■□□□□□■□□\n" +
                                "□□□■□□□□□■□□■■■■■□□□■□□■■■■■■■□□■□□\n" +
                                "□□□■□□□□□■□□□□□□■□□□■□□□□■■■□□□□■□□\n" +
                                "□□□■□□■■■■□□□□□□■□□□■□□□■■■■■□□□■■■\n" +
                                "□□□■■□■■■■□□■■■■■□□□■□□■■□□□■■□□■■■\n" +
                                "□□■■■□□□□■□□■□□□□□□□■□□■■□□□■■□□■□□\n" +
                                "□■■■■■□□□■□□■□□□□□□□■□□□■■■■■□□□■□□\n" +
                                "■■■□□■■□□■□□■□□□□□□□■□□□□■■■□□□□■□□\n" +
                                "■■□□□□■□□■□□■■■■■■■□■□□□□■□□□□□□■□□\n" +
                                "□□□□□□□□□■□□□□□□□□□□■□□□□■□□□□□□□□□\n" +
                                "□□□□□□□□□■□□□□□□□□□□■□□□□■□□□□□□□□□\n" +
                                "□□□□□□□□□■□□□□□□□□□□■□□□□■■■■■■■■□□\n" +
                                "\n NameValue's Text RPG \n "+
                                "'Frostmourne Sword'\n");

        System.out.println("1. 게임 시작");
        System.out.println("2. 종료");

        switch (ScannerManager.Scan())
        {
            case 1 :
                Charactor charactor = new Player(ScannerManager.ScanName());
                GoPub goPub = new GoPub();
                GoSmith goSmith = new GoSmith();
                GoDungeon goDungeon = new GoDungeon();
                Govillage start = new Govillage();
                start.ActMenu(charactor,goPub,goSmith,goDungeon);
                break;
            case 2:
                break;
        }






    }
}
