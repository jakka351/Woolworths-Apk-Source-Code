package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class FluentIterable<E> implements Iterable<E> {
    public final Optional d;

    /* renamed from: com.google.common.collect.FluentIterable$2, reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.FluentIterable$3, reason: invalid class name */
    class AnonymousClass3 extends FluentIterable<Object> {

        /* renamed from: com.google.common.collect.FluentIterable$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<Object>> {
            public AnonymousClass1(int i) {
                super(i, 0);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i) {
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return FluentIterable.d((Iterable) obj);
        }
    }

    public FluentIterable() {
        this.d = Optional.a();
    }

    public static FluentIterable d(final Iterable iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<Object>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return iterable.iterator();
            }
        };
    }

    public final FluentIterable b(Class cls) {
        Iterable iterableG = g();
        iterableG.getClass();
        cls.getClass();
        return d(new Iterables.AnonymousClass4(iterableG, Predicates.f(cls)));
    }

    public final Iterable g() {
        return (Iterable) this.d.e(this);
    }

    public final ImmutableSet h() {
        Iterable iterableG = g();
        int i = ImmutableSet.f;
        if (iterableG instanceof Collection) {
            return ImmutableSet.q((Collection) iterableG);
        }
        Iterator it = iterableG.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.m;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new SingletonImmutableSet(next);
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder(4);
        builder.a(next);
        while (it.hasNext()) {
            builder.a(it.next());
        }
        return builder.k();
    }

    public String toString() {
        Iterator it = g().iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public FluentIterable(Iterable iterable) {
        this.d = Optional.d(iterable);
    }
}
