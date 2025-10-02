package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class llqllqq {
    private static final int g0067ggggg = 8;

    @Nullable
    private static final MessageDigest m006D006D006D006Dm006D;
    private static final Pattern m006D006D006Dm006D006D;
    public static final int m006D006Dm006D006D006D = 255;
    private static final int m006D006Dmm006D006D = 262144;
    private static final char[] m006Dm006D006D006D006D;
    private static final String m006Dm006D006Dm006D;
    private static final Pattern m006Dm006Dm006D006D;

    @Nullable
    private static final SecureRandom m006Dmm006D006D006D;

    @Nullable
    private static final MessageDigest m006Dmmm006D006D;
    private static final int mm006D006D006D006D006D = 5;
    private static final char[] mm006D006D006Dm006D;
    private static final Pattern mm006D006Dm006D006D;
    public static final int mm006Dm006D006D006D = -1;
    private static final int mm006Dmm006D006D = 128;
    public static final int mmm006D006D006D006D = 8;
    private static final Pattern mmm006Dm006D006D;
    private static final String mmmm006D006D006D = "special promotion";

    @Nullable
    private static final MessageDigest mmmmm006D006D;

    static {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        String strU00750075u00750075u = lqlqqll.u00750075u00750075u(llqllqq.class);
        m006Dm006D006Dm006D = strU00750075u00750075u;
        mm006D006D006Dm006D = "0123456789abcdef".toCharArray();
        mmm006Dm006D006D = Pattern.compile("^[a-fA-F0-9]{64}$");
        m006Dm006Dm006D006D = Pattern.compile("^([0-9A-Fa-f]{2}:){0,5}([0-9A-Fa-f]{2})$");
        mm006D006Dm006D006D = Pattern.compile("^(0{1,2}:){0,5}(0{1,2})$");
        m006D006D006Dm006D006D = Pattern.compile("^[0-]+$");
        m006Dmm006D006D006D = new SecureRandom();
        lqlqqll.uuu007500750075u(strU00750075u00750075u, "Getting SHA1 digest");
        MessageDigest messageDigest3 = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            lqlqqll.llqqqll.u007500750075uuu(m006Dm006D006Dm006D, "SHA1 digest failed", e);
            messageDigest = null;
        }
        mmmmm006D006D = messageDigest;
        lqlqqll.uuu007500750075u(m006Dm006D006Dm006D, "Getting MD5 digest");
        try {
            messageDigest2 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            lqlqqll.llqqqll.u007500750075uuu(m006Dm006D006Dm006D, "MD5 digest failed", e2);
            messageDigest2 = null;
        }
        m006D006D006D006Dm006D = messageDigest2;
        lqlqqll.uuu007500750075u(m006Dm006D006Dm006D, "Getting SHA256 digest");
        try {
            messageDigest3 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e3) {
            lqlqqll.llqqqll.u007500750075uuu(m006Dm006D006Dm006D, "SHA256 digest failed", e3);
        }
        m006Dmmm006D006D = messageDigest3;
        m006Dm006D006D006D006D = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '='};
    }

    private llqllqq() {
    }

    public static boolean g006700670067006700670067g(@Nullable String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    @Nonnull
    public static String g0067006700670067g0067g(@Nonnull byte[] bArr) {
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = mm006D006D006Dm006D;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            if (i < bArr.length - 1) {
                cArr[i2 + 2] = ':';
            }
        }
        return new String(cArr);
    }

    public static String g0067006700670067gg0067(String str) {
        return str != null ? str.toLowerCase(Locale.US) : str;
    }

    @Nullable
    public static String g006700670067g00670067g(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, boolean z) {
        String lowerCase;
        if (ggggggg0067(str) || ggggggg0067(str3)) {
            return null;
        }
        if (ggggggg0067(str2)) {
            return str;
        }
        if (z) {
            lowerCase = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            lowerCase = str;
        }
        int iIndexOf = lowerCase.indexOf(str2);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = lowerCase.indexOf(str3, iIndexOf + 1);
        return iIndexOf2 != -1 ? str.substring(iIndexOf, iIndexOf2) : str.substring(iIndexOf);
    }

    public static String g006700670067ggg0067(@Nonnull String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length() && i < 128; i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || cCharAt == '_' || cCharAt == '/' || cCharAt == '-')) {
                sb.append(cCharAt);
                i++;
            } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = Character.toLowerCase(cCharAt);
                sb.append(cCharAt);
                i++;
            }
        }
        return sb.toString();
    }

    public static boolean g00670067g006700670067g(@Nullable String str) {
        return (!g006700670067006700670067g(str) || str.equals(mmmm006D006D006D) || m006D006D006Dm006D006D.matcher(str).find()) ? false : true;
    }

    @Nullable
    public static String g00670067g0067gg0067(@Nullable byte[] bArr) {
        String strGg006700670067g0067g;
        if (bArr != null && bArr.length != 0) {
            if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
                return lllqlql.h0068hhhh0068().h0068hhh00680068(bArr);
            }
            MessageDigest messageDigest = mmmmm006D006D;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] bArrDigest = messageDigest.digest();
                    messageDigest.reset();
                    strGg006700670067g0067g = gg006700670067g0067g(bArrDigest);
                }
                return strGg006700670067g0067g;
            }
        }
        return null;
    }

    @Nullable
    public static String g00670067gg00670067g(String... strArr) {
        if (strArr == null || strArr.length % 2 > 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("{\"");
        for (int i = 0; i < strArr.length - 1; i += 2) {
            int i2 = i + 1;
            if (g006700670067006700670067g(strArr[i2])) {
                if (i > 0) {
                    sb.append("\",\"");
                }
                sb.append(strArr[i]);
                sb.append("\":\"");
                sb.append(strArr[i2]);
            }
        }
        sb.append("\"}");
        return sb.toString();
    }

    public static boolean g00670067gg0067g0067(@Nullable String str) {
        return g006700670067006700670067g(str) && mmm006Dm006D006D.matcher(str).find();
    }

    @Nullable
    public static byte[] g00670067gggg0067(@Nullable String str) {
        if (ggggggg0067(str)) {
            return null;
        }
        if (!lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            return g0067g0067ggg0067(str);
        }
        String strHh006800680068h0068 = lllqlql.h0068hhhh0068().hh006800680068h0068(str);
        if (ggggggg0067(strHh006800680068h0068)) {
            return null;
        }
        return strHh006800680068h0068.getBytes(StandardCharsets.UTF_8);
    }

    public static boolean g0067g0067006700670067g(@Nullable String str) {
        return g006700670067006700670067g(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g0067g00670067g0067g(byte[] r18) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqllqq.g0067g00670067g0067g(byte[]):java.lang.String");
    }

    @Nullable
    public static String g0067g00670067gg0067(@Nullable byte[] bArr) {
        String strGg006700670067g0067g;
        if (bArr != null && bArr.length != 0) {
            if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
                return lllqlql.h0068hhhh0068().hh0068hh00680068(bArr);
            }
            MessageDigest messageDigest = m006Dmmm006D006D;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] bArrDigest = messageDigest.digest();
                    messageDigest.reset();
                    strGg006700670067g0067g = gg006700670067g0067g(bArrDigest);
                }
                return strGg006700670067g0067g;
            }
        }
        return null;
    }

    @Nonnull
    public static String g0067g0067g00670067g(int i) {
        String strHhh0068hh0068;
        lqlqqll.llqqqll.u0075uuuuu(m006Dm006D006Dm006D, "getting a random string with length of {} ", Integer.valueOf(i));
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068() && (strHhh0068hh0068 = lllqlql.h0068hhhh0068().hhh0068hh0068(i)) != null) {
            return strHhh0068hh0068;
        }
        byte[] bArr = new byte[(i + 1) / 2];
        m006Dmm006D006D006D.nextBytes(bArr);
        String strGg006700670067g0067g = gg006700670067g0067g(bArr);
        return strGg006700670067g0067g.length() <= i ? strGg006700670067g0067g : strGg006700670067g0067g.substring(0, i);
    }

    @Nullable
    public static byte[] g0067g0067ggg0067(@Nullable String str) {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        if (ggggggg0067(str) || (messageDigest = m006D006D006D006Dm006D) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(str.getBytes());
            bArrDigest = messageDigest.digest();
            messageDigest.reset();
        }
        return bArrDigest;
    }

    private static byte g0067gg006700670067g(char c) throws IllegalArgumentException {
        switch (c) {
            case '0':
                return (byte) 0;
            case '1':
                return (byte) 1;
            case '2':
                return (byte) 2;
            case '3':
                return (byte) 3;
            case '4':
                return (byte) 4;
            case '5':
                return (byte) 5;
            case '6':
                return (byte) 6;
            case '7':
                return (byte) 7;
            case '8':
                return (byte) 8;
            case '9':
                return (byte) 9;
            default:
                switch (c) {
                    case 'A':
                        return (byte) 10;
                    case 'B':
                        return (byte) 11;
                    case 'C':
                        return (byte) 12;
                    case 'D':
                        return (byte) 13;
                    case 'E':
                        return (byte) 14;
                    case 'F':
                        return (byte) 15;
                    default:
                        switch (c) {
                            case 'a':
                                return (byte) 10;
                            case 'b':
                                return (byte) 11;
                            case 'c':
                                return (byte) 12;
                            case 'd':
                                return (byte) 13;
                            case 'e':
                                return (byte) 14;
                            case 'f':
                                return (byte) 15;
                            default:
                                throw new IllegalArgumentException("\"" + c + "\" is not a valid hexidecimal character");
                        }
                }
        }
    }

    @Nullable
    public static String g0067gg0067gg0067(@Nullable String str) {
        if (ggggggg0067(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            if (b < 32) {
                sb.append("\\x");
                sb.append(String.format("%02x", Byte.valueOf(b)));
            } else {
                sb.append((char) b);
            }
        }
        return sb.toString();
    }

    public static String g0067ggg00670067g(Map<String, Object> map, boolean z) {
        return gg0067gg00670067g(map, z, 255);
    }

    public static String g0067ggg0067g0067(String str) {
        if (ggggggg0067(str)) {
            return null;
        }
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            return lllqlql.h0068hhhh0068().h00680068hh00680068(str);
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            lqlqqll.llqqqll.u007500750075uuu(m006Dm006D006Dm006D, "Failed url encoding", e);
            return null;
        }
    }

    @Nonnull
    public static String g0067ggggg0067(@Nonnull List<String> list, @Nonnull String str) {
        return gg0067gggg0067(list, str, false);
    }

    public static boolean gg00670067006700670067g(@Nullable String str) {
        return g006700670067006700670067g(str) && !"02:00:00:00:00:00".equals(str) && !mm006D006Dm006D006D.matcher(str).find() && m006Dm006Dm006D006D.matcher(str).find();
    }

    @Nonnull
    public static String gg006700670067g0067g(@Nonnull byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = mm006D006D006Dm006D;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Nonnull
    public static List<String> gg006700670067gg0067(@Nonnull String str, @Nonnull String str2) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf == -1) {
                break;
            }
            if (iIndexOf >= 1) {
                arrayList.add(str.substring(0, iIndexOf));
            }
            str = str.substring(str2.length() + iIndexOf);
        }
        if (!str.isEmpty()) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static int gg00670067g00670067g(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            i += b;
        }
        return i;
    }

    @Nonnull
    public static String gg00670067ggg0067() {
        lqlqqll.llqqqll.yy00790079007900790079(m006Dm006D006Dm006D, "getting UUID");
        return g0067g0067g00670067g(32);
    }

    @Nonnull
    public static byte[] gg0067g006700670067g(@Nonnull String str) throws IllegalArgumentException {
        int length = str.length() / 2;
        if (length * 2 != str.length()) {
            throw new IllegalArgumentException(a.h("\"", str, "\" has an odd number of characters"));
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (g0067gg006700670067g(str.charAt(i2 + 1)) | (g0067gg006700670067g(str.charAt(i2)) << 4));
        }
        return bArr;
    }

    public static String gg0067g0067gg0067(@Nullable byte[] bArr) {
        String strG0067g00670067g0067g;
        if (bArr != null && bArr.length != 0) {
            if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
                return lllqlql.h0068hhhh0068().hhhhh00680068(bArr);
            }
            MessageDigest messageDigest = mmmmm006D006D;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] bArrDigest = messageDigest.digest();
                    messageDigest.reset();
                    strG0067g00670067g0067g = g0067g00670067g0067g(bArrDigest);
                }
                return strG0067g00670067g0067g;
            }
        }
        return null;
    }

    public static String gg0067gg00670067g(Map<String, Object> map, boolean z, int i) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        if (i > m006D006Dmm006D006D) {
            i = m006D006Dmm006D006D;
        }
        StringBuilder sb = new StringBuilder(i <= 0 ? 128 : i);
        int length = 1;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (i != -1 && length >= i) {
                break;
            }
            String strO = a.o(new StringBuilder(",\""), entry.getKey(), "\":");
            Object value = entry.getValue();
            if (z) {
                value = g00670067g0067gg0067(String.valueOf(value).getBytes());
            }
            if (!(value instanceof Number)) {
                value = b.n(value, "\"", "\"");
            }
            StringBuilder sbS = a.s(strO);
            sbS.append(String.valueOf(value));
            String string = sbS.toString();
            if (i != -1 && string.length() + length > i) {
                break;
            }
            sb.append(string);
            length += string.length();
        }
        sb.replace(0, 1, "{").append("}");
        return sb.toString();
    }

    public static void gg0067gg0067g0067(String str, String str2, @Nonnull Map<String, String> map) {
        if (g006700670067006700670067g(str)) {
            map.put(str2, str);
        }
    }

    @Nonnull
    public static String gg0067gggg0067(@Nonnull List<String> list, @Nonnull String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (!str2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(str2);
            }
        }
        if (z && sb.length() > 0) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean ggg0067006700670067g(@Nullable String str) {
        if (ggggggg0067(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                return false;
            }
        }
        return true;
    }

    public static long ggg00670067g0067g(long j, int i) {
        if (i < 0 || i > 7) {
            return j;
        }
        int i2 = i * 8;
        long j2 = j & (~(255 << i2));
        try {
            return j2 | ((255 & ggg0067g00670067g(j2)) << i2);
        } catch (Exception unused) {
            return j2;
        }
    }

    @Nullable
    public static byte[] ggg00670067gg0067(@Nullable byte[] bArr) {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        if (bArr == null || bArr.length == 0 || (messageDigest = m006Dmmm006D006D) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            bArrDigest = messageDigest.digest();
            messageDigest.reset();
        }
        return bArrDigest;
    }

    public static int ggg0067g00670067g(long j) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i ^ ((int) ((j >> (i2 * 8)) & 255));
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = i3 & 128;
                i3 <<= 1;
                if (i5 != 0) {
                    i3 ^= 7;
                }
            }
            i = i3 & 255;
        }
        return i;
    }

    public static String ggg0067g0067g0067(@Nullable String str, @Nullable String str2) {
        if (str == null || str.length() > m006D006Dmm006D006D || str2 == null) {
            return null;
        }
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            return lllqlql.h0068hhhh0068().hh00680068h00680068(str, str2);
        }
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = str2.getBytes(charset);
        byte[] bytes3 = (bytes.length + "&").getBytes(charset);
        byte[] bArr = new byte[bytes.length + bytes3.length];
        int length = bytes2.length;
        int length2 = bytes3.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            int i4 = i2 + 1;
            int i5 = i3 + 1;
            bArr[i2] = (byte) ((bytes2[i3] & 10) ^ bytes3[i]);
            i3 = i5 >= length ? 0 : i5;
            i++;
            i2 = i4;
        }
        int length3 = bytes.length;
        int i6 = 0;
        while (i6 < length3) {
            int i7 = i2 + 1;
            int i8 = i3 + 1;
            bArr[i2] = (byte) (bytes[i6] ^ (bytes2[i3] & 10));
            i3 = i8 >= length ? 0 : i8;
            i6++;
            i2 = i7;
        }
        return gg006700670067g0067g(bArr);
    }

    @Nullable
    public static String ggg0067ggg0067(@Nullable String str) {
        if (ggggggg0067(str)) {
            return null;
        }
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            return lllqlql.h0068hhhh0068().hh006800680068h0068(str);
        }
        byte[] bArrG0067g0067ggg0067 = g0067g0067ggg0067(str);
        if (bArrG0067g0067ggg0067 == null) {
            return null;
        }
        return gg006700670067g0067g(bArrG0067g0067ggg0067);
    }

    @Nonnull
    public static List<URI> gggg006700670067g(@Nonnull List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                URI uri = new URI(it.next());
                if (uri.getScheme() != null) {
                    arrayList.add(uri);
                } else {
                    lqlqqll.llqqqll.yy00790079007900790079(m006Dm006D006Dm006D, "Failed to get url scheme from: " + uri);
                }
            } catch (URISyntaxException e) {
                lqlqqll.llqqqll.u007500750075uuu(m006Dm006D006Dm006D, "malformed check url", e);
            }
        }
        return arrayList;
    }

    public static String gggg0067gg0067(@Nonnull String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length() && i < 128; i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == '/' || cCharAt == '-'))) {
                sb.append(cCharAt);
                i++;
            }
        }
        return sb.toString();
    }

    @Nullable
    public static String ggggg00670067g(Map<String, Object> map) {
        return g0067ggg00670067g(map, false);
    }

    public static String ggggg0067g0067(String str, int i) {
        return (str == null || i < 0 || str.length() <= i) ? str : str.substring(0, i);
    }

    public static boolean ggggggg0067(@Nullable String str) {
        return str == null || str.isEmpty();
    }
}
