package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqqlqqq {
    private static final String tttt0074tt = lqlqqll.u00750075u00750075u(lqqlqqq.class);
    private static final Pattern t0074tt0074tt = Pattern.compile("^0+$");

    private lqqlqqq() {
    }

    public static String g00670067gg006700670067(@Nonnull nlllnnl nlllnnlVar) {
        return nnlllnn.nnlllln.ff0066fff0066(nlllnnlVar.ww0077w007700770077.getContentResolver(), nnlllnn.nnlllln.w007700770077www);
    }

    private static boolean g0067g0067g006700670067(String str) {
        if (!llqllqq.ggggggg0067(str) && !str.equals("9774d56d682e549c") && str.length() >= 15 && !t0074tt0074tt.matcher(str).find()) {
            return false;
        }
        lqlqqll.llqqqll.yy00790079007900790079(tttt0074tt, "ANDROID_ID contains nothing useful: " + str);
        return true;
    }

    @Nullable
    public static String g0067ggg006700670067(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() == 32) {
            return str;
        }
        if (str.length() >= 32) {
            return llqllqq.ggg0067ggg0067(str);
        }
        String strGgg0067ggg0067 = llqllqq.ggg0067ggg0067(str);
        if (strGgg0067ggg0067 == null) {
            return null;
        }
        int length = 32 - str.length();
        if (length > strGgg0067ggg0067.length()) {
            length = strGgg0067ggg0067.length();
        }
        StringBuilder sbS = a.s(str);
        sbS.append(strGgg0067ggg0067.substring(0, length));
        return sbS.toString();
    }

    @Nullable
    public static String gg0067gg006700670067(String str) {
        if (g0067g0067g006700670067(str)) {
            return null;
        }
        lqlqqll.llqqqll.yy00790079007900790079(tttt0074tt, "using ANDROID_ID for TPC:" + str);
        return g0067ggg006700670067(str);
    }

    @Nullable
    public static String ggg0067g006700670067(lllqqql lllqqqlVar) throws InterruptedException {
        String strJ006A006Aj006A006Aj = null;
        if (!nnlllnn.nllllln.f00660066f0066f0066()) {
            lqlqqll.llqqqll.yy00790079007900790079(tttt0074tt, "SharedPreferences wasn't found, do not generate Software ID");
            return null;
        }
        try {
            strJ006A006Aj006A006Aj = lllqqqlVar.j006A006Aj006A006Aj("ThreatMetrixMobileSDK");
        } catch (ClassCastException unused) {
            lqlqqll.llqqqll.yy00790079007900790079(tttt0074tt, "Incompatible type for GUID");
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (!llqllqq.ggggggg0067(strJ006A006Aj006A006Aj)) {
            return strJ006A006Aj006A006Aj;
        }
        lqlqqll.llqqqll.yy00790079007900790079(tttt0074tt, "Found nothing in shared prefs, generating GUID");
        String lowerCase = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
        lllqqqlVar.j006A006Ajjj006A("ThreatMetrixMobileSDK", lowerCase);
        return lowerCase;
    }
}
