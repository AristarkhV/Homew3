package App;

public class StringRole {

    public String[] SortRole(String[] text, String[] roles) {

        String[] newText = new String[roles.length * 2];

        for (int i = 0; i < roles.length; i++) {
            vewText[i] = roles[i];
        }
        for (int i = roles.length; i < roles.length * 2; i++) {
            StringBuilder buffer = new StringBuilder();
            buffer.append("\n")
                    .append(roles[i - roles.length])
                    .append(": \n");
            for (int j = 0; j < text.length; j++) {
                if (text[j].startsWith(roles[i - roles.length])) {
                    buffer
                            .append(text[j].replace(roles[i - roles.length], Integer.toString(j + 1)).replace(':', ')'))
                            .append("\n");
                    newText[i] = buffer.toString();
                }
            }
        }
        return newText;
    }
}
