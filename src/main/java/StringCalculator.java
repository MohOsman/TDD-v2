public class StringCalculator {

    public int getSumOfNr(String s) {
        try {
            if(s.equals("")){
                return 0;
            }else if(s.length()==1){
                int nr = Integer.parseInt(s);
                return nr;
            }
            else if(s.contains(",")){
                return sum(s,",");
            }else if(s.contains("\n")){
                return sum(s,"\n");

            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        return -1;
    }

    private int sum(String nr, String reqex) {
        String [] numbers = nr.split(reqex);
        int nr1= Integer.parseInt(numbers[0]);
        int nr2 = Integer.parseInt(numbers[1]);
        return  nr1+nr2;
    }
}
