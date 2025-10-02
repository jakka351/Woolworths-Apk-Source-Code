package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/FulfilmentWindowContainer;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FulfilmentWindowContainer {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f7187a;
    public final DeliveryNowBanner b;
    public final HomepageFulfilmentOrientation c;

    public FulfilmentWindowContainer(ButtonApiData buttonApiData, DeliveryNowBanner deliveryNowBanner, HomepageFulfilmentOrientation homepageFulfilmentOrientation) {
        this.f7187a = buttonApiData;
        this.b = deliveryNowBanner;
        this.c = homepageFulfilmentOrientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowContainer)) {
            return false;
        }
        FulfilmentWindowContainer fulfilmentWindowContainer = (FulfilmentWindowContainer) obj;
        return Intrinsics.c(this.f7187a, fulfilmentWindowContainer.f7187a) && Intrinsics.c(this.b, fulfilmentWindowContainer.b) && this.c == fulfilmentWindowContainer.c;
    }

    public final int hashCode() {
        int i;
        int iHashCode = this.f7187a.hashCode() * 31;
        DeliveryNowBanner deliveryNowBanner = this.b;
        if (deliveryNowBanner == null) {
            i = 0;
        } else {
            deliveryNowBanner.getClass();
            i = -495458729;
        }
        return this.c.hashCode() + ((iHashCode + i) * 31);
    }

    public final String toString() {
        return "FulfilmentWindowContainer(button=" + this.f7187a + ", deliveryNowBanner=" + this.b + ", orientation=" + this.c + ")";
    }
}
