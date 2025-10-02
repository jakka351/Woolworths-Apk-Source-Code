package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes.dex */
public final class zzre implements Supplier {
    private static final zzre zza = new zzre();
    private final Supplier zzb = Suppliers.b(new zzrg());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzrf get() {
        return (zzrf) this.zzb.get();
    }
}
