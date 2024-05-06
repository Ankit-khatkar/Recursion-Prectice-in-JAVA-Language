import javax.print.DocFlavor;
import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;

class Questions {

    //    Question:- 01
    public Integer sumof_N(int n) {
        if (n == 1) {
            return n;
        }
        int smallans = sumof_N(n - 1);
        return n + smallans;

    }

    //    Question:- 02
    public Integer GCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return GCD(m, n % m);
    }
//    Question:- 03

    //    first method-----
    public Integer count_DGT$1(int n, int idx) {
        if (n == 0) {
            return idx;
        }
        return count_DGT$1(n / 10, idx + 1);
    }

    //    second method-----
    public Integer count_DGT$2(int n) {
        int ans = 0;

//        here is our base case
        if (n >= 1 && n <= 9) {
            ans++;
            return ans;
        }

//        recursive work
        int smallans = count_DGT$2(n / 10);

//        self work
        ans += 1 + smallans;
        return ans;
    }

    //    Question:- 04
    public Integer Armstrong_Num(int n, int m) {

//        here we get the tatal digits of input  number.
        int digits = count_DGT$2(m);

//        base condition
        if (n >= 1 & n <= 9) {
            return (int) Math.pow(n, digits);
        }

//        Recursive work and self work
        return Armstrong_Num(n / 10, m) + (int) Math.pow(n % 10, digits);
    }

    //    Question:- 05
    public Integer product_NUM(int m, int n) {
//        Base condition----
        if (n == 1) {
            return m;
        } else if (n > m) {
            return product_NUM(n, m);
        }
//        recursive work-----
        int smallans = product_NUM(m, n - 1);

//        self work----
        return m + smallans;
    }

    //    Question:- 06
    public boolean check_prime(int x, int y) {
        if (y == x) {
            return false;
        }
//        Base condtition-----
        if (y == 1) {
            return true;
        }
//       self work----
        if (x % y == 0) {
            return false;
        }

//        Recursive work---
        return check_prime(x, y - 1);
    }

    //    Question:- 07 (could not done it)
    public ArrayList<Integer> print_arr(int[] arr, int idx) {
        ArrayList<Integer> new_arr = new ArrayList<>();
//       base condition
        if (idx < 0) {
            return new ArrayList<>();
        }
        new_arr.add(arr[idx]);
//        recursive work---
        ArrayList<Integer> smallans = print_arr(arr, idx - 1);

        return new_arr;
    }

    //    Question:- 08
    public Integer MaxVal(int[] arr, int idx) {
        if (arr.length == 0) {
            return null;
        }
        int R_Big = Integer.MIN_VALUE;
//        Base case-----
        if (idx == 0) {
            return arr[idx];
        }
//        Recursive work-----
        if (arr[idx] >= R_Big) {
            R_Big = arr[idx];
        }
        int smallans = MaxVal(arr, idx - 1);
//        Self work---------
        return Math.max(smallans, R_Big);
    }

    //    Question:- 09
    public void isPrime(int n, int m) {
//        Base condition------
        if (m == 1) {
            System.out.println("Prime");
            return;
        }
//        self work---
        if (n % m == 0) {
            System.out.println("Not a Prime");
            return;
        }
//        recursive work---
        isPrime(n, m - 1);
    }

    //    Question:- 10
    public StringBuilder Get_Binary(int x) {
        StringBuilder new_str = new StringBuilder();
        if (x < 0) {
            return new StringBuilder("Invalid input not allowed");
        }
//        base condition--
        if (x < 1) {
            int lst = x % 2;
            return new StringBuilder(lst);
        }
//        get reminder of present value of x--
        int remainder = x % 2;
//        recursive work-----
        StringBuilder smallans = Get_Binary(x / 2);
//        self work to append string builders.
        return smallans.append(remainder);
    }

    //    Question:- 11
    public Integer power_fun(int num, int y) {
//        Base condition-----
        if (y == 1) {
            return num;
        }
        if (y < 0) {
            System.out.println("Here we assume only positive integers.");
            return null;
        }
        if (y == 0) {
            return 1;
        }
//        recursive work----
        Integer smallans = power_fun(num, y - 1);
//        Self work---
        return smallans * num;
    }

//    Question:- 12
    public StringBuilder str_arr(String[] str, int idx){
        StringBuilder lst_str=new StringBuilder();
//        here is our base condition....
        if (idx==0) {
            return lst_str.append(str[idx]);
        }
//        recursive work.....
        StringBuilder smallans=str_arr(str,idx-1);
//        here is our self work...
        return lst_str.append(str[idx]);
    }
//  Question:- 13
    public Integer getNthFibo(int n){
//       Base condition---------
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
//        Recursive Work----------
        int small_1=getNthFibo(n-1);
        int small_2=getNthFibo(n-2);
//        Self Work--------
        return small_1+small_2;
    }

//Question :- 14
    public StringBuilder get_Degits(int n){
        StringBuilder arr_list=new StringBuilder();
//        here is our base condition----
        if (n>0 && n<=9){
            return arr_list.append(n);
        }
//      recursive work------
        int rem=n%10;
        StringBuilder smallans=get_Degits(n/10);

//        self work---------
        return smallans.append(rem);

    }
