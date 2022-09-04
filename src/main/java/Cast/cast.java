package Cast;



import OtherMenu.inventory;

public class cast extends Thread{

    // 모든 캐스트들은 이름, 마법력, 체력, 레벨을 가지고 있다.

    public String name;
    public int mp = 80;
    public int hp =200;
    public int level=0;
    public int MagicPoint =25;
    public int Defense =15;
    public int money = 10000;
    public int experience =0;
    public String domitory;





    public int attack() {
        return MagicPoint;
    }

    public void attacked(int sum) {

        if (Defense >= sum) {
            hp = hp - 0;
        } else {
            hp = hp + Defense - sum;

        }
    }
}



