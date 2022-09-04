package OtherMenu;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HagridHouse {


    int BuckBig = 400;
    public inventory inv1 = new inventory();

    //금지된 숲에 들어가서 해그리드의 일을 도와주면 그 대가로 돈을 받는다.
    //금지된 숲에서 일을 도와주다가 신비한 동물을 발견하면 본인만의 동물로 키울 수 있다.
    // 일을 하고 얻을 수 있는 건 돈이다.

         public int show(int money, int num)
         {

             if(num==1)
             {
                 if(BuckBig<=money)
                 {
                     return money-BuckBig;
                 }
             }

             System.out.println("구매가 완료되었습니다!");
             return money;
         }

        public void show_menu(String name){

         System.out.println("=================================================================");
         System.out.println("해그리드 曰 안녕 ["+ name +"] 너가 여긴 어쩐일로 온거야?\n" );
         System.out.println("1. 그냥 한번 들려봤어요");
         System.out.println("2. 혹시 제가 도와드릴 일이 있나요?");
         System.out.println("3. 요새 돌보시는 동물 있으세요?");
         System.out.println("4. 저랑 내기하실래요?\n");
         System.out.println("어떤 대답을 선택할건가요? : ");
         System.out.println("==================================================================================");
    }

       public int hagrid_money(String name, int money){

           System.out.println("해그리드 曰 잘왔어 마침 너가 도와줘야 할 일이 있어");
           System.out.println("해그리드 曰 나랑 같이 금지된 숲에 가서 일을 좀 도와줄래?");
           System.out.println("해그리드 曰 무사히 도와준다면 내가 두둑하게 보상할게\n");
           System.out.println(">> 해그리드의 어던 부탁을 수락하겠습니까? <<");
           System.out.println("1. 피렌체에게 구호 물품 전해주기     2. 거절하기");
           System.out.println("================================================================================");

           int WorkNum;
           Scanner WorkScr = new Scanner(System.in);
           WorkNum = WorkScr.nextInt();

           if(WorkNum==1)
           {
               System.out.println("해그리드 曰 좋았어! 그럼 나랑 같이 금지된 숲에 가자");
               System.out.println("...............[금지된 숲 도착]..............\n");
               System.out.println("해그리드 曰 우선 숲에 있는 켄타로우스 무리에게 줄 구호 물품이 있어");
               System.out.println("해그리드 曰 그것들을 전달해주고 올래?\n");
               System.out.println("...............[켄타로우스 무리에게 가는 중]..............\n");
               System.out.println("피렌체 曰 해그리드가 오기로 했는데 넌 누구지?");
               System.out.println("1. 오늘 해그리드 대신 심부름 온 [ "+ name + " ] 이에요. 구호 물훔 드리려고 왔어요!");
               System.out.println("2. 무서워서 줄행랑친다.");

               int boxnum;
               Scanner boxscr = new Scanner(System.in);
               boxnum = boxscr.nextInt();

               if(boxnum==1)
               {
                   System.out.println("피렌체 曰 해그리드 대신 온거구나. 여기까지 물건을 전해주러 와서 고맙다");
                   System.out.println("피렌체 曰 그리고 돌아갈 땐 이걸 해그리드에게 전해주지 않겠니?");
                   System.out.println("=======================================================================\n");
                   System.out.println(">>피렌체는 [ "+ name + " ] 에게 돈 꾸러미를 주었다.<<");
                   System.out.println("피렌체 曰 금지된 숲은 위험한 곳이니 이 돈을 잘 가지고 가야해 그럼 잘가렴!\n");
                   System.out.println("........[돈 꾸러미를 가지고 돌아가는 중]............");
                   System.out.println("=======================================================================\n");
                   System.out.println("해그리드 曰 어? 벌써 돌아왔구나! 피렌체가 전해달라고 한게 있지 않았니?");
                   System.out.println("해그리드 曰 음..약속했던 금액이 잘 들어있구나 ");
                   System.out.println("해그리드 曰 오늘 심부름을 잘 다녀왔으니 내가 선물을 줄께");
                   System.out.println("해그리드 曰 여기 300$ ! 중급자 지팡이와 중급자 망토를 사기에 충분한 돈이 될거야");
                   System.out.println("=======================================================================\n");
                   System.out.println("1. 감사합니다!!     2. 돈이 이게 전부인가요?");

                   int moneynum;
                   Scanner moneyscr = new Scanner(System.in);
                   moneynum = moneyscr.nextInt();

                   if(moneynum==1)
                   {
                       System.out.println("해그리드 曰 자 여기 !");
                       System.out.println("==========================================================\n");
                       money += 300;
                       System.out.println(">>해그리드를 도와 심부름을 한 보상으로 300$이 지급되었습니다.");
                       System.out.println("현재 돈이 "+money+" $ 이 되었습니다.");
                   }
                   else
                   {
                       System.out.println("해그리드 曰 뭐?? 돈 절반을 주는 건데 그렇게 말하니까 괘씸하구나");
                       System.out.println("해그리드 曰 기분이 상했으니 250$ 만 주겠어!");
                       System.out.println("=========================================================\n");
                       money += 250;
                       System.out.println(">>해그리드를 도와 심부름을 한 보상으로 250$이 지급되었습니다.");
                       System.out.println("현재 돈이 "+ money + " $ 이 되었습니다.");
                   }


               }
               else
               {
                   System.out.println("해그리드 曰 뭐야? 왜 물품을 그대로 들고 뛰어 온거야?");
                   System.out.println("          설마 피렌체가 무서워서 도망친거야?? 이런이런..");
                   System.out.println("=================================================================\n");
                   System.out.println("금지된 숲에서 쫒겨났습니다.");
               }

           }

           else
           {
               System.out.println("해그리드 曰 그럼 어쩔 수 없지.. 근데 그러면 여긴 왜온거야?! 난 바쁘니까 얼른 나가!\n");
               System.out.println("해그리드의 오두막에서 쫓겨냤습니다.");

           }

           return money;
       }




       public int hagrid_gamble(String name, int money)

       {
           Random random2 = new Random();
           int random2_ok = random2.nextInt(3);
           if(random2_ok == 0 || random2_ok==1) {
               System.out.println("해그리드 曰 뭐?? 내기?! 내가 내기 좋아하는건 어떻게 알고!");
               System.out.println("해그리드 曰 내기 받아드리지!");
               System.out.println("해그리드 曰 내가 1부터 25까지 수를 생각할테니까 한번 맞춰봐!");
               System.out.println("해그리드 曰 기회는 4번이야! 4번안에 숫자를 맞춘다면 돈은 두둑하게 주지!");
               System.out.println(name+" 曰 좋아요!!\n ");
               System.out.println("======================================================");
               Random random = new Random();
               Scanner scanner = new Scanner(System.in);

               int number = random.nextInt(25)+1;
               int guess = -1;
               int count=0;

               while (number != guess) {
                   count=count+1;
                   System.out.print("해그리드 曰 1과 25사이에 수 중에서 하나 골라봐! ");
                   guess = scanner.nextInt();
                   if (guess<number) {
                       System.out.println("해그리드 曰 너무 낮아! 다시 생각해봐");
                   } else if (guess>number) {
                       System.out.println("해그리드 曰 너무 높아! 다시 생각해봐");
                   } else {
                       System.out.println("해그리드 曰 맞아 내가 생각한 숫자는 " + number +" 이야.");
                   }
               }

               if(count>=5) {
                   System.out.println("해그리드 曰 총 " + count + " 번 만에 내가 생각한 숫자를 맞췄네!");
                   System.out.println("해그리드 曰 기회는 총 4번이였어! 내기에서 졌으니 돈은 없어! 어서 돌아가!");
               }
               else
               {
                   System.out.println("해그리드 曰 총 "+ count + " 번 만에 내가 생각한 숫자를 맞췄네!");
                   System.out.println("해그리드 曰 4번의 기회 안에 숫자를 맞췄으니 너의 승리야..");
                   System.out.println("해그리드 曰 여기 300$야\n");

                   System.out.println("======================================================================================\n");
                   System.out.println(">>해그리드와의 게임에서 승리해 돈을 얻었습니다.<<\n");
                   money += 300;
                   System.out.println("현재 돈이 "+money+" $ 입니다.\n");
               }
           }
           else
           {
               System.out.println("해그리드 曰 에이 오늘은 내기할 기분이 아니야! 다음에 오도록 해!\n");
               System.out.println("오늘따라 해그리드의 변덕이 심하네요. 다음 기회를 엿보세요!");
               System.out.println("해그리드의 오두막에서 쫓겨났습니다.");
           }

           return money;
       }

       public void DragonShow(){
           System.out.println("해그리드 曰 그래 그러면 나랑 같이 가자꾸나\n");
           System.out.println(".......금지된 숲에 가는 중.........\n");
           System.out.println("해그리드 曰 저깄구나! 벅빅! 요새 내가 돌보고 있는 아이야 ");
           System.out.println("해그리드 曰 그 누구가 얼마를 준다고 해도 이 아이는 절대 넘기지 않을거야");
           System.out.println("======================================================================================\n");
           System.out.println("1. 보상을 얻은 용의 알과 교환하자고 제안해본다.   2. 많은 돈을 주겠다고 하며 잘 구슬려 본다.");
       }

       public int hagrid_Dragon(String name, int Defense) {


           System.out.println("해그리드 曰 뭐?? 용의 알?? 혹시 헝가리 혼테일이니?");
           System.out.println(name + "曰 네! 맞아요 그 알이랑 벅빅이랑 교환하실래요?");
           System.out.println("해그리드 曰 흠...용의 알이라..그래 ! 용을 돌보는게 내 꿈이었어! 용의 알을 주면 벅빅을 너에게 줄꼐");
           System.out.println("======================================================================================\n");
           System.out.println("현재 인벤토리에 담겨있는 아이템(들) 입니다.");
           inv1.printInv();
           String aniname = "헝가리 혼테일의 알";

           for(int i =0; i<inv1.inv.length; i++)
           {

               System.out.println(Arrays.asList(inv1.inv).contains(aniname));

               if(Arrays.asList(inv1.inv).contains(aniname))
               {
                   System.out.println("======================================================================================\n");
                   System.out.println(">>해그리드에게 용의 알을 넘겨줍니다.<<");
                   inv1.removeItemFromInv("헝가리 혼테일의 알");

                   System.out.println("======================================================================================\n");
                   System.out.println(">>해그리드에게 벅빅을 넘겨받았습니다.<<\n");
                   inv1.addItemToInv("벅빅");
                   inv1.printInv();
                   System.out.println("======================================================================================\n");
                   System.out.println("해그리드 曰 벅빅은 하늘을 날 수 있는 동물이라 벅빅을 타면 먼 곳까지 이동할 수 있고 벅빅을 타고 공격을 피할 수 있지!");
                   System.out.println("해그리드 曰 용의 알을 줘서 고마워 벅빅은 너에게 큰 도움이 될 거야. 잘 돌봐주길 바래");
                   Defense += 200;
                   System.out.println("======================================================================================\n");
                   System.out.println(">>벅빅을 얻고 방어력이 200 만큼 높아졌습니다.<<");
                   System.out.println("현재 방어력은" + Defense + " 입니다.\n");
                   System.out.println("======================================================================================\n");
                   System.out.println("해그리드 曰 그럼 돌아가자!");
                   System.out.println("...............돌아가는 중...............");
                   System.out.println("해그리드 曰 고마웠고 이제 수업 시작하겠다 잘가!!\n");
                   System.out.println("======================================================================================");

                   break;
               }

               else
               {
                   System.out.println("해그리드 曰 에잇 뭐야! 용의 알이 없잖아! 내가 호락호락해 보여?!\n");
                   System.out.println("해그리드 曰 용의 알을 얻기 위해서는 [ STAGE 2 ] 에서 알버스 덤블도어 교수님과의 전투에서 승리해야해\n");
                   System.out.println("해그리드 曰 벅빅을 얻는 것도 좋지만 먼저 덤블도어 교수님부터 이기고 오라고!\n");
                   System.out.println("=========================================================================================\n");
                   System.out.println(" 해그리드와 신비한 동물 교환이 성사되지 않았습니다.");
                   break;
               }
           }


             return Defense;
       }


       public void buck_money_show(String name, int money) {

           System.out.println("해그리드 曰 뭐??? 돈??? 벅빅은 얼마를 주더라도 줄 수 없어! 400$을 주면 모를까!");
           System.out.println(name + " 曰 잠시만 돈 좀 확인해 볼께요!\n");
           System.out.println(">>현재 남은 돈은" + money + " $ 입니다.");
           System.out.println("구매하시겠습니까?\n 1. YES   2. NO");
           System.out.println("======================================================================================");

           int bucknum;
           Scanner buckscr = new Scanner(System.in);
           bucknum = buckscr.nextInt();

           if (bucknum == 1) {

               money = show(money, bucknum);
               System.out.println("해그리드 曰 그 정도 돈이 있으면 일찍 얘기를 하지 그랬어!");
               System.out.println("해그리드 曰 자 여기 벅빅을 넘겨줄게 잘 돌봐줘야해\n");
               inv1.addItemToInv("벅빅");
               inv1.printInv();
               System.out.println("======================================================================================");
               System.out.println("현재 남은 돈은" + money + " $ 입니다.");


           } else {
               System.out.println(name + " 曰 돈이 없네요..죄송해요");
               System.out.println("해그리드 曰 흥 그럴줄 알았어 벅빅은 돈으로 계산할수 없다고!");

           }

       }
}
