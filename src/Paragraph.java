import java.util.Arrays;
import java.util.List;

public class Paragraph {
    public static String changeFormat(String paragraph) {

    	
    	List<String> oldParagraphList = Arrays.asList(paragraph.split("-"));
    	
    	System.out.println(oldParagraphList);
    	
    //	List<String> paragraphList = 
    	
    	
  //  	String paragraphString = String.join("/", paragraphList);
    	
//    	System.out.println(paragraphString);
    	
        
        
        return "";
    }

    public static void main(String[] args) {
        System.out.println(changeFormat("Please quote your policy number: 112-39-8552."));
    }
}