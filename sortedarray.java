public class sortedarray {
    public static int search(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
            return i;
        } 
        }
        return -1;
    }
    public static void main(String[] args){
        int num[]={4,5,6,7,0,1,2};
        int key=0;
        System.out.println(search(num,key));
    }

}
