package Game;

public class TimeOut extends Thread{

    private int n=0;
    private boolean stop;

    TimeOut(){
        this.stop = false;
    }


    @Override
    public void run(){

        while(!stop){

            try{
                n++;
                time();

                Thread.sleep(1000);

                if(n==10) {

                    System.out.println(" [ 보상 버프 10초가 지났습니다. ]\n");

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
