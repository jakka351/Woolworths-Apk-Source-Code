package au.com.woolworths.checkout.common.responsemodels;

import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutPaymentMessage;", "", "termsAndConditions", "", "links", "", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutLink;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTermsAndConditions", "()Ljava/lang/String;", "getLinks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutPaymentMessage {

    @SerializedName("links")
    @NotNull
    private final List<CheckoutLink> links;

    @SerializedName("termsAndConditionsText")
    @NotNull
    private final String termsAndConditions;

    public CheckoutPaymentMessage(@NotNull String termsAndConditions, @NotNull List<CheckoutLink> links) {
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        Intrinsics.h(links, "links");
        this.termsAndConditions = termsAndConditions;
        this.links = links;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutPaymentMessage copy$default(CheckoutPaymentMessage checkoutPaymentMessage, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutPaymentMessage.termsAndConditions;
        }
        if ((i & 2) != 0) {
            list = checkoutPaymentMessage.links;
        }
        return checkoutPaymentMessage.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    @NotNull
    public final List<CheckoutLink> component2() {
        return this.links;
    }

    @NotNull
    public final CheckoutPaymentMessage copy(@NotNull String termsAndConditions, @NotNull List<CheckoutLink> links) {
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        Intrinsics.h(links, "links");
        return new CheckoutPaymentMessage(termsAndConditions, links);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutPaymentMessage)) {
            return false;
        }
        CheckoutPaymentMessage checkoutPaymentMessage = (CheckoutPaymentMessage) other;
        return Intrinsics.c(this.termsAndConditions, checkoutPaymentMessage.termsAndConditions) && Intrinsics.c(this.links, checkoutPaymentMessage.links);
    }

    @NotNull
    public final List<CheckoutLink> getLinks() {
        return this.links;
    }

    @NotNull
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public int hashCode() {
        return this.links.hashCode() + (this.termsAndConditions.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.i("CheckoutPaymentMessage(termsAndConditions=", this.termsAndConditions, ", links=", ")", this.links);
    }
}
