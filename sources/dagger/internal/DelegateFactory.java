package dagger.internal;

/* loaded from: classes.dex */
public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a, reason: collision with root package name */
    public Provider f23777a;

    public static void a(DelegateFactory delegateFactory, Provider provider) {
        if (delegateFactory.f23777a != null) {
            throw new IllegalStateException();
        }
        delegateFactory.f23777a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Provider provider = this.f23777a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
