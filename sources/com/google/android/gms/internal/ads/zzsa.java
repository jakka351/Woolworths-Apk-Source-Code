package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzsa implements zzso {
    private final zzght zza;
    private final zzght zzb;

    public zzsa(final int i) {
        zzght zzghtVar = new zzght() { // from class: com.google.android.gms.internal.ads.zzrz
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzsb.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzght zzghtVar2 = new zzght() { // from class: com.google.android.gms.internal.ads.zzry
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzsb.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzghtVar;
        this.zzb = zzghtVar2;
    }

    public final zzsb zza(zzsn zzsnVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzsb zzsbVar;
        zzst zzstVar = zzsnVar.zza;
        String str = zzstVar.zza;
        zzsb zzsbVar2 = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzsbVar = new zzsb(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zzse(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzsnVar.zzf, null);
            } catch (Exception e) {
                exc = e;
            }
        } catch (Exception e2) {
            exc = e2;
            mediaCodecCreateByCodecName = null;
        }
        try {
            Trace.endSection();
            Surface surface = zzsnVar.zzd;
            int i = 0;
            if (surface == null && zzstVar.zzh && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            }
            zzsbVar.zzq(zzsnVar.zzb, surface, null, i);
            return zzsbVar;
        } catch (Exception e3) {
            exc = e3;
            zzsbVar2 = zzsbVar;
            if (zzsbVar2 != null) {
                zzsbVar2.zzk();
                throw exc;
            }
            if (mediaCodecCreateByCodecName == null) {
                throw exc;
            }
            mediaCodecCreateByCodecName.release();
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final /* bridge */ /* synthetic */ zzsq zzb(zzsn zzsnVar) throws IOException {
        throw null;
    }
}
