package dagger.internal;

import dagger.Lazy;
import dagger.internal.AbstractMapFactory;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, Provider<V>> implements Lazy<Map<K, Provider<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, Provider<V>> {

        /* renamed from: dagger.internal.MapProviderFactory$Builder$1, reason: invalid class name */
        class AnonymousClass1 implements Provider<Map<Object, Provider<Object>>> {
            @Override // javax.inject.Provider
            public final Object get() {
                throw null;
            }
        }
    }

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }
}
