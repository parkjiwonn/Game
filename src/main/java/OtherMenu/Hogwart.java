package OtherMenu;


public class Hogwart {

    int MalmpPotion = 50;
    int MalhpPotion = 80;
    int HampPotion = 50;
    int HahpPotion = 80;
    int KempPotion = 50;
    int KehpPotion = 80;
    int LumpPotion = 50;
    int LuhpPotion = 80;

    public void choice(){
        System.out.println("호그와트에 입장하였습니다.");

        System.out.println("수업을 들으시려면 1번을 수업 땡땡이를 치고 싶다면 2번을 선택해주세요");


    }

    public void DayCondition(int num)
    {
        if(num==1)
        {
            System.out.println("=============================================\n");
            System.out.println(" 밤 - 학교가 문을 닫아 수업을 들을 수 없습니다.\n");
            System.out.println(" 낮에 다시 호그와트를 방문해주세요. \n");
            System.out.println("=============================================\n");


        }
        else if(num==0)
        {
            System.out.println("=============================================\n");
            System.out.println(" 낮 - 학교에서 수업을 들을 수 있습니다.\n");
            System.out.println("=============================================\n");
        }
    }

    public void show(){
        System.out.println("===================슬리데린 전용================");
        System.out.println("1. 뱀의 언어 수업 (50$)  -- mp 50 강화");
        System.out.println("2. 실전 어둠의 마법수업 (50$) -- hp 50 강화 \n");
        System.out.println("=================그리핀도르 전용=================");
        System.out.println("3. 실전 마법 수업 (50$)  -- mp 50 강화");
        System.out.println("4. 어둠의 마법 방어술 수업 (50$) -- hp 50 강화\n");
        System.out.println("===================후플푸프 전용=================");
        System.out.println("5. 신비한 동물 돌봄 수업 (50$) -- mp 50 강화");
        System.out.println("6. 어둠의 마법 방어술 수업 (50$) -- hp 50 강화\n");
        System.out.println("===================레번클로 전용=================");
        System.out.println("7. 마법의 역사 수업 (50$) -- mp 50 강화");
        System.out.println("8. 어둠의 마법 방어술 수업 (50$) -- hp 50 강화\n");
        System.out.println("===============================================");
        System.out.println("듣고 싶은 수업시간을 입력하세요(0. 돌아가기) : ");
        System.out.println("===============================================");


    }

    public int purchase(String domi, int money, int number) {



            if (number == 1)
            {
                if("슬리데린".equals(domi))
                {
                    System.out.println("호그와트에 수업료를 지불하고 있습니다.");

                    if (MalmpPotion <= money)
                    {
                         return money - MalmpPotion;
                    }
                }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }

            }

            else if (number == 2)
            {
                if("슬리데린".equals(domi))
                {
                    System.out.println("호그와트에 수업료를 지불하고 있습니다.");
                    if (MalhpPotion <= money) {
                        return money - MalhpPotion;
                    }
                }
                else
                {
                    System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

                }
            }



        if (number == 3)
        {
            if("그리핀도르".equals(domi))
            {
                System.out.println("호그와트에 수업료를 지불하고 있습니다.");

                if (HampPotion <= money)
                {
                    return money - HampPotion;
                }
            }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }

        }

        else if (number == 4)
        {
            if("그리핀도르".equals(domi))
            {
                System.out.println("호그와트에 수업료를 지불하고 있습니다.");
                if (HahpPotion <= money) {
                    return money - HahpPotion;


                }
            }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }
        }



        if (number == 5)
        {
            if("후플푸프".equals(domi))
            {
                System.out.println("호그와트에 수업료를 지불하고 있습니다.");

                if (KempPotion <= money)
                {
                    return money - KempPotion;
                }
            }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }

        }

        else if (number == 6)
        {
            if("후플푸프".equals(domi))
            {
                System.out.println("호그와트에 수업료를 지불하고 있습니다.");
                if (KehpPotion <= money) {
                    return money - KehpPotion;


                }
            }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }
        }



        if (number == 7)
        {
            if("레번클로".equals(domi))
            {
                System.out.println("호그와트에 수업료를 지불하고 있습니다.");

                if (LumpPotion <= money)
                {
                    return money - LumpPotion;
                }
            }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }

        }

        else if (number == 8)
        {
            if("레번클로".equals(domi))
            {
                System.out.println("호그와트에 수업료를 지불하고 있습니다.");
                if (LuhpPotion <= money) {
                    return money - LuhpPotion;


                }
            }
            else
            {
                System.out.println("기숙사가 달라 해당 수업을 들을 수 없습니다.");

            }
        }



        return money; //돈이 부족할때.
    }

    public int Potion_use_mp(String domi,int number,int mp)
    {

        if(number==1)
        {
            if("슬리데린".equals(domi)) {
                System.out.println("뱀의 언어 수업을 수강했습니다.");
                System.out.println("[ mp가 50만큼 증가했습니다. ]");
                mp += 50;
            }
            else
            {

            }
        }
        else if(number==3)
        {
            if("그리핀도르".equals(domi)) {
                System.out.println("실전 마법 수업을 수강했습니다.");
                System.out.println("[ mp가 50만큼 증가했습니다. ]");
                mp += 50;
            }
            else
            {

            }
        }
        if(number==5)
        {
            if("후플푸프".equals(domi)) {
                System.out.println("신비한 동물 돌봄 수업을 수강했습니다.");
                System.out.println("[ mp가 50만큼 증가했습니다. ]");
                mp += 50;
            }
            else
            {

            }
        }
        if(number==7)
        {
            if("레번클로".equals(domi)) {
                System.out.println("마법의 역사 수업을 수강했습니다.");
                System.out.println("[ mp가 50만큼 증가했습니다. ]");
                mp += 50;
            }
            else
            {

            }
        }

        return mp;
    }

    public int Potion_use_hp(String domi,int number,int hp)
    {
        if(number==2)
        {
            if("슬리데린".equals(domi)) {
                System.out.println("실전 어둠의 마법 수업을 수강했습니다.");
                System.out.println("[ hp가 80만큼 증가했습니다. ]");
                hp += 80;
            }
            else
            {

            }
        }
        else if(number==4)
        {
            if("그리핀도르".equals(domi)) {
                System.out.println("어둠의 마법 방어술 수업을 수강했습니다.");
                System.out.println("[ hp가 80만큼 증가했습니다. ]");
                hp += 80;
            }
            else
            {

            }
        }
        else if(number==6)
        {
            if("후플푸프".equals(domi)) {
                System.out.println("어둠의 마법 방어술 수업을 수강했습니다.");
                System.out.println("[ hp가 80만큼 증가했습니다. ]");
                hp += 80;
            }
            else
            {

            }
        }
        if(number==8)
        {
            if("레번클로".equals(domi)) {
                System.out.println("어둠의 마법 방어술 수업을 수강했습니다.");
                System.out.println("[ hp가 80만큼 증가했습니다. ]");
                hp += 80;
            }
            else
            {

            }
        }

        return hp;
    }








}
