package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kuukkkk;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class kkuukkk {
    public static int g00670067006700670067g = 63;
    public static int g0067gggg0067 = 1;
    public static int gg0067ggg0067 = 2;
    public static int gggggg0067;

    @Nullable
    private static final MessageDigest h0068006800680068h0068;
    private static final String h0068h00680068h0068 = kuukkkk.cc0063ccc0063(kkuukkk.class);
    private static final char[] hh006800680068h0068 = kukuukk.kk006Bk006B006Bk(";\u0015$Aj\u001e\u000fX./YxJQ:]", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121735), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233338))).toCharArray();
    private static final Pattern hhhhh00680068 = Pattern.compile(kukuukk.kkk006B006B006Bk("8L->;r#q\u0019\u001a\u0011XnID4n", (char) (kkkkuku.kkkk006Bk006B() ^ 797363510), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121576), (char) (kkkkuku.kkkk006Bk006B() ^ 797363561)));

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(kukuukk.kkk006B006B006Bk("aWQ>DHJ", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535310)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363514), (char) (kkkkuku.kkkk006Bk006B() ^ 797363563)));
            int i = g00670067006700670067g;
            if (((g0067gggg0067 + i) * i) % gg0067ggg0067 != 0) {
                g00670067006700670067g = g00670067ggg0067();
                gggggg0067 = g00670067ggg0067();
            }
        } catch (NoSuchAlgorithmException e) {
            kuukkkk.kkkukkk.ccccc0063c(h0068h00680068h0068, kukuukk.kk006Bk006B006Bk("\n}ueggP\u0014\u0018\u0015\u0012\u001f\u001fI\u000f\t\u0010\u0012\n\b", (char) (kkkkuku.kkkk006Bk006B() ^ 797363467), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233339))), e);
            messageDigest = null;
        }
        h0068006800680068h0068 = messageDigest;
    }

    private kkuukkk() {
    }

    public static boolean c006300630063c00630063(@Nullable String str) {
        if (!c00630063cc00630063(str) || !hhhhh00680068.matcher(str).find()) {
            return false;
        }
        int i = g00670067006700670067g;
        if (((g0067gggg0067 + i) * i) % gg0067ggg0067 != 0) {
            g00670067006700670067g = 29;
            gggggg0067 = g00670067ggg0067();
        }
        return true;
    }

    public static boolean c00630063cc00630063(@Nullable String str) {
        if (str == null) {
            return false;
        }
        boolean zIsEmpty = str.isEmpty();
        int i = g00670067006700670067g;
        if (((g0067gggg0067 + i) * i) % gg0067ggg0067 != ggg0067gg0067()) {
            g00670067006700670067g = 60;
            gggggg0067 = 46;
        }
        return !zIsEmpty;
    }

    @Nullable
    public static byte[] c0063c0063c00630063(@Nullable byte[] bArr) {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        if (bArr == null || bArr.length == 0 || (messageDigest = h0068006800680068h0068) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            bArrDigest = messageDigest.digest();
            messageDigest.reset();
        }
        return bArrDigest;
    }

    @Nonnull
    public static String c0063ccc00630063(@Nonnull byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = hh006800680068h0068;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            int i3 = i2 + 1;
            char c = cArr2[b & 15];
            int i4 = g00670067006700670067g;
            if (((g0067gggg0067 + i4) * i4) % gg0067ggg0067 != gggggg0067) {
                g00670067006700670067g = g00670067ggg0067();
                gggggg0067 = g00670067ggg0067();
            }
            cArr[i3] = c;
        }
        return new String(cArr);
    }

    @Nullable
    public static byte[][] cc00630063c00630063(@Nullable List<String> list) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                g00670067006700670067g = 91;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                byte[][] bArr = new byte[list.size()][];
                for (int i = 0; i < list.size(); i++) {
                    bArr[i] = cc0063cc00630063(list.get(i));
                }
                return bArr;
            }
        }
    }

    @Nullable
    public static byte[] cc0063cc00630063(@Nullable String str) {
        if (ccc0063c00630063(str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
                while (true) {
                    try {
                        int[] iArr = new int[-1];
                    } catch (Exception unused) {
                        g00670067006700670067g = g00670067ggg0067();
                    }
                }
            } catch (NumberFormatException unused2) {
                kuukkkk.kkkukkk.c0063c00630063cc(kukuukk.kk006Bk006B006Bk(" \"%\u001d\u001a\u0013!S'#9_../%\u0015\rbG\u001e\u001f", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121784), (char) (kkkkuku.kkkk006Bk006B() ^ 797363561)), str);
                return null;
            }
        }
        return bArr;
    }

    public static boolean ccc0063c00630063(@Nullable String str) {
        if (str == null) {
            return true;
        }
        int i = g00670067006700670067g;
        if (((g0067gggg0067 + i) * i) % gg0067ggg0067 != gggggg0067) {
            g00670067006700670067g = g00670067ggg0067();
            gggggg0067 = 2;
        }
        return str.isEmpty();
    }

    public static int g00670067ggg0067() {
        return 4;
    }

    public static int ggg0067gg0067() {
        return 0;
    }
}
