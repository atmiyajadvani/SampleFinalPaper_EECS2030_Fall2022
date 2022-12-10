import java.util.ArrayList;

public class Q6_Day {

    public static void main(String args[]){
        System.out.println("1");
    }

    static class Day{
        String name;
        int day;
        int month;
    }

    static class Month {
        Day[] day;
        int year;

        public Month(){
            day = new Day[31];
            year = 0;
        }

        public Day[] getDay(){
            return day;
        }
    }


    static class Year{
        ArrayList<Month> month;

        public Year(){
            // creating an arraylist of 12 elements capacity
            month = new ArrayList<Month>(12);
        }

        public void setMonth(ArrayList<Month> month){
            this.month = month;
        }

    }
}
