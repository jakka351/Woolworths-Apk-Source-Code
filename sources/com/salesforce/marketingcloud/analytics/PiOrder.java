package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010 \u001a\u00020\u001aHÖ\u0001J\u0019\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010\fR\u0017\u0010\u000f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\u000f\u0010\f¨\u0006-"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiOrder;", "Landroid/os/Parcelable;", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "-deprecated_cart", "()Lcom/salesforce/marketingcloud/analytics/PiCart;", "cart", "", "-deprecated_orderNumber", "()Ljava/lang/String;", "orderNumber", "", "-deprecated_shipping", "()D", "shipping", "-deprecated_discount", "discount", "Lorg/json/JSONObject;", "-toJson", "()Lorg/json/JSONObject;", "toJson", "component1", "component2", "component3", "component4", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "Ljava/lang/String;", "D", "<init>", "(Lcom/salesforce/marketingcloud/analytics/PiCart;Ljava/lang/String;DD)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final /* data */ class PiOrder implements Parcelable {

    @NotNull
    private final PiCart cart;
    private final double discount;

    @NotNull
    private final String orderNumber;
    private final double shipping;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PiOrder> CREATOR = new b();

    /* renamed from: com.salesforce.marketingcloud.analytics.PiOrder$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final PiOrder a(@NotNull PiCart cart, @NotNull String orderNumber, double d, double d2) {
            Intrinsics.h(cart, "cart");
            Intrinsics.h(orderNumber, "orderNumber");
            return new PiOrder(cart, orderNumber, d, d2);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements Parcelable.Creator<PiOrder> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiOrder createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PiOrder(PiCart.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiOrder[] newArray(int i) {
            return new PiOrder[i];
        }
    }

    public PiOrder(@NotNull PiCart cart, @NotNull String orderNumber, double d, double d2) {
        Intrinsics.h(cart, "cart");
        Intrinsics.h(orderNumber, "orderNumber");
        this.cart = cart;
        this.orderNumber = orderNumber;
        this.shipping = d;
        this.discount = d2;
    }

    public static /* synthetic */ PiOrder copy$default(PiOrder piOrder, PiCart piCart, String str, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            piCart = piOrder.cart;
        }
        if ((i & 2) != 0) {
            str = piOrder.orderNumber;
        }
        if ((i & 4) != 0) {
            d = piOrder.shipping;
        }
        if ((i & 8) != 0) {
            d2 = piOrder.discount;
        }
        double d3 = d2;
        return piOrder.copy(piCart, str, d, d3);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final PiOrder create(@NotNull PiCart piCart, @NotNull String str, double d, double d2) {
        return INSTANCE.a(piCart, str, d, d2);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_cart, reason: not valid java name and from getter */
    public final PiCart getCart() {
        return this.cart;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_discount, reason: not valid java name and from getter */
    public final double getDiscount() {
        return this.discount;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_orderNumber, reason: not valid java name and from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_shipping, reason: not valid java name and from getter */
    public final double getShipping() {
        return this.shipping;
    }

    @JvmName
    @NotNull
    /* renamed from: -toJson, reason: not valid java name */
    public final JSONObject m95toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cart", this.cart.m85toJson());
        jSONObject.put("order_number", this.orderNumber);
        jSONObject.put("shipping", this.shipping);
        jSONObject.put("discount", this.discount);
        return jSONObject;
    }

    @JvmName
    @NotNull
    public final PiCart cart() {
        return this.cart;
    }

    @NotNull
    public final PiCart component1() {
        return this.cart;
    }

    @NotNull
    public final String component2() {
        return this.orderNumber;
    }

    public final double component3() {
        return this.shipping;
    }

    public final double component4() {
        return this.discount;
    }

    @NotNull
    public final PiOrder copy(@NotNull PiCart cart, @NotNull String orderNumber, double shipping, double discount) {
        Intrinsics.h(cart, "cart");
        Intrinsics.h(orderNumber, "orderNumber");
        return new PiOrder(cart, orderNumber, shipping, discount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName
    public final double discount() {
        return this.discount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PiOrder)) {
            return false;
        }
        PiOrder piOrder = (PiOrder) other;
        return Intrinsics.c(this.cart, piOrder.cart) && Intrinsics.c(this.orderNumber, piOrder.orderNumber) && Double.compare(this.shipping, piOrder.shipping) == 0 && Double.compare(this.discount, piOrder.discount) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.discount) + android.support.v4.media.session.a.a(this.shipping, androidx.camera.core.impl.b.c(this.cart.hashCode() * 31, 31, this.orderNumber), 31);
    }

    @JvmName
    @NotNull
    public final String orderNumber() {
        return this.orderNumber;
    }

    @JvmName
    public final double shipping() {
        return this.shipping;
    }

    @NotNull
    public String toString() {
        return "PiOrder(cart=" + this.cart + ", orderNumber=" + this.orderNumber + ", shipping=" + this.shipping + ", discount=" + this.discount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        this.cart.writeToParcel(parcel, flags);
        parcel.writeString(this.orderNumber);
        parcel.writeDouble(this.shipping);
        parcel.writeDouble(this.discount);
    }
}
