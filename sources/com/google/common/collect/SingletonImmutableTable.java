package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    public final Object f;
    public final Object g;
    public final Object h;

    public SingletonImmutableTable(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        this.f = obj;
        obj2.getClass();
        this.g = obj2;
        obj3.getClass();
        this.h = obj3;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap k() {
        Object obj = this.f;
        Object obj2 = this.h;
        CollectPreconditions.a(obj, obj2);
        RegularImmutableMap regularImmutableMapQ = RegularImmutableMap.q(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.g;
        CollectPreconditions.a(obj3, regularImmutableMapQ);
        return RegularImmutableMap.q(1, new Object[]{obj3, regularImmutableMapQ}, null);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet e() {
        Table.Cell cellI = ImmutableTable.i(this.f, this.g, this.h);
        int i = ImmutableSet.f;
        return new SingletonImmutableSet(cellI);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection f() {
        int i = ImmutableSet.f;
        return new SingletonImmutableSet(this.h);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap d() {
        Object obj = this.g;
        Object obj2 = this.h;
        CollectPreconditions.a(obj, obj2);
        RegularImmutableMap regularImmutableMapQ = RegularImmutableMap.q(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.f;
        CollectPreconditions.a(obj3, regularImmutableMapQ);
        return RegularImmutableMap.q(1, new Object[]{obj3, regularImmutableMapQ}, null);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, new int[]{0}, new int[]{0});
    }
}
