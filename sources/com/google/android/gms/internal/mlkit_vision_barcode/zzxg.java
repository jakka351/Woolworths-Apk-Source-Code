package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.session.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
final class zzxg extends zzxn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    public zzxg(float f, float f2, float f3, float f4, float f5) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
        this.zzd = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxn) {
            zzxn zzxnVar = (zzxn) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzxnVar.zzc()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzxnVar.zze()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzxnVar.zzb()) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxnVar.zzd())) {
                int iFloatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
                zzxnVar.zza();
                if (iFloatToIntBits == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictedArea{xMin=");
        sb.append(this.zza);
        sb.append(", yMin=");
        sb.append(this.zzb);
        sb.append(", xMax=");
        sb.append(this.zzc);
        sb.append(", yMax=");
        return a.j(this.zzd, ", confidenceScore=0.0}", sb);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zza() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zze() {
        return this.zzb;
    }
}
