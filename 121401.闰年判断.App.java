public class App {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入要判断的年份：");
//        调用Scanner对象
            Scanner scanner = new Scanner(System.in);
//        从控制台获取要录入的信息
            String str = scanner.nextLine();
//          将字符串转换成int型
            int year = Integer.parseInt(str);
//        判断是否能被400整除，返回一个布尔值
            Boolean flag1 = year % 400 == 0;
//        利用是否能被4整除且不能被100整除，返回一个布尔值
            Boolean flag2 = year % 4 == 0 & year % 100 != 0;
//        利用条件运算符得出是否为闰年
            String message = (flag1 || flag2) ? "是闰年" : "不是闰年";
            System.out.println(year + message);
        }
    }
}
