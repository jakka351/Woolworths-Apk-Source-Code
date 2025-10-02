package dagger.internal;

import dagger.Lazy;

/* loaded from: classes7.dex */
public final class ProviderOfLazy<T> implements Provider<Lazy<T>> {
    @Override // javax.inject.Provider
    public final Object get() {
        return DoubleCheck.a(null);
    }
}
