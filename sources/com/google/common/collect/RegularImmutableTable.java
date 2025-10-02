package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Table;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Object objN = RegularImmutableTable.this.n(cell.b(), cell.a());
            return objN != null && objN.equals(cell.getValue());
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i) {
            return RegularImmutableTable.this.q(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class Values extends ImmutableList<V> {
        public Values() {
        }

        @Override // java.util.List
        public final Object get(int i) {
            return RegularImmutableTable.this.r(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: l */
    public final ImmutableSet e() {
        if (size() != 0) {
            return new CellSet();
        }
        int i = ImmutableSet.f;
        return RegularImmutableSet.m;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: m */
    public final ImmutableCollection f() {
        if (size() != 0) {
            return new Values();
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        return RegularImmutableList.h;
    }

    public abstract Table.Cell q(int i);

    public abstract Object r(int i);

    @Override // com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    public abstract Object writeReplace();
}
