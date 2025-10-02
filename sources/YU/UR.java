package YU;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public class UR {

    /* renamed from: a, reason: collision with root package name */
    public static int f22a = 5362;
    public static String b = a("r|JAlAYTLqR~S");
    public static String c = a("r|JAlAYTLqR~Syp}tpl?Saxc),");
    public static String d = a("Yj");
    public static char[] e;

    public static /* synthetic */ String a(String str) {
        if (e == null) {
            e = new char[32767];
            int i = 3;
            int i2 = 0;
            while (i2 < 32767) {
                i = ((i + (i ^ i2)) + 46) % 63;
                e[i2] = (char) i;
                i2++;
                if ((f22a ^ 5362) != 0) {
                    while (f22a + 39 != 52) {
                    }
                    while (true) {
                        f22a = ((f22a * 28) >> 60) * 19;
                    }
                }
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ e[i3])));
        }
        return new String(cArr);
    }

    public static long b(int i, long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i2 = (int) j;
        int i3 = (int) (j >> 32);
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i3 ^ (((i << i4) | (i >>> (32 - i4))) ^ i2);
            i4++;
            int i6 = i2;
            i2 = i5;
            i3 = i6;
        }
        long j2 = (i3 << 32) | (i2 & 4294967295L);
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        O.c(b, c + jUptimeMillis2 + d, new Throwable[0]);
        return j2;
    }
}
