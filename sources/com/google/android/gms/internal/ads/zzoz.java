package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzoz {

    @VisibleForTesting
    static final zzgkc zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzoz zza = new zzoz(zzgjz.zzj(zzoy.zza));

    @SuppressLint
    private static final zzgjz zzc = zzgjz.zzl(2, 5, 6);

    static {
        zzgkb zzgkbVar = new zzgkb();
        zzgkbVar.zza(5, 6);
        zzgkbVar.zza(17, 6);
        zzgkbVar.zza(7, 6);
        zzgkbVar.zza(30, 10);
        zzgkbVar.zza(18, 6);
        zzgkbVar.zza(6, 8);
        zzgkbVar.zza(8, 8);
        zzgkbVar.zza(14, 8);
        zzb = zzgkbVar.zzc();
    }

    private zzoz(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzoy zzoyVar = (zzoy) list.get(i);
            this.zzd.put(zzoyVar.zzb, zzoyVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            iMax = Math.max(iMax, ((zzoy) this.zzd.valueAt(i2)).zzc);
        }
        this.zze = iMax;
    }

    @SuppressLint
    public static zzoz zza(Context context, zzc zzcVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzcVar, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @android.annotation.SuppressLint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzoz zzb(android.content.Context r9, @androidx.annotation.Nullable android.content.Intent r10, com.google.android.gms.internal.ads.zzc r11, @androidx.annotation.Nullable android.media.AudioDeviceInfo r12) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoz.zzb(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.zzc, android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.zzoz");
    }

    @Nullable
    public static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzgjz zzf(@Nullable int[] iArr, int i) {
        int i2 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        for (int i3 : iArr) {
            zzgjwVar.zzf(new zzoy(i3, i));
        }
        return zzgjwVar.zzi();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            if (r7 != r8) goto L3
            goto L46
        L3:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzoz
            r1 = 0
            if (r0 != 0) goto L9
            goto L48
        L9:
            com.google.android.gms.internal.ads.zzoz r8 = (com.google.android.gms.internal.ads.zzoz) r8
            android.util.SparseArray r0 = r7.zzd
            android.util.SparseArray r2 = r8.zzd
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeo.zza
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L1e
            boolean r0 = androidx.core.splashscreen.a.w(r0, r2)
            if (r0 == 0) goto L48
            goto L40
        L1e:
            int r3 = r0.size()
            int r4 = r2.size()
            if (r3 != r4) goto L48
            r4 = r1
        L29:
            if (r4 >= r3) goto L40
            int r5 = r0.keyAt(r4)
            java.lang.Object r6 = r0.valueAt(r4)
            java.lang.Object r5 = r2.get(r5)
            boolean r5 = java.util.Objects.equals(r6, r5)
            if (r5 == 0) goto L48
            int r4 = r4 + 1
            goto L29
        L40:
            int r0 = r7.zze
            int r8 = r8.zze
            if (r0 != r8) goto L48
        L46:
            r8 = 1
            return r8
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzeo.zza;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        String string = this.zzd.toString();
        int i = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + string.length() + 1);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i, "AudioCapabilities[maxChannelCount=", ", audioProfiles=", string, sb);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzd(com.google.android.gms.internal.ads.zzu r10, com.google.android.gms.internal.ads.zzc r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzo
            r0.getClass()
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzar.zzh(r0, r1)
            com.google.android.gms.internal.ads.zzgkc r2 = com.google.android.gms.internal.ads.zzoz.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lad
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zza(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzeo.zza(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.zzd
            boolean r6 = com.google.android.gms.internal.ads.zzeo.zza(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.zzd
            boolean r7 = com.google.android.gms.internal.ads.zzeo.zza(r6, r1)
            if (r7 == 0) goto Lad
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzoy r6 = (com.google.android.gms.internal.ads.zzoy) r6
            r6.getClass()
            int r7 = r10.zzG
            r8 = -1
            if (r7 == r8) goto L7a
            if (r1 != r5) goto L60
            goto L7a
        L60:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L73
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L73
            r10 = 10
            if (r7 <= r10) goto L85
            goto Lad
        L73:
            boolean r10 = r6.zza(r7)
            if (r10 != 0) goto L85
            goto Lad
        L7a:
            int r10 = r10.zzH
            if (r10 != r8) goto L81
            r10 = 48000(0xbb80, float:6.7262E-41)
        L81:
            int r7 = r6.zzb(r10, r11)
        L85:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L99
            if (r7 != r2) goto L8e
            goto L9a
        L8e:
            r10 = 3
            if (r7 == r10) goto L97
            r10 = 4
            if (r7 == r10) goto L97
            r10 = 5
            if (r7 != r10) goto L99
        L97:
            r3 = r4
            goto L9a
        L99:
            r3 = r7
        L9a:
            int r10 = com.google.android.gms.internal.ads.zzeo.zzB(r3)
            if (r10 == 0) goto Lad
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lad:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoz.zzd(com.google.android.gms.internal.ads.zzu, com.google.android.gms.internal.ads.zzc):android.util.Pair");
    }
}
