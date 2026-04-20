class Solution {
    public String reverseByType(String s) {
       char[] arr = s.toCharArray();
       int n = arr.length;
       StringBuilder words = new StringBuilder();
       StringBuilder sym = new StringBuilder();
       
       for(char c : arr){
        // iswords ki jagah isLetter use hoga
        if(Character.isLetter(c)){ 
            words.append(c);
        } else {
            sym.append(c);
                }
}
       int Lidx = words.length() - 1;
       int sindx = sym.length() - 1; 
       char[] result = new char[n];
              for(int i = 0; i < n; i++){
        if(Character.isLetter(arr[i])){
            result[i] = words.charAt(Lidx--);
        } else {
            result[i] = sym.charAt(sindx--);
        }
       }  
       
       return new String(result);      
    }
}