package au.com.woolworths.foundation.shop.storelocator.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/models/StoresSuburbs;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StoresSuburbs {

    /* renamed from: a, reason: collision with root package name */
    public final List f8886a;
    public final List b;

    public StoresSuburbs(ArrayList arrayList, ArrayList arrayList2) {
        this.f8886a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoresSuburbs)) {
            return false;
        }
        StoresSuburbs storesSuburbs = (StoresSuburbs) obj;
        return Intrinsics.c(this.f8886a, storesSuburbs.f8886a) && Intrinsics.c(this.b, storesSuburbs.b);
    }

    public final int hashCode() {
        List list = this.f8886a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "StoresSuburbs(stores=" + this.f8886a + ", suburbs=" + this.b + ")";
    }
}
