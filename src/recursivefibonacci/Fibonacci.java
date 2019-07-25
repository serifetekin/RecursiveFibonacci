/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefibonacci;

/**
 *
 * @author AYBU
 */
public class Fibonacci {
    
    public int fibonacci(int x){
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
}
