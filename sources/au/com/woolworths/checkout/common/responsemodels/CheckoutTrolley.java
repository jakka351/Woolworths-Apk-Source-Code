package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutTrolley;", "", "subtotalInclDelivery", "", "savingsOnTrolley", "totalProducts", "deliveryFee", "items", "", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutProduct;", "checkoutRewardsSummary", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutRewardsSummary;", "<init>", "(FFFFLjava/util/List;Lau/com/woolworths/checkout/common/responsemodels/CheckoutRewardsSummary;)V", "getSubtotalInclDelivery", "()F", "getSavingsOnTrolley", "getTotalProducts", "getDeliveryFee", "getItems", "()Ljava/util/List;", "getCheckoutRewardsSummary", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutRewardsSummary;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutTrolley {

    @SerializedName("WowRewardsSummary")
    @NotNull
    private final CheckoutRewardsSummary checkoutRewardsSummary;

    @SerializedName("DeliveryFee")
    private final float deliveryFee;

    @SerializedName("Items")
    @NotNull
    private final List<CheckoutProduct> items;

    @SerializedName("SavingsOnTrolley")
    private final float savingsOnTrolley;

    @SerializedName("SubtotalInclDelivery")
    private final float subtotalInclDelivery;

    @SerializedName("TotalProducts")
    private final float totalProducts;

    public CheckoutTrolley(float f, float f2, float f3, float f4, @NotNull List<CheckoutProduct> items, @NotNull CheckoutRewardsSummary checkoutRewardsSummary) {
        Intrinsics.h(items, "items");
        Intrinsics.h(checkoutRewardsSummary, "checkoutRewardsSummary");
        this.subtotalInclDelivery = f;
        this.savingsOnTrolley = f2;
        this.totalProducts = f3;
        this.deliveryFee = f4;
        this.items = items;
        this.checkoutRewardsSummary = checkoutRewardsSummary;
    }

    public static /* synthetic */ CheckoutTrolley copy$default(CheckoutTrolley checkoutTrolley, float f, float f2, float f3, float f4, List list, CheckoutRewardsSummary checkoutRewardsSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            f = checkoutTrolley.subtotalInclDelivery;
        }
        if ((i & 2) != 0) {
            f2 = checkoutTrolley.savingsOnTrolley;
        }
        if ((i & 4) != 0) {
            f3 = checkoutTrolley.totalProducts;
        }
        if ((i & 8) != 0) {
            f4 = checkoutTrolley.deliveryFee;
        }
        if ((i & 16) != 0) {
            list = checkoutTrolley.items;
        }
        if ((i & 32) != 0) {
            checkoutRewardsSummary = checkoutTrolley.checkoutRewardsSummary;
        }
        List list2 = list;
        CheckoutRewardsSummary checkoutRewardsSummary2 = checkoutRewardsSummary;
        return checkoutTrolley.copy(f, f2, f3, f4, list2, checkoutRewardsSummary2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSubtotalInclDelivery() {
        return this.subtotalInclDelivery;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSavingsOnTrolley() {
        return this.savingsOnTrolley;
    }

    /* renamed from: component3, reason: from getter */
    public final float getTotalProducts() {
        return this.totalProducts;
    }

    /* renamed from: component4, reason: from getter */
    public final float getDeliveryFee() {
        return this.deliveryFee;
    }

    @NotNull
    public final List<CheckoutProduct> component5() {
        return this.items;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CheckoutRewardsSummary getCheckoutRewardsSummary() {
        return this.checkoutRewardsSummary;
    }

    @NotNull
    public final CheckoutTrolley copy(float subtotalInclDelivery, float savingsOnTrolley, float totalProducts, float deliveryFee, @NotNull List<CheckoutProduct> items, @NotNull CheckoutRewardsSummary checkoutRewardsSummary) {
        Intrinsics.h(items, "items");
        Intrinsics.h(checkoutRewardsSummary, "checkoutRewardsSummary");
        return new CheckoutTrolley(subtotalInclDelivery, savingsOnTrolley, totalProducts, deliveryFee, items, checkoutRewardsSummary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutTrolley)) {
            return false;
        }
        CheckoutTrolley checkoutTrolley = (CheckoutTrolley) other;
        return Float.compare(this.subtotalInclDelivery, checkoutTrolley.subtotalInclDelivery) == 0 && Float.compare(this.savingsOnTrolley, checkoutTrolley.savingsOnTrolley) == 0 && Float.compare(this.totalProducts, checkoutTrolley.totalProducts) == 0 && Float.compare(this.deliveryFee, checkoutTrolley.deliveryFee) == 0 && Intrinsics.c(this.items, checkoutTrolley.items) && Intrinsics.c(this.checkoutRewardsSummary, checkoutTrolley.checkoutRewardsSummary);
    }

    @NotNull
    public final CheckoutRewardsSummary getCheckoutRewardsSummary() {
        return this.checkoutRewardsSummary;
    }

    public final float getDeliveryFee() {
        return this.deliveryFee;
    }

    @NotNull
    public final List<CheckoutProduct> getItems() {
        return this.items;
    }

    public final float getSavingsOnTrolley() {
        return this.savingsOnTrolley;
    }

    public final float getSubtotalInclDelivery() {
        return this.subtotalInclDelivery;
    }

    public final float getTotalProducts() {
        return this.totalProducts;
    }

    public int hashCode() {
        return this.checkoutRewardsSummary.hashCode() + b.d(a.b(this.deliveryFee, a.b(this.totalProducts, a.b(this.savingsOnTrolley, Float.hashCode(this.subtotalInclDelivery) * 31, 31), 31), 31), 31, this.items);
    }

    @NotNull
    public String toString() {
        return "CheckoutTrolley(subtotalInclDelivery=" + this.subtotalInclDelivery + ", savingsOnTrolley=" + this.savingsOnTrolley + ", totalProducts=" + this.totalProducts + ", deliveryFee=" + this.deliveryFee + ", items=" + this.items + ", checkoutRewardsSummary=" + this.checkoutRewardsSummary + ")";
    }
}
