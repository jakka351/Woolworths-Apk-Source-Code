package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    public static final androidx.compose.ui.graphics.colorspace.a c = new androidx.compose.ui.graphics.colorspace.a(19);
    public static final b d = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public Deferred.DeferredHandler f15234a;
    public volatile Provider b;

    public OptionalProvider(androidx.compose.ui.graphics.colorspace.a aVar, Provider provider) {
        this.f15234a = aVar;
        this.b = provider;
    }

    @Override // com.google.firebase.inject.Deferred
    public final void a(final Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.b;
        b bVar = d;
        if (provider3 != bVar) {
            deferredHandler.f(provider3);
            return;
        }
        synchronized (this) {
            provider = this.b;
            if (provider != bVar) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.f15234a;
                this.f15234a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.e
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void f(Provider provider4) {
                        deferredHandler2.f(provider4);
                        deferredHandler.f(provider4);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.f(provider);
        }
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return this.b.get();
    }
}
