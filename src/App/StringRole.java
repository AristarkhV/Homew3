package App;

public class StringRole {

    public String[] printTextPerRole(String[] text, String[] roles) {

        String[] newText = new String[roles.length];

        for (int i = 0; i < roles.length; i++) {
            StringBuilder buffer = new StringBuilder();
            buffer.append(roles[i])
                    .append(": \n");
            for (int j = 0; j < text.length; j++) {
                if (text[j].startsWith(roles[i])) {
                    buffer
                            .append(text[j]
                                    .replace(roles[i], (j + 1)+")")
                                    .replace("):", ")"))
                            .append("\n");
                    newText[i] = buffer.toString();
                }
            }
        }
        return newText;
    }
}
