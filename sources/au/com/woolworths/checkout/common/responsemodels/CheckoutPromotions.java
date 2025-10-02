package au.com.woolworths.checkout.common.responsemodels;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutPromotions;", "", "price", "", "<init>", "(F)V", "getPrice", "()F", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutPromotions {

    @SerializedName("Price")
    private final float price;

    public CheckoutPromotions(float f) {
        this.price = f;
    }

    public static /* synthetic */ CheckoutPromotions copy$default(CheckoutPromotions checkoutPromotions, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = checkoutPromotions.price;
        }
        return checkoutPromotions.copy(f);
    }

    /* renamed from: component1, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    @NotNull
    public final CheckoutPromotions copy(float price) {
        return new CheckoutPromotions(price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckoutPromotions) && Float.compare(this.price, ((CheckoutPromotions) other).price) == 0;
    }

    public final float getPrice() {
        return this.price;
    }

    public int hashCode() {
        return Float.hashCode(this.price);
    }

    @NotNull
    public String toString() {
        return "CheckoutPromotions(price=" + this.price + ")";
    }
}
