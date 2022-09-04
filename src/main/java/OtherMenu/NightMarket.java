package OtherMenu;


import java.util.Random;
import java.util.Scanner;

import static Game.main.maincast;


public class NightMarket {
    int bullet;


    castitem[] Night;
    public inventory Nightinv = new inventory();

    public NightMarket()
    {
        Night  = new castitem[2];
        Night[0] = new castitem("어둠의 지팡이", 500, 50);
        Night[1] = new castitem("어둠의 망토", 500, 50);

    }



    public void 야시장소개(){
        System.out.println("========================================================================================\n");
        System.out.println(" 밤에는 다이건 앨리가 불가능 하지만 어둠의 마법사의 추종자들이 밤에만 여는 야시장에 입장이 가능합니다.");
        System.out.println(" 야시장에서는 매일 새로운 어둠의 아이템이 경품으로 나옵니다.");
        System.out.println(" 추종자들이 진행하는 도박에서 돈을 벌어서 이들이 내놓은 경품을 타가세요!");
        System.out.println(" 하지만 주의 사항이 있습니다...");
        System.out.println(" 이 어둠의 추종자들은 의심이 많아 아무나 야시장에 들어가게 하지 않습니다....");
        System.out.println(" 이들의 암호를 말해야 입장이 가능합니다....\n");
        System.out.println("==========================================================================================\n");
        System.out.println(" 야시장에 입장하시겠습니까? ");
        System.out.println(" 1. YES      2.No \n");
        System.out.println("==========================================================================================");

    }


    public void 야시장입장(int accessnum,String name) {

        switch (accessnum){

            case 1:
                System.out.println("=========================================");
                System.out.println("             암호를 입력하세요");
                System.out.println("=========================================");

                Scanner scr2 = new Scanner(System.in);
                String code = scr2.nextLine();

                String anwser = "1";

                if(code.equals(anwser))
                {

                    System.out.println("============================================");
                    System.out.println(" 저희의 암호를 알고 계시는 군요..");
                    System.out.println(" 환영합니다. [ " + name + " ] 님! \n" );
                    System.out.println("============================================\n");
                    System.out.println("=================================================");
                    System.out.println(" 1. 오늘의 경품 ");
                    System.out.println(" 2. 도박장");


                    Scanner gamblescr = new Scanner(System.in);
                    int gamblenum = gamblescr.nextInt();

                    switch (gamblenum){

                        case 1:

                            Random random2 = new Random();
                            int random2_ok = random2.nextInt(2);

                            System.out.println("=============================================================\n");
                            System.out.println("[ 야시장 주최자 曰 ] 모두들 많이 기다리셨습니다!! ");
                            System.out.println("                  밤에만 열리는 이 야시장에 하이라이트는 [ 오늘의 경품 ] 이죠!!");
                            System.out.println("                  오늘 도박장에서 따낸 돈이 많다면 그 돈으로 구매할 수 있을 겁니다!");
                            System.out.println("                  과연 오늘은 어떤 경품이 나올까요?!\n");
                            System.out.println("=============================================================\n");


                            if(random2_ok ==0)
                            {

                                SpecialItem(name, 0);
                                break;



                            }
                            else
                            {
                                SpecialItem(name, 1);
                                break;
                            }


                        case 2:

                            System.out.println("============================================");
                            System.out.println(" 도박장에 입장합니다...");
                            System.out.println("============================================\n");
                            System.out.println(" 1. 마법룰렛");
                            System.out.println(" 2. 별 맞추기\n");
                            System.out.println("============================================\n");
                            System.out.print(" 진행할 게임을 선택하세요 : ");

                            Scanner gamescr = new Scanner(System.in);
                            int gamenum = gamescr.nextInt();
                            System.out.println("============================================\n");

                            switch (gamenum){

                                case 1:

                                        russianroulette();
                                        break;

                                case 2:

                                       Star(name);
                                       break;

                            }

                            break;


                    }

                }
                else
                {
                    System.out.println("=================================================");
                    System.out.println(" 이런! 잘못된 암호입니다.");
                    System.out.println(" 초대받지 못한 손님이시군요. 그렇다면 입장이 불가합니다.\n");
                    System.out.println("=================================================\n");
                    System.out.println(" 야시장에서 쫒겨났습니다. ");
                    break;
                }

            case 2:


                break;

        }

    }

