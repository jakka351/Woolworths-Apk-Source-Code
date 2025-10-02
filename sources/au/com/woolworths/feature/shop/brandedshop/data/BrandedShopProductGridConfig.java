package au.com.woolworths.feature.shop.brandedshop.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopProductGridConfig;", "", "Companion", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BrandedShopProductGridConfig {
    public static final BrandedShopProductGridConfig f = new BrandedShopProductGridConfig(false, false, true, true, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6693a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopProductGridConfig$Companion;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BrandedShopProductGridConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f6693a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedShopProductGridConfig)) {
            return false;
        }
        BrandedShopProductGridConfig brandedShopProductGridConfig = (BrandedShopProductGridConfig) obj;
        return this.f6693a == brandedShopProductGridConfig.f6693a && this.b == brandedShopProductGridConfig.b && this.c == brandedShopProductGridConfig.c && this.d == brandedShopProductGridConfig.d && this.e == brandedShopProductGridConfig.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.e(b.e(b.e(Boolean.hashCode(this.f6693a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = b.v("BrandedShopProductGridConfig(inStoreMode=", ", canShowWasOrMultiBuyPrice=", ", canShowPromotionLabel=", this.f6693a, this.b);
        a.D(sbV, this.c, ", canShowMemberPriceInfo=", this.d, ", inMappedStore=");
        return YU.a.k(")", sbV, this.e);
    }
}
