package exercise15.models;

import java.util.regex.Pattern;

public class RegexCheck {
    public static final Pattern regexPhoneNumber = Pattern.compile("^(090|098|091|031|035|038)([0-9]{7})$");

    public static final Pattern regexDoB = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$");

    public static final Pattern regexName = Pattern.compile("^[a-zA-Z\\s]{10,50}");
}
