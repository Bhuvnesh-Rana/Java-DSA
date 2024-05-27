package ArrayDemo;


public class MaximumWealth {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,6},
            {3,7,1}
        };
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int wealth=0;
            for(int j=0;j<a[i].length;j++){
                wealth = wealth + a[i][j];
            }
            System.out.println("Wealth of "+i+" is: "+wealth);
            if (wealth>max) {
                max=wealth;
            }
        }
        System.out.println("Maximum wealt is: "+max);
        
    }
   
}
