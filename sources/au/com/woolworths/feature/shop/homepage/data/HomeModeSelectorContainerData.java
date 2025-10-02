package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.Divider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeModeSelectorContainerData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomeModeSelectorContainerData {

    /* renamed from: a, reason: collision with root package name */
    public final HomeFulfilmentWindowTileData f7193a;
    public final Divider b;
    public final BaseDeliveryNowBanner c;
    public final InStoreDetailsCardData d;
    public final HomeOnlineShoppingModeVariantTileData e;

    public HomeModeSelectorContainerData(HomeFulfilmentWindowTileData homeFulfilmentWindowTileData, Divider divider, BaseDeliveryNowBanner baseDeliveryNowBanner, InStoreDetailsCardData inStoreDetailsCardData, HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData) {
        this.f7193a = homeFulfilmentWindowTileData;
        this.b = divider;
        this.c = baseDeliveryNowBanner;
        this.d = inStoreDetailsCardData;
        this.e = homeOnlineShoppingModeVariantTileData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeModeSelectorContainerData)) {
            return false;
        }
        HomeModeSelectorContainerData homeModeSelectorContainerData = (HomeModeSelectorContainerData) obj;
        return Intrinsics.c(this.f7193a, homeModeSelectorContainerData.f7193a) && Intrinsics.c(this.b, homeModeSelectorContainerData.b) && Intrinsics.c(this.c, homeModeSelectorContainerData.c) && Intrinsics.c(this.d, homeModeSelectorContainerData.d) && Intrinsics.c(this.e, homeModeSelectorContainerData.e);
    }

    public final int hashCode() {
        int i;
        HomeFulfilmentWindowTileData homeFulfilmentWindowTileData = this.f7193a;
        int iHashCode = (homeFulfilmentWindowTileData == null ? 0 : homeFulfilmentWindowTileData.hashCode()) * 31;
        Divider divider = this.b;
        if (divider == null) {
            i = 0;
        } else {
            divider.getClass();
            i = -1092045635;
        }
        int i2 = (iHashCode + i) * 31;
        BaseDeliveryNowBanner baseDeliveryNowBanner = this.c;
        int iHashCode2 = (i2 + (baseDeliveryNowBanner == null ? 0 : baseDeliveryNowBanner.hashCode())) * 31;
        InStoreDetailsCardData inStoreDetailsCardData = this.d;
        int iHashCode3 = (iHashCode2 + (inStoreDetailsCardData == null ? 0 : inStoreDetailsCardData.hashCode())) * 31;
        HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData = this.e;
        return iHashCode3 + (homeOnlineShoppingModeVariantTileData != null ? homeOnlineShoppingModeVariantTileData.hashCode() : 0);
    }

    public final String toString() {
        return "HomeModeSelectorContainerData(tileData=" + this.f7193a + ", divider=" + this.b + ", deliveryNowBanner=" + this.c + ", inStoreDetailsCard=" + this.d + ", onlineShoppingModeVariantTile=" + this.e + ")";
    }
}
