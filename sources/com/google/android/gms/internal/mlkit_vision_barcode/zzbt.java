package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* loaded from: classes5.dex */
class zzbt extends zzdh {
    final /* synthetic */ zzbv zza;

    public zzbt(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdh
    public final zzdg zza() {
        return this.zza;
    }
}
