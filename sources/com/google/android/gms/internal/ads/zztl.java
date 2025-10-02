package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@SuppressLint
/* loaded from: classes5.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzst zza() throws zztd {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzst) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zztd {
        try {
            zztc zztcVar = new zztc(str, z, z2);
            HashMap map = zzb;
            List list = (List) map.get(zztcVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zztcVar, new zztg(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListZzh.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                zzj(arrayListZzh, zzth.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzst) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzst) arrayListZzh.remove(0));
            }
            zzgjz zzgjzVarZzq = zzgjz.zzq(arrayListZzh);
            map.put(zztcVar, zzgjzVarZzq);
            return zzgjzVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    @RequiresNonNull
    public static List zzc(zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        List listZza = zztbVar.zza(zzuVar.zzo, z, z2);
        List listZzd = zzd(zztbVar, zzuVar, z, z2);
        int i = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        zzgjwVar.zzh(listZza);
        zzgjwVar.zzh(listZzd);
        return zzgjwVar.zzi();
    }

    public static List zzd(zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        String strZzg = zzg(zzuVar);
        return strZzg == null ? zzgjz.zzi() : zztbVar.zza(strZzg, z, z2);
    }

    @CheckResult
    public static List zze(List list, final zzu zzuVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zztk() { // from class: com.google.android.gms.internal.ads.zztj
            @Override // com.google.android.gms.internal.ads.zztk
            public final /* synthetic */ int zza(Object obj) {
                int i = zztl.zza;
                return ((zzst) obj).zzd(zzuVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    @Nullable
    public static String zzg(zzu zzuVar) {
        Pair pairZze;
        String str = zzuVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZze = zzdc.zze(zzuVar)) != null) {
            int iIntValue = ((Integer) pairZze.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183 A[PHI: r3
  0x0183: PHI (r3v7 boolean) = (r3v6 boolean), (r3v8 boolean) binds: [B:98:0x017d, B:100:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zztc r24, com.google.android.gms.internal.ads.zzte r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.zzh(com.google.android.gms.internal.ads.zztc, com.google.android.gms.internal.ads.zzte):java.util.ArrayList");
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzar.zza(str)) {
            return true;
        }
        String strZza = zzggj.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zztk zztkVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzti
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zztl.zza;
                zztk zztkVar2 = zztkVar;
                return zztkVar2.zza(obj2) - zztkVar2.zza(obj);
            }
        });
    }
}
