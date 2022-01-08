import java.security.SecureRandom;
class SecureRandomDistribution {  
  static int SAMPLE_SIZE=10000000;
  public static void main(String args[]) { 
    int zerosCount=0;
    int onesCount=0;
    int twosCount=0;
    SecureRandom random=new SecureRandom();
    int[] randomValues=new int[SAMPLE_SIZE];
    for(int i=0;i<SAMPLE_SIZE;i++){
      randomValues[i]=random.nextInt(100);
    }    
    for(int i=0;i<SAMPLE_SIZE;i++){
      if(randomValues[i]==0)
        zerosCount++;
      else if(randomValues[i]==1)
        onesCount++;
      else twosCount++;
      }
      System.out.println("Zeros="+(100.0*zerosCount/SAMPLE_SIZE)+" Ones="+100.0*onesCount/SAMPLE_SIZE+" Twos="+100.0*twosCount/SAMPLE_SIZE);
    }
  } 
