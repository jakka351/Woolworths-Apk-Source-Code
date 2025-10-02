package com.google.android.gms.internal.vision;

import java.util.List;

/* loaded from: classes5.dex */
final class zzjz extends zzju {
    private zzjz() {
        super();
    }

    private static <E> zzjl<E> zzc(Object obj, long j) {
        return (zzjl) zzma.zzf(obj, j);
    }

    @Override // com.google.android.gms.internal.vision.zzju
    public final <L> List<L> zza(Object obj, long j) {
        zzjl zzjlVarZzc = zzc(obj, j);
        if (zzjlVarZzc.zza()) {
            return zzjlVarZzc;
        }
        int size = zzjlVarZzc.size();
        zzjl zzjlVarZza = zzjlVarZzc.zza(size == 0 ? 10 : size << 1);
        zzma.zza(obj, j, zzjlVarZza);
        return zzjlVarZza;
    }

    @Override // com.google.android.gms.internal.vision.zzju
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzju
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzjl zzjlVarZzc = zzc(obj, j);
        zzjl zzjlVarZzc2 = zzc(obj2, j);
        int size = zzjlVarZzc.size();
        int size2 = zzjlVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzjlVarZzc.zza()) {
                zzjlVarZzc = zzjlVarZzc.zza(size2 + size);
            }
            zzjlVarZzc.addAll(zzjlVarZzc2);
        }
        if (size > 0) {
            zzjlVarZzc2 = zzjlVarZzc;
        }
        zzma.zza(obj, j, zzjlVarZzc2);
    }
}
