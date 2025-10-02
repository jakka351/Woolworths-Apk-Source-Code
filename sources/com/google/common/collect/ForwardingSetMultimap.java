package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingMultimap
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public abstract SetMultimap P1();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set b(Object obj) {
        return P1().b(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set get(Object obj) {
        return P1().get(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final Set l() {
        return P1().l();
    }
}
