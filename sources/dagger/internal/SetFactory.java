package dagger.internal;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes7.dex */
public final class SetFactory<T> implements Factory<Set<T>> {

    public static final class Builder<T> {
    }

    static {
        Preconditions.c(Collections.EMPTY_SET, "instance cannot be null");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
