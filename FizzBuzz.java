public class FizzBuzz {
    
    public static void main (String args []) {
        
        String s;
        
        for (int i = 1; i <= 100; ++i) {
            
            s = "";
             
            if (i % 3 == 0 && i % 5 == 0)
                s = "FizzBuzz";
            else if (i % 3 == 0) 
                s = "Fizz";
            else if (i % 5 == 0) 
                 s = "Buzz";
            else 
                 s = ""+i;
            
            System.out.println(s);

            
        
        }
        
    }
 
}