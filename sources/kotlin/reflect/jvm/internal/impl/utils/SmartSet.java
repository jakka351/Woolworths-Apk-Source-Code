package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SmartSet<T> extends AbstractMutableSet<T> {
    public static final /* synthetic */ int f = 0;
    public Object d;
    public int e;

    public static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {
        public final Iterator d;

        public ArrayIterator(Object[] array) {
            Intrinsics.h(array, "array");
            this.d = ArrayIteratorKt.a(array);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @SourceDebugExtension
    public static final class Companion {
        public static SmartSet a() {
            return new SmartSet(0);
        }

        public static SmartSet b(ArrayList arrayList) {
            SmartSet smartSet = new SmartSet(0);
            smartSet.addAll(arrayList);
            return smartSet;
        }
    }

    public static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {
        public final Object d;
        public boolean e = true;

        public SingletonIterator(Object obj) {
            this.d = obj;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.e) {
                throw new NoSuchElementException();
            }
            this.e = false;
            return this.d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public SmartSet(int i) {
    }

    public static final SmartSet d() {
        return Companion.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        if (getH() == 0) {
            this.d = obj;
        } else if (getH() == 1) {
            if (Intrinsics.c(this.d, obj)) {
                return false;
            }
            this.d = new Object[]{this.d, obj};
        } else if (getH() < 5) {
            Object obj2 = this.d;
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (ArraysKt.l(objArr2, obj)) {
                return false;
            }
            if (getH() == 4) {
                ?? C = SetsKt.c(Arrays.copyOf(objArr2, objArr2.length));
                C.add(obj);
                objArr = C;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, getH() + 1);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                objArr = objArrCopyOf;
            }
            this.d = objArr;
        } else {
            Object obj3 = this.d;
            Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.c(obj3).add(obj)) {
                return false;
            }
        }
        this.e = getH() + 1;
        return true;
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: b */
    public final int getH() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d = null;
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (getH() == 0) {
            return false;
        }
        if (getH() == 1) {
            return Intrinsics.c(this.d, obj);
        }
        if (getH() < 5) {
            Object obj2 = this.d;
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt.l((Object[]) obj2, obj);
        }
        Object obj3 = this.d;
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i == 1) {
            return new SingletonIterator(this.d);
        }
        if (i < 5) {
            Object obj = this.d;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new ArrayIterator((Object[]) obj);
        }
        Object obj2 = this.d;
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.c(obj2).iterator();
    }
}
