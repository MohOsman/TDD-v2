import exceptions.NegativNumberException;

import java.util.Arrays;

public class StringCalculator {

    public int getSumOfNr(String s) throws NegativNumberException {
        String [] numbers =s.split(("[,\n]"));
          if(s.isEmpty() ){
                return 0;
            }
            else if(isNegativ(numbers)){
            throw new NegativNumberException("negatives not allowed:");
        }

        else  if (MoreThan100(numbers)){
            return 0;
          }
        else if(s.length()==1){
              return stirngToInt(s);
           }
           else{
               return sum(numbers);
             }


    }

    private boolean MoreThan100(String[] numbers) {
        int nr = 0;
        for (int i = 0; i < numbers.length; i++) {
           nr = stirngToInt(numbers[i]);
           if(nr > 1000)
               return true;
        }
        return false;
    }


    private boolean isNegativ(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if(stirngToInt(numbers[i]) < 0){
                return true;
            }
        }
        return false;


    }

    private int sum(String [] numbers) {
        return  Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
    }



    private int stirngToInt(String input){
        int output = 0;
        try {
           output =  Integer.parseInt(input);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
       return output;
    }
}
