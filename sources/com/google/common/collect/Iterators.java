package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public final class Iterators {

    /* renamed from: com.google.common.collect.Iterators$10, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass10 implements Enumeration<Object> {
        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            throw null;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass2 implements Iterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$4, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass4 extends UnmodifiableIterator<List<Object>> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$6, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass6 extends TransformedIterator<Object, Object> {
        public final /* synthetic */ Function e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Iterator it, Function function) {
            super(it);
            this.e = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return this.e.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.Iterators$7, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass7 implements Iterator<Object> {
        public int d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.d++;
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$8, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass8 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        public final String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterators$9, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass9 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        public static final UnmodifiableListIterator g = new ArrayItr(new Object[0]);
        public final Object[] f;

        public ArrayItr(Object[] objArr) {
            super(objArr.length, 0);
            this.f = objArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i) {
            return this.f[i];
        }
    }

    /* loaded from: classes6.dex */
    public static class ConcatenatedIterator<T> implements Iterator<T> {
        public Iterator d;
        public Iterator e = ArrayItr.g;
        public Iterator f;
        public ArrayDeque g;

        public ConcatenatedIterator(UnmodifiableIterator unmodifiableIterator) {
            this.f = unmodifiableIterator;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator it;
            while (true) {
                Iterator it2 = this.e;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator it3 = this.f;
                    if (it3 != null && it3.hasNext()) {
                        it = this.f;
                        break;
                    }
                    ArrayDeque arrayDeque = this.g;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.f = (Iterator) this.g.removeFirst();
                }
                it = null;
                this.f = it;
                if (it == null) {
                    return false;
                }
                Iterator it4 = (Iterator) it.next();
                this.e = it4;
                if (it4 instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) it4;
                    this.e = concatenatedIterator.e;
                    if (this.g == null) {
                        this.g = new ArrayDeque();
                    }
                    this.g.addFirst(this.f);
                    if (concatenatedIterator.g != null) {
                        while (!concatenatedIterator.g.isEmpty()) {
                            this.g.addFirst((Iterator) concatenatedIterator.g.removeLast());
                        }
                    }
                    this.f = concatenatedIterator.f;
                }
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.e;
            this.d = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator it = this.d;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.d = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static final class EmptyModifiableIterator implements Iterator<Object> {
        public static final EmptyModifiableIterator d;
        public static final /* synthetic */ EmptyModifiableIterator[] e;

        static {
            EmptyModifiableIterator emptyModifiableIterator = new EmptyModifiableIterator("INSTANCE", 0);
            d = emptyModifiableIterator;
            e = new EmptyModifiableIterator[]{emptyModifiableIterator};
        }

        public static EmptyModifiableIterator valueOf(String str) {
            return (EmptyModifiableIterator) Enum.valueOf(EmptyModifiableIterator.class, str);
        }

        public static EmptyModifiableIterator[] values() {
            return (EmptyModifiableIterator[]) e.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(false);
        }
    }

    /* loaded from: classes6.dex */
    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static class PeekingImpl<E> implements PeekingIterator<E> {
        public final Iterator d;
        public boolean e;
        public Object f;

        public PeekingImpl(Iterator it) {
            it.getClass();
            this.d = it;
        }

        public final Object a() {
            if (!this.e) {
                this.f = this.d.next();
                this.e = true;
            }
            return this.f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.e) {
                return this.d.next();
            }
            Object obj = this.f;
            this.e = false;
            this.f = null;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.q("Can't remove after you've peeked at next", !this.e);
            this.d.remove();
        }
    }

    public static final class SingletonIterator<T> extends UnmodifiableIterator<T> {
        public final Object d;
        public boolean e;

        public SingletonIterator(Object obj) {
            this.d = obj;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.e;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.e) {
                throw new NoSuchElementException();
            }
            this.e = true;
            return this.d;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void b(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator c(Iterator it, Iterator it2) {
        final Iterator[] itArr = {it, it2};
        return new ConcatenatedIterator(new UnmodifiableIterator<Iterator<?>>() { // from class: com.google.common.collect.Iterators.3
            public int d = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.d < itArr.length;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.d;
                Iterator[] itArr2 = itArr;
                Iterator it3 = itArr2[i];
                Objects.requireNonNull(it3);
                int i2 = this.d;
                itArr2[i2] = null;
                this.d = i2 + 1;
                return it3;
            }
        });
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static UnmodifiableIterator e(final Iterator it, final Predicate predicate) {
        it.getClass();
        predicate.getClass();
        return new AbstractIterator<Object>() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                Object next;
                do {
                    Iterator it2 = it;
                    if (!it2.hasNext()) {
                        this.d = AbstractIterator.State.f;
                        return null;
                    }
                    next = it2.next();
                } while (!predicate.apply(next));
                return next;
            }
        };
    }

    public static Object f(Iterator it, Predicate predicate) {
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static UnmodifiableIterator g(Object... objArr) {
        if (objArr.length != 0) {
            return new ArrayItr(objArr);
        }
        Preconditions.l(0, objArr.length);
        return ArrayItr.g;
    }

    public static Object h(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    public static PeekingIterator i(Iterator it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    public static Object j(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean k(Collection collection, Iterator it) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static int l(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.e(j);
    }

    public static Iterator m(Iterator it, Function function) {
        function.getClass();
        return new AnonymousClass6(it, function);
    }

    public static UnmodifiableIterator n(final Iterator it) {
        it.getClass();
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return it.next();
            }
        };
    }
}
