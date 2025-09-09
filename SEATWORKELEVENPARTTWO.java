public class SEATWORKELEVENPARTTWO {
public static void main(String[] args) {
   System.out.println("SEATWORKELEVENPART2");
    int [][] mynumbers={ {1,4,2},{3,6,8,5,2} };
    for(int row=0; row<mynumbers.length; row++){
      for (int col=0;col < mynumbers[row].length; col++) {
        System.out.println("mynumbers["+row+"]" + "["+col+"]="+mynumbers[row][col]);
      }
      
    }
  }
}


