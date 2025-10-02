package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public final ObjectCountHashMap j(int i) {
        return new ObjectCountLinkedHashMap(i, 0);
    }
}
