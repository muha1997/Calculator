public class Arabian {
    private int out;
    private String Rome;
    private int arab(String in){
        switch (in){
            case "I": out = 1;
                break;
            case "II": out = 2;
                break;
            case "III": out = 3;
                break;
            case "IV": out = 4;
                break;
            case "V": out = 5;
                break;
            case "VI": out = 6;
                break;
            case "VII": out = 7;
                break;
            case "VIII": out = 8;
                break;
            case "IX": out = 9;
                break;
            case "X": out = 10;
                break;
            default:throw  new IllegalArgumentException("Не верный формат данных.");
        }
        return out;
    }
    private String rome(int in){
        switch (in){
            case 1: Rome = "I";
                break;
            case 2: Rome = "II";
                break;
            case 3: Rome = "III";
                break;
            case 4: Rome = "IV";
                break;
            case 5: Rome = "V";
                break;
            case 6: Rome = "VI";
                break;
            case 7: Rome = "VII";
                break;
            case 8: Rome = "VIII";
                break;
            case 9: Rome = "IX";
                break;
            case 10: Rome = "X";
                break;
            case 11: Rome = "XI";
                break;
            case 12: Rome = "XII";
                break;
            case 13: Rome = "XIII";
                break;
            case 14: Rome = "XIV";
                break;
            case 15: Rome = "XV";
                break;
            case 16: Rome = "XVI";
                break;
            case 17: Rome = "XVII";
                break;
            case 18: Rome = "XVIII";
                break;
            case 19: Rome = "XIX";
                break;
            case 20: Rome = "XX";
                break;
            default:throw  new IllegalArgumentException("Не верный формат данных.");
        }
        return Rome;
    }
    public int getArab(String in){
        return arab(in);
    }
    public String getRome(int in1){
        return rome(in1);
    }
}
