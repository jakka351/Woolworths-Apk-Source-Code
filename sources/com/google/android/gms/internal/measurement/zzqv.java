package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes5.dex */
public final class zzqv implements Supplier {
    private static final zzqv zza = new zzqv();
    private final Supplier zzb = Suppliers.b(new zzqx());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqw get() {
        return (zzqw) this.zzb.get();
    }
}
