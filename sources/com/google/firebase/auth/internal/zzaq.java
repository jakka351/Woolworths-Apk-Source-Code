package com.google.firebase.auth.internal;

import androidx.camera.core.impl.b;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes6.dex */
public final class zzaq {
    public static final Logger f = new Logger("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f15196a;
    public volatile long b;
    public long c;
    public com.google.android.gms.internal.p002firebaseauthapi.zze d;
    public Runnable e;

    public final void a() {
        f.v(b.k(this.f15196a - this.c, "Scheduling refresh for "), new Object[0]);
        this.d.removeCallbacks(this.e);
        this.b = Math.max((this.f15196a - DefaultClock.getInstance().currentTimeMillis()) - this.c, 0L) / 1000;
        this.d.postDelayed(this.e, this.b * 1000);
    }
}
