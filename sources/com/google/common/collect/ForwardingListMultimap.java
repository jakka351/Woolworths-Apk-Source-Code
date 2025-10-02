package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingMultimap
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public abstract ListMultimap P1();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List b(Object obj) {
        return P1().b(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        return P1().get(obj);
    }
}
