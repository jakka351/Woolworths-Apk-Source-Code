package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public int d;
    public int e;

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class AvlBuilder<K, V> {
    }

    public static class AvlIterator<K, V> {
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$EntrySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Object key;
            if (!(obj instanceof Map.Entry) || (key = ((Map.Entry) obj).getKey()) == null) {
                return false;
            }
            try {
                key.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Object key;
            if ((obj instanceof Map.Entry) && (key = ((Map.Entry) obj).getKey()) != null) {
                try {
                    key.hashCode();
                    throw null;
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    public final class KeySet extends AbstractSet<K> {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$KeySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                a();
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public Node d;
        public Node e;
        public int f;

        public LinkedTreeMapIterator() {
            throw null;
        }

        public final Node a() {
            Node node = this.d;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.getClass();
            if (node == null) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.e != this.f) {
                throw new ConcurrentModificationException();
            }
            this.d = node.g;
            this.e = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Node node = this.d;
            LinkedHashTreeMap.this.getClass();
            return node != null;
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
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.a(node, true);
            this.e = null;
            this.f = linkedHashTreeMap.e;
        }
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        public Node d;
        public Node e;
        public Node f;
        public Node g;
        public Node h;
        public Object i;
        public int j;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                throw null;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.i;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.i;
            this.i = obj;
            return obj2;
        }

        public final String toString() {
            throw null;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final void a(Node node, boolean z) {
        Node node2;
        Node node3;
        int i;
        if (z) {
            Node node4 = node.h;
            node4.g = node.g;
            node.g.h = node4;
            node.h = null;
            node.g = null;
        }
        Node node5 = node.e;
        Node node6 = node.f;
        Node node7 = node.d;
        int i2 = 0;
        if (node5 != null && node6 != null) {
            if (node5.j > node6.j) {
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
            a(node3, false);
            Node node11 = node.e;
            if (node11 != null) {
                i = node11.j;
                node3.e = node11;
                node11.d = node3;
                node.e = null;
            } else {
                i = 0;
            }
            Node node12 = node.f;
            if (node12 != null) {
                i2 = node12.j;
                node3.f = node12;
                node12.d = node3;
                node.f = null;
            }
            node3.j = Math.max(i, i2) + 1;
            b(node, node3);
            return;
        }
        if (node5 != null) {
            b(node, node5);
            node.e = null;
        } else if (node6 != null) {
            b(node, node6);
            node.f = null;
        } else {
            b(node, null);
        }
        while (true) {
            if (node7 == null) {
                break;
            }
            Node node13 = node7.e;
            Node node14 = node7.f;
            int i3 = node13 != null ? node13.j : 0;
            int i4 = node14 != null ? node14.j : 0;
            int i5 = i3 - i4;
            if (i5 != -2) {
                if (i5 != 2) {
                    if (i5 != 0) {
                        node7.j = Math.max(i3, i4) + 1;
                        break;
                    }
                    node7.j = i3 + 1;
                } else {
                    Node node15 = node13.e;
                    Node node16 = node13.f;
                    int i6 = (node15 != null ? node15.j : 0) - (node16 != null ? node16.j : 0);
                    if (i6 == 1 || i6 == 0) {
                        d(node7);
                    } else {
                        c(node13);
                        d(node7);
                    }
                }
            } else {
                Node node17 = node14.e;
                Node node18 = node14.f;
                int i7 = (node17 != null ? node17.j : 0) - (node18 != null ? node18.j : 0);
                if (i7 == -1 || i7 == 0) {
                    c(node7);
                } else {
                    d(node14);
                    c(node7);
                }
            }
            node7 = node7.d;
        }
        this.d--;
        this.e++;
    }

    public final void b(Node node, Node node2) {
        Node node3 = node.d;
        node.d = null;
        if (node2 != null) {
            node2.d = node3;
        }
        if (node3 == null) {
            throw null;
        }
        if (node3.e == node) {
            node3.e = node2;
        } else {
            node3.f = node2;
        }
    }

    public final void c(Node node) {
        Node node2 = node.e;
        Node node3 = node.f;
        Node node4 = node3.e;
        Node node5 = node3.f;
        node.f = node4;
        if (node4 != null) {
            node4.d = node;
        }
        b(node, node3);
        node3.e = node;
        node.d = node3;
        int iMax = Math.max(node2 != null ? node2.j : 0, node4 != null ? node4.j : 0) + 1;
        node.j = iMax;
        node3.j = Math.max(iMax, node5 != null ? node5.j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill((Object[]) null, (Object) null);
        this.d = 0;
        this.e++;
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            obj.hashCode();
            throw null;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final void d(Node node) {
        Node node2 = node.e;
        Node node3 = node.f;
        Node node4 = node2.e;
        Node node5 = node2.f;
        node.e = node5;
        if (node5 != null) {
            node5.d = node;
        }
        b(node, node2);
        node2.f = node;
        node.d = node2;
        int iMax = Math.max(node3 != null ? node3.j : 0, node5 != null ? node5.j : 0) + 1;
        node.j = iMax;
        node2.j = Math.max(iMax, node4 != null ? node4.j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj != null) {
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
