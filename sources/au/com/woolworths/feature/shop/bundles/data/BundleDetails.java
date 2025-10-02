package au.com.woolworths.feature.shop.bundles.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundleDetails;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleDetails {

    /* renamed from: a, reason: collision with root package name */
    public final TitleTagData f6755a;
    public final String b;
    public final String c;
    public final BundlePricingData d;

    public BundleDetails(TitleTagData titleTagData, String str, String str2, BundlePricingData bundlePricingData) {
        this.f6755a = titleTagData;
        this.b = str;
        this.c = str2;
        this.d = bundlePricingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleDetails)) {
            return false;
        }
        BundleDetails bundleDetails = (BundleDetails) obj;
        return Intrinsics.c(this.f6755a, bundleDetails.f6755a) && Intrinsics.c(this.b, bundleDetails.b) && Intrinsics.c(this.c, bundleDetails.c) && Intrinsics.c(this.d, bundleDetails.d);
    }

    public final int hashCode() {
        TitleTagData titleTagData = this.f6755a;
        int iC = b.c((titleTagData == null ? 0 : titleTagData.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BundleDetails(titleTag=" + this.f6755a + ", title=" + this.b + ", description=" + this.c + ", pricing=" + this.d + ")";
    }
}
