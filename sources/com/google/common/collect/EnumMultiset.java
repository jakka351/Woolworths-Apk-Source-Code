package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtCompatible
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    public transient Class f;
    public transient Enum[] g;
    public transient int[] h;
    public transient int i;
    public transient long j;

    public abstract class Itr<T> implements Iterator<T> {
        public int d = 0;
        public int e = -1;

        public Itr() {
        }

        public abstract Object a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                int i = this.d;
                EnumMultiset enumMultiset = EnumMultiset.this;
                if (i >= enumMultiset.g.length) {
                    return false;
                }
                if (enumMultiset.h[i] > 0) {
                    return true;
                }
                this.d = i + 1;
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.d);
            int i = this.d;
            this.e = i;
            this.d = i + 1;
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.e >= 0);
            EnumMultiset enumMultiset = EnumMultiset.this;
            int[] iArr = enumMultiset.h;
            int i = this.e;
            int i2 = iArr[i];
            if (i2 > 0) {
                enumMultiset.i--;
                enumMultiset.j -= i2;
                iArr[i] = 0;
            }
            this.e = -1;
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class cls = (Class) object;
        this.f = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.g = enumArr;
        this.h = new int[enumArr.length];
        Serialization.d(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f);
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i, Object obj) {
        Enum r9 = (Enum) obj;
        j(r9);
        CollectPreconditions.b(i, "occurrences");
        if (i == 0) {
            return e2(r9);
        }
        int iOrdinal = r9.ordinal();
        int i2 = this.h[iOrdinal];
        long j = i;
        long j2 = i2 + j;
        Preconditions.c(j2, "too many occurrences: %s", j2 <= 2147483647L);
        this.h[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.i++;
        }
        this.j += j;
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int b0(int i, Object obj) {
        if (obj != null && k(obj)) {
            Enum r1 = (Enum) obj;
            CollectPreconditions.b(i, "occurrences");
            if (i == 0) {
                return e2(obj);
            }
            int iOrdinal = r1.ordinal();
            int[] iArr = this.h;
            int i2 = iArr[iOrdinal];
            if (i2 != 0) {
                if (i2 > i) {
                    iArr[iOrdinal] = i2 - i;
                    this.j -= i;
                    return i2;
                }
                iArr[iOrdinal] = 0;
                this.i--;
                this.j -= i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.h, 0);
        this.j = 0L;
        this.i = 0;
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        if (obj == null || !k(obj)) {
            return 0;
        }
        return this.h[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int g() {
        return this.i;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator h() {
        return new EnumMultiset<Enum<Object>>.Itr<Enum<Object>>() { // from class: com.google.common.collect.EnumMultiset.1
            @Override // com.google.common.collect.EnumMultiset.Itr
            public final Object a(int i) {
                return EnumMultiset.this.g[i];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        return new EnumMultiset<Enum<Object>>.Itr<Multiset.Entry<Enum<Object>>>() { // from class: com.google.common.collect.EnumMultiset.2
            @Override // com.google.common.collect.EnumMultiset.Itr
            public final Object a(final int i) {
                return new Multisets.AbstractEntry<Enum<Object>>(this) { // from class: com.google.common.collect.EnumMultiset.2.1
                    public final /* synthetic */ AnonymousClass2 e;

                    {
                        this.e = this;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final Object a() {
                        return EnumMultiset.this.g[i];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final int getCount() {
                        return EnumMultiset.this.h[i];
                    }
                };
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    public final void j(Object obj) {
        obj.getClass();
        if (k(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f + " but got " + obj);
    }

    public final boolean k(Object obj) {
        if (obj instanceof Enum) {
            Enum r5 = (Enum) obj;
            int iOrdinal = r5.ordinal();
            Enum[] enumArr = this.g;
            if (iOrdinal < enumArr.length && enumArr[iOrdinal] == r5) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return Ints.e(this.j);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w2(Object obj) {
        Enum r6 = (Enum) obj;
        j(r6);
        CollectPreconditions.b(0, "count");
        int iOrdinal = r6.ordinal();
        int[] iArr = this.h;
        int i = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.j += 0 - i;
        if (i > 0) {
            this.i--;
        }
        return i;
    }
}
