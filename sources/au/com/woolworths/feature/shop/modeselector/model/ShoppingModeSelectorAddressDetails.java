package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelectorAddressDetails;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeSelectorAddressDetails {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadableAsset f7538a;
    public final String b;
    public final String c;
    public final ButtonApiData d;
    public final V1AddressDetails e;
    public final ButtonApiData f;
    public final ShoppingModeDetails g;

    public ShoppingModeSelectorAddressDetails(DownloadableAsset downloadableAsset, String str, String str2, ButtonApiData buttonApiData, V1AddressDetails v1AddressDetails, ButtonApiData buttonApiData2, ShoppingModeDetails shoppingModeDetails) {
        this.f7538a = downloadableAsset;
        this.b = str;
        this.c = str2;
        this.d = buttonApiData;
        this.e = v1AddressDetails;
        this.f = buttonApiData2;
        this.g = shoppingModeDetails;
    }

    /* renamed from: a, reason: from getter */
    public final ShoppingModeDetails getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeSelectorAddressDetails)) {
            return false;
        }
        ShoppingModeSelectorAddressDetails shoppingModeSelectorAddressDetails = (ShoppingModeSelectorAddressDetails) obj;
        return Intrinsics.c(this.f7538a, shoppingModeSelectorAddressDetails.f7538a) && Intrinsics.c(this.b, shoppingModeSelectorAddressDetails.b) && Intrinsics.c(this.c, shoppingModeSelectorAddressDetails.c) && Intrinsics.c(this.d, shoppingModeSelectorAddressDetails.d) && Intrinsics.c(this.e, shoppingModeSelectorAddressDetails.e) && Intrinsics.c(this.f, shoppingModeSelectorAddressDetails.f) && Intrinsics.c(this.g, shoppingModeSelectorAddressDetails.g);
    }

    public final int hashCode() {
        DownloadableAsset downloadableAsset = this.f7538a;
        int iHashCode = (downloadableAsset == null ? 0 : downloadableAsset.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonApiData buttonApiData = this.d;
        int iHashCode4 = (iHashCode3 + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31;
        V1AddressDetails v1AddressDetails = this.e;
        int iHashCode5 = (iHashCode4 + (v1AddressDetails == null ? 0 : v1AddressDetails.hashCode())) * 31;
        ButtonApiData buttonApiData2 = this.f;
        int iHashCode6 = (iHashCode5 + (buttonApiData2 == null ? 0 : buttonApiData2.hashCode())) * 31;
        ShoppingModeDetails shoppingModeDetails = this.g;
        return iHashCode6 + (shoppingModeDetails != null ? shoppingModeDetails.hashCode() : 0);
    }

    public final String toString() {
        return "ShoppingModeSelectorAddressDetails(image=" + this.f7538a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ", v1AddressDetails=" + this.e + ", secondaryButton=" + this.f + ", shoppingModeDetails=" + this.g + ")";
    }
}
