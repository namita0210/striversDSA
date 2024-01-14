public class demo {
    
    public static void main(String[]args){
        
        String s = " Out in the, garden each fine day ";
        s = s.trim();

        String[] words = new String[s.length()];

        words = s.split("\\s+");

        for(int i = 0 ; i < words.length; i++){
            System.out.println(words[i]);
        }

    }
}
