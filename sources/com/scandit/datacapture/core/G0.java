package com.scandit.datacapture.core;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

/* loaded from: classes6.dex */
public final class G0 implements ClosedRange {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Range f18318a;

    public G0(Range range) {
        this.f18318a = range;
    }

    public final boolean contains(Comparable value) {
        Intrinsics.h(value, "value");
        return value.compareTo(getStart()) >= 0 && value.compareTo(getEndInclusive()) <= 0;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return this.f18318a.getUpper();
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return this.f18318a.getLower();
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return ClosedRange.DefaultImpls.a(this);
    }
}
