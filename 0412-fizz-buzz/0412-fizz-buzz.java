class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ll = new ArrayList<>();

        return Fizzbuzz(ll ,n);
    }
    public static List<String> Fizzbuzz(List<String> ll,int n){
        int  three = 1;
    int  five = 1;
    for(int  i =1;i<=n;i++){
        String  str ="";
      if(three==3){
        str+="Fizz";
        three=0;
      }
      if(five==5){
        str+="Buzz";
        five =0;
      }
      if(str==""){
        str+=i;
      }
     ll.add(str);
    
      three++;
      five++;

    }
    return ll;
    }
}