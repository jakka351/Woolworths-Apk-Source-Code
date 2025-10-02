package coil3;

import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Path;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UriKt {
    public static Uri a(String str) {
        String str2 = Path.e;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return new Uri(string, str2, "file", null, str);
    }

    public static final String b(Uri uri) {
        List listC = c(uri);
        String str = uri.b;
        if (listC.isEmpty()) {
            return null;
        }
        String str2 = uri.e;
        Intrinsics.e(str2);
        if (!StringsKt.W(str2, str, false)) {
            str = "";
        }
        return CollectionsKt.M(listC, uri.b, str, null, null, 60);
    }

    public static final List c(Uri uri) {
        String str = uri.e;
        if (str == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iB = StringsKt.B(str, '/', i2, 4);
            if (iB == -1) {
                iB = str.length();
            }
            String strSubstring = str.substring(i2, iB);
            Intrinsics.g(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iB;
        }
        return arrayList;
    }

    public static final String d(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    AbstractList.Companion.a(0, i2, bArr.length);
                    return new String(bArr, 0, i2, Charsets.f24671a);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    Intrinsics.g(strSubstring, "substring(...)");
                    CharsKt.b(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static Uri e(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = Path.e;
        String strQ = !Intrinsics.c(str2, q2.c) ? StringsKt.Q(str, str2, q2.c, false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strQ.length()) {
            char cCharAt = strQ.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strQ.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strQ.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strQ.substring(0, i6);
            Intrinsics.g(strSubstring2, "substring(...)");
            strSubstring = strQ.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
            Intrinsics.g(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i3 != -1) {
            strSubstring3 = strQ.substring(i3, iMin2);
            Intrinsics.g(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i4 != -1) {
            strSubstring4 = strQ.substring(i4, iMin);
            Intrinsics.g(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i2 != -1) {
            strSubstring5 = strQ.substring(i2, strQ.length());
            Intrinsics.g(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strD = strSubstring2 != null ? d(strSubstring2, bArr) : null;
        String strD2 = strSubstring != null ? d(strSubstring, bArr) : null;
        String strD3 = strSubstring3 != null ? d(strSubstring3, bArr) : null;
        if (str3 != null) {
            d(str3, bArr);
        }
        if (strSubstring5 != null) {
            d(strSubstring5, bArr);
        }
        return new Uri(strQ, str2, strD, strD2, strD3);
    }
}
