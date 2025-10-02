package com.google.android.play.integrity.internal;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f14775a;

    public s(String str) {
        this.f14775a = androidx.camera.core.impl.b.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = androidx.constraintlayout.core.state.a.i(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return androidx.camera.core.impl.b.o(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", c(this.f14775a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f14775a, str, objArr));
        }
    }
}
