import java.util.regex.Matcher;
import java.util.regex.Pattern;
//test

/**
 * Created by Yatin on 29/11/17.
 */
class EmojiEraser{

    private static final String EMOJI_RANGE_REGEX =
            "[\uD83C\uDF00-\uD83D\uDDFF]|[\uD83D\uDE00-\uD83D\uDE4F]|[\uD83D\uDE80-\uD83D\uDEFF]|[\u2600-\u26FF]|[\u2700-\u27BF]";
    private static final Pattern PATTERN = Pattern.compile(EMOJI_RANGE_REGEX);

    /**
     * Finds and removes emojies from @param input
     *
     * @param input the input string potentially containing emojis (comes as unicode stringfied)
     * @return input string with emojis replaced
     */
    public String eraseEmojis(String input) {

        Matcher matcher = PATTERN.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "");
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
