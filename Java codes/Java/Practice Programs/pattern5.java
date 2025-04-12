public class pattern5 {
    public static void main(String[] args) {
        
        int n = 5;
        int stars = 1;
        int spaces = n-1;

        for (int i = 1; i<=(2*n-1); i++) {
            // if(i==n){
            //     continue;
            // }
            for (int j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }

            for(int k = 1 ; k<=stars;k++){
                System.out.print("*");
                

            }
            System.out.println("");

            if(i<n){
                spaces -=1;
                stars +=2;
            }
            else{
                spaces +=1;
                stars -=2;
            }
        }
    }
}
