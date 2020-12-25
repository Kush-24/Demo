package techmojo.main;

import java.util.List;
import java.util.Map;

import techmojo.dao.TweetHandler;
import techmojo.util.Twitterdata;

public class Runner {

	public static void main(String[] args) {
		List<String> twts=Twitterdata.getTweets(); // return list of tweets
		Map<String,Integer> data=TweetHandler.getTweetDS(twts); // map (#hastag -> freq )
		
		List<String> toptwts=TweetHandler.getTopNHashtag(data, 1); // top n hastags which used most.
		
		toptwts.forEach(s-> System.out.println(s));
		
		System.out.println("end..");
		
	}

}
