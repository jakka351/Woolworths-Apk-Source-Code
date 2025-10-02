package com.scandit.datacapture.core.internal.sdk.data;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements Subscription {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f18696a = new AtomicBoolean(false);
    final /* synthetic */ DisposableResource b;

    public a(DisposableResource disposableResource) {
        this.b = disposableResource;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.Subscription
    public final void dispose() {
        if (this.f18696a.compareAndSet(false, true)) {
            Object obj = this.b.e;
            DisposableResource disposableResource = this.b;
            synchronized (obj) {
                try {
                    disposableResource.counter = disposableResource.getCounter() - 1;
                    if (disposableResource.getCounter() == 0) {
                        Object obj2 = disposableResource.d;
                        if (obj2 != null) {
                            disposableResource.b.invoke(obj2);
                        }
                        disposableResource.d = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.Subscription
    public final void use(Function1 action) {
        Object obj;
        Intrinsics.h(action, "action");
        if (this.f18696a.get()) {
            return;
        }
        Object obj2 = this.b.e;
        DisposableResource disposableResource = this.b;
        synchronized (obj2) {
            if (!this.f18696a.get() && (obj = disposableResource.d) != null) {
                action.invoke(obj);
            }
        }
    }
}
