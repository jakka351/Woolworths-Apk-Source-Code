package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzi {

    /* renamed from: a, reason: collision with root package name */
    public final String f14761a;

    public zzi(String str) {
        this.f14761a = b.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = a.i(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return b.o(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f14761a, str, objArr));
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", c(this.f14761a, str, objArr));
        }
    }
}
