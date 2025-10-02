package au.com.woolworths.checkout.common.responsemodels;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrderTotal;", "", AnnotatedPrivateKey.LABEL, "", "value", "type", "Lau/com/woolworths/checkout/common/responsemodels/OrderTotalType;", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/checkout/common/responsemodels/OrderTotalType;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getType", "()Lau/com/woolworths/checkout/common/responsemodels/OrderTotalType;", "getIconUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutOrderTotal {

    @SerializedName("IconURL")
    @Nullable
    private final String iconUrl;

    @SerializedName("Label")
    @NotNull
    private final String label;

    @SerializedName("Type")
    @NotNull
    private final OrderTotalType type;

    @SerializedName("Value")
    @NotNull
    private final String value;

    public CheckoutOrderTotal(@NotNull String label, @NotNull String value, @NotNull OrderTotalType type, @Nullable String str) {
        Intrinsics.h(label, "label");
        Intrinsics.h(value, "value");
        Intrinsics.h(type, "type");
        this.label = label;
        this.value = value;
        this.type = type;
        this.iconUrl = str;
    }

    public static /* synthetic */ CheckoutOrderTotal copy$default(CheckoutOrderTotal checkoutOrderTotal, String str, String str2, OrderTotalType orderTotalType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutOrderTotal.label;
        }
        if ((i & 2) != 0) {
            str2 = checkoutOrderTotal.value;
        }
        if ((i & 4) != 0) {
            orderTotalType = checkoutOrderTotal.type;
        }
        if ((i & 8) != 0) {
            str3 = checkoutOrderTotal.iconUrl;
        }
        return checkoutOrderTotal.copy(str, str2, orderTotalType, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OrderTotalType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final CheckoutOrderTotal copy(@NotNull String label, @NotNull String value, @NotNull OrderTotalType type, @Nullable String iconUrl) {
        Intrinsics.h(label, "label");
        Intrinsics.h(value, "value");
        Intrinsics.h(type, "type");
        return new CheckoutOrderTotal(label, value, type, iconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutOrderTotal)) {
            return false;
        }
        CheckoutOrderTotal checkoutOrderTotal = (CheckoutOrderTotal) other;
        return Intrinsics.c(this.label, checkoutOrderTotal.label) && Intrinsics.c(this.value, checkoutOrderTotal.value) && this.type == checkoutOrderTotal.type && Intrinsics.c(this.iconUrl, checkoutOrderTotal.iconUrl);
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final OrderTotalType getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + b.c(this.label.hashCode() * 31, 31, this.value)) * 31;
        String str = this.iconUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.value;
        OrderTotalType orderTotalType = this.type;
        String str3 = this.iconUrl;
        StringBuilder sbV = a.v("CheckoutOrderTotal(label=", str, ", value=", str2, ", type=");
        sbV.append(orderTotalType);
        sbV.append(", iconUrl=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }
}
