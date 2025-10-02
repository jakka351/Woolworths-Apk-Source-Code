package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements BinaryOperator {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                CollectCollectors.EnumSetAccumulator enumSetAccumulator2 = (CollectCollectors.EnumSetAccumulator) obj2;
                EnumSet enumSet = enumSetAccumulator.f14879a;
                if (enumSet == null) {
                    return enumSetAccumulator2;
                }
                EnumSet enumSet2 = enumSetAccumulator2.f14879a;
                if (enumSet2 == null) {
                    return enumSetAccumulator;
                }
                enumSet.addAll(enumSet2);
                return enumSetAccumulator;
            case 1:
                ImmutableList.Builder builder = (ImmutableList.Builder) obj;
                ImmutableList.Builder builder2 = (ImmutableList.Builder) obj2;
                builder.getClass();
                builder.d(builder2.b, builder2.f14883a);
                return builder;
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                MoreCollectors.ToOptionalState toOptionalState2 = (MoreCollectors.ToOptionalState) obj2;
                if (toOptionalState.f14899a == null) {
                    return toOptionalState2;
                }
                if (toOptionalState2.f14899a == null) {
                    return toOptionalState;
                }
                if (toOptionalState.b.isEmpty()) {
                    toOptionalState.b = new ArrayList();
                }
                toOptionalState.b.add(toOptionalState2.f14899a);
                toOptionalState.b.addAll(toOptionalState2.b);
                if (toOptionalState.b.size() <= 4) {
                    return toOptionalState;
                }
                List list = toOptionalState.b;
                list.subList(4, list.size()).clear();
                toOptionalState.b(true);
                throw null;
            case 3:
                return ((ImmutableSet.Builder) obj).l((ImmutableSet.Builder) obj2);
            default:
                ImmutableRangeSet.Builder builder3 = (ImmutableRangeSet.Builder) obj;
                builder3.getClass();
                Iterator it = ((ImmutableRangeSet.Builder) obj2).f14890a.iterator();
                while (it.hasNext()) {
                    Range range = (Range) it.next();
                    Preconditions.e("range must not be empty, but was %s", range, !range.f());
                    builder3.f14890a.add(range);
                }
                return builder3;
        }
    }
}
