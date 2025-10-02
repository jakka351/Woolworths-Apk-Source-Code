package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.DoNotMock;

@ElementTypesAreNonnullByDefault
@GwtCompatible
@DoNotMock
/* loaded from: classes6.dex */
public abstract class FluentFuture<V> extends GwtFluentFutureCatchingSpecialization<V> {

    public static abstract class TrustedFuture<V> extends FluentFuture<V> implements AbstractFuture.Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.d instanceof AbstractFuture.Cancellation;
        }
    }
}
