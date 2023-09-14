import java.sql.SQLOutput;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("                      欢迎使用密码管理系统");
        System.out.println("--------------------------------------------------------------");
        System.out.print("请选择操作：\n" +
                "1. 加密\n" +
                "2. 解密\n" +
                "3. 判断密码强度（第三周任务添加）\n" +
                "4. 密码生成（第三周任务添加）\n" +
                "5. 退出\n"+
                "请输入选项序号：");
              int number= sc.nextInt();
              if(number==1){
                  Task1 t1=new Task1();
                  t1.print();
        }
    }
}
class Task1{
    Scanner sc=new Scanner(System.in);
    int[]change;
    char[] charpassword;
    String password;
 public Task1(){
     System.out.print("请输入要加密的数字密码：");
     password=sc.next();
     charpassword=password.toCharArray();
     charpassword[password.length()-1]=password.charAt(0);
     charpassword[0]=password.charAt(password.length()-1);
     change=new int[password.length()];
     for (int i=0;i<password.length();i++){
         change[i]=charpassword[i]+3;

     }
     for (int i=0;i< change.length;i++){
         charpassword[i]=(char)(change[i]);
     }
     password=new String(charpassword);

}
public void print(){
     System.out.print("加密后的结果是："+password); }
}