package com.google.android.gms.internal.identity;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* loaded from: classes5.dex */
final class zzaz implements zzdr {

    @GuardedBy
    private ListenerHolder zza;

    public zzaz(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized ListenerHolder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized void zzb(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.zza;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.zza = listenerHolder;
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
    }
}
