package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes5.dex */
final class zztg implements zzte {
    private final int zza;

    @Nullable
    private MediaCodecInfo[] zzb;

    public zztg(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.zza = i;
    }

    @EnsuresNonNull
    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final MediaCodecInfo zzb(int i) {
        zzf();
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
