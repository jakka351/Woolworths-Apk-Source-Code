package au.com.woolworths.pay.internal.util;

import android.util.Log;

/* loaded from: classes4.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9188a;

    public Logger(boolean z) {
        this.f9188a = z;
    }

    public final void a(String str) {
        if (this.f9188a) {
            Log.d("PaySDK", str);
        }
    }

    public final void b(String str, String str2) {
        if (this.f9188a) {
            Log.d(str, str2);
        }
    }
}
