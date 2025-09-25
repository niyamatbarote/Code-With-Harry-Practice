public class ForLoopPractice {

    public static void main(String[] args) {
        //int n =4;
        for (int i = 4; i>0; i--) {
            
            for (int j=0; j<i;j++) {
                System.out.print(" * " );
            }
            System.out.println();
        }
    }
    
}
//EXPLAINATION ==================================================================
  // Here, 'i' is in The For Loop 
  // 'i' decrementing in every iteration
  //eg= in 1sr loop 'i=4', then it will go in the 2nd For Loop i.e. 'j=0' 
  // in this 'j<i'means 'j<4' i.e. It will Print "*" 4 Times and exit 'j' Loop
  //Then sout("\n") leave the line
  // similarly, now value of i is 3 'i==3' bcoz 'i--' then it will go in the 2nd For Loop
  // then it is 'j<i' means 'j<3' it will print 2 "*"
  //Then sout("\n") leave the line
  // Similarly again and again until 'i>0';