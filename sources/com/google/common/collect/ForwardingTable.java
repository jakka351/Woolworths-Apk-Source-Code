package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object P1() {
        return null;
    }

    @Override // com.google.common.collect.Table
    public Set W0() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public Map d() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int hashCode() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        throw null;
    }
}
