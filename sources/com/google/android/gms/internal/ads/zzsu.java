package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.audio.g;
import java.util.List;

@RequiresApi
/* loaded from: classes5.dex */
final class zzsu {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, g.e(i, i2, (int) d));
            boolean z = true;
            if (iZzc == 1 && zzsv.zza == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int iZzb = zzb(false);
                    int iZzb2 = zzb(true);
                    if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    }
                    zzsv.zza = Boolean.valueOf(z);
                    if (!zzsv.zza.booleanValue()) {
                    }
                }
                z = false;
                zzsv.zza = Boolean.valueOf(z);
                if (!zzsv.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzs zzsVar = new zzs();
            zzsVar.zzm("video/avc");
            zzu zzuVarZzM = zzsVar.zzM();
            if (zzuVarZzM.zzo != null) {
                List listZzc = zztl.zzc(zztb.zzb, zzuVarZzM, z, false);
                for (int i = 0; i < listZzc.size(); i++) {
                    if (((zzst) listZzc.get(i)).zzd != null && (videoCapabilities = ((zzst) listZzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        g.h();
                        return zzc(supportedPerformancePoints, g.d());
                    }
                }
            }
        } catch (zztd unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (g.f(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
