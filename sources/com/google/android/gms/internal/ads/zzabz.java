package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzabz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;

    @Nullable
    public final String zzl;

    private zzabz(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, @Nullable String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzabz zza(zzef zzefVar) throws zzas {
        String strZzb;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zzefVar.zzk(4);
            int iZzs = (zzefVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzefVar.zzs() & 31;
            for (int i9 = 0; i9 < iZzs2; i9++) {
                arrayList.add(zzb(zzefVar));
            }
            int iZzs3 = zzefVar.zzs();
            for (int i10 = 0; i10 < iZzs3; i10++) {
                arrayList.add(zzb(zzefVar));
            }
            if (iZzs2 > 0) {
                zzfk zzfkVarZzd = zzfl.zzd((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i11 = zzfkVarZzd.zze;
                int i12 = zzfkVarZzd.zzf;
                int i13 = zzfkVarZzd.zzh + 8;
                int i14 = zzfkVarZzd.zzi + 8;
                int i15 = zzfkVarZzd.zzj;
                int i16 = zzfkVarZzd.zzk;
                int i17 = zzfkVarZzd.zzl;
                int i18 = zzfkVarZzd.zzm;
                float f2 = zzfkVarZzd.zzg;
                strZzb = zzdc.zzb(zzfkVarZzd.zza, zzfkVarZzd.zzb, zzfkVarZzd.zzc);
                i5 = i17;
                i6 = i18;
                f = f2;
                i4 = i14;
                i7 = i15;
                i8 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                strZzb = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new zzabz(arrayList, iZzs, i, i2, i3, i4, i7, i8, i5, i6, f, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzas.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzef zzefVar) {
        int iZzt = zzefVar.zzt();
        int iZzg = zzefVar.zzg();
        zzefVar.zzk(iZzt);
        return zzdc.zzg(zzefVar.zzi(), iZzg, iZzt);
    }
}
