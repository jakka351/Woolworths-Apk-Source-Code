package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Range;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {
    public static final ImmutableRangeMap f;
    public final transient ImmutableList d;
    public final transient ImmutableList e;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable<?>>> {
        @Override // java.util.List
        public final Object get(int i) {
            Preconditions.i(i, 0);
            if (i == 0 || i == -1) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$2, reason: invalid class name */
    class AnonymousClass2 extends ImmutableRangeMap<Comparable<?>, Object> {
        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public final /* bridge */ /* synthetic */ Map a() {
            return a();
        }

        @Override // com.google.common.collect.ImmutableRangeMap
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f14889a = new ArrayList();
    }

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        public final ImmutableMap d;

        public SerializedForm(ImmutableMap immutableMap) {
            this.d = immutableMap;
        }

        public Object readResolve() {
            ArrayList arrayList;
            ImmutableMap immutableMap = this.d;
            if (immutableMap.isEmpty()) {
                return ImmutableRangeMap.f;
            }
            Builder builder = new Builder();
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = builder.f14889a;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Range range = (Range) entry.getKey();
                Object value = entry.getValue();
                range.getClass();
                value.getClass();
                Preconditions.e("Range must not be empty, but was %s", range, !range.f());
                arrayList.add(new ImmutableEntry(range, value));
            }
            Range range2 = Range.f;
            Collections.sort(arrayList, new ByFunctionOrdering(Maps.EntryFunction.d, Range.RangeLexOrdering.d));
            ImmutableList.Builder builder2 = new ImmutableList.Builder(arrayList.size());
            ImmutableList.Builder builder3 = new ImmutableList.Builder(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                Range range3 = (Range) ((Map.Entry) arrayList.get(i)).getKey();
                if (i > 0) {
                    Range range4 = (Range) ((Map.Entry) arrayList.get(i - 1)).getKey();
                    if (range3.e(range4) && !range3.d(range4).f()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + range4 + " overlaps with entry " + range3);
                    }
                }
                builder2.h(range3);
                builder3.h(((Map.Entry) arrayList.get(i)).getValue());
            }
            return new ImmutableRangeMap(builder2.j(), builder3.j());
        }
    }

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        ImmutableList immutableList = RegularImmutableList.h;
        f = new ImmutableRangeMap(immutableList, immutableList);
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.d = immutableList;
        this.e = immutableList2;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.RangeMap
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap a() {
        ImmutableList immutableList = this.d;
        if (immutableList.isEmpty()) {
            return RegularImmutableMap.j;
        }
        Range range = Range.f;
        return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.d), this.e, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return a().equals(((RangeMap) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return Maps.i(a());
    }

    public Object writeReplace() {
        return new SerializedForm(a());
    }
}
