package au.com.woolworths.checkout.common.responsemodels;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutGiftCard;", "", "number", "", "amount", "", "<init>", "(Ljava/lang/String;F)V", "getNumber", "()Ljava/lang/String;", "getAmount", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutGiftCard {

    @SerializedName("Amount")
    private final float amount;

    @SerializedName("GiftCardNumber")
    @NotNull
    private final String number;

    public CheckoutGiftCard(@NotNull String number, float f) {
        Intrinsics.h(number, "number");
        this.number = number;
        this.amount = f;
    }

    public static /* synthetic */ CheckoutGiftCard copy$default(CheckoutGiftCard checkoutGiftCard, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutGiftCard.number;
        }
        if ((i & 2) != 0) {
            f = checkoutGiftCard.amount;
        }
        return checkoutGiftCard.copy(str, f);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final CheckoutGiftCard copy(@NotNull String number, float amount) {
        Intrinsics.h(number, "number");
        return new CheckoutGiftCard(number, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutGiftCard)) {
            return false;
        }
        CheckoutGiftCard checkoutGiftCard = (CheckoutGiftCard) other;
        return Intrinsics.c(this.number, checkoutGiftCard.number) && Float.compare(this.amount, checkoutGiftCard.amount) == 0;
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return Float.hashCode(this.amount) + (this.number.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CheckoutGiftCard(number=" + this.number + ", amount=" + this.amount + ")";
    }
}
