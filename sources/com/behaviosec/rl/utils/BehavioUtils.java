package com.behaviosec.rl.utils;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes4.dex */
public class BehavioUtils {
    public static int g00670067006700670067gg = 2;
    public static int g0067g006700670067gg = 0;
    public static int gg0067006700670067gg = 1;
    public static int ggg006700670067gg = 19;
    private static final String jjj006A006Aj006A;

    static {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741403));
        char cR0072rrr007200722 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741256));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = ggg006700670067gg;
        if (((g0067gggg0067g() + i) * i) % g00670067006700670067gg != 0) {
            ggg006700670067gg = gggggg0067g();
            g0067g006700670067gg = 64;
        }
        jjj006A006Aj006A = uuxuuuu.pp0070p0070ppp("uGv\u001eh\b<N#Fu+", cR0072rrr00720072, cR0072rrr007200722, (char) (iR0072r0072r00720072 ^ (-1349847054)));
    }

    private BehavioUtils() {
    }

    @NonNull
    public static String compress(@NonNull String str) throws IOException {
        uuxuuuu.pp0070p0070ppp("q|y{|n{z..", (char) (ylyylll.r0072rrr00720072() ^ (-1691741186)), (char) (yyyllll.rrrr007200720072() ^ 383822067), (char) (yyyllll.rrrr007200720072() ^ 383821869));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            deflaterOutputStream.write(str.getBytes());
            int i = ggg006700670067gg;
            if (((gg0067006700670067gg + i) * i) % g00670067006700670067gg != g0067g006700670067gg) {
                ggg006700670067gg = 42;
                g0067g006700670067gg = 18;
            }
            deflaterOutputStream.close();
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return strEncodeToString;
        } catch (IOException e) {
            LogBridge.e(uuxuuuu.pppp0070ppp("j\u000f\u0013\r#\u0017\u001e\u0005\u0015\u000b\u000f\u0017", (char) (yylylll.r0072r0072r00720072() ^ (-1349847131)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800))), uuxuuuu.pp0070p0070ppp("8x]6\u0015mrXi@", (char) (ylyylll.r0072rrr00720072() ^ (-1691741379)), (char) (yllylll.r007200720072r00720072() ^ (-1146716716)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), e);
            return str;
        }
    }

    public static int g0067gggg0067g() {
        return 1;
    }

    public static int gggggg0067g() {
        return 78;
    }

    public static String merge(@NonNull List<String> list, @NonNull String str) throws Exception {
        int i = ggg006700670067gg;
        if (((gg0067006700670067gg + i) * i) % g00670067006700670067gg != g0067g006700670067gg) {
            ggg006700670067gg = 74;
            g0067g006700670067gg = gggggg0067g();
        }
        return "";
    }

    public static String merge(@NonNull List<String> list, @NonNull String str, boolean z) throws Exception {
        int i = ggg006700670067gg;
        if (((gg0067006700670067gg + i) * i) % g00670067006700670067gg != g0067g006700670067gg) {
            ggg006700670067gg = gggggg0067g();
            g0067g006700670067gg = 19;
        }
        return "";
    }
}
