package au.com.woolworths.shop.aem.components.model.herobanner;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/CarouselItem;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CarouselItem {

    /* renamed from: a, reason: collision with root package name */
    public final HeroBanner f10162a;

    public CarouselItem(HeroBanner heroBanner) {
        this.f10162a = heroBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarouselItem) && Intrinsics.c(this.f10162a, ((CarouselItem) obj).f10162a);
    }

    public final int hashCode() {
        HeroBanner heroBanner = this.f10162a;
        if (heroBanner == null) {
            return 0;
        }
        return heroBanner.hashCode();
    }

    public final String toString() {
        return "CarouselItem(heroBanner=" + this.f10162a + ")";
    }
}
