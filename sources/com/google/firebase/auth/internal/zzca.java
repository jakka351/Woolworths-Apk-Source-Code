package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.FirebaseApp;

/* loaded from: classes6.dex */
public final class zzca {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f15205a;
    public final zzaq b;
    public volatile boolean c;

    public zzca(FirebaseApp firebaseApp) {
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        zzaq zzaqVar = new zzaq();
        zzaq.f.v("Initializing TokenRefresher", new Object[0]);
        FirebaseApp firebaseApp2 = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        zzaqVar.d = new com.google.android.gms.internal.p002firebaseauthapi.zze(handlerThread.getLooper());
        firebaseApp2.a();
        zzaqVar.e = new zzat(zzaqVar, firebaseApp2.b);
        zzaqVar.c = 300000L;
        this.c = false;
        this.f15205a = 0;
        this.b = zzaqVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zzcd(this));
    }

    public final void a() {
        zzaq zzaqVar = this.b;
        zzaqVar.d.removeCallbacks(zzaqVar.e);
    }

    public final void b(int i) {
        if (i > 0 && this.f15205a == 0) {
            this.f15205a = i;
            if (this.f15205a > 0 && !this.c) {
                this.b.a();
            }
        } else if (i == 0 && this.f15205a != 0) {
            zzaq zzaqVar = this.b;
            zzaqVar.d.removeCallbacks(zzaqVar.e);
        }
        this.f15205a = i;
    }

    public final void c(zzahv zzahvVar) {
        if (zzahvVar == null) {
            return;
        }
        long jZza = zzahvVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = (jZza * 1000) + zzahvVar.zzb();
        zzaq zzaqVar = this.b;
        zzaqVar.f15196a = jZzb;
        zzaqVar.b = -1L;
        if (this.f15205a <= 0 || this.c) {
            return;
        }
        this.b.a();
    }
}
