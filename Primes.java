public class Primes {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[length+1];
        arr[0] = false;
        arr[1] = false;
        for(int i = 2; i<arr.length; i++){
            arr[i] = true;
        }
        int i =2;
        while (i<arr.length) {
            if(arr[i]){
                int j = i*2;
                while(j<arr.length){
                    arr[j] = false;
                    j+=i;
                }
            }
            i++;
        }
        System.out.println("Prime numbers up to " + length+":");
        int counter =0;
        for(int a = 0; a<arr.length; a++){
            if(arr[a]){
                counter++;
                System.out.println(a);
            }
        }
        System.out.println("There are "+ counter + " primes between 2 and "+ length+ " (" +(counter*100)/length + "% are primes)");

    }
}