package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeOnlineShoppingModeVariantTileData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomeOnlineShoppingModeVariantTileData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7195a;
    public final TextWithAltApiData b;
    public final TextWithAltApiData c;
    public final HomeOnlineShoppingModeVariantTileAnalytics d;

    public HomeOnlineShoppingModeVariantTileData(String str, TextWithAltApiData textWithAltApiData, TextWithAltApiData textWithAltApiData2, HomeOnlineShoppingModeVariantTileAnalytics homeOnlineShoppingModeVariantTileAnalytics) {
        this.f7195a = str;
        this.b = textWithAltApiData;
        this.c = textWithAltApiData2;
        this.d = homeOnlineShoppingModeVariantTileAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeOnlineShoppingModeVariantTileData)) {
            return false;
        }
        HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData = (HomeOnlineShoppingModeVariantTileData) obj;
        return Intrinsics.c(this.f7195a, homeOnlineShoppingModeVariantTileData.f7195a) && Intrinsics.c(this.b, homeOnlineShoppingModeVariantTileData.b) && Intrinsics.c(this.c, homeOnlineShoppingModeVariantTileData.c) && Intrinsics.c(this.d, homeOnlineShoppingModeVariantTileData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f7195a.hashCode() * 31;
        TextWithAltApiData textWithAltApiData = this.b;
        int iHashCode2 = (iHashCode + (textWithAltApiData == null ? 0 : textWithAltApiData.hashCode())) * 31;
        TextWithAltApiData textWithAltApiData2 = this.c;
        return this.d.f7194a.hashCode() + ((iHashCode2 + (textWithAltApiData2 != null ? textWithAltApiData2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HomeOnlineShoppingModeVariantTileData(url=" + this.f7195a + ", title=" + this.b + ", subtitle=" + this.c + ", analytics=" + this.d + ")";
    }
}
