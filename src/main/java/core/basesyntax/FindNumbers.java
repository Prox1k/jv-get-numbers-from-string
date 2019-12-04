package core.basesyntax;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        StringBuilder digits = new StringBuilder();
        int k = 0;
        int j = 0;
        int i = 0;
        int numOfDig = 0;
        for (i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                while (i + 1 < text.length() && Character.isDigit(text.charAt(i + 1))) {
                    i++;
                }
                numOfDig += 1;
            }
        }
        int[] res = new int[numOfDig];
        for (i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)) || text.charAt(i) == '-') {
                digits.append(text.charAt(i));
                while (i + 1 < text.length() && Character.isDigit(text.charAt(i + 1))) {
                    i++;
                    digits.append(text.charAt(i));
                }
                res[j] = Integer.parseInt(digits.toString()) * 2;
                j++;
            }
            digits = new StringBuilder();
        }
        return res;
    }
}
