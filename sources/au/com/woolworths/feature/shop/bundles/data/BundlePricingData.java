package au.com.woolworths.feature.shop.bundles.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData;", "", "BundleStandardPricingData", "BundleComparisonPricingData", "Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData$BundleComparisonPricingData;", "Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData$BundleStandardPricingData;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BundlePricingData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData$BundleComparisonPricingData;", "Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleComparisonPricingData implements BundlePricingData {

        /* renamed from: a, reason: collision with root package name */
        public final String f6756a;

        public BundleComparisonPricingData(String str) {
            this.f6756a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BundleComparisonPricingData) && Intrinsics.c(this.f6756a, ((BundleComparisonPricingData) obj).f6756a);
        }

        public final int hashCode() {
            String str = this.f6756a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("BundleComparisonPricingData(logo=", this.f6756a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData$BundleStandardPricingData;", "Lau/com/woolworths/feature/shop/bundles/data/BundlePricingData;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundleStandardPricingData implements BundlePricingData {

        /* renamed from: a, reason: collision with root package name */
        public final String f6757a;
        public final String b;
        public final CoreTagModel c;

        public BundleStandardPricingData(String str, String str2, CoreTagModel coreTagModel) {
            this.f6757a = str;
            this.b = str2;
            this.c = coreTagModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleStandardPricingData)) {
                return false;
            }
            BundleStandardPricingData bundleStandardPricingData = (BundleStandardPricingData) obj;
            return Intrinsics.c(this.f6757a, bundleStandardPricingData.f6757a) && Intrinsics.c(this.b, bundleStandardPricingData.b) && Intrinsics.c(this.c, bundleStandardPricingData.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f6757a.hashCode() * 31, 31, this.b);
            CoreTagModel coreTagModel = this.c;
            return iC + (coreTagModel == null ? 0 : coreTagModel.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("BundleStandardPricingData(prefix=", this.f6757a, ", price=", this.b, ", tag=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
