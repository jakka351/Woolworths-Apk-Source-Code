package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzhr {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        int i5 = this.zze;
        int i6 = this.zzf;
        int i7 = this.zzg;
        int i8 = this.zzh;
        int i9 = this.zzi;
        int i10 = this.zzj;
        long j = this.zzk;
        int i11 = this.zzl;
        String str = zzeo.zza;
        Locale locale = Locale.US;
        StringBuilder sbQ = YU.a.q(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        YU.a.w(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbQ);
        YU.a.w(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbQ);
        YU.a.w(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbQ);
        YU.a.w(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbQ);
        sbQ.append(j);
        sbQ.append("\n videoFrameProcessingOffsetCount=");
        sbQ.append(i11);
        sbQ.append("\n}");
        return sbQ.toString();
    }

    public final synchronized void zza() {
    }
}
