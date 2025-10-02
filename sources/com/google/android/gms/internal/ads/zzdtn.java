package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzdtn extends zzdtr {
    private long zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzdtr
    public final zzdtr zza(long j) {
        this.zza = j;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtr
    public final zzdtr zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtr
    public final zzdts zzc() {
        if (this.zzc == 3) {
            return new zzdto(this.zza, this.zzb, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
