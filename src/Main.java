public class Main {
    //private static final char exitCharacter = '!';

    public static void main(String[] args) {
        DataReader reader = new DataReader();
        try {
                reader.read();
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
            int result = Calculator.calculate(reader.getVar1(), reader.getVar2(), reader.getOper());
            if (reader.getArab()){
                Arabian arabian = new Arabian();
                System.out.println(arabian.getRome(result));
            }
            else {
                System.out.println(result);
            }

    }
}