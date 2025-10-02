package au.com.woolworths.product.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"FriendlyAislePrefix", "", "aisleNumberDisplayable", "Lau/com/woolworths/product/models/InStoreLocationData;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InStoreLocationDataKt {

    @NotNull
    private static final String FriendlyAislePrefix = "Aisle";

    @Nullable
    public static final String aisleNumberDisplayable(@NotNull InStoreLocationData inStoreLocationData) {
        String locationText;
        Intrinsics.h(inStoreLocationData, "<this>");
        InstoreLocationDetailsData details = inStoreLocationData.getDetails();
        Integer numValueOf = details != null ? Integer.valueOf(details.getAisleNumber()) : null;
        InstoreDetailsData displayInfo = inStoreLocationData.getDisplayInfo();
        if (displayInfo == null || (locationText = displayInfo.getLocationText()) == null || !StringsKt.W(locationText, FriendlyAislePrefix, false)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.toString();
        }
        return null;
    }
}
