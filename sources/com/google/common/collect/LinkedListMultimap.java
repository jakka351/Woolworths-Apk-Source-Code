package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    public transient Node i;
    public transient Node j;
    public transient Map k;
    public transient int l;
    public transient int m;

    /* renamed from: com.google.common.collect.LinkedListMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractSequentialList<Object> {
        public final /* synthetic */ Object d;
        public final /* synthetic */ LinkedListMultimap e;

        public AnonymousClass1(LinkedListMultimap linkedListMultimap, Object obj) {
            this.d = obj;
            this.e = linkedListMultimap;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            return new ValueForKeyIterator(this.d, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            KeyList keyList = (KeyList) ((CompactHashMap) this.e.k).get(this.d);
            if (keyList == null) {
                return 0;
            }
            return keyList.c;
        }
    }

    public class DistinctKeyIterator implements Iterator<K> {
        public final HashSet d;
        public Node e;
        public Node f;
        public int g;

        public DistinctKeyIterator() {
            this.d = new HashSet(Maps.c(LinkedListMultimap.this.keySet().size()));
            this.e = LinkedListMultimap.this.i;
            this.g = LinkedListMultimap.this.m;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (LinkedListMultimap.this.m == this.g) {
                return this.e != null;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Node node;
            if (LinkedListMultimap.this.m != this.g) {
                throw new ConcurrentModificationException();
            }
            Node node2 = this.e;
            if (node2 == null) {
                throw new NoSuchElementException();
            }
            this.f = node2;
            Object obj = node2.d;
            HashSet hashSet = this.d;
            hashSet.add(obj);
            do {
                node = this.e.f;
                this.e = node;
                if (node == null) {
                    break;
                }
            } while (!hashSet.add(node.d));
            return this.f.d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            if (linkedListMultimap.m != this.g) {
                throw new ConcurrentModificationException();
            }
            Preconditions.q("no calls to next() since the last call to remove()", this.f != null);
            Iterators.b(new ValueForKeyIterator(this.f.d));
            this.f = null;
            this.g = linkedListMultimap.m;
        }
    }

    public static class KeyList<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Node f14892a;
        public Node b;
        public int c;

        public KeyList(Node node) {
            this.f14892a = node;
            this.b = node;
            node.i = null;
            node.h = null;
            this.c = 1;
        }
    }

    public static final class Node<K, V> extends AbstractMapEntry<K, V> {
        public final Object d;
        public Object e;
        public Node f;
        public Node g;
        public Node h;
        public Node i;

        public Node(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.e;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.e;
            this.e = obj;
            return obj2;
        }
    }

    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {
        public int d;
        public Node e;
        public Node f;
        public Node g;
        public int h;

        public NodeIterator(int i) {
            this.h = LinkedListMultimap.this.m;
            int i2 = LinkedListMultimap.this.l;
            Preconditions.l(i, i2);
            if (i < i2 / 2) {
                this.e = LinkedListMultimap.this.i;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    a();
                    Node node = this.e;
                    if (node == null) {
                        throw new NoSuchElementException();
                    }
                    this.f = node;
                    this.g = node;
                    this.e = node.f;
                    this.d++;
                    i = i3;
                }
            } else {
                this.g = LinkedListMultimap.this.j;
                this.d = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    a();
                    Node node2 = this.g;
                    if (node2 == null) {
                        throw new NoSuchElementException();
                    }
                    this.f = node2;
                    this.e = node2;
                    this.g = node2.g;
                    this.d--;
                    i = i4;
                }
            }
            this.f = null;
        }

        public final void a() {
            if (LinkedListMultimap.this.m != this.h) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            a();
            return this.e != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            a();
            return this.g != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            a();
            Node node = this.e;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f = node;
            this.g = node;
            this.e = node.f;
            this.d++;
            return node;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            a();
            Node node = this.g;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.f = node;
            this.e = node;
            this.g = node.g;
            this.d--;
            return node;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            Preconditions.q("no calls to next() since the last call to remove()", this.f != null);
            Node node = this.f;
            if (node != this.e) {
                this.g = node.g;
                this.d--;
            } else {
                this.e = node.f;
            }
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            LinkedListMultimap.h(linkedListMultimap, node);
            this.f = null;
            this.h = linkedListMultimap.m;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static void h(LinkedListMultimap linkedListMultimap, Node node) {
        Node node2 = node.g;
        Object obj = node.d;
        if (node2 != null) {
            node2.f = node.f;
        } else {
            linkedListMultimap.i = node.f;
        }
        Node node3 = node.f;
        if (node3 != null) {
            node3.g = node2;
        } else {
            linkedListMultimap.j = node2;
        }
        if (node.i == null && node.h == null) {
            KeyList keyList = (KeyList) ((CompactHashMap) linkedListMultimap.k).remove(obj);
            Objects.requireNonNull(keyList);
            keyList.c = 0;
            linkedListMultimap.m++;
        } else {
            KeyList keyList2 = (KeyList) ((CompactHashMap) linkedListMultimap.k).get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.c--;
            Node node4 = node.i;
            if (node4 == null) {
                Node node5 = node.h;
                Objects.requireNonNull(node5);
                keyList2.f14892a = node5;
            } else {
                node4.h = node.h;
            }
            Node node6 = node.h;
            if (node6 == null) {
                Node node7 = node.i;
                Objects.requireNonNull(node7);
                keyList2.b = node7;
            } else {
                node6.i = node.i;
            }
        }
        linkedListMultimap.l--;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.k = new CompactLinkedHashMap(3);
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.l);
        for (Map.Entry entry : (List) super.l()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        return new Multimaps.AsMap(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection c() {
        return new AbstractSequentialList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final ListIterator listIterator(int i) {
                return new NodeIterator(i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return LinkedListMultimap.this.l;
            }
        };
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        this.i = null;
        this.j = null;
        ((CompactLinkedHashMap) this.k).clear();
        this.l = 0;
        this.m++;
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return ((CompactHashMap) this.k).containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean containsValue(Object obj) {
        return ((List) super.values()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        return new Sets.ImprovedAbstractSet<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                return !LinkedListMultimap.this.b(obj).isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return ((CompactHashMap) LinkedListMultimap.this.k).size();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset e() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection f() {
        return new AbstractSequentialList<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final ListIterator listIterator(int i) {
                final NodeIterator nodeIterator = new NodeIterator(i);
                return new TransformedListIterator<Map.Entry<Object, Object>, Object>(nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    @Override // com.google.common.collect.TransformedIterator
                    public final Object a(Object obj) {
                        return ((Map.Entry) obj).getValue();
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public final void set(Object obj) {
                        NodeIterator nodeIterator2 = nodeIterator;
                        Preconditions.r(nodeIterator2.f != null);
                        nodeIterator2.f.e = obj;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return LinkedListMultimap.this.l;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return new AnonymousClass1(this, obj);
    }

    public final Node i(Object obj, Object obj2, Node node) {
        Node node2 = new Node(obj, obj2);
        if (this.i == null) {
            this.j = node2;
            this.i = node2;
            ((CompactHashMap) this.k).put(obj, new KeyList(node2));
            this.m++;
        } else if (node == null) {
            Node node3 = this.j;
            Objects.requireNonNull(node3);
            node3.f = node2;
            node2.g = this.j;
            this.j = node2;
            KeyList keyList = (KeyList) ((CompactHashMap) this.k).get(obj);
            if (keyList == null) {
                ((CompactHashMap) this.k).put(obj, new KeyList(node2));
                this.m++;
            } else {
                keyList.c++;
                Node node4 = keyList.b;
                node4.h = node2;
                node2.i = node4;
                keyList.b = node2;
            }
        } else {
            KeyList keyList2 = (KeyList) ((CompactHashMap) this.k).get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.c++;
            node2.g = node.g;
            node2.i = node.i;
            node2.f = node;
            node2.h = node;
            Node node5 = node.i;
            if (node5 == null) {
                keyList2.f14892a = node2;
            } else {
                node5.h = node2;
            }
            Node node6 = node.g;
            if (node6 == null) {
                this.i = node2;
            } else {
                node6.f = node2;
            }
            node.g = node2;
            node.i = node2;
        }
        this.l++;
        return node2;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean isEmpty() {
        return this.i == null;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection l() {
        return (List) super.l();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean put(Object obj, Object obj2) {
        i(obj, obj2, null);
        return true;
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return this.l;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List b(Object obj) {
        List listUnmodifiableList = Collections.unmodifiableList(Lists.b(new ValueForKeyIterator(obj)));
        Iterators.b(new ValueForKeyIterator(obj));
        return listUnmodifiableList;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        return new AnonymousClass1(this, obj);
    }

    public class ValueForKeyIterator implements ListIterator<V> {
        public final Object d;
        public int e;
        public Node f;
        public Node g;
        public Node h;

        public ValueForKeyIterator(Object obj) {
            this.d = obj;
            KeyList keyList = (KeyList) ((CompactHashMap) LinkedListMultimap.this.k).get(obj);
            this.f = keyList == null ? null : keyList.f14892a;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.h = LinkedListMultimap.this.i(this.d, obj, this.f);
            this.e++;
            this.g = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.h != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Node node = this.f;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.g = node;
            this.h = node;
            this.f = node.h;
            this.e++;
            return node.e;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.e;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            Node node = this.h;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.g = node;
            this.f = node;
            this.h = node.i;
            this.e--;
            return node.e;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.e - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            Preconditions.q("no calls to next() since the last call to remove()", this.g != null);
            Node node = this.g;
            if (node != this.f) {
                this.h = node.i;
                this.e--;
            } else {
                this.f = node.h;
            }
            LinkedListMultimap.h(LinkedListMultimap.this, node);
            this.g = null;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Preconditions.r(this.g != null);
            this.g.e = obj;
        }

        public ValueForKeyIterator(Object obj, int i) {
            KeyList keyList = (KeyList) ((CompactHashMap) LinkedListMultimap.this.k).get(obj);
            int i2 = keyList == null ? 0 : keyList.c;
            Preconditions.l(i, i2);
            if (i >= i2 / 2) {
                this.h = keyList == null ? null : keyList.b;
                this.e = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.f = keyList == null ? null : keyList.f14892a;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.d = obj;
            this.g = null;
        }
    }
}
