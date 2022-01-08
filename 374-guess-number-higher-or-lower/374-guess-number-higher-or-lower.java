/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
       int start = 1;
        while(start <= n){
            int mid = start + (n-start)/2;
            int pick = guess(mid);
            if(pick == 0){
                return mid;
            }else if(pick == -1){
                n = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return n;
        
    }
}