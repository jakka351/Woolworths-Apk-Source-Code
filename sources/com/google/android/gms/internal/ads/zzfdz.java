package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfdz {
    public static void zza(int i, Throwable th, String str) {
        String strN = YU.a.n(new StringBuilder(String.valueOf(i).length() + 20), "Ad failed to load : ", i);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strN);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
    }

    public static void zzb(Context context, boolean z) {
        if (z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        String strP = YU.a.p(new StringBuilder(String.valueOf(strZzD).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strZzD, "\")) to get test ads on this device.");
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strP);
    }
}
