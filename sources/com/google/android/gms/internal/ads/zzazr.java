package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzazr {
    public static void zza(String[] strArr, int i, int i2, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        if (length < 6) {
            zzb(i, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long jZza = zzazo.zza(strArr[i3 - 1]);
            long jZza2 = zzazo.zza(strArr[i3 + 5]);
            String strZzc = zzc(strArr, i3, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i, jZze, strZzc, length2, priorityQueue);
            i3++;
        }
    }

    @VisibleForTesting
    public static void zzb(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzazq zzazqVar = new zzazq(j, str, i2);
        if ((priorityQueue.size() != i || (((zzazq) priorityQueue.peek()).zzc <= zzazqVar.zzc && ((zzazq) priorityQueue.peek()).zza <= zzazqVar.zza)) && !priorityQueue.contains(zzazqVar)) {
            priorityQueue.add(zzazqVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    @VisibleForTesting
    public static String zzc(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i3 - 1;
            if (i >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    @VisibleForTesting
    public static long zzd(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return (i & 1) == 0 ? zzd(j2, i2) % 1073807359 : ((zzd(j2, i2) % 1073807359) * j) % 1073807359;
    }

    private static long zze(String[] strArr, int i, int i2) {
        long jZza = (zzazo.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jZza = (((zzazo.zza(strArr[i3]) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
