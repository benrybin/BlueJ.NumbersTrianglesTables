


public class NumberUtilities {

    public static String getRange(int stop) {
        String answer =""; 
        for(int i =0; i<stop;i++){
             answer += i;
            
        }
        
        return answer;
        
    }

    public static String getRange(int start, int stop) {
        String answer =""; 
        for(int i = start;i<stop;i++){
             answer += i;
            
        }
        
        return answer;
    }


    public static String getRange(int start, int stop, int step) {
        String answer =""; 
        for(int i = start;i<stop;i +=step){
             answer += i;
            
        }
        
        return answer;
    }

    public static String getEvenNumbers(int start, int stop) {
        String answer = "";
        for(int i =start; i<stop;i++){
            if((i % 2) == 0) {
            answer += i;
            System.out.println(answer);
        }
        }
        return answer;
    }


    public static String getOddNumbers(int start, int stop) {
        String answer = "";
        for(int i =start; i<stop;i++){
            if((i % 2) != 0) {
            answer += i;
            
        }
        }
        return answer;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String answer = "";
        for(int i =start; i<=stop;i++){
            
            answer += (int) Math.pow(i,exponent);
            
        }
        return answer;
        }
        
    }

