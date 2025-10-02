package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrderMarketDetails;", "", "address", "", "isMarketOnly", "", "sellerDetails", "", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutSellerDetails;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getAddress", "()Ljava/lang/String;", "()Z", "getSellerDetails", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutOrderMarketDetails {

    @SerializedName("Address")
    @NotNull
    private final String address;

    @SerializedName("IsMarketOnly")
    private final boolean isMarketOnly;

    @SerializedName("SellerDetails")
    @NotNull
    private final List<CheckoutSellerDetails> sellerDetails;

    public CheckoutOrderMarketDetails(@NotNull String address, boolean z, @NotNull List<CheckoutSellerDetails> sellerDetails) {
        Intrinsics.h(address, "address");
        Intrinsics.h(sellerDetails, "sellerDetails");
        this.address = address;
        this.isMarketOnly = z;
        this.sellerDetails = sellerDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutOrderMarketDetails copy$default(CheckoutOrderMarketDetails checkoutOrderMarketDetails, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutOrderMarketDetails.address;
        }
        if ((i & 2) != 0) {
            z = checkoutOrderMarketDetails.isMarketOnly;
        }
        if ((i & 4) != 0) {
            list = checkoutOrderMarketDetails.sellerDetails;
        }
        return checkoutOrderMarketDetails.copy(str, z, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMarketOnly() {
        return this.isMarketOnly;
    }

    @NotNull
    public final List<CheckoutSellerDetails> component3() {
        return this.sellerDetails;
    }

    @NotNull
    public final CheckoutOrderMarketDetails copy(@NotNull String address, boolean isMarketOnly, @NotNull List<CheckoutSellerDetails> sellerDetails) {
        Intrinsics.h(address, "address");
        Intrinsics.h(sellerDetails, "sellerDetails");
        return new CheckoutOrderMarketDetails(address, isMarketOnly, sellerDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutOrderMarketDetails)) {
            return false;
        }
        CheckoutOrderMarketDetails checkoutOrderMarketDetails = (CheckoutOrderMarketDetails) other;
        return Intrinsics.c(this.address, checkoutOrderMarketDetails.address) && this.isMarketOnly == checkoutOrderMarketDetails.isMarketOnly && Intrinsics.c(this.sellerDetails, checkoutOrderMarketDetails.sellerDetails);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final List<CheckoutSellerDetails> getSellerDetails() {
        return this.sellerDetails;
    }

    public int hashCode() {
        return this.sellerDetails.hashCode() + b.e(this.address.hashCode() * 31, 31, this.isMarketOnly);
    }

    public final boolean isMarketOnly() {
        return this.isMarketOnly;
    }

    @NotNull
    public String toString() {
        String str = this.address;
        boolean z = this.isMarketOnly;
        return a.t(androidx.constraintlayout.core.state.a.q("CheckoutOrderMarketDetails(address=", str, ", isMarketOnly=", ", sellerDetails=", z), this.sellerDetails, ")");
    }
}
