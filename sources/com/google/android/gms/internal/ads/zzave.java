package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzave implements zzavl {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzave(zzavm zzavmVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzavmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.zza, this.zzb);
    }
}
