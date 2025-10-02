package YU;

import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public static String f12a = CircleProgressBar.a("JM^\"\u001f\u001c\u001a");
    public static String b = CircleProgressBar.a("lqy7\u0000LBHMEE2cVP");
    public static String c = CircleProgressBar.a("LQY\"\u0015");

    public static String a(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes(c);
            StringBuffer stringBuffer = new StringBuffer(bytes.length);
            for (byte b2 : bytes) {
                if (b2 < 33 || b2 > 126 || b2 == 34 || b2 == 37 || b2 == 39 || b2 == 44 || b2 == 92) {
                    stringBuffer.append('%');
                    char cForDigit = Character.forDigit((b2 >> 4) & 15, 16);
                    if (Character.isLetter(cForDigit)) {
                        cForDigit = (char) (cForDigit - ' ');
                    }
                    stringBuffer.append(cForDigit);
                    char cForDigit2 = Character.forDigit(b2 & 15, 16);
                    if (Character.isLetter(cForDigit2)) {
                        cForDigit2 = (char) (cForDigit2 - ' ');
                    }
                    stringBuffer.append(cForDigit2);
                } else {
                    stringBuffer.append((char) b2);
                }
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException unused) {
            return b;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(f12a).digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int c(String str) {
        if (str == null || str.trim().equalsIgnoreCase("")) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            try {
                char cCharAt = str.charAt(i2);
                if (cCharAt < 128) {
                    i += cCharAt;
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        return i;
    }
}
