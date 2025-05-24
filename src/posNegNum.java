public class posNegNum {
    public String negOrPos(double input ){
 
        if(input > 0){
        
        return "Is positive";
        } else if (input < 0) {
        
        return "Is Negative";
        } else {
             return "Zero";
        } 
    };
    
    public String negOrPos(String input){
    
    try{
    Double value = Double.parseDouble(input);
    return negOrPos(value);
    
    } catch(NumberFormatException e){
    return "Is not a number ";
    }
    
    }
    
    
      public static void main(String[] args) {
        posNegNum a1 = new posNegNum();
        Double inp = 2.5;
        String nan = "nnn";
     
        System.out.println(a1.negOrPos(inp));
        System.out.println(a1.negOrPos(nan));
       
      }
}
