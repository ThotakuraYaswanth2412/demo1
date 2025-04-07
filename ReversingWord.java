public class ReversingWord{
     public static void main(String [] args){
          String s = "hai";
   	  String reversed = "";
	  int j = s.length()-1
	  for(int i=0;i<=s.length()-1;i++){
	       reversed+=reversed.charAt(j--);
	  }
	  System.out.println(reversed);
     }
}