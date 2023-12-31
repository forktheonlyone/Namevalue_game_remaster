package Scene; // Scene 패키지에 속함

import Manager.GameManager; // Manager 패키지에 있는 GameManager 불러옴
import javax.swing.*; // 자바 GUI swing 불러옴

public class Ending extends Scene{ // Scene을 상속받음

    // user 초기화
    @Override
    public void initialize() {this.user = GameManager.getInstance().getUser();}

    // update 초기화
    @Override
    public int update() {
        return 0;
    }

    @Override
    public void render() {
        // User 스탯창 출력
        GameManager.getInstance().getUser().render();
        // 만약 유저의 Intel값이 90보다 크고
        // 유저의 sociability값이 90보다 크고
        // 유저의 Morality값이 90보다 크고
        // 유저의 Artistry값이 90보다 크면
        if (user.getIntel() > 90 && user.getSociability() > 90 && user.getMorality() > 90 && user.getArtistry() > 90) {
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            System.out.println("\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠷⢾⡗⠷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⢤⣤⣖⣖⡾⢗⣖⣢⣤⢤⣦⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣯⡟⠉⣷⣿⣥⣴⣿⣿⣦⣾⣟⣏⠙⢿⣳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣧⣾⡟⣿⣽⣿⣿⣿⣿⣿⡿⣿⣻⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⢰⣿⣧⡄⠀⠀⠀⠀⠀⠀⠈⢾⣿⣛⣿⣧⡾⣷⣿⢾⣿⣿⣻⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⣼⡟⠟⠁⠐⠈⠘⠉⠉⠑⠻⣟⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⢰⣷⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀  ⢸⣷⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⢀⣼⠜⡇⠀⠀⠀⠀⢀⠀⠀⠀⠀  ⢈⡿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⢸⡇⠀⢱⡀⠈⠃⠀⢸⠀⠈⠃⠀⡸⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⢠⣾⡁⠀⠀⢧⠀⠀⠒⠚⠒⠂⠀⣰⠃⠀⣸⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⣸⣿⣧⡀⠀⠈⠳⢄⡀⠀⠀⣀⡴⠁⠀⣰⣟⣯⡿⣇⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢀⣴⣾⣿⣿⢟⠘⣶⣤⣀⠀⠈⠉⠉⠀⣀⣤⣾⡇⠈⠙⢿⣏⣺⣆⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣤⣾⣿⣴⠟⠁⠀⠀⠙⠿⣟⣿⡟⣷⣮⢿⣿⡻⠋⠀⠀⠈⠀⠈⠛⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣷⣿⣿⢁⠀⠀⠀⠀⠀⠈⠈⢿⣿⡛⠻⣿⡟⠄⢈⠀⢈⠀⠀⡁⣤⣾⠿⢿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⠀⠀⣴⣾⣿⣿⣿⢉⢩⢿⣷⣦⣤⣀⢀⠀⠀⢸⣿⣴⣤⣿⢦⠀⣠⢀⢤⣵⣿⠿⠛⢻⡄⠀⠙⢻⣦⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⠀⢀⣤⣿⢿⠟⢉⣿⠘⠂⠀⠁⠓⣾⠻⣿⣿⣶⣿⣵⣿⣿⣾⣾⣷⣟⠿⠁⠺⢀⠀⠀⠀⠀⠀⢀⠴⢿⣿⣦⡀⠀⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⠀⢀⣸⣿⣿⠟⠓⠦⣿⡆⠀⠀⠀⠀⠂⠀⢀⣱⡻⣏⣿⢿⣿⢿⠍⡿⣑⢄⡀⠀⠁⠀⠠⠀⣠⣶⠃⠶⠀⠘⠻⣷⣤⠀⠀⠀⠀\n" +
                    "                              ⠀⠀⠀⢀⣼⣿⣿⣧⣆⡈⠈⣿⣏⡖⠀⠀⠀⢀⡤⠿⠀⠓⠃⠀⣾⣿⣆⠈⠉⢀⠠⠭⠲⣄⡀⠐⠾⣷⡇⠀⠀⡀⢨⠰⠽⢿⣧⡄⠀⠀\n" +
                    "                              ⠀⠀⠀⣿⣿⡏⡄⢹⠉⠀⣀⣿⣿⠀⠀⢀⠴⢻⠀⠠⠊⠀⠀⠐⣿⣿⠟⠃⠂⠀⠢⠀⢸⠃⠙⠦⣄⠈⠳⢆⠀⢰⡌⠁⠄⠀⢹⣿⠀⠀\n" +
                    "                              ⠀⠀⢰⣿⠋⢙⠇⣀⠀⢓⡜⠉⣿⠀⣠⡋⠐⠈⣇⠠⠚⢁⡆⡀⣹⣿⡠⢴⠂⠈⠀⢀⡏⠀⢀⢛⣿⣶⡄⠀⠙⣤⡁⠀⠀⠀⠀⠹⣄⠀\n" +
                    "                              ⠀⠀⢸⣧⠠⣼⡆⢠⣄⠎⠀⠀⣿⣿⢻⡇⠠⠀⢸⡄⠍⠀⠘⠁⢿⣿⠀⠘⠀⣼⣿⣸⣁⠠⢠⣿⡿⠻⢿⣆⠀⠈⠳⡄⡃⢀⡀⣤⡟⡄\n" +
                    "                              ⠀⡰⠃⠈⠀⠉⡟⡱⠋⢀⠀⢠⣾⣿⡼⡇⠀⠈⠘⡆⠀⠀⠐⠀⣿⣷⠆⠐⠆⢈⠈⡟⡿⣷⣿⣿⡤⢀⠂⠈⢆⠈⠀⠵⡞⠁⠉⠙⠖⢻\n" +
                    "                              ⢠⠁⠀⠀⠀⠀⢰⠃⠀⠀⢀⠿⠿⡿⠛⡇⣀⣤⣤⣿⡁⢸⡤⠈⢿⣿⠋⠀⡄⠀⣻⣷⣴⣿⡿⠯⣛⠿⣷⣦⢸⠀⠄⠀⢹⡤⡀⡀⠋⢪\n" +
                    "                              ⣷⣀⠀⢀⢀⣀⠏⠀⠀⠀⠎⢀⣠⣷⣀⣹⠁⢤⠛⠻⣿⣧⡀⢲⢿⣿⠶⠂⣠⣿⣿⣿⣿⣿⣷⢀⡈⢳⣭⡼⡗⠀⠀⠂⠀⡃⡁⢉⡀⣉\n");
            System.out.println("                                            딸이 자라서 왕이 되었습니다.");
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            SwingUtilities.invokeLater(() -> { // // 스레드에 해당 이벤트 등록
                new ImageDisplay("InsaengRPG/src/images/King.jpg", 400, 536).setVisible(true);
            });
            // 혹은 유저의 Wealth값이 90보다 크고
            // 유저의 Morality값이 20보다 크면
        } else if (user.getWealth() > 90 && user.getMorality() > 20) {
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            System.out.println("                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣶⣶⣶⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                          ⠀⠀⠀⠀⠀⠀⣀⣤⣾⣿⡿⠿⠛⠛⠛⠛⠛⠛⠻⢿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀\n" +
                    "                                          ⠀⠀⠀⠀⢠⣼⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠈⠙⠿⣿⣷⣄⠀⠀⠀⠀\n" +
                    "                                          ⠀⠀⠀⣰⣿⡿⠋⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀⠀  ⠈⢿⣿⣦⡀⠀⠀\n" +
                    "                                          ⠀⠀⣸⣿⡿⠀⠀⠀⠸⠿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣶⣄⠀⠀⠀⠀⢹⣿⣷⠀⠀\n" +
                    "                                          ⠀⢠⣿⡿⠁⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠈⣿⣿⣿⠀⠀⠀ ⠀⠀⢹⣿⣧⠀\n" +
                    "                                          ⠀⣾⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⢀⣠⣿⣿⠟⠀⠀⠀⠀⠀ ⠈⣿⣿⠀\n" +
                    "                                          ⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡿⠿⠿⠿⣿⣿⣥⣄⠀⠀⠀ ⠀⠀⠀⣿⣿⠀\n" +
                    "                                          ⠀⢿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⢻⣿⣿⣧⠀⠀⠀ ⠀⢀⣿⣿⠀\n" +
                    "                                          ⠀⠘⣿⣷⡀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⣼⣿⣿⡿⠀⠀⠀ ⠀⣸⣿⡟⠀\n" +
                    "                                          ⠀⠀⢹⣿⣷⡀⠀⠀⢰⣶⣿⣿⣿⣷⣶⣶⣾⣿⣿⠿⠛⠁⠀⠀⠀⣸⣿⡿⠀⠀\n" +
                    "                                          ⠀⠀⠀⠹⣿⣷⣄⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀  ⠀⢀⣾⣿⠟⠁⠀⠀\n" +
                    "                                          ⠀⠀⠀⠀⠘⢻⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢀⣠⣾⣿⡿⠋⠀⠀⠀⠀\n" +
                    "                                          ⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣷⣶⣤⣤⣤⣤⣤⣤⣴⣾⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀\n" +
                    "                                          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠿⠿⠿⠿⠟⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀  ");
            System.out.println("                                ⠀⠀⠀⠀⠀       딸이 자라서 재력가가 되었습니다.");
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            SwingUtilities.invokeLater(() -> { // 스레드에 해당 이벤트 등록
                new ImageDisplay("InsaengRPG/src/images/Rich.jpg", 400, 536).setVisible(true);
            });
            // 혹은 유저의 Artistry값이 70보다 크면
        } else if (user.getArtistry() > 70) {
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀                  ⠀⠀⠀⠀⠀⠀⠀⠀                        ⢀⡠⣄⡀⠀⠀⡠⠞⠛⢦⣠⢤⡀⠀\n" +
                    "                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢠⠏⠀⠀⢱⡀⣸⠁⠀⡴⠋⠀⠀⣹⠀\n" +
                    "                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠉⢿⢀⡤⠶⣴⠇⣯⠀⣼⠁⠀⢀⡴⠷⣄\n" +
                    "                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠁⠀⣀⡾⠋⠀⠀⢹⣼⠁⢠⡇⠀⡴⠋⠀⠀⡼\n" +
                    "                                         ⠀⠀⠀⠀⢠⠊⠑⢦⠀⡴⠋⢀⣠⠞⠉⠀⠀⠀⣠⣿⠧⣄⡾⠁⡼⠁⣀⣤⠾⡁\n" +
                    "                                         ⠀⠀⠀⠀⢸⠀⠀⣨⠟⠁⢠⡞⠁⠀⠀⠀⣠⡾⠛⠁⠀⣿⠃⣰⠃⣴⠋⠀⠀⣷\n" +
                    "                                         ⠀⠀⠀⠀⣸⢠⠞⠁⠀⢠⠏⠀⠀⢀⡴⠋⠁⠀⢀⣠⡴⠿⣶⡇⢰⠇⠀⠀⢠⠇\n" +
                    "                                         ⠀⠀⠀⢠⢿⠏⠀⠀⠀⠉⠀⠀⣠⠞⠁⠀⡴⠚⠉⠁⠀⢀⡟⠀⣼⠀⠀⠀⢸⠀\n" +
                    "                                         ⠀⠀⠀⡾⣼⢀⠀⠀⠀⠀⠀⠈⠉⠀⣠⠞⠁⠀⠀⢀⡴⠋⠙⢼⠃⠀⠀⠀⣸⠀\n" +
                    "                                         ⠀⠀⠀⡇⠉⡎⠀⣰⠃⠀⠀⠀⠀⠀⠁⠀⠀⠀⡼⠉⠀⠀⠀⠘⠂⠀⠀⣠⠇⠀\n" +
                    "                                         ⠀⠀⠀⡇⢸⠀⣰⠃⠀⡴⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⣠⠖⠁⠀⠀\n" +
                    "                                         ⠀⠀⢸⠁⡏⢠⠃⢀⠞⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⢀⣠⠖⠋⠁⠀⠀⠀⠀\n" +
                    "                                         ⠀⠀⡞⠀⠃⡎⢀⠏⠀⠀⠀⠀⠀⠀⢀⡏⠀⣀⡤⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                         ⡴⢺⠇⠀⠀⠀⠞⠀⠀⠀⠀⠀⠀⢀⡾⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                         ⡇⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                         ⢳⡀⠘⢦⡀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                         ⠀⠳⣄⠀⠙⠲⣤⣀⣠⠴⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                         ⠀⠀⠈⠓⠦⣄⣀⡠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        \n");
            System.out.println("                                         딸이 자라서 예술가가 되었습니다.");
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            SwingUtilities.invokeLater(() -> { // 스레드에 해당 이벤트 등록
                new ImageDisplay("InsaengRPG/src/images/Artist.jpg", 400, 536).setVisible(true);
            });
            // 혹은 유저의 PTSD값이 80보다 크고
            // 유저의 Morality값이 20보다 크면
        } else if (user.getPTSD() > 80 && user.getMorality() < 20) {
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            System.out.println("\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⣰⠂⠀⠀⠀⠀⠀⠄⢠⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⣳⣤⣤⣤⣦⣶⠟⠉⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⣀⡀⠀⢤⢴⣮⣿⣯⣿⡷⣻⠃⠀⠀⠀⠀⢀⣀⣤⠤⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣷⣤⢺⣿⡿⣟⣻⣿⣿⣍⠳⣢⣴⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠻⣿⢘⢯⡁⠉⣹⣿⡿⡈⣻⣿⣿⠿⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣯⣿⠼⠷⣿⢿⠿⢠⢷⢿⣛⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣟⣁⠌⢁⣴⣴⣶⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠀⠲⣤⣿⣿⣿⡿⣿⣿⣿⣿⣿⡿⣿⣿⡿⠟⡇⠀⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣷⣢⣵⡎⢙⡻⣿⣞⣽⣙⣻⣿⣿⣻⡿⣷⣧⣤⣧⣶⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⢪⣿⡝⣿⣿⣿⣿⣿⣿⣿⣷⣝⡿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠿⡹⢻⣇⠏⢀⣾⣿⣿⣿⣿⣿⣿⣻⡆⣿⢿⣿⢳⣍⣿⢿⠻⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡟⣴⠁⠈⡘⣴⡟⣼⣿⣿⡾⣿⠃⠿⡄⣧⢸⡄⢹⢿⣿⣿⣄⠀⢹⡟⣽⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⡟⠠⠃⠀⢰⣿⣿⢧⢿⣿⣿⣿⣿⡌⠆⠃⢸⡆⣷⡟⠀⡹⢿⣿⣷⡀⠁⠉⣿⡹⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠁⠀⠀⣰⣿⡟⢹⣳⣿⣿⡿⣿⣿⣻⡄⠀⠘⣿⢘⢷⠺⠃⠀⠻⣿⣿⡄⠀⢸⠀⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠀⠀⣼⣿⠏⠀⣰⣿⣿⣿⣷⣿⣿⣧⢃⠀⠀⠈⠻⡈⢻⣆⠀⠀⠹⣿⣿⡄⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⠀⣸⣿⠋⠀⢠⣯⣿⣿⣿⣿⣿⠾⣿⣷⡂⠀⠀⠀⢣⠀⠱⡠⠀⠀⢹⣿⣧⠀⢸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⠀⣿⠃⠀⠀⣾⢿⣿⣿⣿⣿⣿⣼⣸⣿⣿⣦⠀⠀⠀⠆⠀⠱⡡⠀⠀⣿⣿⠀⣸⣿⠙⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⣿⠀⠀⠀⡸⢨⣿⠏⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠰⠀⠀⢣⠃⠀⣿⣿⠀⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⣿⢇⠀⠀⡇⠀⡏⠀⣿⣿⢿⣿⣿⣿⡟⣿⣿⣿⡀⠀⡇⠀⠈⡸⢾⣿⠇⠀⢻⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢹⣾⡆⢠⡇⠀⢁⠀⣿⣿⣿⣿⣿⣿⣇⢻⣿⣿⣧⢀⠃⢠⣾⣴⢿⠏⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢏⠈⣡⠀⢸⠀⣿⣿⢻⣿⣿⣿⣿⡜⡿⡞⣿⣼⢔⣾⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⣻⠀⢠⠃⢹⡿⣼⣿⣿⣿⣿⣷⣽⡻⡘⣫⣼⣉⣥⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠼⢒⣾⣷⡿⡿⣿⢼⣿⣿⣿⢹⣿⣣⢳⡌⢻⣻⣟⣑⡦⡶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠙⠛⠛⠻⠿⠿⢿⣿⣿⡟⢻⡿⢺⠿⣿⣧⢻⡟⠛⠚⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠛⠋⠀⠈⠀⠚⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.println("                                             딸이 자라서 마왕이 되었습니다.");
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            SwingUtilities.invokeLater(() -> { // 스레드에 해당 이벤트 등록
                new ImageDisplay("src/images/King.jpg", 400, 536).setVisible(true);
            });
            // 아니면
        } else {
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            System.out.println("\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⡇⠀⠀⠀⠀⠀⠀⠀⢀⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠠⡄⣀⠀⠀⠀⠀⢰⠶⠆⠠⡄⡀⠀⢠⣿⣿⣿⡇⠀⣴⣾⣶⣾⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢦⡀⠀⣑⠤⠀⠒⠚⠓⣄⠀⠀⠈⠲⡼⣿⣿⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠜⣷⡏⠀⣠⠔⠉⠉⠀⠉⠻⣷⣄⠀⠘⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣥⣀⣿⡇⡔⠁⠀⠀⠀⠀⠀⠀⠘⣿⣷⡀⠀⠀⠈⢻⣿⣿⡛⠻⠿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⢀⡀⣤⣀⠀⠀⠅⢀⣿⣿⢿⣁⣤⣶⠛⠛⠛⠛⠛⠻⠿⣿⣧⠀⠀⠀⠀⠹⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⣼⣿⣿⣿⣿⣦⡲⢤⡟⠁⢸⣯⣿⡿⠀⠀⠀⠀⠀⠀⠀⢀⠏⠀⠀⠀⠀⠀⢻⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣦⠙⢦⠀⠻⡟⠁⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⢣⠀⠣⠀⠈⠒⠤⠤⠤⠤⠒⠊⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡷⠀⠩⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠸⣿⣿⣿⣿⣿⢿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⡇⠀⠀⢣⠀⢀⠀⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠃⠀⠀⢸⡄⠧⠾⣸⣰⠆⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠈⠉⠻⢍⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⠇⠀⠀⠀⠸⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠉⠢⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢀⣀⣼⣿⡿⠃⠀⠀⠀⢀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠃⢶⣤⣤⣄⣀⣀⣀⣸⣤⣤⣄⡀⠀⣼⣿⣿⣏⣀⠀⠀⠀⣠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⡿⠛⠁⠀⢸⣿⣿⣿⣿⣿⠋⠉⢘⣿⣿⣿⡶⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠈⠉⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
            System.out.println("                                      딸이 자라서 돼지농장의 주인이 되었습니다.");
            System.out.println("                      ༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺༻✦༺ 　༻✧༺　༻✦༺  ༻✦༺ 　༻✧༺　༻✦༺");
            SwingUtilities.invokeLater(() -> { // 스레드에 해당 이벤트 등록
                new ImageDisplay("InsaengRPG/src/images/PigparmCEO.jpg", 400, 536).setVisible(true);
            });
        }
    }

}