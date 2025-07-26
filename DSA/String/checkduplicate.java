package String;

    public class checkduplicate {
    public static void main(String[] args) {
        String name = "Jay kariya";
        int n = name.length();
        char[] ch = name.toCharArray();
        char[] temp ={};

       
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(ch[j]==ch[k]){
                    temp[j]++;
                } 
            }
        }
        for(int res : temp){
            System.out.println(res);
        }
        
    }
        
}
