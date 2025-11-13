public class TimeCalc {
    public static void main(String[] args) {
    int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    int minAdd = Integer.parseInt(args[1]);
    
    int totalMinutes = (hours * 60) + minutes + minAdd;
    int totalHours = totalMinutes / 60;
    
    int newHours = totalHours % 24;
    int newMinutes = totalMinutes - (totalHours * 60);

    String newHourString;
    String newMinutesString;

    if (newHours < 10) {
      newHourString = "0" + newHours;  
    }
    else {
       newHourString = "" + newHours;
    }

     if (newMinutes < 10) {
      newMinutesString = "0" + newMinutes;  
    }
    else {
      newMinutesString = "" + newMinutes;
    }


    System.out.println( newHourString + ":" + newMinutesString);


    }
}
