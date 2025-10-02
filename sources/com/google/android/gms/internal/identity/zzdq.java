package com.google.android.gms.internal.identity;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzs;

/* loaded from: classes5.dex */
final class zzdq extends zzs {

    @GuardedBy
    private ListenerHolder zza;

    public zzdq(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.zza;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.zza = listenerHolder;
        }
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        listenerHolder.notifyListener(new zzdp(this, deviceOrientation));
    }

    public final synchronized void zze() {
        this.zza.clear();
    }
}
