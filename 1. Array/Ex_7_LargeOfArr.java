public class Ex_7_LargeOfArr {
    
    public static int LargeElement(int num[]){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i] >= large){
                large = num[i];  
               
            }           
        }
        return large;
        
    }
    public static void main(String[] args) {
        int numb[] = {1, 2, 6, 3, 5};
        
        int numIndex = LargeElement(numb);
        if(numIndex == -1) {
            System.out.println("not found");
        }
        else {
            System.out.println("index is : " + numIndex);
        }
    }
}
