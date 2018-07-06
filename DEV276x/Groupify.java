package DEV276x;

public class Groupify {
    public static String groupText(String text, int sizeOfGroups) {
        String groupedText = "";
        for (int i = 0; i < text.length(); i++) {
            if(i % sizeOfGroups == 0 ) {
                if (i == 0 && sizeOfGroups >= 2) {
                    groupedText += text.charAt(i);
                } else {
                    groupedText += ' ';
                    groupedText += text.charAt(i);
                }
            } else {
                groupedText += text.charAt(i);
            }
        }
        while ((groupedText.length() -1) - groupedText.lastIndexOf(" ") < sizeOfGroups ) {
            groupedText += 'x';
        }
        return groupedText;
    }

    public static String ungroupText(String groupedText) {
        String ungroupedText = "";
        for (int i = 0; i < groupedText.length(); i++) {
            if(groupedText.charAt(i) != ' ' && groupedText.charAt(i) != 'x') {
                ungroupedText += groupedText.charAt(i);
            }
        }
        return ungroupedText;
    }

    public static void main(String[] args) {
       String group = groupText("NOMOREWAR", 4);
       System.out.println(group);
       System.out.println(group.charAt(group.length()-1));

    }
}
