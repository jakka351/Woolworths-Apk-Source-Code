package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Iterables {

    /* renamed from: com.google.common.collect.Iterables$1, reason: invalid class name */
    class AnonymousClass1 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$2, reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$3, reason: invalid class name */
    class AnonymousClass3 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$4, reason: invalid class name */
    class AnonymousClass4 extends FluentIterable<Object> {
        public final /* synthetic */ Iterable e;
        public final /* synthetic */ Predicate f;

        public AnonymousClass4(Iterable iterable, Predicate predicate) {
            this.e = iterable;
            this.f = predicate;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.e(this.e.iterator(), this.f);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$7, reason: invalid class name */
    class AnonymousClass7 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$8, reason: invalid class name */
    class AnonymousClass8 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterables$9, reason: invalid class name */
    class AnonymousClass9 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            Iterables.i(null, new e(2));
            throw null;
        }
    }

    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            throw null;
        }
    }

    public static boolean a(Iterable iterable, Predicate predicate) {
        Iterator it = iterable.iterator();
        Preconditions.j(predicate, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (predicate.apply(it.next())) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    public static Iterable b(Iterable iterable, Predicate predicate) {
        iterable.getClass();
        return new AnonymousClass4(iterable, predicate);
    }

    public static Object c(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object d(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object e(Iterable iterable, Predicate predicate) {
        predicate.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean f(Iterable iterable, Predicate predicate) {
        boolean z = false;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            predicate.getClass();
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        List list = (List) iterable;
        predicate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!predicate.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        g(list, predicate, i2, i);
                    } catch (UnsupportedOperationException unused2) {
                        g(list, predicate, i2, i);
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static void g(List list, Predicate predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static Object[] h(Iterable iterable) {
        return (iterable instanceof Collection ? (Collection) iterable : Lists.b(iterable.iterator())).toArray();
    }

    public static Iterable i(final Collection collection, final Function function) {
        collection.getClass();
        return new FluentIterable<Object>() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Iterators.m(collection.iterator(), function);
            }
        };
    }
}
