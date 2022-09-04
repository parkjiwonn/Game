package Cast;

import Game.*;
import OtherMenu.inventory;


import static java.lang.Thread.sleep;

public class Villain extends cast{


    private  boolean stop;


    int time_count =0;
    public inventory inv2 = new inventory();


    public Villain(){
        this.stop = false;
    }

    public void stageshow(int Day){

        if(Day == 0) {
            System.out.println("==============※ WARNING ※=============");
            System.out.println("낮에는 빌런들의 능력치가 상승하지 않습니다.");
            System.out.println("========================================\n");
            System.out.println("=============STAGE============");
            System.out.println("1. STAGE 1");
            System.out.println("2. STAGE 2");
            System.out.println("3. STAGE 3");
            System.out.println("==============================");
            System.out.println("입장할 스테이지를 선택하세요 : ");
            System.out.println("==============================");
        }

        if(Day==1)
        {
            System.out.println("=================※ WARNING ※=================");
            System.out.println("밤에는 빌런들의 능력치가 상승하니 전투시 주의하세요.");
            System.out.println("빌런들의 주문력이 50씩 증가합니다.");
            System.out.println("밤의 전투에서 승리시 경험치가 낮보다 더 상승");
            System.out.println("보상금도 많이 받음.");
            System.out.println("==============================================\n");
            System.out.println("=============STAGE============");
            System.out.println("1. STAGE 1");
            System.out.println("2. STAGE 2");
            System.out.println("3. STAGE 3");
            System.out.println("==============================");
            System.out.println("입장할 스테이지를 선택하세요 : ");
            System.out.println("==============================");
        }
    }


    @Override
    public void run(){
        while(!stop){
            try{
                int villian_attack = attack();

                main.maincast.attacked(villian_attack);

                int a;
                if(main.maincast.Defense>=villian_attack)
                {    a=0; }

                else
                { a=main.maincast.Defense -villian_attack ;}


                System.out.println(" 플레이어가 입은 실 데미지 : "+ a);
                System.out.println(" 플레이어의 잔여 hp : " + main.maincast.hp);
                System.out.println(" 빌런의 잔여 hp : " + hp);

                if(main.maincast.hp<0) {
                    stop=true;
                    main.fight_time.threadStop(true);

                    System.out.println("플레이어가 죽었습니다...\n\n");

                    Thread.sleep(2000);
                    System.exit(0);
                }

                time_count++;
                Thread.sleep(2000);
                if(time_count==10) {
                    stop=true;
                }


            }
            catch(Exception e){
                return;
            }
        }
    }
    public  void Stop(boolean stop){
        this.stop = stop;
    }

    public void Win(String name, String name2, int money,int experience) throws InterruptedException {
        if(name=="세베루스 스네이프") {
            System.out.println("");
            System.out.println("==============승리==============");
            System.out.println("전투에서 스네이프 교수를 물리쳤습니다!");
            System.out.println("===============================\n");

        }
        if(name=="알버스 덤블도어") {
            System.out.println("");
            System.out.println("==============승리==============");
            System.out.println("전투에서 덤블도어 교수를 물리쳤습니다!");
            System.out.println("===============================\n");
            inv2.addItemToInv("헝가리 혼테일의 알");
            System.out.println("==================================");
            System.out.println("전투승리의 보상으로 용의 알을 얻었습니다!\n");
            System.out.println("==================================\n");
        }
        if(name=="볼드모드 경") {
            System.out.println("==============승리==============\n");
            System.out.println("전투에서 볼드모트 경을 물리쳤습니다!");
            System.out.println("===============================\n");
            System.out.println("엔딩 그림 ");
            System.out.println("축하드립니다! 드디어 마법사 세계의 악의 축인 볼드모드경을 물리치셨군요!" +
                    "[ "+ name2 + " ] 덕분에 혼란스러웠던 마법사의 세계는 다시 평화를 되찾았습니다!" +
                    "감사합니다!");
        }



        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("[ " + name + " ] 가 죽었습니다.\n");
        Thread.sleep(1000);
        System.out.println("[ 돈   +" + money + " ] 을 획득합니다.\n");

        Thread.sleep(1000);

        System.out.println("[ 경험치   +" + experience + " ] 을 획득합니다.\n");

        Thread.sleep(1000);
    }









}
