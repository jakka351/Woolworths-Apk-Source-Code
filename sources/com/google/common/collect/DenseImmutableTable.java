package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Strings;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public final ImmutableMap f;
    public final ImmutableMap g;
    public final ImmutableMap h;
    public final ImmutableMap i;
    public final int[] j;
    public final int[] k;
    public final Object[][] l;
    public final int[] m;
    public final int[] n;

    public final class Column extends ImmutableArrayMap<R, V> {
        public final int h;

        public Column(int i) {
            super(DenseImmutableTable.this.k[i]);
            this.h = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object r(int i) {
            return DenseImmutableTable.this.l[i][this.h];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap s() {
            return DenseImmutableTable.this.f;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public ColumnMap() {
            super(DenseImmutableTable.this.k.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object r(int i) {
            return new Column(i);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap s() {
            return DenseImmutableTable.this.g;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        public final int g;

        public ImmutableArrayMap(int i) {
            this.g = i;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet e() {
            return this.g == s().size() ? s().keySet() : new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            Integer num = (Integer) s().get(obj);
            if (num == null) {
                return null;
            }
            return r(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final UnmodifiableIterator q() {
            return new AbstractIterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1
                public int f = -1;
                public final int g;

                {
                    this.g = ImmutableArrayMap.this.s().size();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    int i = this.f;
                    while (true) {
                        this.f = i + 1;
                        int i2 = this.f;
                        if (i2 >= this.g) {
                            this.d = AbstractIterator.State.f;
                            return null;
                        }
                        ImmutableArrayMap immutableArrayMap = ImmutableArrayMap.this;
                        Object objR = immutableArrayMap.r(i2);
                        if (objR != null) {
                            return new ImmutableEntry(immutableArrayMap.s().keySet().b().get(this.f), objR);
                        }
                        i = this.f;
                    }
                }
            };
        }

        public abstract Object r(int i);

        public abstract ImmutableMap s();

        @Override // java.util.Map
        public final int size() {
            return this.g;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {
        public final int h;

        public Row(int i) {
            super(DenseImmutableTable.this.j[i]);
            this.h = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object r(int i) {
            return DenseImmutableTable.this.l[this.h][i];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap s() {
            return DenseImmutableTable.this.g;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public RowMap() {
            super(DenseImmutableTable.this.j.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object r(int i) {
            return new Row(i);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap s() {
            return DenseImmutableTable.this.f;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public DenseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.l = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size());
        ImmutableMap immutableMapF = Maps.f(immutableSet);
        this.f = immutableMapF;
        ImmutableMap immutableMapF2 = Maps.f(immutableSet2);
        this.g = immutableMapF2;
        this.j = new int[((RegularImmutableMap) immutableMapF).i];
        this.k = new int[((RegularImmutableMap) immutableMapF2).i];
        RegularImmutableList regularImmutableList = (RegularImmutableList) immutableList;
        int i = regularImmutableList.g;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            Table.Cell cell = (Table.Cell) regularImmutableList.get(i2);
            Object objB = cell.b();
            Object objA = cell.a();
            Integer num = (Integer) this.f.get(objB);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.g.get(objA);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            Object obj = this.l[iIntValue][iIntValue2];
            Object value = cell.getValue();
            if (!(obj == null)) {
                throw new IllegalArgumentException(Strings.b("Duplicate key: (row=%s, column=%s), values: [%s, %s].", objB, objA, value, obj));
            }
            this.l[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.j;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.k;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i2] = iIntValue;
            iArr2[i2] = iIntValue2;
        }
        this.m = iArr;
        this.n = iArr2;
        this.h = new RowMap();
        this.i = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public final Map d() {
        return ImmutableMap.c(this.h);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap k() {
        return ImmutableMap.c(this.i);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final Object n(Object obj, Object obj2) {
        Integer num = (Integer) this.f.get(obj);
        Integer num2 = (Integer) this.g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.l[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    /* renamed from: o */
    public final ImmutableMap d() {
        return ImmutableMap.c(this.h);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Table.Cell q(int i) {
        int i2 = this.m[i];
        int i3 = this.n[i];
        E e = d().keySet().b().get(i2);
        E e2 = k().keySet().b().get(i3);
        Object obj = this.l[i2][i3];
        Objects.requireNonNull(obj);
        return ImmutableTable.i(e, e2, obj);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Object r(int i) {
        Object obj = this.l[this.m[i]][this.n[i]];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return this.m.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, this.m, this.n);
    }
}
