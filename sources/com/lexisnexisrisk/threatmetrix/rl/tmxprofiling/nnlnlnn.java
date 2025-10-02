package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import androidx.constraintlayout.core.state.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class nnlnlnn {
    private static final String s00730073ssss = "537.36";
    private static final String s0073sssss = "534.13";
    private static final String ss0073ssss = "534.30";

    @Nonnull
    private static final TreeMap<Integer, String> sss0073sss;
    private static final String xx00780078007800780078 = "533.1";

    static {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        sss0073sss = treeMap;
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ss0073s0073s0073), xx00780078007800780078);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s00730073s0073s0073), xx00780078007800780078);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.sss00730073s0073), xx00780078007800780078);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s0073s00730073s0073), xx00780078007800780078);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ss007300730073s0073), s0073sssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s0073007300730073s0073), ss0073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.sssss00730073), ss0073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s0073sss00730073), ss0073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ss0073ss00730073), ss0073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s00730073ss00730073), ss0073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.sss0073s00730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s0073s0073s00730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s007300730073s00730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ssss007300730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s0073ss007300730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ss0073s007300730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.s0073s0073007300730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.ss00730073007300730073), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.b0062bbbbb), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.bb0062bbbb), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.b00620062bbbb), s00730073ssss);
        treeMap.put(Integer.valueOf(nnlllnn.nnnnnln.nnlnnln.bbb0062bbb), s00730073ssss);
    }

    private nnlnlnn() {
    }

    @Nonnull
    public static String o006Foo006Fo006F(nlllnnl nlllnnlVar) {
        String strConcat;
        String str;
        String str2;
        Context context;
        TreeMap<Integer, String> treeMap = sss0073sss;
        int i = nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073;
        String strOooo006Fo006F = "";
        if (treeMap.containsKey(Integer.valueOf(i))) {
            strConcat = treeMap.get(Integer.valueOf(i));
        } else {
            Map.Entry<Integer, String> entryLastEntry = treeMap.lastEntry();
            strConcat = entryLastEntry != null ? entryLastEntry.getValue().concat("+") : "";
        }
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        String strI = !country.isEmpty() ? a.i(language, "-", country, "; ") : YU.a.g(language, "; ");
        if (i >= nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073) {
            str = "Mozilla/5.0 (Linux; Android ";
            str2 = "; wv) AppleWebKit/";
            strI = "";
        } else {
            str = "Mozilla/5.0 (Linux; U; Android ";
            str2 = ") AppleWebKit/";
        }
        if (nlllnnlVar != null && (context = nlllnnlVar.ww0077w007700770077) != null) {
            strOooo006Fo006F = oooo006Fo006F(context);
        }
        StringBuilder sbS = YU.a.s(str);
        sbS.append(nnlllnn.nnnnnln.nlnnnln.sss0073ss0073);
        sbS.append("; ");
        sbS.append(strI.toLowerCase(Locale.US));
        sbS.append(nnlllnn.nnnnnln.s0073ss00730073s);
        sbS.append(" Build/");
        a.B(sbS, nnlllnn.nnnnnln.ss00730073s0073s, str2, strConcat, " (KHTML, like Gecko) Version/4.0");
        return a.l(sbS, strOooo006Fo006F, " Mobile Safari/", strConcat, " 7.6-46 : RL");
    }

    private static String oooo006Fo006F(Context context) {
        String strFf0066f00660066f = new nnlllnn.nllnlln(context, "com.google.android.webview", 128).ff0066f00660066f();
        if (llqllqq.g006700670067006700670067g(strFf0066f00660066f)) {
            return " Chrome/".concat(strFf0066f00660066f);
        }
        String strFf0066f00660066f2 = new nnlllnn.nllnlln(context, "com.android.webview", 128).ff0066f00660066f();
        return llqllqq.g006700670067006700670067g(strFf0066f00660066f2) ? " Chrome/".concat(strFf0066f00660066f2) : "";
    }
}
