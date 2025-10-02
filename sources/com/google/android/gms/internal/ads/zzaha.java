package com.google.android.gms.internal.ads;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzaha {
    private final zzef zza = new zzef(8);
    private int zzb;

    private final long zzb(zzacv zzacvVar) throws IOException {
        int i;
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        int i2 = 0;
        zzaclVar.zzh(zzefVar.zzi(), 0, 1, false);
        int i3 = zzefVar.zzi()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzaclVar.zzh(zzefVar.zzi(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzefVar.zzi()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzacv zzacvVar) throws IOException {
        long jZzo = zzacvVar.zzo();
        long j = llqqqql.c00630063c0063c0063;
        if (jZzo != -1 && jZzo <= llqqqql.c00630063c0063c0063) {
            j = jZzo;
        }
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzefVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | (zzefVar.zzi()[0] & 255)) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzaclVar.zzh(zzefVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzacvVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzo == -1 || j3 < jZzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzacvVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzacvVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i3 = (int) jZzb2;
                            zzaclVar.zzj(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
