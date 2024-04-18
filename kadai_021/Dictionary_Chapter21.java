package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void fMap (String s) {
	HashMap<String,String> fruitMap = new HashMap<String,String>();

	fruitMap.put("apple","りんご");
    fruitMap.put("peach","桃");
    fruitMap.put("banana","バナナ");
    fruitMap.put("lemon","レモン");
    fruitMap.put("pear","梨");
    fruitMap.put("kiwi","キウィ");
    fruitMap.put("strawberry","いちご");
    fruitMap.put("grape","ぶどう");
    fruitMap.put("muscat","マスカット");
    fruitMap.put("cherry","さくらんぼ");
    
    int cnt = 0;
    for(String key : fruitMap.keySet()) {
    	if(key.equals(s)) {
    		System.out.println(key+ "の意味は" + fruitMap.get(key));
    		break;
    	}
    	cnt++;
    }
    if(cnt >= fruitMap.size()) {
    	System.out.println(s + "は辞書に存在しません");
    }
    
  } 
}
