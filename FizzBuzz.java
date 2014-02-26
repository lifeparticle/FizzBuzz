import java.io.*;

public class FizzBuzz {

    public static void main (String args []) {


        try {

            File file = new File ("out.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
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
                    s = "" + i;

                output.write(s);
                if (i != 100)
                    output.newLine();
            }

            output.close();

            // System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}

