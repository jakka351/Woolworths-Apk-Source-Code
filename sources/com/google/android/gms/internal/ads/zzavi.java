package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzavi implements zzavl {
    final /* synthetic */ Activity zza;

    public zzavi(zzavm zzavmVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzavmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
