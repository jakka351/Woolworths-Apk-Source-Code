package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class zzaa {
    private static volatile float zzc = -1.0f;
    private static volatile long zzd;
    private static final Object zze = new Object();
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoG)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            return audioManager == null ? BitmapDescriptorFactory.HUE_RED : zzg(audioManager);
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoH)).intValue();
        if (zzc != -1.0f && jCurrentTimeMillis - zzd < jIntValue) {
            return zzc;
        }
        synchronized (zze) {
            try {
                long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (zzc != -1.0f && jCurrentTimeMillis2 - zzd < jIntValue) {
                    return zzc;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    zzc = BitmapDescriptorFactory.HUE_RED;
                    zzd = jCurrentTimeMillis2;
                    return BitmapDescriptorFactory.HUE_RED;
                }
                zzc = zzg(audioManager2);
                zzd = jCurrentTimeMillis2;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized boolean zzf() {
        return this.zzb >= BitmapDescriptorFactory.HUE_RED;
    }

    private static float zzg(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? BitmapDescriptorFactory.HUE_RED : audioManager.getStreamVolume(3) / streamMaxVolume;
    }

    public final synchronized void zza(float f) {
        this.zzb = f;
    }

    public final synchronized float zzb() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z) {
        this.zza = z;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }
}
