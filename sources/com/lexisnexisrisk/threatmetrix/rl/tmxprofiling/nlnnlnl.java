package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class nlnnlnl {
    private static final String e0065eeeee = "android.permission.";
    private static final String ee0065eeee = "java.lang.SecurityException: ";
    private static final Set<String> w0077w0077007700770077 = new HashSet();
    private static final Object ww00770077007700770077 = new Object();

    private nlnnlnl() {
    }

    public static String d006400640064d0064d() {
        String string;
        synchronized (ww00770077007700770077) {
            try {
                Set<String> set = w0077w0077007700770077;
                string = set.isEmpty() ? "" : set.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static void d00640064dd0064d(Exception exc) {
        if (exc instanceof SecurityException) {
            String strG006700670067g00670067g = llqllqq.g006700670067g00670067g(exc.toString(), e0065eeeee, " ", true);
            if (llqllqq.g006700670067006700670067g(strG006700670067g00670067g)) {
                d0064d0064d0064d(strG006700670067g00670067g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d0064d0064d0064d(java.lang.String r4) {
        /*
            java.lang.String r0 = "\""
            java.lang.String r1 = "android.permission."
            int r1 = r4.indexOf(r1)
            if (r1 != 0) goto L11
            r1 = 19
        Lc:
            java.lang.String r4 = r4.substring(r1)
            goto L1c
        L11:
            java.lang.String r1 = "java.lang.SecurityException: "
            int r1 = r4.indexOf(r1)
            if (r1 != 0) goto L1c
            r1 = 29
            goto Lc
        L1c:
            java.lang.Object r1 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnnlnl.ww00770077007700770077
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnnlnl.w0077w0077007700770077     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r3.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L37
            r2.add(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnnlnl.d0064d0064d0064d(java.lang.String):void");
    }

    public static void dd00640064d0064d(String str, String str2) {
        lqlqqll.llqqqll.u0075uuuuu(str2, "User refuse granting permission {}", str);
        d0064d0064d0064d(str);
    }

    public static void dd0064dd0064d(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            d0064d0064d0064d(it.next());
        }
    }

    public static void ddd0064d0064d(Exception exc, String str) {
        lqlqqll.llqqqll.u0075uuuuu(str, "User refuse granting permission {}", exc.toString());
        d00640064dd0064d(exc);
    }

    public static void dddd00640064d() {
        synchronized (ww00770077007700770077) {
            w0077w0077007700770077.clear();
        }
    }
}
