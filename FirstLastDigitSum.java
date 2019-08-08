public class FirstLastDigitSum {
    public static int sumFisrtAndLastDigit(int number){
        if(number<0){
            return -1;
        }else {
            int first = 0, last = 0, temp;
            last = number % 10;
            temp = number;
            while (temp > 0) {

                first = temp;
                temp = temp / 10;
            }
            return first + last;
        }
    }
}
