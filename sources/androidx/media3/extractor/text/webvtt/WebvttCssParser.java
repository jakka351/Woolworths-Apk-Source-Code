package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.ParsableByteArray;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class WebvttCssParser {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3395a = new ParsableByteArray();
    public final StringBuilder b = new StringBuilder();

    public static String a(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = parsableByteArray.b;
        int i2 = parsableByteArray.c;
        while (i < i2 && !z) {
            char c2 = (char) parsableByteArray.f2922a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        parsableByteArray.H(i - parsableByteArray.b);
        return sb.toString();
    }

    public static String b(ParsableByteArray parsableByteArray, StringBuilder sb) {
        c(parsableByteArray);
        if (parsableByteArray.a() == 0) {
            return null;
        }
        String strA = a(parsableByteArray, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) parsableByteArray.u());
    }

    public static void c(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.a() > 0 && z; z = false) {
                int i = parsableByteArray.b;
                byte[] bArr = parsableByteArray.f2922a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    parsableByteArray.H(1);
                } else {
                    int i2 = parsableByteArray.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            parsableByteArray.H(i2 - parsableByteArray.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
