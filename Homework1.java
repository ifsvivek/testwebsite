public class Homework1 {
    public static void main(String[] args) {
	    long startTime = System.currentTimeMillis();
        int x=0;
        //int current;
        //*Creating and Assigning values to each array element
        String[] array1 = new String[100000];
        //int[] array2 = new int[10000];

        Homework1 rand = new Homework1();
        for(int i=0;i<array1.length;i++){
            array1[i]=rand.getAlphaNumericString();
            //System.out.println(array1[i]);        
        }

        /*for(int i=0;i<array2.length;i++){
            array2[i]=array1[0].compareTo(array1[i]);
            //System.out.println(array2[i]);
        }*/

            //* It works till here lmao */

        for(int i=1;i<array1.length;i++){
            String ele = array1[i];
            int j;
            for (j = i - 1; j >= 0 && ele.compareTo(array1[j]) <= 0; j--){
                array1[j + 1] = array1[j];
			}
            array1[j + 1] = ele;
        }
            /*current = array1[i];
            j=i-1;
            while(j>=0 && array1[j]>current){
                array1[j+1]=array1[j];
                j--;
            }
            array1[j+1]=current;
            while(j>=0 && array2[j]>current){
                array2[j+1]=array2[j];
                j--;
            }
            array2[j+1]=current;*/

        /*for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }*/

        /*for (int i = 1; i < array1.length; i++) {
            String ele = array1[i];
            for (j = i - 1; j >= 0 && ele.compareTo(array1[j]) <= 0; j--)
            {
                array1[j + 1] = array1[j];
            }
            array1[j + 1] = ele;
        }*/

        for(int i=0;i<array1.length-1;i++){
            if(array1[i]==array1[i+1]){
                x++;
            }
        }

        System.out.println("There are "+x+" duplicates");

	    long endTime = System.currentTimeMillis();
	    long time = endTime - startTime;
	    System.out.println("Time taken = " + time);
    }

    //* function to generate a random string of length 20
    public String getAlphaNumericString(){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            int index= (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }return sb.toString();
    }
}