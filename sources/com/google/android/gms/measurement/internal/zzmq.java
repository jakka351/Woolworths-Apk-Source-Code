package com.google.android.gms.measurement.internal;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzmq extends zzay {
    final /* synthetic */ zznl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmq(zznl zznlVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        c.C(this.zza.zzu, "Tasks have been queued for a long time");
    }
}
