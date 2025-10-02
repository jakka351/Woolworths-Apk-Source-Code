package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Provider e;
    public final /* synthetic */ Provider f;

    public /* synthetic */ d(Provider provider, Provider provider2, int i) {
        this.d = i;
        this.f = provider;
        this.e = provider2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Deferred.DeferredHandler deferredHandler;
        switch (this.d) {
            case 0:
                OptionalProvider optionalProvider = (OptionalProvider) this.f;
                Provider provider = this.e;
                if (optionalProvider.b != OptionalProvider.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (optionalProvider) {
                    deferredHandler = optionalProvider.f15234a;
                    optionalProvider.f15234a = null;
                    optionalProvider.b = provider;
                }
                deferredHandler.f(provider);
                return;
            default:
                LazySet lazySet = (LazySet) this.f;
                Provider provider2 = this.e;
                synchronized (lazySet) {
                    try {
                        if (lazySet.b == null) {
                            lazySet.f15233a.add(provider2);
                        } else {
                            lazySet.b.add(provider2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
