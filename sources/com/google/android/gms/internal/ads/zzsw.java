package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzsw extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzst zzc;

    @Nullable
    public final String zzd;

    public zzsw(zzu zzuVar, @Nullable Throwable th, boolean z, int i) {
        String string = zzuVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzuVar.zzo;
        int iAbs = Math.abs(i);
        this(string2, th, str, false, null, YU.a.n(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs), null);
    }

    public final /* synthetic */ zzsw zza(zzsw zzswVar) {
        return new zzsw(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzswVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzsw(zzu zzuVar, @Nullable Throwable th, boolean z, zzst zzstVar) {
        String str = zzstVar.zza;
        int length = str.length();
        String string = zzuVar.toString();
        this(androidx.constraintlayout.core.state.a.l(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th, zzuVar.zzo, false, zzstVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsw(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable zzst zzstVar, @Nullable String str3, @Nullable zzsw zzswVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzstVar;
        this.zzd = str3;
    }
}
