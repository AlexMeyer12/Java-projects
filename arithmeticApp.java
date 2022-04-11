public class arithmeticApp{
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        int n1,n2;
        n1 = nums.nextInt();
        n2 = nums.nextInt();
        arithmetic ar = new arithmetic(n1,n2);
        System.out.println(ar.disply());

    }
}