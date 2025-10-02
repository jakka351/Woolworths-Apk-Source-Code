package dagger.internal;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class LazyClassKeyMap<V> implements Map<Class<?>, V> {
    public final Map d;

    /* loaded from: classes7.dex */
    public static class MapFactory<V> implements Factory<Map<Class<?>, V>> {
        @Override // javax.inject.Provider
        public final Object get() {
            throw null;
        }
    }

    /* loaded from: classes7.dex */
    public static class MapProviderFactory<V> implements Factory<Map<Class<?>, Provider<V>>> {
        @Override // javax.inject.Provider
        public final Object get() {
            throw null;
        }
    }

    public LazyClassKeyMap(ImmutableMap immutableMap) {
        this.d = immutableMap;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.d.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.d.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Map
    public final Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Class<?> cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d.values();
    }
}
