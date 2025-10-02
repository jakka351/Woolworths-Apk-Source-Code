package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzhkz extends zzhlb {
    public zzhkz(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zza(Object obj, long j, byte b) {
        if (zzhlc.zzb) {
            zzhlc.zzG(obj, j, b);
        } else {
            zzhlc.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final boolean zzb(Object obj, long j) {
        return zzhlc.zzb ? zzhlc.zzx(obj, j) : zzhlc.zzy(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zzc(Object obj, long j, boolean z) {
        if (zzhlc.zzb) {
            zzhlc.zzG(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzhlc.zzH(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final byte zzh(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zzi(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }
}
