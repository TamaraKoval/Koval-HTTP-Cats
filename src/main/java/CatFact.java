import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {

    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public CatFact(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        if (upvotes == null) {
            this.upvotes = 0;
        } else {
            this.upvotes = upvotes;
        }
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Факт от " + user + " про " + type + ": " + text;
    }
}
