public class CountVowels {
    public long count(String sentence) {
        return sentence.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}

