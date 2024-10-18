/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

/**
 *
 * @author Mohammad
 */
class Q1{
    int times = 0;
    
    void divide(int a, int b){
        if(a < b)
            System.out.println(times);
        else{
            times++;
            divide(a-b,b);
        }
    }
}
class Q2{
    int[]arr = {1,3,4,5,7};
    int i=0,sum = 0;
    
    void avg( int i){
        if(i == arr.length)
            sum /= arr.length;
        else{
            sum += arr[i];
            avg(++i);
        }
    }
}
class Q3{
    int[] arr = {1,8,3,4,9};
    int i =0;
    
    void reverse(int[] arr, int i){
        if(arr.length % 2 == 0 ){
            if( i < (arr.length / 2)){
                int x = arr[i];
                int length = arr.length - 1;
                arr[i] = arr[length-i];
                arr[length-i] = x;
                reverse(arr, ++i);
            }
        }
        else{
            if( i <= (arr.length / 2)){
                int x = arr[i];
                int length = arr.length - 1;
                arr[i] = arr[length-i];
                arr[length-i] = x;
                reverse(arr, ++i);
            }
        }
    }
}
class Q4{
    int[] arr = new int[16];
    int num;
    Q4(int num){
        binary(num,15);
        
        for(int i=0;i<16;i++){
            if(i == 15)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i]);
        }
    }
    void binary (int num,int i){
        if(i>=0){
            if(num % 2 == 0)
                arr[i] = 0;
            
            else
                arr[i]=1;
            
            
            binary(num/2,i-1);
            
        }
    }
}
class Q5{
    int x;
    int n;
    Q5(int arr[], int n){
        this.n = n;
        int i=0;
        x = arr[i];
        max(arr,0);
        
        System.out.println(x);
        
        
    }
    void max(int arr[], int i){
        if(i < n){
            if(arr[i] >= x)
                x = arr[i];
            max(arr,++i);
        }
    }
}

class Q6{
    int ans = 0;
    Q6(int a,int b){
        
        times(a,b);
        
        System.out.println(ans);
    }
    
    void times(int a, int b){
        if(b>0){
            ans+=a;
            times(a,b-1);
        }
    }
}
class Q7{
    int n;
    int a,b;
    Q7(int a, int b){
        this.a=a;
        this.b=b;
        
        n = a;
        big(n);
        
        System.out.println(n);
        
    }
    
    void big(int n){
        if(a%n != 0 || b%n != 0){
            big(n-1);
        }
        else{
            this.n = n;
        }
        
    }
}

class Q8{
    int n;
    Q8(int n){
        this.n = n;
        
        table(n);
    }
    void table(int n){
        int i=0;
        for(i = i;i<=1;i++){
            if(n>1){
                table(n-1);
            }
            if(n == this.n)
                System.out.println(i);
            else
                System.out.printf("%d ", i);
            
            i++;
            break;
        }
        
    }
}
class Q9{
    int n;
    int sum = 0;
    Q9(int n){
        this.n = n;
        
        fact(1);
        System.out.println(sum);
    }
    
    void fact(int n){
        int times = 1;
        if(n !=this.n){
            fact(n+1);
        }
        for(int i=1;i<=n;i++){
            times *= i;
        }
        sum+=times;
    }
}
class Q10{
    int n;
    double sum = 0;
    Q10(int n){
        this.n = n;
        
        fact(1);
        System.out.println(sum);
    }
    
    void fact(int n){
        double times = 1;
        if(n !=this.n){
            fact(n+1);
        }
        for(int i=1;i<=n;i++){
            times *= i;
        }
        double x = 1/times;
        sum+=x;
    }
}
class Q13{
    
    Q13(int n){
        towerOfHanoi(n, 'S', 'D', 'A');
    }
    
    static void towerOfHanoi(int n, char from,
                             char to, char mid)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from, mid, to);
        System.out.println(from + " -> "
                           + to);
        towerOfHanoi(n - 1, mid, to, from);
    }
}
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q13 t = new Q13(2);
    }
    
}
