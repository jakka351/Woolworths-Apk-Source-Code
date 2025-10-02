package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CollectionMethod;", "", "", "title", "", "Lau/com/woolworths/shop/checkout/domain/model/CollectionMethodOption;", "options", "Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;", "address", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$MarketplacePickUp;", "marketPickupSheet", "Lau/com/woolworths/shop/checkout/domain/model/ShoppingModeDetails;", "shoppingModeDetails", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "insetBanner", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$MarketplacePickUp;Lau/com/woolworths/shop/checkout/domain/model/ShoppingModeDetails;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;", "a", "()Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$MarketplacePickUp;", "c", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$MarketplacePickUp;", "Lau/com/woolworths/shop/checkout/domain/model/ShoppingModeDetails;", "e", "()Lau/com/woolworths/shop/checkout/domain/model/ShoppingModeDetails;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "b", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollectionMethod {

    @SerializedName("address")
    @NotNull
    private final CollectionAddress address;

    @SerializedName("insetBanner")
    @Nullable
    private final InsetBannerApiData insetBanner;

    @SerializedName("marketPickupSheet")
    @Nullable
    private final BottomSheetContent.MarketplacePickUp marketPickupSheet;

    @SerializedName("options")
    @NotNull
    private final List<CollectionMethodOption> options;

    @SerializedName("shoppingModeDetails")
    @Nullable
    private final ShoppingModeDetails shoppingModeDetails;

    @SerializedName("title")
    @NotNull
    private final String title;

    public CollectionMethod(@NotNull String title, @NotNull List<CollectionMethodOption> options, @NotNull CollectionAddress address, @Nullable BottomSheetContent.MarketplacePickUp marketplacePickUp, @Nullable ShoppingModeDetails shoppingModeDetails, @Nullable InsetBannerApiData insetBannerApiData) {
        Intrinsics.h(title, "title");
        Intrinsics.h(options, "options");
        Intrinsics.h(address, "address");
        this.title = title;
        this.options = options;
        this.address = address;
        this.marketPickupSheet = marketplacePickUp;
        this.shoppingModeDetails = shoppingModeDetails;
        this.insetBanner = insetBannerApiData;
    }

    /* renamed from: a, reason: from getter */
    public final CollectionAddress getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    /* renamed from: c, reason: from getter */
    public final BottomSheetContent.MarketplacePickUp getMarketPickupSheet() {
        return this.marketPickupSheet;
    }

    /* renamed from: d, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* renamed from: e, reason: from getter */
    public final ShoppingModeDetails getShoppingModeDetails() {
        return this.shoppingModeDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionMethod)) {
            return false;
        }
        CollectionMethod collectionMethod = (CollectionMethod) obj;
        return Intrinsics.c(this.title, collectionMethod.title) && Intrinsics.c(this.options, collectionMethod.options) && Intrinsics.c(this.address, collectionMethod.address) && Intrinsics.c(this.marketPickupSheet, collectionMethod.marketPickupSheet) && Intrinsics.c(this.shoppingModeDetails, collectionMethod.shoppingModeDetails) && Intrinsics.c(this.insetBanner, collectionMethod.insetBanner);
    }

    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = (this.address.hashCode() + b.d(this.title.hashCode() * 31, 31, this.options)) * 31;
        BottomSheetContent.MarketplacePickUp marketplacePickUp = this.marketPickupSheet;
        int iHashCode2 = (iHashCode + (marketplacePickUp == null ? 0 : marketplacePickUp.hashCode())) * 31;
        ShoppingModeDetails shoppingModeDetails = this.shoppingModeDetails;
        int iHashCode3 = (iHashCode2 + (shoppingModeDetails == null ? 0 : shoppingModeDetails.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.insetBanner;
        return iHashCode3 + (insetBannerApiData != null ? insetBannerApiData.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        List<CollectionMethodOption> list = this.options;
        CollectionAddress collectionAddress = this.address;
        BottomSheetContent.MarketplacePickUp marketplacePickUp = this.marketPickupSheet;
        ShoppingModeDetails shoppingModeDetails = this.shoppingModeDetails;
        InsetBannerApiData insetBannerApiData = this.insetBanner;
        StringBuilder sbS = a.s("CollectionMethod(title=", str, ", options=", ", address=", list);
        sbS.append(collectionAddress);
        sbS.append(", marketPickupSheet=");
        sbS.append(marketplacePickUp);
        sbS.append(", shoppingModeDetails=");
        sbS.append(shoppingModeDetails);
        sbS.append(", insetBanner=");
        sbS.append(insetBannerApiData);
        sbS.append(")");
        return sbS.toString();
    }
}
