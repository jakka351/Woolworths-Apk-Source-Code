package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.CharMatcher;
import io.jsonwebtoken.JwtParser;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class InetAddresses {

    /* renamed from: a, reason: collision with root package name */
    public static final CharMatcher f14936a = CharMatcher.j(JwtParser.SEPARATOR_CHAR);
    public static final CharMatcher b = CharMatcher.j(':');

    public static final class Scope {

        /* renamed from: a, reason: collision with root package name */
        public String f14937a;
    }

    public static final class TeredoInfo {
    }

    static {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r4 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r3 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r3 = r15.lastIndexOf(58) + 1;
        r11 = r15.substring(0, r3);
        r3 = c(r15.substring(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r3 = androidx.constraintlayout.core.state.a.i(r11, java.lang.Integer.toHexString(((r3[0] & 255) << 8) | (r3[1] & 255)), ":", java.lang.Integer.toHexString((r3[3] & 255) | ((r3[2] & 255) << 8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r2 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        r0.f14937a = r3.substring(r2 + 1);
        r3 = r3.substring(0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r2 = com.google.common.net.InetAddresses.b.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r2 < 2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r2 <= 8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r2 = r2 + 1;
        r11 = 8 - r2;
        r12 = 0;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r12 >= (r3.length() - 1)) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r3.charAt(r12) != ':') goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if (r3.charAt(r12 + 1) != ':') goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (r13 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        r13 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r12 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r13 = r11 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r12 != (r3.length() - 2)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r11 = r13;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (r3.charAt(0) != ':') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r3.charAt(1) == ':') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r3.charAt(r3.length() - 1) != ':') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
    
        if (r3.charAt(r3.length() - 2) == ':') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        if (r11 > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
    
        if (r2 == 8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        r2 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        if (r3.charAt(0) != ':') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        if (r8 >= r3.length()) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
    
        r4 = r3.indexOf(58, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0110, code lost:
    
        if (r4 != (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
    
        r4 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        if (r3.charAt(r8) != ':') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011d, code lost:
    
        if (r5 >= r11) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011f, code lost:
    
        r2.putShort(0);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0125, code lost:
    
        r5 = r4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0127, code lost:
    
        if (r5 <= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012a, code lost:
    
        if (r5 > 4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012d, code lost:
    
        if (r8 >= r4) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012f, code lost:
    
        r5 = (r5 << 4) | java.lang.Character.digit(r3.charAt(r8), 16);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
    
        r2.putShort((short) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
    
        r8 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0149, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014a, code lost:
    
        r9 = r2.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014f, code lost:
    
        if (r3 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        if (r2 == (-1)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0154, code lost:
    
        r9 = c(r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress a(java.lang.String r15) throws java.net.SocketException, java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.a(java.lang.String):java.net.InetAddress");
    }

    public static byte b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 3) {
            throw new NumberFormatException();
        }
        if (i3 > 1 && str.charAt(i) == '0') {
            throw new NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 * 10;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i4 = i5 + iDigit;
            i++;
        }
        if (i4 <= 255) {
            return (byte) i4;
        }
        throw new NumberFormatException();
    }

    public static byte[] c(String str) {
        if (f14936a.f(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIndexOf = str.indexOf(46, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i2] = b(i, iIndexOf, str);
                i = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }
}
