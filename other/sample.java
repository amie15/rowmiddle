public class sample{
    public static void main(String[] args){
        int[] array01 = new int[5];
        array01[0] = 1;
        array01[1] = 2;
        array01[2] = 3;
        array01[3] = 4;
        array01[4] = 5;

        int[] array02 = {1,2,3,4,5};
    
        System.out.println("要素数は" + array02.length + "¥n");

        for(int i=0; i<array01.length; i++){
            System.out.println(array01[i]);
        }
    }
    
}