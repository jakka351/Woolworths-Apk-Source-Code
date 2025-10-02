package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzuf implements zzga {
    private final zzga zza;
    private final int zzb;
    private final zzue zzc;
    private final byte[] zzd;
    private int zze;

    public zzuf(zzga zzgaVar, int i, zzue zzueVar) {
        zzghc.zza(i > 0);
        this.zza = zzgaVar;
        this.zzb = i;
        this.zzc = zzueVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            zzga zzgaVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i4 = 0;
            if (zzgaVar.zza(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iZza = zzgaVar.zza(bArr3, i4, i6);
                        if (iZza != -1) {
                            i4 += iZza;
                            i6 -= iZza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new zzef(bArr3, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i, Math.min(i3, i2));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zza.zze(zzgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        return this.zza.zzj();
    }
}
