package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzayt implements zzayv {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzayt(zzayw zzaywVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzaywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
