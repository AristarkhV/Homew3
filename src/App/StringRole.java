package App;

public class StringRole {

    public String printTextPerRole(String[] text, String[] roles) {

        String[] newText = new String[roles.length];
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            buffer.delete(0, buffer.length());
            buffer.append(roles[i])
                    .append(": \n");
            for (int j = 0; j < text.length; j++) {
                if (text[j].startsWith(roles[i])) {
                    buffer
                            .append(text[j]
                                    .replace(roles[i], (j + 1) + ")")
                                    .replace("):", ")"))
                            .append("\n");
                    newText[i] = buffer.toString();
                }
            }
        }
        buffer.delete(0, buffer.length());
        for (int i = 0; i < newText.length; i++)
            buffer.append(newText[i])
                    .append("\n");
        return (buffer.toString());
    }
}
