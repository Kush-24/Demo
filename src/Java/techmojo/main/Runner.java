package Java.techmojo.main;

import java.util.List;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		List<String> twts=Java.techmojo.util.Twitterdata.getTweets(); // return list of tweets
		Map<String,Integer> data=Java.techmojo.dao.TweetHandler.getTweetDS(twts); // map (#hastag -> freq )
	
		List<String> toptwts=Java.techmojo.dao.TweetHandler.getTopNHashtag(data, 1); // top n hastags which used most.
		
		toptwts.forEach(s-> System.out.println(s));
		
		System.out.println("end..");
		
	}

}
