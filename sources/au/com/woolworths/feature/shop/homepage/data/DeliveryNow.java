package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/DeliveryNow;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryNow {

    /* renamed from: a, reason: collision with root package name */
    public final String f7185a;
    public final Integer b;

    public DeliveryNow(String str, Integer num) {
        this.f7185a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryNow)) {
            return false;
        }
        DeliveryNow deliveryNow = (DeliveryNow) obj;
        return Intrinsics.c(this.f7185a, deliveryNow.f7185a) && Intrinsics.c(this.b, deliveryNow.b);
    }

    public final int hashCode() {
        int iHashCode = this.f7185a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "DeliveryNow(status=" + this.f7185a + ", expressDeliveryStoreId=" + this.b + ")";
    }
}
