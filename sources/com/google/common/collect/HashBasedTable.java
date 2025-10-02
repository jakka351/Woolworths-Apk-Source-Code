package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import com.google.common.collect.StandardTable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {

    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new LinkedHashMap(Maps.c(0));
        }
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable
    public final void b() {
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Map i(Object obj) {
        return new StandardTable.Column(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public final boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Map s(Object obj) {
        return new StandardTable.Row(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public final int size() {
        throw null;
    }
}
