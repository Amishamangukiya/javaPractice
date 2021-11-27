package week7homework;

public class SwitchCase2 {
    public static void monthSelection(String monthName){
        switch (monthName){
            case "January":
                System.out.println("Month number 1");
                break;
            case "February":
                System.out.println("Month number 2");
                break;
            case "March":
                System.out.println("Month number 3");
                break;
            case "April":
                System.out.println("Month number 4");
                break;
            case "May":
                System.out.println("Month number 5");
                break;
            case "June":
                System.out.println("Month number 6");
                break;
            case "July":
                System.out.println("Month number 7");
                break;
            case "August":
                System.out.println("Month number 8");
                break;
            case "September":
                System.out.println("Month number 9");
                break;
            case "October":
                System.out.println("Month number 10");
                break;
            case "November":
                System.out.println("Month number 11");
                break;
            case "December":
                System.out.println("Month number 12");



        }
    }

    public static void main(String[] args) {
        monthSelection("November");
        monthSelection("February");
        monthSelection("May");
    }
}
