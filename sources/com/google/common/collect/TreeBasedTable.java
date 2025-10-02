package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {

    /* renamed from: com.google.common.collect.TreeBasedTable$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractIterator<Object> {
        public Object f;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new TreeMap((Comparator) null);
        }
    }

    public class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {
        public final Object g;
        public final Object h;

        public TreeRow(Object obj, Object obj2, Object obj3) {
            super(obj);
            this.g = obj2;
            this.h = obj3;
            if (obj2 == null || obj3 == null) {
                return;
            }
            comparator();
            throw null;
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final Map b() {
            f();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.Row
        public final void c() {
            f();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            TreeBasedTable.this.getClass();
            return null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return e(obj) && super.containsKey(obj);
        }

        public final boolean e(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.g != null) {
                comparator();
                throw null;
            }
            if (this.h == null) {
                return true;
            }
            comparator();
            throw null;
        }

        public final void f() {
            throw null;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            d();
            Map map = this.e;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            obj.getClass();
            Preconditions.g(e(obj));
            return new TreeRow(this.d, this.g, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set keySet() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            d();
            Map map = this.e;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            obj.getClass();
            Preconditions.g(e(obj));
            return super.put(obj, obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // java.util.SortedMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.SortedMap subMap(java.lang.Object r4, java.lang.Object r5) {
            /*
                r3 = this;
                r4.getClass()
                boolean r0 = r3.e(r4)
                if (r0 == 0) goto L14
                r5.getClass()
                boolean r0 = r3.e(r5)
                if (r0 == 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                com.google.common.base.Preconditions.g(r0)
                com.google.common.collect.TreeBasedTable$TreeRow r0 = new com.google.common.collect.TreeBasedTable$TreeRow
                com.google.common.collect.TreeBasedTable r1 = com.google.common.collect.TreeBasedTable.this
                java.lang.Object r2 = r3.d
                r0.<init>(r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.TreeRow.subMap(java.lang.Object, java.lang.Object):java.util.SortedMap");
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            obj.getClass();
            Preconditions.g(e(obj));
            return new TreeRow(this.d, obj, this.h);
        }
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable
    public final void b() {
        throw null;
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public final Map d() {
        return super.d();
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
    public final Iterator n() {
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Map s(Object obj) {
        return new TreeRow(obj, null, null);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public final int size() {
        throw null;
    }
}
