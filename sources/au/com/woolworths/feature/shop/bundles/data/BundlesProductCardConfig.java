package au.com.woolworths.feature.shop.bundles.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlesProductCardConfig;", "", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundlesProductCardConfig {
    public static final BundlesProductCardConfig e = new BundlesProductCardConfig(false, false, false, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6765a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlesProductCardConfig$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BundlesProductCardConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f6765a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static BundlesProductCardConfig a(BundlesProductCardConfig bundlesProductCardConfig, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = bundlesProductCardConfig.f6765a;
        }
        if ((i & 4) != 0) {
            z2 = bundlesProductCardConfig.b;
        }
        if ((i & 16) != 0) {
            z3 = bundlesProductCardConfig.c;
        }
        if ((i & 128) != 0) {
            z4 = bundlesProductCardConfig.d;
        }
        return new BundlesProductCardConfig(z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlesProductCardConfig)) {
            return false;
        }
        BundlesProductCardConfig bundlesProductCardConfig = (BundlesProductCardConfig) obj;
        return this.f6765a == bundlesProductCardConfig.f6765a && this.b == bundlesProductCardConfig.b && this.c == bundlesProductCardConfig.c && this.d == bundlesProductCardConfig.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + b.e(b.e(b.e(b.e(b.e(b.e(Boolean.hashCode(this.f6765a) * 31, 31, false), 31, this.b), 31, false), 31, this.c), 31, false), 31, false);
    }

    public final String toString() {
        return a.q(b.v("BundlesProductCardConfig(inStoreMode=", ", canShowWasOrMultiBuyPrice=false, canShowPromotionLabel=", ", canShowMemberPriceInfo=false, inMappedStore=", this.f6765a, this.b), this.c, ", useTappableAisle=false, shouldUseProductNameInlineLabel=false, shouldShowQuantityLabel=", this.d, ")");
    }
}
