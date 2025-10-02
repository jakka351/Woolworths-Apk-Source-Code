package au.com.woolworths.feature.shop.recipes.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/ShopIngredientButton;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShopIngredientButton {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f8023a;

    public ShopIngredientButton(ButtonApiData buttonApiData) {
        this.f8023a = buttonApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopIngredientButton) && Intrinsics.c(this.f8023a, ((ShopIngredientButton) obj).f8023a);
    }

    public final int hashCode() {
        return this.f8023a.hashCode();
    }

    public final String toString() {
        return "ShopIngredientButton(button=" + this.f8023a + ")";
    }
}
