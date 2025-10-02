package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.MoreCollectors;
import java.util.Collections;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14908a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f14908a) {
            case 0:
                int i = CollectCollectors.f14878a;
                return new CollectCollectors.EnumSetAccumulator();
            case 1:
                MoreCollectors.ToOptionalState toOptionalState = new MoreCollectors.ToOptionalState();
                toOptionalState.f14899a = null;
                toOptionalState.b = Collections.EMPTY_LIST;
                return toOptionalState;
            case 2:
                return ImmutableSet.l();
            case 3:
                ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.e;
                return new ImmutableRangeSet.Builder();
            default:
                return ImmutableList.m();
        }
    }
}
