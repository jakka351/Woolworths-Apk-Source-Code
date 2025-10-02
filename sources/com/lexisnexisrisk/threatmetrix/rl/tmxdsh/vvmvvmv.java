package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class vvmvvmv {
    public static int i006900690069i00690069 = 1;
    public static int i0069i0069i00690069 = 79;
    public static int ii00690069i00690069 = 0;
    public static int iiii006900690069 = 2;
    private static Set<String> w007700770077w00770077;
    private static final String w0077ww007700770077 = vvvmmvm.n006E006En006Enn("2>7DD=;\u0004I=MGFORG0.p", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588015)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843029)));
    private static final Object wwww007700770077;

    static {
        HashSet hashSet = new HashSet();
        int i = i0069i0069i00690069;
        if (((i006900690069i00690069 + i) * i) % iiii006900690069 != ii00690069i00690069) {
            i0069i0069i00690069 = 28;
            ii00690069i00690069 = i0069ii006900690069();
        }
        w007700770077w00770077 = hashSet;
        wwww007700770077 = new Object();
    }

    private vvmvvmv() {
    }

    public static Set<String> h00680068hhhh() {
        HashSet hashSet = new HashSet();
        synchronized (wwww007700770077) {
            try {
                if (!w007700770077w00770077.isEmpty()) {
                    hashSet.addAll(w007700770077w00770077);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public static void hh0068hhhh(Exception exc) {
        if (exc instanceof SecurityException) {
            String strH0068hhhh0068 = vmmvmmv.h0068hhhh0068(exc.toString(), vvvmmvm.n006E006En006Enn("`napje](g]gc\\gd[^^\u001b", (char) (vmmmvvm.hh0068h006800680068() ^ 263258529), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843029))), vvvmmvm.n006En006E006Enn("J", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843165)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587910)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496241))), true);
            if (vmmvmmv.hh0068hhh0068(strH0068hhhh0068)) {
                synchronized (wwww007700770077) {
                    w007700770077w00770077.add(strH0068hhhh0068);
                }
            }
        }
    }

    public static int i0069ii006900690069() {
        return 57;
    }
}
