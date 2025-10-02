package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaii {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((zzaiv) it.next()).zza.zzg.zzo;
            if (zzar.zzb(str2)) {
                return "video/mp4";
            }
            if (zzar.zza(str2)) {
                z = true;
            } else if (zzar.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
