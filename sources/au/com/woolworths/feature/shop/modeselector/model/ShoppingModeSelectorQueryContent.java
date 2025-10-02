package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelectorQueryContent;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeSelectorQueryContent {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeSelector f7541a;
    public final ShoppingModeSelectorErrorResponse b;

    public ShoppingModeSelectorQueryContent(ShoppingModeSelector shoppingModeSelector, ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse) {
        this.f7541a = shoppingModeSelector;
        this.b = shoppingModeSelectorErrorResponse;
    }

    /* renamed from: a, reason: from getter */
    public final ShoppingModeSelector getF7541a() {
        return this.f7541a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeSelectorQueryContent)) {
            return false;
        }
        ShoppingModeSelectorQueryContent shoppingModeSelectorQueryContent = (ShoppingModeSelectorQueryContent) obj;
        return Intrinsics.c(this.f7541a, shoppingModeSelectorQueryContent.f7541a) && Intrinsics.c(this.b, shoppingModeSelectorQueryContent.b);
    }

    public final int hashCode() {
        ShoppingModeSelector shoppingModeSelector = this.f7541a;
        int iHashCode = (shoppingModeSelector == null ? 0 : shoppingModeSelector.hashCode()) * 31;
        ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse = this.b;
        return iHashCode + (shoppingModeSelectorErrorResponse != null ? shoppingModeSelectorErrorResponse.hashCode() : 0);
    }

    public final String toString() {
        return "ShoppingModeSelectorQueryContent(onShoppingModeSelector=" + this.f7541a + ", onShoppingModeSelectorErrorResponse=" + this.b + ")";
    }
}
