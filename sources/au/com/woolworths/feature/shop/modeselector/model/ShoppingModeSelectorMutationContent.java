package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelectorMutationContent;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeSelectorMutationContent {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeSelector f7540a;
    public final ShoppingModeSelectorErrorResponse b;
    public final ShoppingModeSelectorRedirectResponse c;

    public ShoppingModeSelectorMutationContent(ShoppingModeSelector shoppingModeSelector, ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse, ShoppingModeSelectorRedirectResponse shoppingModeSelectorRedirectResponse) {
        this.f7540a = shoppingModeSelector;
        this.b = shoppingModeSelectorErrorResponse;
        this.c = shoppingModeSelectorRedirectResponse;
    }

    /* renamed from: a, reason: from getter */
    public final ShoppingModeSelector getF7540a() {
        return this.f7540a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeSelectorMutationContent)) {
            return false;
        }
        ShoppingModeSelectorMutationContent shoppingModeSelectorMutationContent = (ShoppingModeSelectorMutationContent) obj;
        return Intrinsics.c(this.f7540a, shoppingModeSelectorMutationContent.f7540a) && Intrinsics.c(this.b, shoppingModeSelectorMutationContent.b) && Intrinsics.c(this.c, shoppingModeSelectorMutationContent.c);
    }

    public final int hashCode() {
        ShoppingModeSelector shoppingModeSelector = this.f7540a;
        int iHashCode = (shoppingModeSelector == null ? 0 : shoppingModeSelector.hashCode()) * 31;
        ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse = this.b;
        int iHashCode2 = (iHashCode + (shoppingModeSelectorErrorResponse == null ? 0 : shoppingModeSelectorErrorResponse.hashCode())) * 31;
        ShoppingModeSelectorRedirectResponse shoppingModeSelectorRedirectResponse = this.c;
        return iHashCode2 + (shoppingModeSelectorRedirectResponse != null ? shoppingModeSelectorRedirectResponse.f7542a.hashCode() : 0);
    }

    public final String toString() {
        return "ShoppingModeSelectorMutationContent(onShoppingModeSelector=" + this.f7540a + ", onShoppingModeSelectorErrorResponse=" + this.b + ", onShoppingModeSelectorRedirectResponse=" + this.c + ")";
    }
}
