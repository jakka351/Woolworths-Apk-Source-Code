package au.com.woolworths.android.onesite.utils;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class FormValidator {
    static {
        Pattern.compile("^(?=.*[0-9]).{6,}$");
        Pattern.compile("^((0|(\\+61))4)[0-9]{8}$");
    }
}
