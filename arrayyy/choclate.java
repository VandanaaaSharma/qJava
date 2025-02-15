import java.util.Arrays;
public class choclate {
    public static int choco(int num[], int m){
        int n=num.length;
        Arrays.sort(num);
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=num[i+m-1]-num[i];
            if(diff<min){
                min=diff;
            }

        }
        return min;
    }
    public static void main(String[] args){
        int num[]={7,3,2,4,9,12,56};
        int m=3;
        System.out.println(choco(num,m));
    }
}
