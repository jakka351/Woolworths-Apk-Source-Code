package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelector;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeSelector {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeHeader f7537a;
    public final ArrayList b;

    public ShoppingModeSelector(ShoppingModeHeader shoppingModeHeader, ArrayList arrayList) {
        this.f7537a = shoppingModeHeader;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeSelector)) {
            return false;
        }
        ShoppingModeSelector shoppingModeSelector = (ShoppingModeSelector) obj;
        return this.f7537a.equals(shoppingModeSelector.f7537a) && this.b.equals(shoppingModeSelector.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7537a.hashCode() * 31);
    }

    public final String toString() {
        return "ShoppingModeSelector(header=" + this.f7537a + ", sections=" + this.b + ")";
    }
}
