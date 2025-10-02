package au.com.woolworths.base.shopapp.cartquantity;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/cartquantity/ShoppingCartItem;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingCartItem {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingCartItem) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ShoppingCartItem(articleId=null, quantity=0.0)";
    }
}
