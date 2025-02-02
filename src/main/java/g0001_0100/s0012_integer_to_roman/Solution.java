package g0001_0100.s0012_integer_to_roman;

public class Solution {
    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        int m = 1000;
        int c = 100;
        int x = 10;
        int i = 1;

        num = numerals(sb, num, m, ' ', ' ', 'M');
        num = numerals(sb, num, c, 'M', 'D', 'C');
        num = numerals(sb, num, x, 'C', 'L', 'X');
        numerals(sb, num, i, 'X', 'V', 'I');

        return sb.toString();
    }

    public int numerals(StringBuilder sb, int num, int one, char cTen, char cFive, char cOne) {
        int div = num / one;
        switch (div) {
            case 9:
                sb.append(cOne);
                sb.append(cTen);
                break;
            case 8:
                sb.append(cFive);
                sb.append(cOne);
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 7:
                sb.append(cFive);
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 6:
                sb.append(cFive);
                sb.append(cOne);
                break;
            case 5:
                sb.append(cFive);
                break;
            case 4:
                sb.append(cOne);
                sb.append(cFive);
                break;
            case 3:
                sb.append(cOne);
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 2:
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 1:
                sb.append(cOne);
                break;
            default:
                break;
        }
        return num - (div * one);
    }
}
