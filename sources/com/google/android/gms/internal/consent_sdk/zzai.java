package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes5.dex */
final class zzai {
    private Application zza;

    private zzai() {
        throw null;
    }

    public final zza zza() {
        zzdq.zzb(this.zza, Application.class);
        return new zzah(this.zza);
    }

    public final zzai zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }

    public /* synthetic */ zzai(zzal zzalVar) {
    }
}
