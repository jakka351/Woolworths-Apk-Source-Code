package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* loaded from: classes7.dex */
abstract class AbstractMaybeWithUpstream<T, R> extends Maybe<R> implements HasUpstreamMaybeSource<T> {
    public final Maybe d;

    public AbstractMaybeWithUpstream(Maybe maybe) {
        this.d = maybe;
    }
}
