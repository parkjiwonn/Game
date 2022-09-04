package Game;

import javax.swing.*;
import java.awt.*;

public class DayTimer extends JFrame {
    JLabel la;
    JLabel la1;
    JLabel la2;
    int min, sec;
    int day=1;

    DayTimer(){
        this.setTitle("하루는 1분으로 설정됩니다.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));

        MyThread th = new MyThread();

        la=new JLabel();
        la1=new JLabel();
        la2=new JLabel();

        la.setFont(new Font("Gothic", Font.PLAIN, 50));

        la1.setFont(new Font("Gothic", Font.ITALIC, 20));
        la1.setOpaque(true);// 색 설정
        Color color = new Color(255,0,0);
        la1.setForeground(color);

        la2.setFont(new Font("Gothic", Font.ITALIC, 20));

        this.add("Center",la);
        this.add("North",la1);
        this.add("West",la2);

        this.setLocationRelativeTo(null);
        this.setSize(400,200);
        this.setVisible(true);
        this.setAlwaysOnTop(true); // 프레임 항상 위에 있게
        th.start();
    }

    public int time() {
        return min;
    }


    class MyThread extends Thread{
        public void run(){
            int n=0;

            while(true){
                n++;
                sec  = n % 60;
                min  = n / 60 % 60;

                if(min==0) {
                    la1.setText(String.format(" ※  낮 - 호그와트, 다이건앨리 운영 시간입니다."));
                }
                if(min==1) {
                    la1.setText(String.format(" ※ 밤 - 호그와트, 다이건앨리가 문을 닫았습니다. "));
                }
                if(min==2) {
                    n=0;
                    day++;
                }
                la2.setText(String.format("        " + day +" 일차"));
                //la.setText(Integer.toString(n++));
                la.setText(String.format("  %02d:%02d", min, sec));
                try{
                    sleep(1000);
                }
                catch(Exception e){
                    return;
                }
            }
        }
    }
}
