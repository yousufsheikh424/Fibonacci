public class CharacterOccurence {
        public static void main(String[] args) {
            String str = "mohammed";
            int totalcount = str.length();  /*counting the length of all characters*/
            int totalcount_afterremovem = str.replace("m", "").length(); /*counting the length of characters after removing s*/
            int count = totalcount-totalcount_afterremovem;
            System.out.println("Total occurance of m is: " + count);
        }
    }
