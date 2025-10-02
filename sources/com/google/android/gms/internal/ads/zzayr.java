package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzayr implements zzayv {
    final /* synthetic */ Activity zza;

    public zzayr(zzayw zzaywVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzaywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
