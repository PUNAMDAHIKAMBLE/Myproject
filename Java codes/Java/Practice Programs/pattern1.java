public class pattern1 {
    
    public static void main(String[] args) {
        
        
        int n = 5;
        int stars = 1;
        int spaces = n;
        

        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }

            for(int k = 1 ; k<=stars;k++){
                System.out.print("*");

            }
            System.out.println("");

                spaces -=1;
                stars +=2;
                
            
    
            }

            for (int r = n; r>=1; r++) {
            
                for (int e = 1; e<=spaces; e++) {
                    System.out.print(" ");
                }
    
                for(int c = 1 ; c<=stars;c++){
                    System.out.print("*");
    
                }
                System.out.println("");
    
                    spaces +=1;
                    stars -=2;
                    
                }
        }
        
          
    }

