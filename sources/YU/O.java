package YU;

import android.util.Log;

/* loaded from: classes.dex */
public class O {
    public static final O b;

    /* renamed from: a, reason: collision with root package name */
    public int f14a;

    static {
        O o = new O();
        o.f14a = 3;
        b = o;
    }

    public static void a(String str, String str2, Throwable... thArr) {
        b.d(6, str, str2, thArr);
    }

    public static void b(int i, String str, String str2) {
        String str3;
        String str4 = Z.a("[HO5") + str;
        if (str2.length() <= 4000) {
            Log.println(i, str4, str2);
            return;
        }
        int length = str2.length() / 4000;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = i2 + 1;
            int i4 = i3 * 4000;
            if (i4 >= str2.length()) {
                str3 = Z.a("Idm{\r") + i2 + Z.a("#%") + str2.substring(i2 * 4000);
            } else {
                str3 = Z.a("Idm{\r") + i2 + Z.a("#%") + str2.substring(i2 * 4000, i4);
            }
            Log.println(i, str4, str3);
            i2 = i3;
        }
    }

    public static void c(String str, String str2, Throwable... thArr) {
        b.d(4, str, str2, thArr);
    }

    public static void e(String str, String str2, Throwable... thArr) {
        b.d(5, str, str2, thArr);
    }

    public final void d(int i, String str, String str2, Throwable... thArr) {
        if (i < this.f14a) {
            return;
        }
        if (thArr.length <= 0) {
            b(i, str, str2);
            return;
        }
        b(i, str, str2 + '\n' + Log.getStackTraceString(thArr[0]));
    }
}
