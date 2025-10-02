package au.com.woolworths.feature.shop.bundles.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundleSortOption;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleSortOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f6760a;
    public final CoreRadioRowUI b;

    public BundleSortOption(String str, CoreRadioRowUI coreRadioRowUI) {
        this.f6760a = str;
        this.b = coreRadioRowUI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleSortOption)) {
            return false;
        }
        BundleSortOption bundleSortOption = (BundleSortOption) obj;
        return Intrinsics.c(this.f6760a, bundleSortOption.f6760a) && Intrinsics.c(this.b, bundleSortOption.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6760a.hashCode() * 31);
    }

    public final String toString() {
        return "BundleSortOption(id=" + this.f6760a + ", coreRadioRowUI=" + this.b + ")";
    }
}
