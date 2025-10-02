package dagger.internal;

import dagger.Lazy;

/* loaded from: classes.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Provider f23778a;
    public volatile Object b = c;

    public DoubleCheck(Provider provider) {
        this.f23778a = provider;
    }

    public static Lazy a(Provider provider) {
        if (provider instanceof Lazy) {
            return (Lazy) provider;
        }
        provider.getClass();
        return new DoubleCheck(provider);
    }

    public static Provider b(Provider provider) {
        return provider instanceof DoubleCheck ? provider : new DoubleCheck(provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.f23778a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.f23778a = null;
            }
        }
        return obj;
    }
}
