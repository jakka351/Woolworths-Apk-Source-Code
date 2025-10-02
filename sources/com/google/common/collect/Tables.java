package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Tables {

    /* renamed from: a, reason: collision with root package name */
    public static final Function f14905a = new AnonymousClass1();

    /* renamed from: com.google.common.collect.Tables$1, reason: invalid class name */
    public class AnonymousClass1 implements Function<Map<Object, Object>, Map<Object, Object>> {
        @Override // com.google.common.base.Function
        public final Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                if (Objects.a(b(), cell.b()) && Objects.a(a(), cell.a()) && Objects.a(getValue(), cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{b(), a(), getValue()});
        }

        public final String toString() {
            return "(" + b() + "," + a() + ")=" + getValue();
        }
    }

    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        public final Object d;
        public final Object e;
        public final Object f;

        public ImmutableCell(Object obj, Object obj2, Object obj3) {
            this.d = obj;
            this.e = obj2;
            this.f = obj3;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object a() {
            return this.e;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object b() {
            return this.d;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object getValue() {
            return this.f;
        }
    }

    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* renamed from: com.google.common.collect.Tables$TransformedTable$1, reason: invalid class name */
        class AnonymousClass1 implements Function<Table.Cell<Object, Object, Object>, Table.Cell<Object, Object, Object>> {
            @Override // com.google.common.base.Function
            public final Table.Cell<Object, Object, Object> apply(Table.Cell<Object, Object, Object> cell) {
                Table.Cell<Object, Object, Object> cell2 = cell;
                cell2.b();
                cell2.a();
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$2, reason: invalid class name */
        class AnonymousClass2 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function
            public final Map<Object, Object> apply(Map<Object, Object> map) {
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$3, reason: invalid class name */
        class AnonymousClass3 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function
            public final Map<Object, Object> apply(Map<Object, Object> map) {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractTable
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final void b() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final Map d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final Collection f() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            throw null;
        }
    }

    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        @Override // com.google.common.collect.AbstractTable
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final void b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final boolean c(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final Map d() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            throw null;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final Map d() {
            throw null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final SortedMap d() {
            throw null;
        }
    }

    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final Set W0() {
            return Collections.unmodifiableSet(super.W0());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map d() {
            return Collections.unmodifiableMap(new Maps.TransformedEntriesMap(super.d(), new Maps.AnonymousClass9(Tables.f14905a)));
        }
    }
}
