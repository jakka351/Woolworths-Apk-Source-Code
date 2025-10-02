package com.cyberfend.cyfsecurity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class CYFIntegrityChecker$LoggingMode {
    public static final int d;
    public static final CYFIntegrityChecker$LoggingMode e;
    public static final CYFIntegrityChecker$LoggingMode f;
    public static final CYFIntegrityChecker$LoggingMode g;
    public static final /* synthetic */ CYFIntegrityChecker$LoggingMode[] h;

    static {
        CYFIntegrityChecker$LoggingMode cYFIntegrityChecker$LoggingMode = new CYFIntegrityChecker$LoggingMode(CircleProgressBar.a("WJQJ"), 0);
        e = cYFIntegrityChecker$LoggingMode;
        CYFIntegrityChecker$LoggingMode cYFIntegrityChecker$LoggingMode2 = new CYFIntegrityChecker$LoggingMode(CircleProgressBar.a("ZJQ\\bei"), 1);
        f = cYFIntegrityChecker$LoggingMode2;
        CYFIntegrityChecker$LoggingMode cYFIntegrityChecker$LoggingMode3 = new CYFIntegrityChecker$LoggingMode(CircleProgressBar.a("\\]\\J}}edl"), 2);
        g = cYFIntegrityChecker$LoggingMode3;
        int i = d;
        if ((i ^ 8968) != 0) {
            while (true) {
                int i2 = d;
                int i3 = i2 + 26;
                if (i3 != 65) {
                    if (i3 == 110) {
                        d = (i2 % 124) * 50;
                    } else if (i3 == 269) {
                        d = (d + i2) ^ 4226;
                    }
                }
                d = ((d * 85) ^ 4637) >> 82;
                d = (d + i2) ^ 4226;
            }
        } else if (i > 8967) {
            h = new CYFIntegrityChecker$LoggingMode[]{cYFIntegrityChecker$LoggingMode, cYFIntegrityChecker$LoggingMode2, cYFIntegrityChecker$LoggingMode3};
        } else {
            while (d + 13 != 68) {
            }
            while (true) {
                d = (d ^ 6233) * 69;
            }
        }
    }

    public static CYFIntegrityChecker$LoggingMode valueOf(String str) {
        return (CYFIntegrityChecker$LoggingMode) Enum.valueOf(CYFIntegrityChecker$LoggingMode.class, str);
    }

    public static CYFIntegrityChecker$LoggingMode[] values() {
        return (CYFIntegrityChecker$LoggingMode[]) h.clone();
    }
}
