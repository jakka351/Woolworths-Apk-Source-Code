package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class zzfy extends zzfs {

    @Nullable
    private zzge zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfy() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        String str = zzeo.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        zzf(zzgeVar);
        this.zza = zzgeVar;
        Uri uriNormalizeScheme = zzgeVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzghc.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzeo.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzas.zza("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw zzas.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = zzgeVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzgb(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzgeVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzg(zzgeVar);
        return j2 != -1 ? j2 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        zzge zzgeVar = this.zza;
        if (zzgeVar != null) {
            return zzgeVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
