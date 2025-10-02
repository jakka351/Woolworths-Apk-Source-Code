package lib.android.paypal.com.magnessdk.log;

import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f24899a = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: lib.android.paypal.com.magnessdk.log.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0416a {
    }

    public static void a(String str, int i, Class cls) {
        boolean z = f24899a;
        if (z) {
            if (i == 0) {
                Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 1) {
                Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i != 2) {
                if (i == 3 && z) {
                    androidx.compose.ui.input.pointer.a.v("****MAGNES DEBUGGING MESSAGE**** : ", str, cls.getSimpleName());
                    return;
                }
                return;
            }
            Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
        }
    }

    public static void b(Throwable th, Class cls) {
        boolean z = f24899a;
        if (z && z) {
            Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
        }
    }
}
