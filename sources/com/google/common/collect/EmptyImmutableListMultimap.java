package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    public static final EmptyImmutableListMultimap k = new EmptyImmutableListMultimap(RegularImmutableMap.j, 0);

    private Object readResolve() {
        return k;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: h */
    public final ImmutableMap p1() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Map p1() {
        return this.i;
    }
}
