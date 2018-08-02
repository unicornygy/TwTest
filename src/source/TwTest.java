package source;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TwTest {
    public static void test(){
        view();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.equals("1")) {
            rightInput("1");
        } else {
            worseInput("1");
        }

    }

    private static String[] judgeInput(String input){

        String patternName = "^[\\u4e00-\\u9fa5]{0,}$";
        String patternNumber = "^[0-9]*$";
        String patternSubject = "^[\\u4e00-\\u9fa5]{0,}\\:[0-9]*$";
        boolean flag = input.matches(patternName);
        String[] inputarr = input.split(",");
        if (inputarr.length < 3 || !inputarr[0].matches(patternName) || !inputarr[1].matches(patternNumber) || !inputarr[2].matches(patternSubject)) {
            return null;
        } else {

        }
        return null;
    }
    private static void view(){
        System.out.println("1.添加学生");
        System.out.println("2.生成成绩单");
        System.out.println("3.退出");
        System.out.println("请输入你的选择（1~3）:");
    }
    private static void rightInput(String type){
        if (type.equals("1")) {
            System.out.println("请输入学生信息（格式: 姓名，学号，学科:成绩，...），按回车提交");
        } else if (type.equals("2")) {
            System.out.println("请输入要打印的学生的学号（格式: 学号，学号，...），按回车提交");
        }

    }
    private static void worseInput(String type){
        if (type.equals("1")) {
            System.out.println("请按正确的格式输入（格式: 姓名、学号、学科:成绩，...）");
        } else if (type.equals("2")) {
            System.out.println("请按正确的格式输入要打印的学生的学号（格式: 学号，学号，...），按回车提交");
        }

    }
    private static void rightResult(String studentName){
        System.out.println("学生" + studentName + "的成绩被添加");
    }

}
