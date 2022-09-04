package OtherMenu;


import java.util.Arrays;
import java.util.Scanner;

public class inventory {


    public String[] inv= new String[]{"", "", "", "", "", "", "","",""};



    public void addItemToInv(String name){


        for(int i=0; i <inv.length; i++){
            if(inv[i] == ""){
                inv[i]= name;
                System.out.println( "아이템이 추가되었습니다. 추가된 아이템 : " + name + ".");



                return;
            }

        }

    }

    public void removeItemFromInv(String name){

            for (int i = 0; i < inv.length; i++) {
                if (inv[i].equals(name)) {
                    inv[i] = "";
                    printInv();

                }
            }

    }


    public void Wearitem(int num)
    {

        if(num==1)
        {

            System.out.println(Arrays.toString(inv));

            System.out.println("현재 인벤토리 현황입니다.\n");
            System.out.println("============================");
            System.out.println("장착할 아이템을 입력해주세요 : ");
            System.out.println("===================================");

        }
        else
        {
            System.out.println("아이템을 장착하지 않습니다.");
        }


    }


    public void printInv(){

        System.out.println(Arrays.toString(inv));

    }




}
