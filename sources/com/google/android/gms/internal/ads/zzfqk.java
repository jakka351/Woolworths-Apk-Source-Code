package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzfqk extends zzfqq {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfqq zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqr zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfql(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqq
    public final zzfqq zze(int i) {
        this.zzd = 1;
        return this;
    }
}
