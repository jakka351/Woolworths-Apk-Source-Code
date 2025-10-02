package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes6.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator l = new AnonymousClass1();
    public final Comparator d;
    public final boolean e;
    public Node f;
    public int g;
    public int h;
    public final Node i;
    public EntrySet j;
    public KeySet k;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$EntrySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean contains(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L29
                com.google.gson.internal.LinkedTreeMap r0 = com.google.gson.internal.LinkedTreeMap.this
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r2 = r5.getKey()
                r3 = 0
                if (r2 == 0) goto L15
                com.google.gson.internal.LinkedTreeMap$Node r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L15
                goto L16
            L15:
                r0 = r3
            L16:
                if (r0 == 0) goto L25
                java.lang.Object r2 = r0.k
                java.lang.Object r5 = r5.getValue()
                boolean r5 = java.util.Objects.equals(r2, r5)
                if (r5 == 0) goto L25
                r3 = r0
            L25:
                if (r3 == 0) goto L29
                r5 = 1
                return r5
            L29:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.EntrySet.contains(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean remove(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                goto L28
            L6:
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r0 = r6.getKey()
                com.google.gson.internal.LinkedTreeMap r2 = com.google.gson.internal.LinkedTreeMap.this
                r3 = 0
                if (r0 == 0) goto L16
                com.google.gson.internal.LinkedTreeMap$Node r0 = r2.a(r0, r1)     // Catch: java.lang.ClassCastException -> L16
                goto L17
            L16:
                r0 = r3
            L17:
                if (r0 == 0) goto L26
                java.lang.Object r4 = r0.k
                java.lang.Object r6 = r6.getValue()
                boolean r6 = java.util.Objects.equals(r4, r6)
                if (r6 == 0) goto L26
                r3 = r0
            L26:
                if (r3 != 0) goto L29
            L28:
                return r1
            L29:
                r6 = 1
                r2.c(r3, r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.EntrySet.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.g;
        }
    }

    public final class KeySet extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$KeySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                return a().i;
            }
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            Node nodeA = null;
            if (obj != null) {
                try {
                    nodeA = linkedTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (nodeA != null) {
                linkedTreeMap.c(nodeA, true);
            }
            return nodeA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.g;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public Node d;
        public Node e = null;
        public int f;

        public LinkedTreeMapIterator() {
            this.d = LinkedTreeMap.this.i.g;
            this.f = LinkedTreeMap.this.h;
        }

        public final Node a() {
            Node node = this.d;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.i) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.h != this.f) {
                throw new ConcurrentModificationException();
            }
            this.d = node.g;
            this.e = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != LinkedTreeMap.this.i;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.e;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.c(node, true);
            this.e = null;
            this.f = linkedTreeMap.h;
        }
    }

    public LinkedTreeMap() {
        this(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Node a(Object obj, boolean z) {
        int iCompareTo;
        Node node;
        Node node2 = this.f;
        Comparator comparator = l;
        Comparator comparator2 = this.d;
        if (node2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = node2.i;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return node2;
                }
                Node node3 = iCompareTo < 0 ? node2.e : node2.f;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            iCompareTo = 0;
        }
        Node node4 = node2;
        if (!z) {
            return null;
        }
        Node node5 = this.i;
        if (node4 != null) {
            node = new Node(this.e, node4, obj, node5, node5.h);
            if (iCompareTo < 0) {
                node4.e = node;
            } else {
                node4.f = node;
            }
            b(node4, true);
        } else {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            node = new Node(this.e, node4, obj, node5, node5.h);
            this.f = node;
        }
        this.g++;
        this.h++;
        return node;
    }

    public final void b(Node node, boolean z) {
        while (node != null) {
            Node node2 = node.e;
            Node node3 = node.f;
            int i = node2 != null ? node2.l : 0;
            int i2 = node3 != null ? node3.l : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                Node node4 = node3.e;
                Node node5 = node3.f;
                int i4 = (node4 != null ? node4.l : 0) - (node5 != null ? node5.l : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(node);
                } else {
                    f(node3);
                    e(node);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                Node node6 = node2.e;
                Node node7 = node2.f;
                int i5 = (node6 != null ? node6.l : 0) - (node7 != null ? node7.l : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(node);
                } else {
                    e(node2);
                    f(node);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.l = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.l = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.d;
        }
    }

    public final void c(Node node, boolean z) {
        Node node2;
        Node node3;
        int i;
        if (z) {
            Node node4 = node.h;
            node4.g = node.g;
            node.g.h = node4;
        }
        Node node5 = node.e;
        Node node6 = node.f;
        Node node7 = node.d;
        int i2 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                d(node, node5);
                node.e = null;
            } else if (node6 != null) {
                d(node, node6);
                node.f = null;
            } else {
                d(node, null);
            }
            b(node7, false);
            this.g--;
            this.h++;
            return;
        }
        if (node5.l > node6.l) {
            Node node8 = node5.f;
            while (true) {
                Node node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.f;
                }
            }
        } else {
            Node node10 = node6.e;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.e;
                }
            }
            node3 = node2;
        }
        c(node3, false);
        Node node11 = node.e;
        if (node11 != null) {
            i = node11.l;
            node3.e = node11;
            node11.d = node3;
            node.e = null;
        } else {
            i = 0;
        }
        Node node12 = node.f;
        if (node12 != null) {
            i2 = node12.l;
            node3.f = node12;
            node12.d = node3;
            node.f = null;
        }
        node3.l = Math.max(i, i2) + 1;
        d(node, node3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f = null;
        this.g = 0;
        this.h++;
        Node node = this.i;
        node.h = node;
        node.g = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Node nodeA = null;
        if (obj != null) {
            try {
                nodeA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nodeA != null;
    }

    public final void d(Node node, Node node2) {
        Node node3 = node.d;
        node.d = null;
        if (node2 != null) {
            node2.d = node3;
        }
        if (node3 == null) {
            this.f = node2;
        } else if (node3.e == node) {
            node3.e = node2;
        } else {
            node3.f = node2;
        }
    }

    public final void e(Node node) {
        Node node2 = node.e;
        Node node3 = node.f;
        Node node4 = node3.e;
        Node node5 = node3.f;
        node.f = node4;
        if (node4 != null) {
            node4.d = node;
        }
        d(node, node3);
        node3.e = node;
        node.d = node3;
        int iMax = Math.max(node2 != null ? node2.l : 0, node4 != null ? node4.l : 0) + 1;
        node.l = iMax;
        node3.l = Math.max(iMax, node5 != null ? node5.l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.j;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.j = entrySet2;
        return entrySet2;
    }

    public final void f(Node node) {
        Node node2 = node.e;
        Node node3 = node.f;
        Node node4 = node2.e;
        Node node5 = node2.f;
        node.e = node5;
        if (node5 != null) {
            node5.d = node;
        }
        d(node, node2);
        node2.f = node;
        node.d = node2;
        int iMax = Math.max(node3 != null ? node3.l : 0, node5 != null ? node5.l : 0) + 1;
        node.l = iMax;
        node2.l = Math.max(iMax, node4 != null ? node4.l : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Node nodeA;
        if (obj != null) {
            try {
                nodeA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            nodeA = null;
        }
        if (nodeA != null) {
            return nodeA.k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySet keySet = this.k;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.k = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.e) {
            throw new NullPointerException("value == null");
        }
        Node nodeA = a(obj, true);
        Object obj3 = nodeA.k;
        nodeA.k = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Node nodeA;
        if (obj != null) {
            try {
                nodeA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            nodeA = null;
        }
        if (nodeA != null) {
            c(nodeA, true);
        }
        if (nodeA != null) {
            return nodeA.k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.g;
    }

    public LinkedTreeMap(boolean z) {
        this.g = 0;
        this.h = 0;
        this.d = l;
        this.e = z;
        this.i = new Node(z);
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        public Node d;
        public Node e;
        public Node f;
        public Node g;
        public Node h;
        public final Object i;
        public final boolean j;
        public Object k;
        public int l;

        public Node(boolean z) {
            this.i = null;
            this.j = z;
            this.h = this;
            this.g = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.i;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.k;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.i;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.k;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.i;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.k;
            return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj == null && !this.j) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.k;
            this.k = obj;
            return obj2;
        }

        public final String toString() {
            return this.i + "=" + this.k;
        }

        public Node(boolean z, Node node, Object obj, Node node2, Node node3) {
            this.d = node;
            this.i = obj;
            this.j = z;
            this.l = 1;
            this.g = node2;
            this.h = node3;
            node3.g = this;
            node2.h = this;
        }
    }
}
