package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public interface zzfhr {
    static zzfhr zzn(Context context, int i) {
        boolean zBooleanValue;
        if (zzfie.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                zBooleanValue = ((Boolean) zzbeb.zze.zze()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbeb.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbeb.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbeb.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbeb.zzf.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfht(context, i);
            }
        }
        return new zzfis();
    }

    static zzfhr zzo(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfhr zzfhrVarZzn = zzn(context, i);
        if (zzfhrVarZzn instanceof zzfht) {
            zzfhrVarZzn.zza();
            zzfhrVarZzn.zzp(i2);
            zzfhrVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfia.zza(str)) {
                zzfhrVarZzn.zze(str);
            }
        }
        return zzfhrVarZzn;
    }

    zzfhr zza();

    boolean zzb();

    zzfhr zzc();

    zzfhr zzd(boolean z);

    zzfhr zze(String str);

    zzfhr zzf(zzfig zzfigVar);

    zzfhr zzg(zzfct zzfctVar);

    zzfhr zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfhr zzi(String str);

    zzfhr zzj(Throwable th);

    zzfhr zzk(String str);

    boolean zzl();

    @Nullable
    zzfhu zzm();

    zzfhr zzp(int i);
}
