static int factorial(int n){

    //0!= 1 n!=n*(n-1)!
    if (n==0)
        return 1;
    return n*(factorial(n-1))!;
    }



    public static void main(String[] args) {
        int n = 1;
        int result;
        result=factorial(n);
        System.out.println("Factorial of"+n+"is"+result);

    }


