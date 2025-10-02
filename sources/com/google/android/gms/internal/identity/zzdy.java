package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzy;

/* loaded from: classes5.dex */
final class zzdy extends zzy {
    private final zzdr zza;

    public zzdy(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    public final zzdy zzc(ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzz
    public final void zzd(Location location) {
        this.zza.zza().notifyListener(new zzdw(this, location));
    }

    @Override // com.google.android.gms.location.zzz
    public final void zze() {
        this.zza.zza().notifyListener(new zzdx(this));
    }

    public final void zzf() {
        this.zza.zza().clear();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.zza;
    }
}
