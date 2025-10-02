package com.airbnb.deeplinkdispatch.base;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/base/CompareResult;", "", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompareResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f13299a;
    public final boolean b;

    public CompareResult(String placeholderValue, boolean z) {
        Intrinsics.h(placeholderValue, "placeholderValue");
        this.f13299a = placeholderValue;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompareResult)) {
            return false;
        }
        CompareResult compareResult = (CompareResult) obj;
        return Intrinsics.c(this.f13299a, compareResult.f13299a) && this.b == compareResult.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f13299a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompareResult(placeholderValue=");
        sb.append(this.f13299a);
        sb.append(", isEmptyConfigurablePathSegmentMatch=");
        return b.s(sb, this.b, ')');
    }
}
