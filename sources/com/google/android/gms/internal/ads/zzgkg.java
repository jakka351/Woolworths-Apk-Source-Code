package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzgkg extends zzgic {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzghd zzb;

    public zzgkg(Iterator it, zzghd zzghdVar) {
        this.zza = it;
        this.zzb = zzghdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgic
    public final Object zza() {
        zzghd zzghdVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzghdVar = this.zzb;
            next = it.next();
        } while (!zzghdVar.zza(next));
        return next;
    }
}
