package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.MoreCollectors;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14910a;

    public /* synthetic */ d(int i) {
        this.f14910a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f14910a) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                EnumSet enumSet = enumSetAccumulator.f14879a;
                if (enumSet == null) {
                    int i = ImmutableSet.f;
                    return RegularImmutableSet.m;
                }
                int i2 = ImmutableEnumSet.i;
                int size = enumSet.size();
                Object immutableEnumSet = size != 0 ? size != 1 ? new ImmutableEnumSet(enumSet) : new SingletonImmutableSet((Enum) Iterables.d(enumSet)) : RegularImmutableSet.m;
                enumSetAccumulator.f14879a = null;
                return immutableEnumSet;
            case 1:
                ArrayList arrayList = ((ImmutableRangeSet.Builder) obj).f14890a;
                ImmutableList.Builder builder = new ImmutableList.Builder(arrayList.size());
                Range range = Range.f;
                Collections.sort(arrayList, Range.RangeLexOrdering.d);
                PeekingIterator peekingIteratorI = Iterators.i(arrayList.iterator());
                while (peekingIteratorI.hasNext()) {
                    Range range2 = (Range) peekingIteratorI.next();
                    while (peekingIteratorI.hasNext()) {
                        Range range3 = (Range) ((Iterators.PeekingImpl) peekingIteratorI).a();
                        if (range2.e(range3)) {
                            Preconditions.h(range2.d(range3).f(), "Overlapping ranges not permitted but found %s overlapping %s", range2, range3);
                            Range range4 = (Range) peekingIteratorI.next();
                            Cut cut = range2.d;
                            int iCompareTo = cut.compareTo(range4.d);
                            Cut cut2 = range2.e;
                            Cut cut3 = range4.e;
                            int iCompareTo2 = cut2.compareTo(cut3);
                            if (iCompareTo > 0 || iCompareTo2 < 0) {
                                if (iCompareTo < 0 || iCompareTo2 > 0) {
                                    if (iCompareTo > 0) {
                                        cut = range4.d;
                                    }
                                    if (iCompareTo2 < 0) {
                                        cut2 = cut3;
                                    }
                                    range2 = new Range(cut, cut2);
                                } else {
                                    range2 = range4;
                                }
                            }
                        }
                    }
                    builder.h(range2);
                }
                ImmutableList immutableListJ = builder.j();
                return immutableListJ.isEmpty() ? ImmutableRangeSet.e : (((RegularImmutableList) immutableListJ).g == 1 && ((Range) Iterables.d(immutableListJ)).equals(Range.f)) ? ImmutableRangeSet.f : new ImmutableRangeSet(immutableListJ);
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                if (toOptionalState.b.isEmpty()) {
                    return Optional.ofNullable(toOptionalState.f14899a);
                }
                toOptionalState.b(false);
                throw null;
            case 3:
                MoreCollectors.ToOptionalState toOptionalState2 = (MoreCollectors.ToOptionalState) obj;
                Object obj2 = MoreCollectors.f14898a;
                if (toOptionalState2.f14899a == null) {
                    throw new NoSuchElementException();
                }
                if (!toOptionalState2.b.isEmpty()) {
                    toOptionalState2.b(false);
                    throw null;
                }
                Object obj3 = toOptionalState2.f14899a;
                if (obj3 == MoreCollectors.f14898a) {
                    return null;
                }
                return obj3;
            case 4:
                return ((ImmutableSet.Builder) obj).k();
            default:
                return ((ImmutableList.Builder) obj).j();
        }
    }
}
