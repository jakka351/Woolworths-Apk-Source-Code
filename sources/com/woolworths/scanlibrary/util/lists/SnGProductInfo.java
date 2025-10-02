package com.woolworths.scanlibrary.util.lists;

import com.woolworths.scanlibrary.models.product.Is;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/lists/SnGProductInfo;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class SnGProductInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f21369a;
    public final Is b;

    public SnGProductInfo(String articleNumber, Is itemIs) {
        Intrinsics.h(articleNumber, "articleNumber");
        Intrinsics.h(itemIs, "itemIs");
        this.f21369a = articleNumber;
        this.b = itemIs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnGProductInfo)) {
            return false;
        }
        SnGProductInfo snGProductInfo = (SnGProductInfo) obj;
        return Intrinsics.c(this.f21369a, snGProductInfo.f21369a) && Intrinsics.c(this.b, snGProductInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21369a.hashCode() * 31);
    }

    public final String toString() {
        return "SnGProductInfo(articleNumber=" + this.f21369a + ", itemIs=" + this.b + ")";
    }
}
