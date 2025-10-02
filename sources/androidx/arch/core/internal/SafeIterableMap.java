package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public Entry d;
    public Entry e;
    public final WeakHashMap f = new WeakHashMap();
    public int g = 0;

    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.g;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.f;
        }
    }

    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.f;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.g;
        }
    }

    public static class Entry<K, V> implements Map.Entry<K, V> {
        public final Object d;
        public final Object e;
        public Entry f;
        public Entry g;

        public Entry(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.d.equals(entry.d) && this.e.equals(entry.e);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.d + "=" + this.e;
        }
    }

    @RestrictTo
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public Entry d;
        public boolean e = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entry2 = this.d;
            if (entry == entry2) {
                Entry entry3 = entry2.g;
                this.d = entry3;
                this.e = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e) {
                return SafeIterableMap.this.d != null;
            }
            Entry entry = this.d;
            return (entry == null || entry.f == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.e) {
                this.e = false;
                this.d = SafeIterableMap.this.d;
            } else {
                Entry entry = this.d;
                this.d = entry != null ? entry.f : null;
            }
            return this.d;
        }
    }

    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public Entry d;
        public Entry e;

        public ListIterator(Entry entry, Entry entry2) {
            this.d = entry2;
            this.e = entry;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entryC = null;
            if (this.d == entry && entry == this.e) {
                this.e = null;
                this.d = null;
            }
            Entry entry2 = this.d;
            if (entry2 == entry) {
                this.d = b(entry2);
            }
            Entry entry3 = this.e;
            if (entry3 == entry) {
                Entry entry4 = this.d;
                if (entry3 != entry4 && entry4 != null) {
                    entryC = c(entry3);
                }
                this.e = entryC;
            }
        }

        public abstract Entry b(Entry entry);

        public abstract Entry c(Entry entry);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Entry entry = this.e;
            Entry entry2 = this.d;
            this.e = (entry == entry2 || entry2 == null) ? null : c(entry);
            return entry;
        }
    }

    @RestrictTo
    public static abstract class SupportRemove<K, V> {
        public abstract void a(Entry entry);
    }

    public Entry b(Object obj) {
        Entry entry = this.d;
        while (entry != null && !entry.d.equals(obj)) {
            entry = entry.f;
        }
        return entry;
    }

    public Object d(Object obj, Object obj2) {
        Entry entryB = b(obj);
        if (entryB != null) {
            return entryB.e;
        }
        Entry entry = new Entry(obj, obj2);
        this.g++;
        Entry entry2 = this.e;
        if (entry2 == null) {
            this.d = entry;
            this.e = entry;
            return null;
        }
        entry2.f = entry;
        entry.g = entry2;
        this.e = entry;
        return null;
    }

    public final Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.e, this.d);
        this.f.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((androidx.arch.core.internal.SafeIterableMap.ListIterator) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof androidx.arch.core.internal.SafeIterableMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.arch.core.internal.SafeIterableMap r7 = (androidx.arch.core.internal.SafeIterableMap) r7
            int r1 = r6.g
            int r3 = r7.g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            androidx.arch.core.internal.SafeIterableMap$ListIterator r3 = (androidx.arch.core.internal.SafeIterableMap.ListIterator) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            androidx.arch.core.internal.SafeIterableMap$ListIterator r4 = (androidx.arch.core.internal.SafeIterableMap.ListIterator) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            androidx.arch.core.internal.SafeIterableMap$ListIterator r7 = (androidx.arch.core.internal.SafeIterableMap.ListIterator) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.arch.core.internal.SafeIterableMap.equals(java.lang.Object):boolean");
    }

    public Object g(Object obj) {
        Entry entryB = b(obj);
        if (entryB == null) {
            return null;
        }
        this.g--;
        WeakHashMap weakHashMap = this.f;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).a(entryB);
            }
        }
        Entry entry = entryB.g;
        if (entry != null) {
            entry.f = entryB.f;
        } else {
            this.d = entryB.f;
        }
        Entry entry2 = entryB.f;
        if (entry2 != null) {
            entry2.g = entry;
        } else {
            this.e = entry;
        }
        entryB.f = null;
        entryB.g = null;
        return entryB.e;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) listIterator.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.d, this.e);
        this.f.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) listIterator.next()).toString());
            if (listIterator.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
