package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes5.dex */
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public /* synthetic */ zzhc(MediaCodec.CryptoInfo cryptoInfo, byte[] bArr) {
        this.zza = cryptoInfo;
    }

    public final /* synthetic */ void zza(int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i, i2);
        this.zza.setPattern(pattern);
    }
}