    public void SpecialItem(String customer,int a)
    {
        System.out.println("=============================================================\n");
        System.out.println("[ 야시장 주최자 曰 ] 오늘의 경품은 [ "+Night[a].name+" ] 입니다!");
        System.out.println("과연 이 경품을 구매할 사람은 누구 일까요?\n");
        System.out.println("=============================================================\n");
        System.out.println("경품을 구매하겠습니까?");
        System.out.println("1. YES     2. NO\n");
        System.out.println("=============================================================\n");

        Scanner scr = new Scanner(System.in);
        int anw = scr.nextInt();

        switch (anw){

            case 1:
                System.out.println("=============================================================\n");
                System.out.println("[ 야시장 주최자 曰 ] 저기 구매의사를 밝힌 손님이 계시네요!");
                System.out.println("게임에서 재미 좀 보셨나 봅니다!");
                System.out.println("오늘의 경품을 타가는 주인공은 바로 [ "+customer+" ] 입니다!\n" );
                System.out.println("=============================================================\n");
                System.out.println("현재 보유 금액 : "+ maincast.money+ " $");

                maincast.money -= Night[a].price;

                System.out.println("현재 보유 금액 : "+ maincast.money+ " $\n");

                Nightinv.addItemToInv(Night[a].name);

                Nightinv.printInv();

                break;



            case 2:

                break;

        }
    }



    public void russianroulette()
    {
        Random random = new Random();


        Scanner scan = new Scanner(System.in);
        int[] rand = {0,1,2,3,4,5};
        int count = rand.length-1;
        bullet = random.nextInt(rand.length);


        System.out.println("======================================================================================\n");
        System.out.println("[ 추종자 曰 ] 어서오세요 게임을 진행하기 전 게임 설명을 해드리겠습니다.");
        System.out.println("             스스로 머리에 지팡이를 겨냥하고 공격 주문을 외쳐야합니다. ");
        System.out.println("             하지만! 이 지팡이는 자기 마음대로라 본인을 언제 공격할지 모릅니다!\n");
        System.out.println("             ※ 주문을 맞는다고 죽지는 않으니 걱정하지 마세요 ※\n");
        System.out.println("             순전히 본인의 운을 시험해보셔야 합니다!!\n");
        System.out.println("======================================================================================\n");

        System.out.println("===================================< 주의 사항 >=========================================\n");
        System.out.println(" 공격 주문을 맞을 경우 추종자가 100$을 가져갑니다!\n");
        System.out.println(" 공격 주문이 빗겨나갈때 마다 500$ 씩 지급됩니다!\n");
        System.out.println("=======================================================================================\n");



        while(true)
        {
            System.out.println("======================================================================================\n");
            System.out.println("[ 추종자 曰 ] 게임을 진행합니다!\n");
            System.out.println("1. 게임할게요!     2. 도망가기");
            System.out.println("======================================================================================\n");

            int num = scan.nextInt();

            if(num ==1)
            {
                System.out.println("======================================================================================\n");
                System.out.println("[ 추종자 曰 ] 그럼 게임을 시작하도록 하겠습니다!");
                System.out.println("            앞에 놓여 있는 지팡이를 들고 머리에 겨냥하세요\n");
                System.out.println("======================================================================================\n");

                playgame(num, count,rand,scan);
            }
            else if(num==2)
            {
                System.out.println("[ 추종자 曰 ] 겁이 많은 마법사군...\n");
                break;
            }
            else
            {
                System.out.println("1 또는 2를 눌러주세요\n");
                continue;
            }

       }

    }

    public void playgame(int num1, int count, int[] rand, Scanner scan) {

        int i = 0;
        int money = 100;

        while (true) {
            if (count == 0) {
                System.out.println("[ 추종자 曰 ] 배짱이 두둑한 마법사군요!  당신은 살아남으셨습니다! \n");
                System.out.println("======================================================================================\n");
                System.out.println(" 따낸 금액 : " + money * 10 + " $ 입니다.\n");
                System.out.println(" 이전 보유 금액 : " + maincast.money + "$ \n");
                maincast.money += money*10;
                System.out.println(" 현재 보유하고 있는 금액 : "+ maincast.money + " $\n");
                System.out.println("======================================================================================\n");
                break;
            }

            System.out.println("======================================================================================\n");
            System.out.println("1. 계속 진행   2. 멈춤 \n");
            System.out.println("======================================================================================\n");

            num1 = scan.nextInt();

            if (num1 == 1) {
                if (bullet == rand[i]) {

                    System.out.println("======================================================================================\n");
                    System.out.println("[ 추종자 曰 ] 아이고 공격 주문이 발사 됐네요 .. 100$을 가져가겠습니다~\n");
                    System.out.println("======================================================================================\n");
                    System.out.println(" 이전 보유 금액 : "+ maincast.money);
                    maincast.money -= 100;
                    System.out.println(" 현재 보유하고 있는 금액 : "+ maincast.money + " $");
                    break;

                } else {
                    count--;

                        System.out.println("==========================================================================================================\n");
                        System.out.println("[ 추종자 曰 ] 오!! 주문이 발사되지 않았네요!\n");
                        System.out.println(" 기회가 " + count+" 번 남았습니다.\n" );
                        System.out.println(" 따낸 금액 : " + money * 5 + "$ 입니다.");
                        maincast.money += money * 5;
                        System.out.println(" 현재 보유 금액 : " + maincast.money + " $ 입니다. \n");
                        System.out.println("==========================================================================================================\n");

                    i++;
                }
            } else if (num1 == 2) {

                    System.out.println("[ 추종자 曰 ] 여기서 멈추시는 군요..안녕히 가십쇼!");
                    break;

            } else {
                System.out.println("1 또는 2를 눌러주세요");
                continue;
            }

        }
    }






