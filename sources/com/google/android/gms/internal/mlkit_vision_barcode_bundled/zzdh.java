package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes5.dex */
final class zzdh extends zzdj {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzdh(byte[] bArr, int i, int i2, boolean z, zzdg zzdgVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i) throws zzer {
        int i2 = this.zzd;
        this.zzd = 0;
        int i3 = this.zzb + this.zzc;
        this.zzb = i3;
        if (i3 <= 0) {
            this.zzc = 0;
            return i2;
        }
        this.zzc = i3;
        this.zzb = 0;
        return i2;
    }
}
