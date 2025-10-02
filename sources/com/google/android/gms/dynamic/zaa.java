package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        Objects.requireNonNull(deferredLifecycleHelper);
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper deferredLifecycleHelper = this.zaa;
        deferredLifecycleHelper.zab(lifecycleDelegate);
        Iterator it = deferredLifecycleHelper.zad().iterator();
        while (it.hasNext()) {
            ((zah) it.next()).zab(deferredLifecycleHelper.zaa());
        }
        deferredLifecycleHelper.zad().clear();
        deferredLifecycleHelper.zac(null);
    }
}
