package Scene;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame { // JFrame 클래스 상속
    public ImageDisplay(String imagePath, int desiredWidth, int desiredHeight) {
        ImageIcon imageIcon = new ImageIcon(imagePath); // 이미지 경로를 가진 ImageIcon 객체 생성
        Image image = imageIcon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH); // 너비,높이,이미지가 깨지지 않게 업로드 / 업로드 방식 / 대입
        JLabel imageLabel = new JLabel(new ImageIcon(image)); // JLabel 객체 생성 (이미지 넣음)
        getContentPane().add(imageLabel); // 화면에 표시되는 창에 imageLabel을 넣음
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 닫는 방식 = x누르면 종료
        pack(); // JFame의 내용물에 맞게 윈도우 크기를 조절하는 메서드
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 화면크기를 대입
        int screenWidth = screenSize.width; // 화면크기의 너비를 screenWidth에 대입
        int screenHeight = screenSize.height; // 화면크기의 높이를 screenHeight에 대입
        int windowWidth = getWidth(); // 윈도우창의 너비
        int windowHeight = getHeight(); // 윈도우창의 높이
        int xPosition = screenWidth - windowWidth; // x좌표는 스크린창의 너비 - 윈도우창의 너비
        setLocation(xPosition, (screenHeight - windowHeight) / 2); // 컴포넌트 위치는 xPosition의 값과 , y값은 (스크림창의 높이 - 윈도우창의 높이) / 2
        setAlwaysOnTop(true); // 화면 위치가 항상 맨앞
    }
}

