package au.com.woolworths.android.onesite.utils;

/* loaded from: classes3.dex */
public class Objects {
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i++) {
            iCharAt = (iCharAt * 31) + str.charAt(i);
        }
        return iCharAt;
    }
}
