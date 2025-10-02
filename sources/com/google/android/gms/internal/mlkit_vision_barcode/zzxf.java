package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.session.a;

/* loaded from: classes5.dex */
final class zzxf extends zzxm {
    private final int zzb;
    private final int zzc;
    private final float zzd;
    private final float zze;
    private final boolean zzf;
    private final float zzg;
    private final float zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final float zzl;
    private final float zzm;

    public /* synthetic */ zzxf(int i, int i2, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6, zzxe zzxeVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
        this.zze = f2;
        this.zzf = z;
        this.zzg = f3;
        this.zzh = f4;
        this.zzi = j;
        this.zzj = j2;
        this.zzk = z2;
        this.zzl = f5;
        this.zzm = f6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxm) {
            zzxm zzxmVar = (zzxm) obj;
            if (this.zzb == zzxmVar.zzh() && this.zzc == zzxmVar.zzg() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxmVar.zzd()) && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzxmVar.zzc()) && this.zzf == zzxmVar.zzl() && Float.floatToIntBits(this.zzg) == Float.floatToIntBits(zzxmVar.zzb()) && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzxmVar.zza()) && this.zzi == zzxmVar.zzj() && this.zzj == zzxmVar.zzi() && this.zzk == zzxmVar.zzk() && Float.floatToIntBits(this.zzl) == Float.floatToIntBits(zzxmVar.zze()) && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzxmVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.zzb ^ 1000003) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzg)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ ((int) this.zzi)) * 1000003) ^ ((int) this.zzj)) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzl)) * 1000003) ^ Float.floatToIntBits(this.zzm);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoZoomOptions{recentFramesToCheck=");
        sb.append(this.zzb);
        sb.append(", recentFramesContainingPredictedArea=");
        sb.append(this.zzc);
        sb.append(", recentFramesIou=");
        sb.append(this.zzd);
        sb.append(", maxCoverage=");
        sb.append(this.zze);
        sb.append(", useConfidenceScore=");
        sb.append(this.zzf);
        sb.append(", lowerConfidenceScore=");
        sb.append(this.zzg);
        sb.append(", higherConfidenceScore=");
        sb.append(this.zzh);
        sb.append(", zoomIntervalInMillis=");
        sb.append(this.zzi);
        sb.append(", resetIntervalInMillis=");
        sb.append(this.zzj);
        sb.append(", enableZoomThreshold=");
        sb.append(this.zzk);
        sb.append(", zoomInThreshold=");
        sb.append(this.zzl);
        sb.append(", zoomOutThreshold=");
        return a.j(this.zzm, "}", sb);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zze() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzl() {
        return this.zzf;
    }
}
