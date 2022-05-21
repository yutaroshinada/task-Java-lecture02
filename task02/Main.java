package task02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TicketsPrice general = new TicketsPrice("一般", 1900, "水曜日以外");
        general.introduce();
        System.out.println(general.getName() + "は" + general.getDay() + general.getPrice() + "円です。");

        TicketsPrice college = new TicketsPrice("大学生", 1500, "水曜日以外");
        college.introduce();
        System.out.println(college.getName() + "は" + college.getDay() + college.getPrice() + "円です。");

        TicketsPrice highschool = new TicketsPrice("高校生", 1000, "毎日");
        highschool.introduce();
        System.out.println(highschool.getName() + "は" + highschool.getDay() + highschool.getPrice() + "円です。");

        TicketsPrice jrhighschool = new TicketsPrice("中学生", 1000, "毎日");
        jrhighschool.introduce();
        System.out.println(jrhighschool.getName() + "は" + jrhighschool.getDay() + jrhighschool.getPrice() + "円です。");

        TicketsPrice elementary = new TicketsPrice("小学生", 1000, "毎日");
        elementary.introduce();
        System.out.println(elementary.getName() + "は" + elementary.getDay() + elementary.getPrice() + "円です。");

        TicketsPrice child = new TicketsPrice("幼児", 1000, "毎日");
        child.introduce();
        System.out.println(child.getName() + "は" + child.getDay() + child.getPrice() + "円です。");

        TicketsPrice senior = new TicketsPrice("シニア", 1200, "毎日");
        senior.introduce();
        System.out.println(senior.getName() + "は" + senior.getDay() + senior.getPrice() + "円です。");

        TicketsPrice disabledperson = new TicketsPrice("障がい者", 1000, "毎日");
        disabledperson.introduce();
        System.out.println(disabledperson.getName() + "は" + disabledperson.getDay() + disabledperson.getPrice() + "円です。");


        general.setPrice(2000);
        System.out.println("来年から、" + general.getName() + "の料金が" + general.getPrice() + "に値上がりします。");
        college.setPrice(1600);
        System.out.println("来年から、" + college.getName() + "の料金が" + college.getPrice() + "に値上がりします。");


        List<TicketsPrice> ticketsPriceList = List.of(new TicketsPrice("一般", 1900, "水曜日以外"),
                new TicketsPrice("大学生", 1500, "水曜日以外"),
                new TicketsPrice("シニア", 1200, "毎日"));

        for (TicketsPrice ticketsPrice : ticketsPriceList) {
            System.out.println("券種:" + ticketsPrice.getName());
            System.out.println("料金:" + ticketsPrice.getPrice());
            System.out.println(ticketsPrice.getDay());
        }

        if (general.getDay().equals("水曜日以外")) {
            System.out.println(general.getName() + "は、" + general.getPrice() + "です。");
        } else if (general.getDay().equals("水曜日")) {
            System.out.println(general.getName() + "は、" + "1200でございます。");

        }


    }

}
