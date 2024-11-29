public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0; i<sentences.length; i++){
            String str = sentences[i];
            int j =0;
            boolean print = false;

            while(j<str.length()){
                String word= "";
                while(j < str.length() && str.charAt(j) != ' '){
                    word += str.charAt(j);
                    j++;
                }

                for(int m = 0; m< keywords.length; m++){
                    if(word.toLowerCase().equals(keywords[m])){
                        System.out.println(str);
                        print = true;
                        break;
                    }
                }
                if(print){
                    break;
                }
                while (j < str.length() && str.charAt(j) == ' ') {
                    j++;
                }
            }
        }
    }
}
