class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(String str: arr) {
            int n = Integer.parseInt(str);
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        return min + " " + max;
    }
}