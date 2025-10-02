package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.primitives.Ints;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset k;
    public final transient ObjectCountHashMap h;
    public final transient int i;
    public transient ImmutableSet j;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i) {
            return RegularImmutableMultiset.this.h.e(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableMultiset.this.h.c;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @GwtIncompatible
    public static class SerializedForm implements Serializable {
        public final Object[] d;
        public final int[] e;

        public SerializedForm(Multiset multiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) multiset;
            int size = immutableMultiset.entrySet().size();
            this.d = new Object[size];
            this.e = new int[size];
            int i = 0;
            for (Multiset.Entry entry : immutableMultiset.entrySet()) {
                this.d[i] = entry.a();
                this.e[i] = entry.getCount();
                i++;
            }
        }

        public Object readResolve() {
            Object[] objArr = this.d;
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                builder.d(this.e[i], objArr[i]);
            }
            return builder.e();
        }
    }

    static {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap();
        objectCountHashMap.h(3);
        k = new RegularImmutableMultiset(objectCountHashMap);
    }

    public RegularImmutableMultiset(ObjectCountHashMap objectCountHashMap) {
        this.h = objectCountHashMap;
        long jF = 0;
        for (int i = 0; i < objectCountHashMap.c; i++) {
            jF += objectCountHashMap.f(i);
        }
        this.i = Ints.e(jF);
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        return this.h.d(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: m */
    public final ImmutableSet c() {
        ImmutableSet immutableSet = this.j;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.j = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry o(int i) {
        ObjectCountHashMap objectCountHashMap = this.h;
        Preconditions.i(i, objectCountHashMap.c);
        return new ObjectCountHashMap.MapEntry(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
