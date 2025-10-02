package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowSlotSelectionInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowSlotSelectionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f10609a;
    public final FulfilmentWindowsFooterIconData b;

    public FulfilmentWindowSlotSelectionInfo(String str, FulfilmentWindowsFooterIconData iconType) {
        Intrinsics.h(iconType, "iconType");
        this.f10609a = str;
        this.b = iconType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowSlotSelectionInfo)) {
            return false;
        }
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo = (FulfilmentWindowSlotSelectionInfo) obj;
        return Intrinsics.c(this.f10609a, fulfilmentWindowSlotSelectionInfo.f10609a) && this.b == fulfilmentWindowSlotSelectionInfo.b;
    }

    public final int hashCode() {
        String str = this.f10609a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "FulfilmentWindowSlotSelectionInfo(descriptionMd=" + this.f10609a + ", iconType=" + this.b + ")";
    }
}
