package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {
        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache
        /* renamed from: R1 */
        public final /* bridge */ /* synthetic */ Cache P1() {
            return null;
        }
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object P1() {
        return null;
    }

    @Override // com.google.common.cache.ForwardingCache
    /* renamed from: R1 */
    public /* bridge */ /* synthetic */ Cache P1() {
        return null;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        throw null;
    }
}
