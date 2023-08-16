class HelloWorld {
    public static boolean isPrime(int n1){
        if(n1==2){
            return true ;
        }
        for(int i=2 ; i<= Math.sqrt(n1) ; i++){
            if(n1%i==0){
                return false ;
            }
        }
        return true ;
    }
    public static void PrimeInRange(int n){
        for(int i = 2 ; i<= n; i++){
            if(isPrime(i)){
                System.out.print(i+",");
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int num = 100 ;
        PrimeInRange(num);
    }
}

