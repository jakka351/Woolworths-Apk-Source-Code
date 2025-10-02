package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqlqllq {
    public static final String a00610061a006100610061 = "trsp";
    private static final String a0061aa006100610061 = "TMCNG_";
    private static final String aa0061a006100610061 = "TMJRS_";
    private static final String aaaa006100610061 = lqlqqll.u00750075u00750075u(lqlqllq.class);

    public static String g00670067gg0067gg(@Nonnull String str) {
        return a.A(a0061aa006100610061, str);
    }

    private static boolean g0067g0067g0067gg() {
        return (nnlllnn.nllllln.f00660066f0066f0066() && nnlllnn.nllllln.fff00660066f0066()) ? false : true;
    }

    public static String ggg0067g0067gg(@Nonnull String str) {
        return a.A(aa0061a006100610061, str);
    }

    public boolean g006700670067g0067gg(@Nonnull SharedPreferences sharedPreferences, @Nonnull String str, @Nullable List<String> list) {
        String str2;
        String str3;
        if (list == null || list.isEmpty()) {
            str2 = aaaa006100610061;
            str3 = "Invalid input";
        } else {
            String strJ006Aj006A006Aj006A = lqlqqql.j006Aj006A006Aj006A(llqllqq.gg0067gggg0067(list, ";", true), str);
            if (!llqllqq.ggggggg0067(strJ006Aj006A006Aj006A)) {
                SharedPreferences.Editor editorFff0066ff0066 = nnlllnn.nllllln.fff0066ff0066(sharedPreferences);
                if (editorFff0066ff0066 == null) {
                    return false;
                }
                nnlllnn.nllllln.f0066006600660066f0066(g00670067gg0067gg(str), strJ006Aj006A006Aj006A, editorFff0066ff0066);
                return editorFff0066ff0066.commit();
            }
            str2 = aaaa006100610061;
            str3 = "Failed to encode paths";
        }
        lqlqqll.llqqqll.uuu0075uuu(str2, str3);
        return false;
    }

    @Nullable
    public String gg00670067g0067gg(@Nonnull SharedPreferences sharedPreferences, @Nonnull String str) {
        SharedPreferences.Editor editorFff0066ff0066;
        String strGgg0067g0067gg = ggg0067g0067gg(str);
        String strF0066ff0066f0066 = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences, strGgg0067g0067gg, null);
        if (strF0066ff0066f0066 == null || (editorFff0066ff0066 = nnlllnn.nllllln.fff0066ff0066(sharedPreferences)) == null) {
            return null;
        }
        nnlllnn.nllllln.f0066006600660066f0066(strGgg0067g0067gg, null, editorFff0066ff0066);
        editorFff0066ff0066.apply();
        return strF0066ff0066f0066;
    }

    @Nonnull
    public String gggg00670067gg(@Nonnull Context context, @Nonnull String str, @Nullable List<String> list) {
        if (context == null || llqllqq.ggggggg0067(str) || g0067g0067g0067gg()) {
            lqlqqll.llqqqll.yy00790079007900790079(aaaa006100610061, "Invalid SharedPreferences state");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(a00610061a006100610061, 0);
        g006700670067g0067gg(sharedPreferences, str, list);
        String strGg00670067g0067gg = gg00670067g0067gg(sharedPreferences, str);
        return strGg00670067g0067gg == null ? "" : strGg00670067g0067gg;
    }
}