//Question :- 15
    public Integer Array_Sum(Integer[] arr, int idx){
//        Base condition--------
        if (idx==0){
            return arr[idx];
        }
//        recursive work and self work-----------
        return arr[idx]+Array_Sum(arr,idx-1);
    }

//Question :- 16
    public Integer Min_val(Integer[] arr, int idx){
        if (arr.length==0){
            return null;
        }
//        Base condition-------
        if (idx==0){
            return arr[idx];
        }
        int ans=Integer.MAX_VALUE;
//        Self work------
        if (arr[idx]<=ans){
            ans=arr[idx];
        }
        int smallans=Min_val(arr,idx-1);
//        recursive work-----
        return Math.min(smallans,ans);
    }

//Question :- 17
    public Integer ArraySum(int[] arr, int idx){
//        Base condition--------
        if (idx==0){
            return arr[idx];
        }
//        Recursive work--------
        int smallans=ArraySum(arr,idx-1);

//        Self work---------
        return arr[idx]+smallans;
    }

//Question :- 18
    public Boolean checkelem(int[] arr, int idx, int target){

//       at this condition we will move on from an array with rue result.

        if (arr[idx]==target){
            return true;
        }

        if (arr[idx]==arr.length){
            return false;
        }

//        Recursvive work----------

       return checkelem(arr,idx+1,target);

    }

//Question :- 19
    public ArrayList<Integer> Get_Indices(int[] arr, int idx){
        ArrayList<Integer> my_list=new ArrayList<>();

//        Base condition--------
        if (idx==arr.length){
            return new ArrayList<>();
        }


//        Self Work---------
        my_list.add(idx);

//        recursive work---------
        ArrayList<Integer> smallans=Get_Indices(arr,idx+1);



//        Final task---------
        my_list.addAll(smallans);
        return my_list;
    }

//Question :- 20

//    public ArrayList<Integer> Get_Indicies_List(int[] arr, int start, int target, int idx) {
//
////        Could Not done it
//
//    }

//Question :- 21


//    => Method 1st
     int min_val=Integer.MIN_VALUE;
    public boolean isSorted_Asend$1(int[] arr, int idx){

//        base condition-----
        if (idx==arr.length){
            return true;
        }
//        self work---
        if (min_val<arr[idx]){
            min_val=arr[idx];
        }
        if (min_val>arr[idx]){
            return false;
        }

//        recursive work----------
        return isSorted_Asend$1(arr,idx+1);

    }

//    => Method 2st

    public boolean isSorted_Asend$2(int[] arr, int idx){
        if (idx==arr.length-1){
            return true;
        }
        if (arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted_Asend$2(arr,idx+1);
    }

//    Question :- 22

//    => Method 1st

    int max_val=Integer.MAX_VALUE;
    public boolean isSorted_Desend$1(int[] arr, int idx){
//        Base Condition---------
        if (idx==arr.length){
            return true;
        }

//        Self Work-----------
        if (arr[idx]<=max_val){
            max_val=arr[idx];
        }
        if (arr[idx]>max_val){
            return false;
        }

//        Recursive work-----
        return isSorted_Desend$1(arr,idx+1);
    }

//    => Method 2st
    public boolean isSorted_Desend$2(int[] arr, int idx){
        if (idx==arr.length){
            return true;
        }
        if (arr[idx]<arr[idx+1]){
            return false;
        }
        return isSorted_Desend$2(arr,idx+1);
    }


//    Question:-23

    StringBuilder new_str=new StringBuilder();
    public StringBuilder Reverse_STR(String str,int idx){

//        Error Handling--
        if (str.isEmpty()){
            return new StringBuilder("Empty String");
        }
//         Base condition--------
        if (new_str.length()==str.length()){
            return new_str;
        }

//        self work--------
        new_str.append(str.charAt(idx));

//        Recursive work---------
        return Reverse_STR(str,idx-1);
    }

//    Question:- 24

    public String MakeStr(String str1, String str2, int idx){
//        Base condition--------
        if (idx==str2.length()){
            return "";
        }
//      self work
//        concat_str.append(str1.charAt(idx))+""+concat_str.append(str2.charAt(idx));
//        recursive work--------
        return str1.charAt(idx)+""+str2.charAt(idx)+MakeStr(str1,str2, idx+1);
    }

//    Question:- 25

    public boolean Check_Plaindrome(String str, int s, int l){

//        Base condition-----
        if (s>=l){
            return true;
        }

//        Self Work-----
        if(str.charAt(s)!=str.charAt(l)){
            return false;
        }

//        Recursive work-----
        return Check_Plaindrome(str,s+1,l-1);
    }


//    NOTE:- This code does not apply for string plaindrome it is only for word.


//    Question :- 26

    public Integer factorial_N(int n){

//        Error Handling----
        if (n==0){
            return 1;
        }

//        Base condition-----
        if(n==1){
           return n;
        }

//        Recursive work------
        int smallans=factorial_N(n-1);

//        selfwork-----
        return n*smallans;
    }


//    Question :- 27




}




public class Recursion_Questions{
    public static void main(String[]args){
        Questions new_Q=new Questions();
        System.out.println(new_Q.factorial_N(7));
    }
}