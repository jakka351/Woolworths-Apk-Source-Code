package dagger.internal;

import dagger.internal.AbstractMapFactory;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
    }

    static {
        Preconditions.c(Collections.EMPTY_MAP, "instance cannot be null");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
