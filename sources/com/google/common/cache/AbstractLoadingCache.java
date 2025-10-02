package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        try {
            return get(obj);
        } catch (ExecutionException e) {
            throw new UncheckedExecutionException(e.getCause());
        }
    }
}
