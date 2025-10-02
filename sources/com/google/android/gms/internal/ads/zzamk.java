package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class zzamk implements zzamd {
    private final zzang zza;
    private long zzf;
    private String zzh;
    private zzaeb zzi;
    private zzamj zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzamu zzc = new zzamu(7, 128);
    private final zzamu zzd = new zzamu(8, 128);
    private final zzamu zze = new zzamu(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzef zzn = new zzef();

    public zzamk(zzang zzangVar, boolean z, boolean z2, String str) {
        this.zza = zzangVar;
    }

    @RequiresNonNull
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @RequiresNonNull
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzamu zzamuVar = this.zzc;
            zzamuVar.zze(i2);
            zzamu zzamuVar2 = this.zzd;
            zzamuVar2.zze(i2);
            if (this.zzk) {
                if (zzamuVar.zzb()) {
                    zzfk zzfkVarZzd = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                    this.zza.zzb(zzfkVarZzd.zzm);
                    this.zzj.zza(zzfkVarZzd);
                    zzamuVar.zza();
                } else if (zzamuVar2.zzb()) {
                    this.zzj.zzb(zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb));
                    zzamuVar2.zza();
                }
            } else if (zzamuVar.zzb() && zzamuVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzamuVar.zza, zzamuVar.zzb));
                arrayList.add(Arrays.copyOf(zzamuVar2.zza, zzamuVar2.zzb));
                zzfk zzfkVarZzd2 = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                zzfj zzfjVarZzg = zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb);
                String strZzb = zzdc.zzb(zzfkVarZzd2.zza, zzfkVarZzd2.zzb, zzfkVarZzd2.zzc);
                zzaeb zzaebVar = this.zzi;
                zzs zzsVar = new zzs();
                zzsVar.zza(this.zzh);
                zzsVar.zzl(this.zzb);
                zzsVar.zzm("video/avc");
                zzsVar.zzj(strZzb);
                zzsVar.zzt(zzfkVarZzd2.zze);
                zzsVar.zzu(zzfkVarZzd2.zzf);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzfkVarZzd2.zzj);
                zzgVar.zzb(zzfkVarZzd2.zzk);
                zzgVar.zzc(zzfkVarZzd2.zzl);
                zzgVar.zze(zzfkVarZzd2.zzh + 8);
                zzgVar.zzf(zzfkVarZzd2.zzi + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzfkVarZzd2.zzg);
                zzsVar.zzp(arrayList);
                int i3 = zzfkVarZzd2.zzm;
                zzsVar.zzo(i3);
                zzaebVar.zzu(zzsVar.zzM());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zzfkVarZzd2);
                this.zzj.zzb(zzfjVarZzg);
                zzamuVar.zza();
                zzamuVar2.zza();
            }
        }
        zzamu zzamuVar3 = this.zze;
        if (zzamuVar3.zze(i2)) {
            int iZza = zzfl.zza(zzamuVar3.zza, zzamuVar3.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar3.zza, iZza);
            zzefVar.zzh(4);
            this.zza.zzc(j2, zzefVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfl.zzi(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzamj zzamjVar = this.zzj;
        if (zzamjVar != null) {
            zzamjVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzi = zzaebVarZzu;
        this.zzj = new zzamj(zzaebVarZzu, false, false);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzaeb r1 = r14.zzi
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeo.zza
            int r1 = r15.zzg()
            int r7 = r15.zze()
            byte[] r8 = r15.zzi()
            long r2 = r14.zzf
            int r4 = r15.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.zzf = r2
            com.google.android.gms.internal.ads.zzaeb r2 = r14.zzi
            int r3 = r15.zzd()
            r2.zzz(r15, r3)
        L26:
            boolean[] r2 = r14.zzg
            int r2 = com.google.android.gms.internal.ads.zzfl.zzh(r8, r1, r7, r2)
            if (r2 == r7) goto L68
            int r3 = r2 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r2 <= 0) goto L41
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L41
            r3 = 4
            r11 = r3
            r10 = r4
            goto L43
        L41:
            r10 = r2
            r11 = r3
        L43:
            int r2 = r10 - r1
            if (r2 <= 0) goto L4a
            r14.zzg(r8, r1, r10)
        L4a:
            int r3 = r7 - r10
            long r4 = r14.zzf
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r2 >= 0) goto L55
            int r1 = -r2
        L53:
            r12 = r4
            goto L57
        L55:
            r1 = 0
            goto L53
        L57:
            long r5 = r14.zzl
            r0 = r14
            r4 = r1
            r1 = r12
            r0.zzh(r1, r3, r4, r5)
            long r4 = r14.zzl
            r3 = r9
            r0.zzf(r1, r3, r4)
            int r1 = r10 + r11
            goto L26
        L68:
            r14.zzg(r8, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamk.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzeo.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
