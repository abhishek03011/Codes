import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ListVocuabulary implements Vocabulary {

	private List<String> words = new ArrayList<String>();
	
	public ListVocuabulary(Collection<String> word) {
		 this.words.addAll(words);
	        Collections.sort(this.words);
	}

	
	public boolean add(String word) {

		int pos = Collections.binarySearch(words, word);
        // pos > 0 means the word is already in the list. Insert only
        // if it's not there yet
        if (pos < 0) {
            words.add(-(pos+1), word);
            return true;
        }
        return false;
	}


	public boolean isPrefix(String prefix) {
		
		return false;
	}

	
	public boolean contains(String word) {
		// TODO Auto-generated method stub
		return false;
	}

}
