package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzble extends zzblb {
    final /* synthetic */ zzbzm zza;

    public zzble(zzblf zzblfVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzblfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
