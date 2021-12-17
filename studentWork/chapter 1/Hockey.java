

public class Hockey {

    public static void main(String[] args) {
        
        int periodsPlayed = 3;
        Stringteam = "oilers";
        System.out.println(TotalGoals teams(periodsPlayed));


    }

        public static String TotalGoals(String teamname ,int periods) {
            
            int sum = 0;
            double average = 0.0;
            for(int i = 1; 1<= periods; i++ ){
                Scanner hstat = new Scanner (System.in);
                System.outprint.ln("The" + teamName = "scored how many goals at the end of the " + i + "period") 
            int value = hstat.nextInt();
                sum = sum + value;
                average = sum/(double)periods;


            }

            return "In " + periods + " periods of play they have " + sum + " goals and an average of " + average + " goals per period.";
        
    } 
}