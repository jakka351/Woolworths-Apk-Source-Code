package dagger.internal;

/* loaded from: classes.dex */
public final class SingleCheck<T> implements Provider<T> {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Provider f23779a;
    public volatile Object b;

    public static Provider a(Provider provider) {
        if ((provider instanceof SingleCheck) || (provider instanceof DoubleCheck)) {
            return provider;
        }
        SingleCheck singleCheck = new SingleCheck();
        singleCheck.b = c;
        singleCheck.f23779a = provider;
        return singleCheck;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        Provider provider = this.f23779a;
        if (provider == null) {
            return this.b;
        }
        Object obj2 = provider.get();
        this.b = obj2;
        this.f23779a = null;
        return obj2;
    }
}