    public void Star (String name)

    {
        System.out.println("======================================================================================\n");
        System.out.println("[ 추종자 曰 ] 어서오세요 게임을 진행하기 전 게임 설명을 해드리겠습니다.");
        System.out.println("             제가 돈을 숨겨놓은 별을 섞으면 손님은 돈이 있는 별을 선택하시면 됩니다.");
        System.out.println("             게임 시작 전 배팅을 하고 별을 맞추시면 배팅한 금액의 2배가 되는 돈을 드립니다!!\n");
        System.out.println("======================================================================================\n");

        int star = (int)(Math.random() *5)+1 ; //난수 1~5까지.

        System.out.println("[ 추종자 曰 ] 자 그러면 시작하겠습니다!");
        System.out.println("             아, 또한 게임에서 패배시 배팅한 금액은 제가 갖습니다ㅎㅎ\n");
        System.out.println("======================================================================================\n");

        Thread MixStar = new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    for(int i=0; i<5; i++) {
                        Thread.sleep(500);
                        System.out.print("★\t\t");
                    }
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }

            }
        });

        // Thread 생성자 내에서 객체 생성.
        // 작업스레드 객체를 만들기 위해서 Runnable을 매개변수로 받는 생성자를 호출해야한다.
        //Thread t1 = new Thread(Runnable run);
        //Runnable 은 이름 뜻 그래도 작업 스레드가 실행할 수 있는 코드를 가진 인터페이스 객체임.
        //따라서 runnable을 사용하기 위해서 run함수를 구현해줘야 하고 3가지 방식이 있다.
        //1. runnable 객체 생성하고 사용
        //2. thread 생성자 내에서 객체 생성
        //3. 람다식.

        try {
            System.out.println("별 섞는 중...\n");
            System.out.println("[ 추종자 曰 ] 자! 별을 놓겠습니다! \n");
            System.out.println("===============================================================\n");

            MixStar.start();
            MixStar.join();

            System.out.println("");
            System.out.println("[ 추종자 曰 ] 배팅할 금액을 입력하세요.\n");
            System.out.print(" 배팅할 금액 :  \n");
            System.out.println("===============================================================\n");
            Scanner scan = new Scanner(System.in);
            int batting = scan.nextInt();

            if(batting<=maincast.money) {
                System.out.println("[ 추종자 曰 ] 어떤 별을 선택하시겠습니까?\n");
                System.out.println("===============================================================\n");
                int ChoiceStar = scan.nextInt();
                if(ChoiceStar == star) {
                    System.out.println("[ 추종자 曰 ] 마법으로 잘 감췄다고 생각했는데...");
                    System.out.println("             용케 별을 잘 찾으셨군요....");
                    System.out.println("             축하드립니다....\n");
                    System.out.println("===============================================================\n");
                    maincast.money += batting;
                    System.out.println("현재 금액은 " + maincast.money + " $ 입니다.");

                    Thread.sleep(1000);
                }else if(ChoiceStar != star) {
                    System.out.println("[ 추종자 曰 ] 하하하 못찾으셨군요! 제가 단단히 숨겨놓았습니다! ");
                    System.out.println("             정말~ 아쉽지만 배팅한 금액은 제가 가져가야 겠군요 ㅎㅎ");
                    System.out.println("===============================================================\n");
                    System.out.println("[ "+name+" ]님,"+batting+ "원 만큼 돈을 잃었습니다");
                    maincast.money -= batting;
                    System.out.println("현재 금액은 " + maincast.money + " $ 입니다.");

                    Thread.sleep(1000);
                }
            }else if(batting > maincast.money) {

                System.out.println("본인이 보유한 돈보다 높은 배팅 금액을 입력하셨습니다. 과한 금액을 배팅하는 것은 해롭습니다.");

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }




}




