public class Calculator {
    private Calculator(){}

    public static int calculate(int var1, int var2, char operation){
        int result = 0;
        switch (operation){
            case '+': result = var1 + var2; break;
            case '-': result = var1 - var2; break;
            case '*': result = var1 * var2; break;
            case '/': result = var1 / var2; break;
            default:throw  new IllegalArgumentException("Не верный формат данных.");

        }
        if (((var1<1)|(var1>10))|((var2<1)|(var2>10))) throw new IllegalArgumentException("Числа превышают заданный диапазон");
        return result;
    }

}