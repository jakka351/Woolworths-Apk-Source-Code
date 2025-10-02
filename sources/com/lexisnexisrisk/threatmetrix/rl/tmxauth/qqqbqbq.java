package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class qqqbqbq {
    public static int i006900690069i00690069 = 1;
    public static int ii00690069i00690069 = 0;
    public static int iiii006900690069 = 2;
    private static Set<String> w00770077w0077ww;
    private static final String w0077w00770077ww;
    private static final Object www00770077ww;

    static {
        char cQqq007100710071q = (char) (qbbqqbb.qqq007100710071q() ^ (-321957254));
        char cQq00710071q0071q = (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710747));
        if ((i0069i0069i00690069() * (i0069i0069i00690069() + i006900690069i00690069)) % iiii006900690069 != ii00690069i00690069) {
            ii00690069i00690069 = i0069i0069i00690069();
        }
        w0077w00770077ww = qqqqbbb.q0071q00710071q0071("~\r\u0004\u0013\u0011\f\bR\u0016\f\u001a\u0016\u0013\u001e\u001f\u0016\u001d\u001d]", cQqq007100710071q, cQq00710071q0071q);
        w00770077w0077ww = new HashSet();
        www00770077ww = new Object();
    }

    private qqqbqbq() {
    }

    public static Set<String> b0062b0062b0062b() {
        HashSet hashSet = new HashSet();
        synchronized (www00770077ww) {
            try {
                if (!w00770077w0077ww.isEmpty()) {
                    hashSet.addAll(w00770077w0077ww);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public static void bbb0062b0062b(Exception exc) {
        if (exc instanceof SecurityException) {
            String strB0062b00620062b0062 = qbbqbbq.b0062b00620062b0062(exc.toString(), qqqqbbb.q0071007100710071q0071("\f\u0018\r\u001a\u0016\u000f\tQ\u0013\u0007\u0013\r\b\u0011\u0010\u0005\n\bF", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710863)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710684)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694665)), qqqqbbb.q0071q00710071q0071("H", (char) (qqqbqbb.q00710071007100710071q() ^ 1589694692), (char) (qbbqqbb.qqq007100710071q() ^ (-321957276))), true);
            if (qbbqbbq.bb006200620062b0062(strB0062b00620062b0062)) {
                synchronized (www00770077ww) {
                    w00770077w0077ww.add(strB0062b00620062b0062);
                }
            }
        }
    }

    public static int i0069i0069i00690069() {
        return 85;
    }
}
