package Game;

import Cast.cast;
import Cast.Villain;


public class fight_time extends Thread{

    private int n=0;
    private boolean stop;

    fight_time(){
        this.stop = false;
    }

    @Override
    public void run(){

        while(!stop){

            try{
                n++;
                time();

                Thread.sleep(1000);

                if(n==20) {
                    System.out.println("");
                    System.out.println("제한시간 20초가 지났습니다.\n");
                    System.out.println("나가려면 0을 눌르세요");
                    stop=true;
                    break;
                }
            }
            catch(Exception e){
                return;
            }
        }
    }

    public void threadStop(boolean stop){
        this.stop = stop;
    }

    public int time() {

        return n;
    }
}
