package au.com.woolworths.feature.shop.product.availability.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/domain/StoreProductAvailabilityListData;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoreProductAvailabilityListData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7996a;

    public StoreProductAvailabilityListData(ArrayList arrayList) {
        this.f7996a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreProductAvailabilityListData) && this.f7996a.equals(((StoreProductAvailabilityListData) obj).f7996a);
    }

    public final int hashCode() {
        return this.f7996a.hashCode();
    }

    public final String toString() {
        return a.k("StoreProductAvailabilityListData(list=", ")", this.f7996a);
    }
}
