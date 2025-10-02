package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public class zzss extends zzhe {
    public final int zza;

    public zzss(Throwable th, @Nullable zzst zzstVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(zzstVar == null ? null : zzstVar.zza)), th);
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.zza = errorCode;
    }
}
