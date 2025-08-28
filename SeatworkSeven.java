public class SeatworkSeven{
    public static void main(String[] args) {
    char grade ='C';
    
    switch(grade){
      case'A':
      System.out.println("Excellent");
      break;
      case'B':
      System.out.println("great job");
      break;
      case'C':
      System.out.println("well done");
      break;
      case'D':
      System.out.println("you passed");
      break;
      case'F':
      System.out.println("better try next time");
      break;
      default:
      System.out.println("invalid grade");
      
    }
    System.out.println("your grade is" + grade);
  }
}

