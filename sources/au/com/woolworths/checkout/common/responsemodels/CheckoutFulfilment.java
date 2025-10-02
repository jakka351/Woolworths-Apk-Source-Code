package au.com.woolworths.checkout.common.responsemodels;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutFulfilment;", "", "method", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutFulfilment {

    @SerializedName("Label")
    @NotNull
    private final String label;

    @SerializedName("Method")
    @NotNull
    private final String method;

    public CheckoutFulfilment(@NotNull String method, @NotNull String label) {
        Intrinsics.h(method, "method");
        Intrinsics.h(label, "label");
        this.method = method;
        this.label = label;
    }

    public static /* synthetic */ CheckoutFulfilment copy$default(CheckoutFulfilment checkoutFulfilment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutFulfilment.method;
        }
        if ((i & 2) != 0) {
            str2 = checkoutFulfilment.label;
        }
        return checkoutFulfilment.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final CheckoutFulfilment copy(@NotNull String method, @NotNull String label) {
        Intrinsics.h(method, "method");
        Intrinsics.h(label, "label");
        return new CheckoutFulfilment(method, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutFulfilment)) {
            return false;
        }
        CheckoutFulfilment checkoutFulfilment = (CheckoutFulfilment) other;
        return Intrinsics.c(this.method, checkoutFulfilment.method) && Intrinsics.c(this.label, checkoutFulfilment.label);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.method.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("CheckoutFulfilment(method=", this.method, ", label=", this.label, ")");
    }
}
