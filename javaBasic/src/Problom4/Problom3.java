package Problom4;

public class Problom3 {
    
    public int solution(int number) {
        if (number <= 0) return 0;

        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        } 

        return result;
    }

}