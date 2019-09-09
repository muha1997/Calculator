import java.util.Scanner;
public class DataReader {

    private int var1;
    private int var2;
    private char oper;
    private boolean arab = false;
    public void read() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        try {
            String[] blocks = text.split("[+-/*]");
            var1 = Integer.parseInt(blocks[0]);
            oper = text.charAt(blocks[0].length());
            var2 = Integer.parseInt(blocks[1]);

        } catch (RuntimeException e) {
            Arabian arabian = new Arabian();
            String[] blocks = text.split("[+-/*]");
            var1 = arabian.getArab(blocks[0]);
            oper = text.charAt(blocks[0].length());
            var2 = arabian.getArab(blocks[1]);
            arab = true;
            //throw new IllegalArgumentException("Не верный формат данных.");

        }
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public char getOper() {
        return oper;
    }
    public boolean getArab() {
        return arab;
    }

}