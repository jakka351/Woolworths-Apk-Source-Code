package au.com.woolworths.feature.shop.product.availability.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/domain/GeoData;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GeoData {

    /* renamed from: a, reason: collision with root package name */
    public final Double f7994a;

    public GeoData(Double d) {
        this.f7994a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeoData) && Intrinsics.c(this.f7994a, ((GeoData) obj).f7994a);
    }

    public final int hashCode() {
        Double d = this.f7994a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public final String toString() {
        return "GeoData(distance=" + this.f7994a + ")";
    }
}
