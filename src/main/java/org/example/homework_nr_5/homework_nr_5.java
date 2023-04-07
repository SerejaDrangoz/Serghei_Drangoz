package org.example.homework_nr_5;

public class homework_nr_5 {


    public static void main(String[] args){
        Weekday monday = Weekday.MONDAY;
        System.out.println(monday.isWeekDay());
        System.out.println(monday.isHoliday());

        Weekday saturday = Weekday.SATURDAY;
        System.out.println(saturday.isWeekDay());
        System.out.println(saturday.isHoliday());


        month Month = month.January;
        month Month1 = month.February;
        month Month2 = month.March;
        month Month3 = month.April;
        month Month4 = month.May;
        month Month5 = month.June;
        month Month6 = month.July;
        month Month7 = month.August;
        month Month8 = month.September;
        month Month9 = month.October;
        month Month10 = month.November;
        month Month11 = month.December;


        System.out.println(Month);
            System.out.println(Month1);
            System.out.println(Month2);
            System.out.println(Month3);
            System.out.println(Month4);
            System.out.println(Month5);
            System.out.println(Month6);
            System.out.println(Month7);
            System.out.println(Month8);
            System.out.println(Month9);
            System.out.println(Month10);
            System.out.println(Month11);



        System.out.println(toBoolean("true"));

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }

    public static Boolean toBoolean(String string) {
        return Boolean.valueOf(string);
    }
    static String str = "120";
    static byte num = Byte.parseByte(str);

    static String str2 = "32000";
    static short num2 = Short.parseShort(str2);

    static String str3 = "147895632";
    static int num3 = Integer.parseInt(str3);

    static String str4 = "987654321987654321";
    static long num4 = Long.parseLong(str4);

    static String str5 = "4444.5d";
    static double num5 = Double.parseDouble(str5);

    static String str6 = "2354.56f";
    static float num6 = Float.parseFloat(str6);
}
