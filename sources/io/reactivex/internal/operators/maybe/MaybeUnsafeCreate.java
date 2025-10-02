package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;

/* loaded from: classes7.dex */
public final class MaybeUnsafeCreate<T> extends AbstractMaybeWithUpstream<T, T> {
    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(maybeObserver);
    }
}
