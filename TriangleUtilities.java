 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String answer = "";
        String star = "*";
        for(int i=0;i<numberOfStars;i++){
            answer += star;
            System.out.println(answer);
    }
    return answer;
}
    
    public static String getTriangle(int numberOfRows) {
        String answer = "";
        String star = "*";
        for(int i=0;i<numberOfRows;i++){
            
            answer += star;
            answer += "\n";
            star += "*";
            System.out.println(answer);
    }
    return answer;
    }


    public static String getSmallTriangle() {
        String answer = "";
        String star = "*";
        for(int i=0;i<4;i++){
            
            answer += star;
            answer += "\n";
            star += "*";
            System.out.println(answer);
    }
    return answer;
    }

    

    public static String getLargeTriangle() {
        String answer = "";
        String star = "*";
        for(int i=0;i<9;i++){
            
            answer += star;
            answer += "\n";
            star += "*";
            System.out.println(answer);
    }
    return answer;
    }
}
