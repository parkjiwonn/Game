package Cast;

public class MagicAttack {

    public Thread 쿨타임;
    private boolean stop;

    MagicAttack(){
        this.stop = false;
    }


    public void 주문1() {

        쿨타임 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    for(int i=3; i>0; i--) {
                        int 쿨타임 =i;
                        Thread.sleep(1000);

                        if(쿨타임 == 1) {
                            Thread.sleep(1000);
                            System.out.println("                                    [ 인센디오 사용 가능]");

                        }
                    }// for end

                } catch (InterruptedException e) {
                    // TODO: handle exception
                }

            }
        });
        쿨타임.start();

    }

    public void 주문2() {

        쿨타임 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    for(int i=2; i>0; i--) {
                        int 쿨타임 =i;
                        Thread.sleep(1000);

                        if(쿨타임 == 1) {
                            Thread.sleep(1000);
                            System.out.println("                                    [ 엑스펠리아르무스 사용 가능]");

                        }
                    }// for end

                } catch (InterruptedException e) {
                    // TODO: handle exception
                }

            }
        });
        쿨타임.start();

    }

    public void threadStop(boolean stop){
        this.stop = stop;
    }
}
