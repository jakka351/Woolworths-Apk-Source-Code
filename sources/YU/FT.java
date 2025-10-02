package YU;

import android.os.SystemClock;
import com.cyberfend.cyfsecurity.CircleProgressBar;

/* loaded from: classes2.dex */
public class FT {

    /* renamed from: a, reason: collision with root package name */
    public static String f6a = CircleProgressBar.a("443\"\u001c\u0005\u0001\u001a\u000e\f\u00113+\u0015\u000e\u000e\u001b\u0015\u0015\u0006\u0002\u0010\r\u0017\u001f\u0000");

    public static String a() {
        int i;
        int i2;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 1; i5 < 1000000; i5++) {
                if (((4508713 % i5) * 11) % i5 == 0) {
                    i3++;
                }
                if (i5 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis > 2) {
                    break;
                }
                i4++;
            }
            int i6 = i4 / 100;
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            float f = 33.34f;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 1; i9 < 1000000; i9++) {
                f += i9;
                if ((19.239f * f) / 3.56f < 10000.0f) {
                    i7++;
                }
                if (i9 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis2 > 2) {
                    break;
                }
                i8++;
            }
            int i10 = i8 / 100;
            long jUptimeMillis3 = SystemClock.uptimeMillis();
            int i11 = 0;
            int i12 = 0;
            for (double d = 1.0d; d < 1000000; d += 1.0d) {
                if (Math.sqrt(d) > 30.0d) {
                    i11++;
                }
                if (((int) d) % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis3 > 2) {
                    break;
                }
                i12++;
            }
            int i13 = i11;
            int i14 = i12 / 100;
            long jUptimeMillis4 = SystemClock.uptimeMillis();
            int i15 = 1;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i15 >= 1000000) {
                    i = i3;
                    i2 = i7;
                    break;
                }
                i2 = i7;
                i = i3;
                if (Math.acos(i15 / 1000000) + Math.asin(i15 / 1000000) + Math.atan(i15 / 1000000) > 1.5d) {
                    i16++;
                }
                if (i15 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis4 > 2) {
                    break;
                }
                i17++;
                i15++;
                i7 = i2;
                i3 = i;
            }
            int i18 = i17 / 100;
            long jUptimeMillis5 = SystemClock.uptimeMillis();
            int i19 = 0;
            for (int i20 = 1; i20 < 1000000 && SystemClock.uptimeMillis() - jUptimeMillis5 <= 2; i20++) {
                i19++;
            }
            return i + "," + i6 + "," + i2 + "," + i10 + "," + i13 + "," + i14 + "," + i16 + "," + i18 + "," + i19;
        } catch (Exception e) {
            UB.a(e);
            return f6a;
        }
    }
}
