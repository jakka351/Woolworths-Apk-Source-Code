package com.medallia.digital.mobilesdk;

import android.os.Environment;
import java.text.DecimalFormat;
import java.util.Locale;

/* loaded from: classes.dex */
final class m1 {
    public static double a(long j) {
        return j / 1048576.0d;
    }

    public static String b(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        if (d > 0.0d) {
            Locale locale = Locale.US;
            return YU.a.g(decimalFormat.format(a(d)), " MB");
        }
        Locale locale2 = Locale.US;
        return "0 MB";
    }

    public static long a(double d) {
        if (d == 0.0d) {
            return 0L;
        }
        return (long) (d / 1048576.0d);
    }

    public static boolean a() {
        return Environment.isExternalStorageRemovable() && Environment.getExternalStorageState().equals("mounted");
    }
}
