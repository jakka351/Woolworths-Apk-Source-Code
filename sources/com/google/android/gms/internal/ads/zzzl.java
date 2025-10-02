package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class zzzl {
    private static final Comparator zza = zzzk.zza;
    private static final Comparator zzb = zzzj.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzi[] zzd = new zzzi[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzl(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzzi zzziVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzzi[] zzziVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzziVar = zzziVarArr[i3];
        } else {
            zzziVar = new zzzi(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzziVar.zza = i4;
        zzziVar.zzb = i;
        zzziVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzziVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzzi zzziVar2 = (zzzi) arrayList.get(0);
            int i7 = zzziVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                arrayList.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzzi[] zzziVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzziVarArr2[i8] = zzziVar2;
                }
            } else {
                zzziVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final float zzc(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzzi) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f3 = 0.5f * f2;
            zzzi zzziVar = (zzzi) arrayList.get(i);
            i2 += zzziVar.zzb;
            if (i2 >= f3) {
                return zzziVar.zzc;
            }
            i++;
        }
    }
}
