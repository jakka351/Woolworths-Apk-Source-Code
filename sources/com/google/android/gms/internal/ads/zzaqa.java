package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzaqa {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public zzaqa(String str, zzaoq zzaoqVar) {
        String str2 = zzaoqVar.zzb;
        long j = zzaoqVar.zzc;
        long j2 = zzaoqVar.zzd;
        long j3 = zzaoqVar.zze;
        long j4 = zzaoqVar.zzf;
        List arrayList = zzaoqVar.zzh;
        if (arrayList == 0) {
            Map map = zzaoqVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static zzaqa zza(zzaqb zzaqbVar) throws IOException {
        if (zzaqd.zzi(zzaqbVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzaqd.zzm(zzaqbVar);
        String strZzm2 = zzaqd.zzm(zzaqbVar);
        long jZzk = zzaqd.zzk(zzaqbVar);
        long jZzk2 = zzaqd.zzk(zzaqbVar);
        long jZzk3 = zzaqd.zzk(zzaqbVar);
        long jZzk4 = zzaqd.zzk(zzaqbVar);
        int iZzi = zzaqd.zzi(zzaqbVar);
        if (iZzi < 0) {
            throw new IOException(YU.a.n(new StringBuilder(String.valueOf(iZzi).length() + 20), "readHeaderList size=", iZzi));
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iZzi; i++) {
            arrayList.add(new zzaoz(zzaqd.zzm(zzaqbVar).intern(), zzaqd.zzm(zzaqbVar).intern()));
        }
        return new zzaqa(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    private zzaqa(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
