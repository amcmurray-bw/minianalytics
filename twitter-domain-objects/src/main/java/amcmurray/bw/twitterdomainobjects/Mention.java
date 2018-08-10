package amcmurray.bw.twitterdomainobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
class limits amount of information to process to just ID and the tweet text
 */
@Document(collection = "savedMentions")
public final class Mention {

    //will add date and other metrics later

    @Id
    String id;
    int queryId;
    MentionType mentionType;
    String text;

    String languageCode;
    int favouriteCount;


    public Mention(String id, int queryId, MentionType mentionType,
                   String text, String languageCode,
                   int favouriteCount) {
        this.id = id;
        this.queryId = queryId;
        this.mentionType = mentionType;
        this.text = text;
        this.languageCode = languageCode;
        this.favouriteCount = favouriteCount;
    }

    public String getId() {
        return id;
    }

    public int getQueryId() {
        return queryId;
    }

    public MentionType getMentionType() {
        return mentionType;
    }

    public String getText() {
        return text;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public int getFavouriteCount() {
        return favouriteCount;
    }

}