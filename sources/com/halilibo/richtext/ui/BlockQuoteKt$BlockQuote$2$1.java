package com.halilibo.richtext.ui;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BlockQuoteKt$BlockQuote$2$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final BlockQuoteKt$BlockQuote$2$1 f16277a = new BlockQuoteKt$BlockQuote$2$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope Layout, List measurables, long j) {
        Intrinsics.h(Layout, "$this$Layout");
        Intrinsics.h(measurables, "measurables");
        Measurable measurable = (Measurable) measurables.get(0);
        Measurable measurable2 = (Measurable) measurables.get(1);
        int iA0 = measurable.a0(Constraints.g(j));
        Placeable placeableC0 = measurable2.c0(ConstraintsKt.j(-iA0, 0, 2, j));
        int i = placeableC0.d + iA0;
        int i2 = placeableC0.e;
        return Layout.L0(i, i2, EmptyMap.d, new au.com.woolworths.foundation.rewards.offers.ui.c(iA0, 1, measurable.c0(Constraints.a(j, 0, iA0, i2, i2, 1)), placeableC0));
    }
}
