package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zab implements zah {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ Bundle zab;
    final /* synthetic */ Bundle zac;
    final /* synthetic */ DeferredLifecycleHelper zad;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
        Objects.requireNonNull(deferredLifecycleHelper);
        this.zad = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        this.zad.zaa().onInflate(this.zaa, this.zab, this.zac);
    }
}
