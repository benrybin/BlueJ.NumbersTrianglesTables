 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String answer = "";
        String star = "*";
        for(int j=1;j<6;j++){
            
        for(int i=1;i<6;i++){
            
            answer += String.format("%3s",(j * i)) + " |";
            
            
    }
    answer += "\n";
}
    
    return answer;
        
        
    }

    public static String getLargeMultiplicationTable() {
        String answer = "";
        String star = "*";
        for(int j=1;j<11;j++){
            
        for(int i=1;i<11;i++){
            
            answer += String.format("%3s",(j * i)) + " |";
            
            
    }
    answer += "\n";
}
    
    return answer;
    }

    public static String getMultiplicationTable(int tableSize) {
        String answer = "";
        String star = "*";
        for(int j=1;j<tableSize+1;j++){
            
        for(int i=1;i<tableSize+ 1;i++){
            
            answer += String.format("%3s",(j * i)) + " |";
            
            
    }
    answer += "\n";
}
    
    return answer;
    }
}
