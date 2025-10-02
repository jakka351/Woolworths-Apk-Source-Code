package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxlxlx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class xlxxllx {
    private static final String b006200620062bbb = xlxlxlx.t0074tt0074t0074(xlxxllx.class);
    private static final char[] bbbb0062bb;
    public static int f006600660066f00660066 = 0;
    public static int f0066ff006600660066 = 2;
    public static int ff00660066f00660066 = 96;
    public static int ffff006600660066 = 1;

    static {
        char cRr0072rrr0072 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105874);
        char cRr0072rrr00722 = (char) (jkjjkjj.rr0072rrr0072() ^ 1132105747);
        char cRrr007200720072r = (char) (jkkkjjj.rrr007200720072r() ^ 1252464210);
        int i = ff00660066f00660066;
        if (((ffff006600660066 + i) * i) % f0066ff006600660066 != 0) {
            ff00660066f00660066 = 89;
            f006600660066f00660066 = ff0066f006600660066();
        }
        bbbb0062bb = xlxllxl.r007200720072r0072r("..........UUUUUU", cRr0072rrr0072, cRr0072rrr00722, cRrr007200720072r).toCharArray();
    }

    private xlxxllx() {
    }

    public static int f0066f0066006600660066() {
        return 0;
    }

    public static int ff00660066006600660066() {
        return 2;
    }

    public static int ff0066f006600660066() {
        return 68;
    }

    public static String t0074007400740074t0074(Map<String, String> map) throws Exception {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = ff00660066f00660066;
        if (((ffff006600660066 + i) * i) % f0066ff006600660066 != 0) {
            ff00660066f00660066 = ff0066f006600660066();
            f006600660066f00660066 = ff0066f006600660066();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strT00740074tt00740074 = t00740074tt00740074(entry.getValue());
            String strT00740074tt007400742 = t00740074tt00740074(entry.getKey());
            if (ttttt00740074(strT00740074tt007400742) && ttttt00740074(strT00740074tt00740074)) {
                if (sb.length() > 0) {
                    sb.append(xlxllxl.r007200720072r0072r(lllqqql.c0063ccc0063c, (char) (jjjjkjj.rrrrrr0072() ^ 2074272753), (char) (jjjjkjj.rrrrrr0072() ^ 2074272667), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858856)));
                }
                sb.append(strT00740074tt007400742);
                sb.append(xlxllxl.r007200720072r0072r(".", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105908), (char) (jjjjkjj.rrrrrr0072() ^ 2074272560), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858860)));
                sb.append(strT00740074tt00740074);
            }
        }
        return sb.toString();
    }

    public static String t00740074tt00740074(String str) throws Exception {
        if (t0074ttt00740074(str)) {
            return null;
        }
        try {
            try {
                try {
                    return URLEncoder.encode(str, xlxllxl.r007200720072r0072r("+5}\u001dB", (char) (jkjjkjj.rr0072rrr0072() ^ 1132105970), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105965), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105816)));
                } catch (Exception e) {
                    throw e;
                }
            } catch (UnsupportedEncodingException e2) {
                String str2 = b006200620062bbb;
                int iRr0072rrr0072 = jkjjkjj.rr0072rrr0072();
                int i = ff00660066f00660066;
                if (((ffff006600660066 + i) * i) % f0066ff006600660066 != f0066f0066006600660066()) {
                    ff00660066f00660066 = 9;
                    f006600660066f00660066 = 74;
                }
                xlxlxlx.xxllxlx.e(str2, xlxllxl.r0072r0072r0072r("2\u001brWBfPO\u0004k#D9&4D\u0017\f^", (char) (iRr0072rrr0072 ^ 1132105809), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105811)), e2);
                return null;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Nonnull
    private static String t0074t00740074t0074(@Nonnull byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = ff00660066f00660066;
        if (((ffff006600660066 + i) * i) % ff00660066006600660066() != 0) {
            ff00660066f00660066 = 81;
            f006600660066f00660066 = 14;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = bbbb0062bb;
            cArr[i3] = cArr2[(b & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean t0074ttt00740074(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        int i = ff00660066f00660066;
        if (((ffff006600660066 + i) * i) % f0066ff006600660066 != f006600660066f00660066) {
            ff00660066f00660066 = ff0066f006600660066();
            f006600660066f00660066 = ff0066f006600660066();
        }
        return true;
    }

    @Nullable
    public static byte[] tt007400740074t0074(String str) throws IOException {
        if (t0074ttt00740074(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            int i = ff00660066f00660066;
            if (((ffff006600660066 + i) * i) % f0066ff006600660066 != 0) {
                ff00660066f00660066 = ff0066f006600660066();
                f006600660066f00660066 = 66;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public static byte[] tt0074tt00740074(Map<String, String> map, boolean z) throws Exception {
        byte[] bArrTt007400740074t0074 = null;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String strT0074007400740074t0074 = t0074007400740074t0074(map);
        try {
            bArrTt007400740074t0074 = tt007400740074t0074(strT0074007400740074t0074);
            int i = 4;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    ff00660066f00660066 = 12;
                    return (bArrTt007400740074t0074 == null && z) ? strT0074007400740074t0074.getBytes(StandardCharsets.UTF_8) : bArrTt007400740074t0074;
                }
            }
        } catch (IOException e) {
            xlxlxlx.xxllxlx.e(b006200620062bbb, xlxllxl.r0072r0072r0072r("v\u0016$%'-Y0.)]$.$1')d", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858846), (char) (jjjjkjj.rrrrrr0072() ^ 2074272513)), e);
        }
    }

    public static String ttt0074t00740074(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = str2.getBytes(charset);
        byte[] bytes3 = (bytes.length + xlxllxl.r007200720072r0072r("$", (char) (jjjjkjj.rrrrrr0072() ^ 2074272760), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858768), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858858))).getBytes(charset);
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
            byte b = bytes[i6];
            int i7 = ff00660066f00660066;
            if (((ffff006600660066 + i7) * i7) % f0066ff006600660066 != f006600660066f00660066) {
                ff00660066f00660066 = 56;
                f006600660066f00660066 = ff0066f006600660066();
            }
            int i8 = i2 + 1;
            int i9 = i3 + 1;
            bArr[i2] = (byte) (b ^ (bytes2[i3] & 10));
            i3 = i9 >= length ? 0 : i9;
            i6++;
            i2 = i8;
        }
        return t0074t00740074t0074(bArr);
    }

    public static boolean ttttt00740074(@Nullable String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }
}
