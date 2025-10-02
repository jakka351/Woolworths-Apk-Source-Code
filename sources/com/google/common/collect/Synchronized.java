package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@J2ktIncompatible
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Synchronized {

    public static final class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        public transient Set i;
        public transient Collection j;

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set entrySet() {
            Set set;
            synchronized (this.e) {
                try {
                    if (this.i == null) {
                        this.i = new SynchronizedAsMapEntries(((Map) this.d).entrySet(), this.e);
                    }
                    set = this.i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Object get(Object obj) {
            Collection collectionB;
            synchronized (this.e) {
                Collection collection = (Collection) super.get(obj);
                collectionB = collection == null ? null : Synchronized.b(this.e, collection);
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Collection values() {
            Collection collection;
            synchronized (this.e) {
                try {
                    if (this.j == null) {
                        this.j = new SynchronizedAsMapValues(((Map) this.d).values(), this.e);
                    }
                    collection = this.j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static final class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new TransformedIterator<Collection<Object>, Collection<Object>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return Synchronized.b(SynchronizedAsMapValues.this.e, (Collection) obj);
                }
            };
        }
    }

    public static final class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
        public transient Set i;
        public transient BiMap j;

        @Override // com.google.common.collect.BiMap
        public final BiMap T0() {
            BiMap biMap;
            synchronized (this.e) {
                try {
                    if (this.j == null) {
                        SynchronizedBiMap synchronizedBiMap = new SynchronizedBiMap(((BiMap) ((Map) this.d)).T0(), this.e);
                        synchronizedBiMap.j = this;
                        this.j = synchronizedBiMap;
                    }
                    biMap = this.j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return biMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        public final Map g() {
            return (BiMap) ((Map) this.d);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set values() {
            Set set;
            synchronized (this.e) {
                try {
                    if (this.i == null) {
                        this.i = new SynchronizedSet(((BiMap) ((Map) this.d)).values(), this.e);
                    }
                    set = this.i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        @Override // java.util.Deque
        public final void addFirst(Object obj) {
            synchronized (this.e) {
                ((Deque) super.g()).addFirst(obj);
            }
        }

        @Override // java.util.Deque
        public final void addLast(Object obj) {
            synchronized (this.e) {
                ((Deque) super.g()).addLast(obj);
            }
        }

        @Override // java.util.Deque
        public final Iterator descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.e) {
                itDescendingIterator = ((Deque) super.g()).descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection
        public final Collection g() {
            return (Deque) super.g();
        }

        @Override // java.util.Deque
        public final Object getFirst() {
            Object first;
            synchronized (this.e) {
                first = ((Deque) super.g()).getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public final Object getLast() {
            Object last;
            synchronized (this.e) {
                last = ((Deque) super.g()).getLast();
            }
            return last;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue
        /* renamed from: h */
        public final Queue g() {
            return (Deque) super.g();
        }

        @Override // java.util.Deque
        public final boolean offerFirst(Object obj) {
            boolean zOfferFirst;
            synchronized (this.e) {
                zOfferFirst = ((Deque) super.g()).offerFirst(obj);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public final boolean offerLast(Object obj) {
            boolean zOfferLast;
            synchronized (this.e) {
                zOfferLast = ((Deque) super.g()).offerLast(obj);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public final Object peekFirst() {
            Object objPeekFirst;
            synchronized (this.e) {
                objPeekFirst = ((Deque) super.g()).peekFirst();
            }
            return objPeekFirst;
        }

        @Override // java.util.Deque
        public final Object peekLast() {
            Object objPeekLast;
            synchronized (this.e) {
                objPeekLast = ((Deque) super.g()).peekLast();
            }
            return objPeekLast;
        }

        @Override // java.util.Deque
        public final Object pollFirst() {
            Object objPollFirst;
            synchronized (this.e) {
                objPollFirst = ((Deque) super.g()).pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.Deque
        public final Object pollLast() {
            Object objPollLast;
            synchronized (this.e) {
                objPollLast = ((Deque) super.g()).pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.Deque
        public final Object pop() {
            Object objPop;
            synchronized (this.e) {
                objPop = ((Deque) super.g()).pop();
            }
            return objPop;
        }

        @Override // java.util.Deque
        public final void push(Object obj) {
            synchronized (this.e) {
                ((Deque) super.g()).push(obj);
            }
        }

        @Override // java.util.Deque
        public final Object removeFirst() {
            Object objRemoveFirst;
            synchronized (this.e) {
                objRemoveFirst = ((Deque) super.g()).removeFirst();
            }
            return objRemoveFirst;
        }

        @Override // java.util.Deque
        public final boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.e) {
                zRemoveFirstOccurrence = ((Deque) super.g()).removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public final Object removeLast() {
            Object objRemoveLast;
            synchronized (this.e) {
                objRemoveLast = ((Deque) super.g()).removeLast();
            }
            return objRemoveLast;
        }

        @Override // java.util.Deque
        public final boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.e) {
                zRemoveLastOccurrence = ((Deque) super.g()).removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }
    }

    @GwtIncompatible
    public static final class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.e) {
                zEquals = ((Map.Entry) this.d).equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            Object key;
            synchronized (this.e) {
                key = ((Map.Entry) this.d).getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Object value;
            synchronized (this.e) {
                value = ((Map.Entry) this.d).getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = ((Map.Entry) this.d).hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object value;
            synchronized (this.e) {
                value = ((Map.Entry) this.d).setValue(obj);
            }
            return value;
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        @Override // java.util.List
        public final void add(int i, Object obj) {
            synchronized (this.e) {
                g().add(i, obj);
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            boolean zAddAll;
            synchronized (this.e) {
                zAddAll = g().addAll(i, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.e) {
                zEquals = g().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public final Object get(int i) {
            Object obj;
            synchronized (this.e) {
                obj = g().get(i);
            }
            return obj;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final List g() {
            return (List) ((Collection) this.d);
        }

        @Override // java.util.Collection, java.util.List
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = g().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.e) {
                iIndexOf = g().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.e) {
                iLastIndexOf = g().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return g().listIterator();
        }

        @Override // java.util.List
        public final Object remove(int i) {
            Object objRemove;
            synchronized (this.e) {
                objRemove = g().remove(i);
            }
            return objRemove;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            Object obj2;
            synchronized (this.e) {
                obj2 = g().set(i, obj);
            }
            return obj2;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            List listD;
            synchronized (this.e) {
                listD = Synchronized.d(this.e, g().subList(i, i2));
            }
            return listD;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return g().listIterator(i);
        }
    }

    public static final class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        public final Multimap g() {
            return (ListMultimap) ((Multimap) this.d);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List b(Object obj) {
            List listB;
            synchronized (this.e) {
                listB = ((ListMultimap) ((Multimap) this.d)).b(obj);
            }
            return listB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            List listD;
            synchronized (this.e) {
                listD = Synchronized.d(this.e, ((ListMultimap) ((Multimap) this.d)).get(obj));
            }
            return listD;
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        public transient Set f;
        public transient Collection g;
        public transient Set h;

        @Override // java.util.Map
        public final void clear() {
            synchronized (this.e) {
                g().clear();
            }
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.e) {
                zContainsKey = g().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.e) {
                zContainsValue = g().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set entrySet() {
            Set set;
            synchronized (this.e) {
                try {
                    if (this.h == null) {
                        this.h = new SynchronizedSet(g().entrySet(), this.e);
                    }
                    set = this.h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.e) {
                zEquals = g().equals(obj);
            }
            return zEquals;
        }

        public Map g() {
            return (Map) this.d;
        }

        public Object get(Object obj) {
            Object obj2;
            synchronized (this.e) {
                obj2 = g().get(obj);
            }
            return obj2;
        }

        @Override // java.util.Map
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = g().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.e) {
                zIsEmpty = g().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set keySet() {
            Set set;
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        this.f = new SynchronizedSet(g().keySet(), this.e);
                    }
                    set = this.f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public final Object put(Object obj, Object obj2) {
            Object objPut;
            synchronized (this.e) {
                objPut = g().put(obj, obj2);
            }
            return objPut;
        }

        @Override // java.util.Map
        public final void putAll(Map map) {
            synchronized (this.e) {
                g().putAll(map);
            }
        }

        @Override // java.util.Map
        public final Object remove(Object obj) {
            Object objRemove;
            synchronized (this.e) {
                objRemove = g().remove(obj);
            }
            return objRemove;
        }

        @Override // java.util.Map
        public final int size() {
            int size;
            synchronized (this.e) {
                size = g().size();
            }
            return size;
        }

        public Collection values() {
            Collection collection;
            synchronized (this.e) {
                try {
                    if (this.g == null) {
                        this.g = new SynchronizedCollection(g().values(), this.e);
                    }
                    collection = this.g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {
        public transient Collection f;

        @Override // com.google.common.collect.Multimap
        public final Multiset F() {
            synchronized (this.e) {
            }
            return null;
        }

        public Collection b(Object obj) {
            Collection collectionB;
            synchronized (this.e) {
                collectionB = g().b(obj);
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            synchronized (this.e) {
                g().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.e) {
                zContainsKey = g().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.e) {
                zEquals = g().equals(obj);
            }
            return zEquals;
        }

        public Multimap g() {
            return (Multimap) this.d;
        }

        public Collection get(Object obj) {
            Collection collectionB;
            synchronized (this.e) {
                collectionB = Synchronized.b(this.e, g().get(obj));
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Multimap
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = g().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.e) {
                zIsEmpty = g().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public final Set keySet() {
            synchronized (this.e) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public Collection l() {
            synchronized (this.e) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final Map p1() {
            synchronized (this.e) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            boolean zPut;
            synchronized (this.e) {
                zPut = g().put(obj, obj2);
            }
            return zPut;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.e) {
                zRemove = g().remove(obj, obj2);
            }
            return zRemove;
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            int size;
            synchronized (this.e) {
                size = g().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public final Collection values() {
            Collection collection;
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        this.f = new SynchronizedCollection(g().values(), this.e);
                    }
                    collection = this.f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean y1(Object obj, Object obj2) {
            boolean zY1;
            synchronized (this.e) {
                zY1 = g().y1(obj, obj2);
            }
            return zY1;
        }
    }

    public static final class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {
        public transient Set f;
        public transient Set g;

        @Override // com.google.common.collect.Multiset
        public final boolean V1(int i, Object obj) {
            boolean zV1;
            synchronized (this.e) {
                zV1 = g().V1(i, obj);
            }
            return zV1;
        }

        @Override // com.google.common.collect.Multiset
        public final int add(int i, Object obj) {
            int iAdd;
            synchronized (this.e) {
                iAdd = g().add(i, obj);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.Multiset
        public final int b0(int i, Object obj) {
            int iB0;
            synchronized (this.e) {
                iB0 = g().b0(i, obj);
            }
            return iB0;
        }

        @Override // com.google.common.collect.Multiset
        public final Set c() {
            Set set;
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        this.f = Synchronized.a(g().c(), this.e);
                    }
                    set = this.f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            int iE2;
            synchronized (this.e) {
                iE2 = g().e2(obj);
            }
            return iE2;
        }

        @Override // com.google.common.collect.Multiset
        public final Set entrySet() {
            Set set;
            synchronized (this.e) {
                try {
                    if (this.g == null) {
                        this.g = Synchronized.a(g().entrySet(), this.e);
                    }
                    set = this.g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.e) {
                zEquals = g().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Multiset g() {
            return (Multiset) ((Collection) this.d);
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = g().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multiset
        public final int w2(Object obj) {
            int iW2;
            synchronized (this.e) {
                iW2 = g().w2(obj);
            }
            return iW2;
        }
    }

    public static class SynchronizedObject implements Serializable {
        public final Object d;
        public final Object e;

        public SynchronizedObject(Object obj, Object obj2) {
            obj.getClass();
            this.d = obj;
            this.e = obj2 == null ? this : obj2;
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.e) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public final String toString() {
            String string;
            synchronized (this.e) {
                string = this.d.toString();
            }
            return string;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        @Override // java.util.Queue
        public final Object element() {
            Object objElement;
            synchronized (this.e) {
                objElement = g().element();
            }
            return objElement;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Queue g() {
            return (Queue) ((Collection) this.d);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            boolean zOffer;
            synchronized (this.e) {
                zOffer = g().offer(obj);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public final Object peek() {
            Object objPeek;
            synchronized (this.e) {
                objPeek = g().peek();
            }
            return objPeek;
        }

        @Override // java.util.Queue
        public final Object poll() {
            Object objPoll;
            synchronized (this.e) {
                objPoll = g().poll();
            }
            return objPoll;
        }

        @Override // java.util.Queue
        public final Object remove() {
            Object objRemove;
            synchronized (this.e) {
                objRemove = g().remove();
            }
            return objRemove;
        }
    }

    public static final class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.e) {
                zEquals = g().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Set g() {
            return (Set) ((Collection) this.d);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = g().hashCode();
            }
            return iHashCode;
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public SetMultimap g() {
            return (SetMultimap) ((Multimap) this.d);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set b(Object obj) {
            Set setB;
            synchronized (this.e) {
                setB = g().b(obj);
            }
            return setB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set get(Object obj) {
            SynchronizedSet synchronizedSet;
            synchronized (this.e) {
                synchronizedSet = new SynchronizedSet(g().get(obj), this.e);
            }
            return synchronizedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public final Set l() {
            synchronized (this.e) {
            }
            return null;
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        @Override // java.util.SortedMap
        public final Comparator comparator() {
            Comparator<? super K> comparator;
            synchronized (this.e) {
                comparator = g().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            Object objFirstKey;
            synchronized (this.e) {
                objFirstKey = g().firstKey();
            }
            return objFirstKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedMap g() {
            return (SortedMap) ((Map) this.d);
        }

        public SortedMap headMap(Object obj) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.e) {
                synchronizedSortedMap = new SynchronizedSortedMap(g().headMap(obj), this.e);
            }
            return synchronizedSortedMap;
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            Object objLastKey;
            synchronized (this.e) {
                objLastKey = g().lastKey();
            }
            return objLastKey;
        }

        public SortedMap subMap(Object obj, Object obj2) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.e) {
                synchronizedSortedMap = new SynchronizedSortedMap(g().subMap(obj, obj2), this.e);
            }
            return synchronizedSortedMap;
        }

        public SortedMap tailMap(Object obj) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.e) {
                synchronizedSortedMap = new SynchronizedSortedMap(g().tailMap(obj), this.e);
            }
            return synchronizedSortedMap;
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator comparator() {
            Comparator<? super E> comparator;
            synchronized (this.e) {
                comparator = g().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Object objFirst;
            synchronized (this.e) {
                objFirst = g().first();
            }
            return objFirst;
        }

        public SortedSet headSet(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.e) {
                synchronizedSortedSet = new SynchronizedSortedSet(g().headSet(obj), this.e);
            }
            return synchronizedSortedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedSet g() {
            return (SortedSet) super.g();
        }

        @Override // java.util.SortedSet
        public final Object last() {
            Object objLast;
            synchronized (this.e) {
                objLast = g().last();
            }
            return objLast;
        }

        public SortedSet subSet(Object obj, Object obj2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.e) {
                synchronizedSortedSet = new SynchronizedSortedSet(g().subSet(obj, obj2), this.e);
            }
            return synchronizedSortedSet;
        }

        public SortedSet tailSet(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.e) {
                synchronizedSortedSet = new SynchronizedSortedSet(g().tailSet(obj), this.e);
            }
            return synchronizedSortedSet;
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$2, reason: invalid class name */
        class AnonymousClass2 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function
            public final Map<Object, Object> apply(Map<Object, Object> map) {
                throw null;
            }
        }

        @Override // com.google.common.collect.Table
        public final Set W0() {
            SynchronizedSet synchronizedSet;
            synchronized (this.e) {
                synchronizedSet = new SynchronizedSet(((Table) this.d).W0(), this.e);
            }
            return synchronizedSet;
        }

        @Override // com.google.common.collect.Table
        public final Map d() {
            SynchronizedMap synchronizedMap;
            synchronized (this.e) {
                synchronizedMap = new SynchronizedMap(new Maps.TransformedEntriesMap(((Table) this.d).d(), new Maps.AnonymousClass9(new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.1
                    @Override // com.google.common.base.Function
                    public final Map<Object, Object> apply(Map<Object, Object> map) {
                        return new SynchronizedMap(map, SynchronizedTable.this.e);
                    }
                })), this.e);
            }
            return synchronizedMap;
        }

        @Override // com.google.common.collect.Table
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.e) {
                zEquals = ((Table) this.d).equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Table
        public final int hashCode() {
            int iHashCode;
            synchronized (this.e) {
                iHashCode = ((Table) this.d).hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            int size;
            synchronized (this.e) {
                size = ((Table) this.d).size();
            }
            return size;
        }
    }

    public static Set a(Set set, Object obj) {
        return set instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) set, obj) : new SynchronizedSet(set, obj);
    }

    public static Collection b(Object obj, Collection collection) {
        return collection instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) collection, obj) : collection instanceof Set ? new SynchronizedSet((Set) collection, obj) : collection instanceof List ? d(obj, (List) collection) : new SynchronizedCollection(collection, obj);
    }

    public static Map.Entry c(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    public static List d(Object obj, List list) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    public static final class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap
        public final Multimap g() {
            return (SortedSetMultimap) super.g();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap
        /* renamed from: h */
        public final SetMultimap g() {
            return (SortedSetMultimap) super.g();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet b(Object obj) {
            SortedSet sortedSetB;
            synchronized (this.e) {
                sortedSetB = ((SortedSetMultimap) super.g()).b(obj);
            }
            return sortedSetB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet get(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.e) {
                synchronizedSortedSet = new SynchronizedSortedSet(((SortedSetMultimap) super.g()).get(obj), this.e);
            }
            return synchronizedSortedSet;
        }
    }

    @VisibleForTesting
    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        @Override // java.util.Collection
        public final boolean add(Object obj) {
            boolean zAdd;
            synchronized (this.e) {
                zAdd = g().add(obj);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            boolean zAddAll;
            synchronized (this.e) {
                zAddAll = g().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public final void clear() {
            synchronized (this.e) {
                g().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.e) {
                zContains = g().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection collection) {
            boolean zContainsAll;
            synchronized (this.e) {
                zContainsAll = g().containsAll(collection);
            }
            return zContainsAll;
        }

        public Collection g() {
            return (Collection) this.d;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.e) {
                zIsEmpty = g().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator iterator() {
            return g().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.e) {
                zRemove = g().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection collection) {
            boolean zRemoveAll;
            synchronized (this.e) {
                zRemoveAll = g().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection collection) {
            boolean zRetainAll;
            synchronized (this.e) {
                zRetainAll = g().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public final int size() {
            int size;
            synchronized (this.e) {
                size = g().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.e) {
                array = g().toArray();
            }
            return array;
        }

        public Object[] toArray(Object[] objArr) {
            Object[] array;
            synchronized (this.e) {
                array = g().toArray(objArr);
            }
            return array;
        }
    }

    public static final class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.e) {
                zContains = !(obj instanceof Map.Entry) ? false : g().contains(new Maps.AnonymousClass7((Map.Entry) obj));
            }
            return zContains;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            boolean zA;
            synchronized (this.e) {
                zA = Collections2.a(g(), collection);
            }
            return zA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            boolean zB;
            if (obj == this) {
                return true;
            }
            synchronized (this.e) {
                zB = Sets.b(g(), obj);
            }
            return zB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new TransformedIterator<Map.Entry<Object, Collection<Object>>, Map.Entry<Object, Collection<Object>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<Object, Collection<Object>>(this) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1
                        public final /* synthetic */ AnonymousClass1 e;

                        {
                            this.e = this;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        public final Object P1() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* renamed from: R1 */
                        public final Map.Entry P1() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object getValue() {
                            return Synchronized.b(SynchronizedAsMapEntries.this.e, (Collection) entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.e) {
                zRemove = !(obj instanceof Map.Entry) ? false : g().remove(new Maps.AnonymousClass7((Map.Entry) obj));
            }
            return zRemove;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            boolean zK;
            synchronized (this.e) {
                zK = Iterators.k(collection, g().iterator());
            }
            return zK;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            boolean z;
            synchronized (this.e) {
                Iterator it = g().iterator();
                collection.getClass();
                z = false;
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            Object[] objArr;
            synchronized (this.e) {
                Set setG = g();
                objArr = new Object[setG.size()];
                ObjectArrays.b(setG, objArr);
            }
            return objArr;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            Object[] objArrC;
            synchronized (this.e) {
                objArrC = ObjectArrays.c(g(), objArr);
            }
            return objArrC;
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    public static final class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        public transient NavigableSet i;
        public transient NavigableMap j;
        public transient NavigableSet k;

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).ceilingEntry(obj), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            Object objCeilingKey;
            synchronized (this.e) {
                objCeilingKey = ((NavigableMap) super.g()).ceilingKey(obj);
            }
            return objCeilingKey;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            synchronized (this.e) {
                try {
                    NavigableSet navigableSet = this.i;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableMap) super.g()).descendingKeySet(), this.e);
                    this.i = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            synchronized (this.e) {
                try {
                    NavigableMap navigableMap = this.j;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    SynchronizedNavigableMap synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.g()).descendingMap(), this.e);
                    this.j = synchronizedNavigableMap;
                    return synchronizedNavigableMap;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).firstEntry(), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).floorEntry(obj), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            Object objFloorKey;
            synchronized (this.e) {
                objFloorKey = ((NavigableMap) super.g()).floorKey(obj);
            }
            return objFloorKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap
        public final Map g() {
            return (NavigableMap) super.g();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap
        /* renamed from: h */
        public final SortedMap g() {
            return (NavigableMap) super.g();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.e) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.g()).headMap(obj, z), this.e);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).higherEntry(obj), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            Object objHigherKey;
            synchronized (this.e) {
                objHigherKey = ((NavigableMap) super.g()).higherKey(obj);
            }
            return objHigherKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).lastEntry(), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).lowerEntry(obj), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            Object objLowerKey;
            synchronized (this.e) {
                objLowerKey = ((NavigableMap) super.g()).lowerKey(obj);
            }
            return objLowerKey;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            synchronized (this.e) {
                try {
                    NavigableSet navigableSet = this.k;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableMap) super.g()).navigableKeySet(), this.e);
                    this.k = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).pollFirstEntry(), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            Map.Entry entryC;
            synchronized (this.e) {
                entryC = Synchronized.c(((NavigableMap) super.g()).pollLastEntry(), this.e);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.e) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.g()).subMap(obj, z, obj2, z2), this.e);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.e) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.g()).tailMap(obj, z), this.e);
            }
            return synchronizedNavigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    public static final class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        public transient NavigableSet f;

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            Object objCeiling;
            synchronized (this.e) {
                objCeiling = ((NavigableSet) super.g()).ceiling(obj);
            }
            return objCeiling;
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((NavigableSet) super.g()).descendingIterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            synchronized (this.e) {
                try {
                    NavigableSet navigableSet = this.f;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.g()).descendingSet(), this.e);
                    this.f = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            Object objFloor;
            synchronized (this.e) {
                objFloor = ((NavigableSet) super.g()).floor(obj);
            }
            return objFloor;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection
        public final Collection g() {
            return (NavigableSet) super.g();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet
        /* renamed from: h */
        public final Set g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.e) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.g()).headSet(obj, z), this.e);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            Object objHigher;
            synchronized (this.e) {
                objHigher = ((NavigableSet) super.g()).higher(obj);
            }
            return objHigher;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet
        /* renamed from: i */
        public final SortedSet g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            Object objLower;
            synchronized (this.e) {
                objLower = ((NavigableSet) super.g()).lower(obj);
            }
            return objLower;
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            Object objPollFirst;
            synchronized (this.e) {
                objPollFirst = ((NavigableSet) super.g()).pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            Object objPollLast;
            synchronized (this.e) {
                objPollLast = ((NavigableSet) super.g()).pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.e) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.g()).subSet(obj, z, obj2, z2), this.e);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.e) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.g()).tailSet(obj, z), this.e);
            }
            return synchronizedNavigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }
}
