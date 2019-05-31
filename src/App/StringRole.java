package App;

public class StringRole {

    public static String printTextPerRole(String[] text, String[] roles) {

        StringBuilder buffer = new StringBuilder();

        for (String role : roles) {
            buffer.append(role + ":\n");
            for (int i = 0; i < text.length; i++) {
                if (text[i].startsWith((role) + ":")) {
                    buffer
                            .append((i + 1))
                            .append(")")
                            .append(text[i].substring(role.length() + 1))
                            .append("\n");
                }
            }
            buffer.append("\n");
        }
        return (buffer.toString());
    }
}

