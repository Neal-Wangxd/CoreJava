package com.Stream;


import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * MapReduce功能测试类
 *
 * @auther wxd
 * @create 2017/12/20
 * @desc MapReduce功能测试类
 */
public class MapReduceTest {
    public static void main(String[] args) {
        List<ShopCar> carList = new ArrayList<>();
        carList.add(new ShopCar("外星人主机",9999.9,3));
        carList.add(new ShopCar("LG 4K显示器",1999.9,3));
        carList.add(new ShopCar("LG 罗技G502鼠标",399.9,3));
        carList.add(new ShopCar("樱桃机械键盘",999.9,3));
        //carList.stream().map((x) -> x.getAmout()*x.getPrice()).forEach(System.out :: println);
        //double total = carList.stream().map((x) -> x.getAmout()*x.getPrice()).reduce((sum,m) -> sum + m).get();
        DoubleSummaryStatistics dss = carList.stream().mapToDouble((sc) -> sc.getAmout()*sc.getPrice()).summaryStatistics();
        System.out.println("商品个数："+ dss.getCount());
        System.out.println("花费金额："+ dss.getSum());
        System.out.println("平均价格："+ dss.getAverage());
        System.out.println("最高价格："+ dss.getMax());
        System.out.println("最低价格："+ dss.getMin());
    }
}

class ShopCar{

    private String name;
    private double price;
    private int amout;

    public ShopCar(String name, double price, int amout) {
        this.name = name;
        this.price = price;
        this.amout = amout;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmout() {
        return amout;
    }


}
