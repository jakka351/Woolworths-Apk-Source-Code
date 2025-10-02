package au.com.woolworths.feature.shop.bundles.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlesHeader;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundlesHeader {

    /* renamed from: a, reason: collision with root package name */
    public final List f6764a;
    public final String b;
    public final BundleSortOptions c;

    public BundlesHeader(List list, String str, BundleSortOptions bundleSortOptions) {
        this.f6764a = list;
        this.b = str;
        this.c = bundleSortOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlesHeader)) {
            return false;
        }
        BundlesHeader bundlesHeader = (BundlesHeader) obj;
        return Intrinsics.c(this.f6764a, bundlesHeader.f6764a) && Intrinsics.c(this.b, bundlesHeader.b) && Intrinsics.c(this.c, bundlesHeader.c);
    }

    public final int hashCode() {
        List list = this.f6764a;
        int iC = b.c((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
        BundleSortOptions bundleSortOptions = this.c;
        return iC + (bundleSortOptions != null ? bundleSortOptions.hashCode() : 0);
    }

    public final String toString() {
        return "BundlesHeader(chips=" + this.f6764a + ", totalBundles=" + this.b + ", sortOptions=" + this.c + ")";
    }
}
