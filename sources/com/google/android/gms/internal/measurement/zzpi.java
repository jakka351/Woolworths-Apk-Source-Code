package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes.dex */
public final class zzpi implements Supplier {
    private static final zzpi zza = new zzpi();
    private final Supplier zzb = Suppliers.b(new zzpk());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzpj get() {
        return (zzpj) this.zzb.get();
    }
}
