package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes6.dex */
abstract class y {
    private final String b;
    private final long c;

    @GuardedBy
    private boolean e;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f14758a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j) {
        this.b = str;
        this.c = j;
    }

    public final Task a(Activity activity, int i) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                com.google.android.play.integrity.internal.s sVar = this.f14758a;
                Object[] objArr = {Integer.valueOf(i)};
                sVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", com.google.android.play.integrity.internal.s.c(sVar.f14775a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i);
                bundle.putString("package.name", this.b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
