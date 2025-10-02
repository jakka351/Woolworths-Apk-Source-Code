package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof AbstractFuture.Cancellation;
    }
}
