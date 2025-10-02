package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {
    public transient Set d;
    public transient Collection e;

    /* renamed from: com.google.common.collect.AbstractTable$1, reason: invalid class name */
    class AnonymousClass1 extends TransformedIterator<Table.Cell<Object, Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Table.Cell) obj).getValue();
        }
    }

    public class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractTable.this.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.h(cell.b(), AbstractTable.this.d());
            if (map != null) {
                return Collections2.c(new ImmutableEntry(cell.a(), cell.getValue()), map.entrySet());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractTable.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean zRemove;
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                Map map = (Map) Maps.h(cell.b(), AbstractTable.this.d());
                if (map != null) {
                    Set setEntrySet = map.entrySet();
                    ImmutableEntry immutableEntry = new ImmutableEntry(cell.a(), cell.getValue());
                    Set set = setEntrySet;
                    set.getClass();
                    try {
                        zRemove = set.remove(immutableEntry);
                    } catch (ClassCastException | NullPointerException unused) {
                        zRemove = false;
                    }
                    if (zRemove) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractTable.this.size();
        }
    }

    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AbstractTable.this.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractTable.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return AbstractTable.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public Set W0() {
        Set set = this.d;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.d = setE;
        return setE;
    }

    public abstract Iterator a();

    public void b() {
        Iterators.b(W0().iterator());
    }

    public boolean c(Object obj) {
        Iterator<V> it = d().values().iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set e() {
        return new CellSet();
    }

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Table) {
            return W0().equals(((Table) obj).W0());
        }
        return false;
    }

    public Collection f() {
        return new Values();
    }

    public Collection g() {
        Collection collection = this.e;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.e = collectionF;
        return collectionF;
    }

    public Iterator h() {
        return new AnonymousClass1(W0().iterator());
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return W0().hashCode();
    }

    public String toString() {
        return d().toString();
    }
}
