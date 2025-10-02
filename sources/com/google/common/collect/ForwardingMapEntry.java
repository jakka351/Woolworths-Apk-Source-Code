package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry P1();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return P1().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return P1().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return P1().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return P1().hashCode();
    }

    public Object setValue(Object obj) {
        return P1().setValue(obj);
    }
}
