public class Max{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num1: ");

        int[] num1 = {4,7,1,20,2,45,87,151,35656,1515};
        int max=0;

        for(int j = 0; j < num1.length; j++) {
            for (int i = 1; i < num1.length; i++) {
                if(num1[i] > num1[i-1]){
                    max = num1[i];
//                    num1[i] = num1[i-1];
//                    num1[i-1] = max;
                }

            }

        }
        System.out.print("Arrays max: "+max);
    }

}
