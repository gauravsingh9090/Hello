import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int bn = sc.nextInt();
       int ans = 0;
        int pow = 1;
        while(bn>0){
            int cnt = bn%10;
            ans += (cnt*pow);
            bn /= 10;
            pow *= 2;
        }
        System.out.println(ans);
    }
}