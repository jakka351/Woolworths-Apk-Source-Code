package com.medallia.digital.mobilesdk;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
final class a4 implements m8 {
    private static final String d = "com.medallia.digital";
    private static final int e = 3;
    protected static a4 f;
    private b c;
    private MDLogLevel b = MDLogLevel.OFF;

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f16373a = new SimpleDateFormat("dd-MM HH:mm:ss.SSS", Locale.US);

    /* loaded from: classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16374a;

        static {
            int[] iArr = new int[MDLogLevel.values().length];
            f16374a = iArr;
            try {
                iArr[MDLogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16374a[MDLogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16374a[MDLogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16374a[MDLogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16374a[MDLogLevel.FATAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str);
    }

    private a4() {
    }

    public static a4 a() {
        if (f == null) {
            f = new a4();
        }
        return f;
    }

    private void c(MDLogLevel mDLogLevel, String str) {
        int i = a.f16374a[mDLogLevel.ordinal()];
        if (i == 1) {
            Log.d(d, str);
            return;
        }
        if (i == 2) {
            Log.i(d, str);
            return;
        }
        if (i == 3) {
            Log.w(d, str);
        } else if (i == 4) {
            Log.e(d, str);
        } else {
            if (i != 5) {
                return;
            }
            Log.wtf(d, str);
        }
    }

    public static void d(String str) {
        a().b(MDLogLevel.FATAL, str);
    }

    public static void e(String str) {
        a().b(MDLogLevel.INFO, str);
    }

    public static void f(String str) {
        a().b(MDLogLevel.WARN, str);
    }

    public MDLogLevel b() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a("a4");
        f = null;
    }

    private String a(MDLogLevel mDLogLevel, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        return String.format(Locale.US, "%s [%s][%s][%s:%d]%s> %s", this.f16373a.format(new Date()), mDLogLevel.toString(), Thread.currentThread(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), stackTraceElement.getMethodName(), str);
    }

    private void b(MDLogLevel mDLogLevel, String str) {
        if (this.b.equals(MDLogLevel.OFF) || this.b.getLevel() < mDLogLevel.getLevel()) {
            return;
        }
        String strA = a(mDLogLevel, str);
        c(mDLogLevel, strA);
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(strA);
        }
    }

    public static void c(String str) {
        a().b(MDLogLevel.ERROR, str);
    }

    public static void b(String str) {
        a().b(MDLogLevel.DEBUG, str);
    }

    public void a(MDLogLevel mDLogLevel) {
        this.b = mDLogLevel;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public static void a(String str) {
        a().b(MDLogLevel.DEBUG, YU.a.A("Clear and Disconnect - ", str));
    }
}
