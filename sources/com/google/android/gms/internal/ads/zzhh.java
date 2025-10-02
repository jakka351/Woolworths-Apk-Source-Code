package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes5.dex */
public abstract class zzhh extends zzbe {
    private final int zzb;
    private final zzwi zzc;

    public zzhh(boolean z, zzwi zzwiVar) {
        this.zzc = zzwiVar;
        this.zzb = zzwiVar.zza();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzc.zzb(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzc.zzc(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        int iZzq = zzq(i);
        int iZzu = zzu(iZzq);
        int iZzt = zzt(iZzq);
        zzs(iZzq).zzb(i - iZzu, zzbdVar, j);
        Object objZzv = zzv(iZzq);
        if (!zzbd.zza.equals(zzbdVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbdVar.zzb);
        }
        zzbdVar.zzb = objZzv;
        zzbdVar.zzn += iZzt;
        zzbdVar.zzo += iZzt;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z) {
        int iZzp = zzp(i);
        int iZzu = zzu(iZzp);
        zzs(iZzp).zzd(i - zzt(iZzp), zzbcVar, z);
        zzbcVar.zzc += iZzu;
        if (z) {
            Object objZzv = zzv(iZzp);
            Object obj = zzbcVar.zzb;
            obj.getClass();
            zzbcVar.zzb = Pair.create(objZzv, obj);
        }
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        int iZze;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzr = zzr(obj2);
            if (iZzr != -1 && (iZze = zzs(iZzr).zze(obj3)) != -1) {
                return zzt(iZzr) + iZze;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        int iZzp = zzp(i);
        return Pair.create(zzv(iZzp), zzs(iZzp).zzf(i - zzt(iZzp)));
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzh(int i, int i2, boolean z) {
        int iZzq = zzq(i);
        int iZzu = zzu(iZzq);
        int iZzh = zzs(iZzq).zzh(i - iZzu, i2 == 2 ? 0 : i2, z);
        if (iZzh != -1) {
            return iZzu + iZzh;
        }
        int iZzw = zzw(iZzq, z);
        while (iZzw != -1 && zzs(iZzw).zzg()) {
            iZzw = zzw(iZzw, z);
        }
        if (iZzw != -1) {
            return zzs(iZzw).zzk(z) + zzu(iZzw);
        }
        if (i2 == 2) {
            return zzk(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzi(int i, int i2, boolean z) {
        int iZzq = zzq(i);
        int iZzu = zzu(iZzq);
        int iZzi = zzs(iZzq).zzi(i - iZzu, 0, false);
        if (iZzi != -1) {
            return iZzu + iZzi;
        }
        int iZzx = zzx(iZzq, false);
        while (iZzx != -1 && zzs(iZzx).zzg()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzs(iZzx).zzj(false) + zzu(iZzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzj(boolean z) {
        int i = this.zzb;
        if (i != 0) {
            int iZzd = z ? this.zzc.zzd() : i - 1;
            while (zzs(iZzd).zzg()) {
                iZzd = zzx(iZzd, z);
                if (iZzd == -1) {
                }
            }
            return zzs(iZzd).zzj(z) + zzu(iZzd);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzk(boolean z) {
        if (this.zzb != 0) {
            int iZze = z ? this.zzc.zze() : 0;
            while (zzs(iZze).zzg()) {
                iZze = zzw(iZze, z);
                if (iZze == -1) {
                }
            }
            return zzs(iZze).zzk(z) + zzu(iZze);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzo(Object obj, zzbc zzbcVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzr = zzr(obj2);
        int iZzu = zzu(iZzr);
        zzs(iZzr).zzo(obj3, zzbcVar);
        zzbcVar.zzc += iZzu;
        zzbcVar.zzb = obj;
        return zzbcVar;
    }

    public abstract int zzp(int i);

    public abstract int zzq(int i);

    public abstract int zzr(Object obj);

    public abstract zzbe zzs(int i);

    public abstract int zzt(int i);

    public abstract int zzu(int i);

    public abstract Object zzv(int i);
}
