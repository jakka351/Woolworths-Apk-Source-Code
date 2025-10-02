package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingObject;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingCache
        /* renamed from: R1 */
        public final Cache P1() {
            return null;
        }
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public abstract Cache P1();
}
