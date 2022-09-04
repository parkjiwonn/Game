package OtherMenu;

import java.util.Arrays;
import java.util.Scanner;

public class DiganAlley {

    castitem[] menu;
    public inventory inv = new inventory();


    public DiganAlley() {
        // TODO Auto-generated constructor stub
        menu = new castitem[6];
        menu[0] = new castitem("견습생 지팡이", 50, 10);
        menu[1] = new castitem("견습생 망토", 50, 10);
        menu[2] = new castitem("중급자 지팡이", 100, 20);
        menu[3] = new castitem("중급자 망토", 100, 20);
        menu[4] = new castitem("상급자 지팡이", 150, 30);
        menu[5] = new castitem("상급자 망토", 150, 30);

    }

    public int compareInvD(String Item,int figure) {



        if ("견습생 망토".equals(Item)) {
            System.out.println("견습생 망토 장착했습니다.");
            System.out.println("방어력이 10만큼 상승했습니다.");

            figure += menu[1].figure;



        } else if ("중급자 망토".equals(Item)) {
            System.out.println("중급자 망토를 장착했습니다.");
            System.out.println("방어력이 20만큼 상승했습니다.");
            figure += menu[3].figure;




        } else if ("상급자 망토".equals(Item)) {
            System.out.println("상급자 망토를 장착했습니다.");
            System.out.println("방어력이 30만큼 상승했습니다.");
            figure += menu[5].figure;

        }
        else if("어둠의 지팡이".equals(Item))
        {
            System.out.println("어둠의 지팡이를 장착했습니다.");
            System.out.println(" ");
        }


        return figure;

    }

    public int compareInvM(String Item, int figure1)
    {


        if ("견습생 지팡이".equals(Item)) {
            System.out.println("견습생 지팡이를 장착했습니다.");
            System.out.println("주문력이 10만큼 상승했습니다.");

            figure1 +=menu[0].figure;

        }
        else if ("중급자 지팡이".equals(Item)) {
            System.out.println("중급자 지팡이를 장착했습니다.");
            System.out.println("주문력이 20만큼 상승했습니다.");

            figure1 += menu[2].figure;


        }
        else if ("상급자 지팡이".equals(Item)) {
            System.out.println("상급자 지팡이를 장착했습니다.");
            System.out.println("주문력이 30만큼 상승했습니다.");

            figure1 += menu[4].figure;


        }
        return figure1;


    }


    public void DayCondition(int day){
        if (day==0)
        {
            System.out.println("======================================================\n");
            System.out.println("낮 - 다이건 앨리가 정상적으로 영업합니다.\n");
            System.out.println("======================================================\n");
        }
        else if(day==1)
        {
            System.out.println("============================================================\n");
            System.out.println("밤에는 어둠의 마법사의 세력이 강해서 다이건앨리가 영업하지 않습니다.");
            System.out.println("============================================================\n");

        }
    }

    public void showMenu() {

            System.out.println("======================다이건 앨리=======================");
            for (int i = 0; i < menu.length; i++) {
                if (i % 2 == 1) {
                    System.out.println((i + 1) + ". " + menu[i].name + " : " + menu[i].price + " (방어력이 " + menu[i].figure + " 만큼 상승합니다.)");

                } else {
                    System.out.println((i + 1) + ". " + menu[i].name + " : " + menu[i].price + " (주문력이 " + menu[i].figure + " 만큼 상승합니다.)");

                }
            }

            System.out.println("======================================================");
            System.out.print("구매할 아이템 번호를 선택하세요 : ");
            System.out.println("(EXIT NUMBER : 0)");

    }



    public int select(int money, int num) {


        if (num == 1) {
            if (menu[0].price <= money) {
                inv.addItemToInv(menu[0].name);
                inv.printInv();
                return money - menu[0].price;

            }
        } else if (num == 2) {
            if (menu[1].price <= money) {
                inv.addItemToInv(menu[1].name);
                inv.printInv();
                return money - menu[1].price;
            }
        } else if (num == 3) {
            if (menu[2].price <= money) {
                inv.addItemToInv(menu[2].name);
                inv.printInv();
                return money - menu[2].price;
            }
        } else if (num == 4) {
            if (menu[3].price <= money) {
                inv.addItemToInv(menu[3].name);
                inv.printInv();
                return money - menu[3].price;
            }
        } else if (num == 5) {
            if (menu[4].price <= money) {
                inv.addItemToInv(menu[4].name);
                inv.printInv();
                return money - menu[4].price;
            }
        } else if (num == 6) {
            if (menu[5].price <= money) {
                inv.addItemToInv(menu[5].name);
                inv.printInv();
                return money - menu[5].price;
            }
        }


        return money;
    }




}


