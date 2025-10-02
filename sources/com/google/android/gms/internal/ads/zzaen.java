package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzaen implements zzacu {
    private final zzef zza;
    private final zzaem zzb;
    private final boolean zzc;
    private final zzajt zzd;
    private int zze;
    private zzacx zzf;
    private zzaeo zzg;
    private long zzh;
    private zzaeq[] zzi;
    private long zzj;

    @Nullable
    private zzaeq zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaen() {
        this(1, zzajt.zza);
    }

    @Nullable
    private final zzaeq zzb(int i) {
        for (zzaeq zzaeqVar : this.zzi) {
            if (zzaeqVar.zzc(i)) {
                return zzaeqVar;
            }
        }
        return null;
    }

    public final /* synthetic */ zzaeq[] zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzacvVar.zzi(zzefVar.zzi(), 0, 12);
        zzefVar.zzh(0);
        if (zzefVar.zzC() != 1179011410) {
            return false;
        }
        zzefVar.zzk(4);
        return zzefVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacxVar = new zzajw(zzacxVar, this.zzd);
        }
        this.zzf = zzacxVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean z;
        ?? r20;
        long j;
        long j2 = this.zzj;
        if (j2 != -1) {
            long jZzn = zzacvVar.zzn();
            if (j2 < jZzn || j2 > llqqqql.c00630063cc00630063 + jZzn) {
                zzadsVar.zza = j2;
                z = true;
            } else {
                zzacvVar.zzf((int) (j2 - jZzn));
                z = false;
            }
        } else {
            z = false;
        }
        this.zzj = -1L;
        if (z) {
            return 1;
        }
        int i = this.zze;
        zzaeq zzaeqVar = null;
        if (i == 0) {
            if (!zzd(zzacvVar)) {
                throw zzas.zzb("AVI Header List not found", null);
            }
            zzacvVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i == 1) {
            zzef zzefVar = this.zza;
            zzacvVar.zzc(zzefVar.zzi(), 0, 12);
            zzefVar.zzh(0);
            zzaem zzaemVar = this.zzb;
            zzaemVar.zza(zzefVar);
            int i2 = zzaemVar.zza;
            if (i2 != 1414744396) {
                StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(i2, 22));
                sb.append("LIST expected, found: ");
                sb.append(i2);
                throw zzas.zzb(sb.toString(), null);
            }
            int iZzC = zzefVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzaemVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb2 = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(iZzC, 22));
            sb2.append("hdrl expected, found: ");
            sb2.append(iZzC);
            throw zzas.zzb(sb2.toString(), null);
        }
        if (i == 2) {
            int i3 = this.zzl - 4;
            zzef zzefVar2 = new zzef(i3);
            zzacvVar.zzc(zzefVar2.zzi(), 0, i3);
            zzaer zzaerVarZzb = zzaer.zzb(1819436136, zzefVar2);
            if (zzaerVarZzb.zza() != 1819436136) {
                int iZza = zzaerVarZzb.zza();
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb3.append("Unexpected header list type ");
                sb3.append(iZza);
                throw zzas.zzb(sb3.toString(), null);
            }
            zzaeo zzaeoVar = (zzaeo) zzaerVarZzb.zzc(zzaeo.class);
            if (zzaeoVar == null) {
                throw zzas.zzb("AviHeader not found", null);
            }
            this.zzg = zzaeoVar;
            this.zzh = zzaeoVar.zzc * zzaeoVar.zza;
            ArrayList arrayList = new ArrayList();
            zzgjz zzgjzVar = zzaerVarZzb.zza;
            int size = zzgjzVar.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                zzaek zzaekVar = (zzaek) zzgjzVar.get(i4);
                if (zzaekVar.zza() == 1819440243) {
                    zzaer zzaerVar = (zzaer) zzaekVar;
                    int i6 = i5 + 1;
                    zzaep zzaepVar = (zzaep) zzaerVar.zzc(zzaep.class);
                    zzaes zzaesVar = (zzaes) zzaerVar.zzc(zzaes.class);
                    if (zzaepVar == null) {
                        zzds.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzaesVar == null) {
                        zzds.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzaepVar.zzd();
                        zzu zzuVar = zzaesVar.zza;
                        zzs zzsVarZza = zzuVar.zza();
                        zzsVarZza.zzb(i5);
                        int i7 = zzaepVar.zze;
                        if (i7 != 0) {
                            zzsVarZza.zzn(i7);
                        }
                        zzaet zzaetVar = (zzaet) zzaerVar.zzc(zzaet.class);
                        if (zzaetVar != null) {
                            zzsVarZza.zzc(zzaetVar.zza);
                        }
                        int iZzg = zzar.zzg(zzuVar.zzo);
                        if (iZzg == 1) {
                            zzaeb zzaebVarZzu = this.zzf.zzu(i5, iZzg);
                            zzaebVarZzu.zzu(zzsVarZza.zzM());
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzaeqVar = new zzaeq(i5, zzaepVar, zzaebVarZzu);
                        } else if (iZzg == 2) {
                            iZzg = 2;
                            zzaeb zzaebVarZzu2 = this.zzf.zzu(i5, iZzg);
                            zzaebVarZzu2.zzu(zzsVarZza.zzM());
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzaeqVar = new zzaeq(i5, zzaepVar, zzaebVarZzu2);
                        } else {
                            zzaeqVar = null;
                        }
                    }
                    if (zzaeqVar != null) {
                        arrayList.add(zzaeqVar);
                    }
                    i5 = i6;
                }
                i4++;
                zzaeqVar = null;
            }
            this.zzi = (zzaeq[]) arrayList.toArray(new zzaeq[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i == 3) {
            long j3 = this.zzm;
            if (j3 != -1 && zzacvVar.zzn() != j3) {
                this.zzj = j3;
                return 0;
            }
            zzef zzefVar3 = this.zza;
            zzacvVar.zzi(zzefVar3.zzi(), 0, 12);
            zzacvVar.zzl();
            zzefVar3.zzh(0);
            zzaem zzaemVar2 = this.zzb;
            zzaemVar2.zza(zzefVar3);
            int iZzC2 = zzefVar3.zzC();
            int i8 = zzaemVar2.zza;
            if (i8 == 1179011410) {
                zzacvVar.zzf(12);
                return 0;
            }
            if (i8 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzacvVar.zzn() + zzaemVar2.zzb + 8;
                return 0;
            }
            long jZzn2 = zzacvVar.zzn();
            this.zzm = jZzn2;
            long j4 = jZzn2 + zzaemVar2.zzb + 8;
            this.zzn = j4;
            if (!this.zzp) {
                zzaeo zzaeoVar2 = this.zzg;
                zzaeoVar2.getClass();
                if ((zzaeoVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j4;
                    return 0;
                }
                this.zzf.zzw(new zzadu(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzacvVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i == 4) {
            zzef zzefVar4 = this.zza;
            zzacvVar.zzc(zzefVar4.zzi(), 0, 8);
            zzefVar4.zzh(0);
            int iZzC3 = zzefVar4.zzC();
            int iZzC4 = zzefVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzacvVar.zzn() + iZzC4;
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i != 5) {
            if (zzacvVar.zzn() >= this.zzn) {
                return -1;
            }
            zzaeq zzaeqVar2 = this.zzk;
            if (zzaeqVar2 != null) {
                if (!zzaeqVar2.zze(zzacvVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzacvVar.zzn() & 1) == 1) {
                zzacvVar.zzf(1);
            }
            zzef zzefVar5 = this.zza;
            zzacvVar.zzi(zzefVar5.zzi(), 0, 12);
            zzefVar5.zzh(0);
            int iZzC5 = zzefVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzefVar5.zzh(8);
                zzacvVar.zzf(zzefVar5.zzC() != 1769369453 ? 8 : 12);
                zzacvVar.zzl();
                return 0;
            }
            int iZzC6 = zzefVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzacvVar.zzn() + iZzC6 + 8;
                return 0;
            }
            zzacvVar.zzf(8);
            zzacvVar.zzl();
            zzaeq zzaeqVarZzb = zzb(iZzC5);
            if (zzaeqVarZzb == null) {
                this.zzj = zzacvVar.zzn() + iZzC6;
                return 0;
            }
            zzaeqVarZzb.zzd(iZzC6);
            this.zzk = zzaeqVarZzb;
            return 0;
        }
        zzef zzefVar6 = new zzef(this.zzo);
        zzacvVar.zzc(zzefVar6.zzi(), 0, this.zzo);
        if (zzefVar6.zzd() < 16) {
            r20 = 0;
            j = 0;
        } else {
            int iZzg2 = zzefVar6.zzg();
            zzefVar6.zzk(8);
            long jZzC = zzefVar6.zzC();
            r20 = 0;
            long j5 = this.zzm;
            j = jZzC > j5 ? 0L : j5 + 8;
            zzefVar6.zzh(iZzg2);
        }
        while (zzefVar6.zzd() >= 16) {
            int iZzC7 = zzefVar6.zzC();
            int iZzC8 = zzefVar6.zzC();
            long jZzC2 = zzefVar6.zzC() + j;
            zzefVar6.zzk(4);
            zzaeq zzaeqVarZzb2 = zzb(iZzC7);
            if (zzaeqVarZzb2 != null) {
                zzaeqVarZzb2.zza(jZzC2, (iZzC8 & 16) == 16 ? true : r20);
            }
        }
        zzaeq[] zzaeqVarArr = this.zzi;
        int length = zzaeqVarArr.length;
        for (int i9 = r20; i9 < length; i9++) {
            zzaeqVarArr[i9].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzadu(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzael(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return r20;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaeq zzaeqVar : this.zzi) {
            zzaeqVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    public zzaen(int i, zzajt zzajtVar) {
        this.zzd = zzajtVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzef(12);
        this.zzb = new zzaem(null);
        this.zzf = new zzadq();
        this.zzi = new zzaeq[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
