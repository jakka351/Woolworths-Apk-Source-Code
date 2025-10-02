package au.com.woolworths.feature.shop.bundles.data.mapper;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/mapper/BundlesPageData;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundlesPageData {

    /* renamed from: a, reason: collision with root package name */
    public final BundlesData f6771a;

    public BundlesPageData(BundlesData bundlesData) {
        this.f6771a = bundlesData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BundlesPageData) && Intrinsics.c(this.f6771a, ((BundlesPageData) obj).f6771a);
    }

    public final int hashCode() {
        return this.f6771a.hashCode();
    }

    public final String toString() {
        return "BundlesPageData(bundles=" + this.f6771a + ")";
    }
}
