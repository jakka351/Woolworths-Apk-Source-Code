package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzahg implements zzacu {
    private final zzef zza;
    private final zzado zzb;
    private final zzadk zzc;
    private final zzadm zzd;
    private final zzaeb zze;
    private zzacx zzf;
    private zzaeb zzg;
    private zzaeb zzh;
    private int zzi;

    @Nullable
    private zzao zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahi zzp;
    private boolean zzq;

    public zzahg() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244  */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahi] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.google.android.gms.internal.ads.zzahh] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.google.android.gms.internal.ads.zzacx] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzb(com.google.android.gms.internal.ads.zzacv r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzb(com.google.android.gms.internal.ads.zzacv):int");
    }

    private final long zzc(long j) {
        zzado zzadoVar = this.zzb;
        return ((j * 1000000) / zzadoVar.zzd) + this.zzk;
    }

    private final boolean zzj(zzacv zzacvVar, boolean z) throws IOException {
        int iZzm;
        int i;
        int iZza;
        zzacvVar.zzl();
        long jZzn = zzacvVar.zzn();
        int i2 = true != z ? 131072 : 32768;
        if (jZzn == 0) {
            zzao zzaoVarZza = this.zzd.zza(zzacvVar, null, i2);
            this.zzj = zzaoVarZza;
            if (zzaoVarZza != null) {
                this.zzc.zza(zzaoVarZza);
            }
            iZzm = (int) zzacvVar.zzm();
            if (!z) {
                zzacvVar.zzf(iZzm);
            }
            i = 0;
        } else {
            iZzm = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!zzk(zzacvVar)) {
                zzef zzefVar = this.zza;
                zzefVar.zzh(0);
                int iZzB = zzefVar.zzB();
                if ((i == 0 || zzm(iZzB, i)) && (iZza = zzadp.zza(iZzB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(iZzB);
                        i = iZzB;
                    }
                    zzacvVar.zzk(iZza - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        zzl();
                        throw new EOFException();
                    }
                    if (z) {
                        zzacvVar.zzl();
                        zzacvVar.zzk(iZzm + i5);
                    } else {
                        zzacvVar.zzf(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                zzl();
                throw new EOFException();
            }
        }
        if (z) {
            zzacvVar.zzf(iZzm + i4);
        } else {
            zzacvVar.zzl();
        }
        this.zzi = i;
        return true;
    }

    private final boolean zzk(zzacv zzacvVar) throws IOException {
        zzahi zzahiVar = this.zzp;
        if (zzahiVar != null) {
            long jZzf = zzahiVar.zzf();
            if (jZzf != -1 && zzacvVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzacvVar.zzh(this.zza.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzl() {
        zzahi zzahiVar = this.zzp;
        if ((zzahiVar instanceof zzahc) && zzahiVar.zzb()) {
            long j = this.zzn;
            if (j == -1 || j == this.zzp.zzf()) {
                return;
            }
            this.zzp = ((zzahc) this.zzp).zzh(this.zzn);
            zzacx zzacxVar = this.zzf;
            zzacxVar.getClass();
            zzacxVar.zzw(this.zzp);
            this.zzg.getClass();
            this.zzp.zza();
        }
    }

    private static boolean zzm(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zzj(zzacvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
        zzaeb zzaebVarZzu = zzacxVar.zzu(0, 1);
        this.zzg = zzaebVarZzu;
        this.zzh = zzaebVarZzu;
        this.zzf.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws Throwable {
        this.zzg.getClass();
        String str = zzeo.zza;
        int iZzb = zzb(zzacvVar);
        if (iZzb == -1 && (this.zzp instanceof zzahd)) {
            if (this.zzp.zza() != zzc(this.zzl)) {
                throw null;
            }
        }
        return iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        if (this.zzp instanceof zzahd) {
            throw null;
        }
    }

    public zzahg(int i) {
        this.zza = new zzef(10);
        this.zzb = new zzado();
        this.zzc = new zzadk();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzadm();
        zzacr zzacrVar = new zzacr();
        this.zze = zzacrVar;
        this.zzh = zzacrVar;
        this.zzn = -1L;
    }
}
