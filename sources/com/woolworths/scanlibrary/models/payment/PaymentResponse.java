package com.woolworths.scanlibrary.models.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.data.payment.PaymentStatus;
import com.woolworths.scanlibrary.models.product.Item;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0014HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0003JÁ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\t2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0010HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100¨\u0006H"}, d2 = {"Lcom/woolworths/scanlibrary/models/payment/PaymentResponse;", "", "cartId", "", "status", "Lcom/woolworths/scanlibrary/data/payment/PaymentStatus;", "reason", "storeId", "balanceDue", "Ljava/math/BigDecimal;", "merchantTotal", "totalPrice", "totalGst", "savings", "totalSavings", "totalQuantity", "", "rewardCardNumber", "rewardsAccrued", "discounts", "", "items", "", "Lcom/woolworths/scanlibrary/models/product/Item;", "paymentInfo", "Lcom/woolworths/scanlibrary/models/payment/PaymentInformation;", "<init>", "(Ljava/lang/String;Lcom/woolworths/scanlibrary/data/payment/PaymentStatus;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/String;Ljava/math/BigDecimal;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getCartId", "()Ljava/lang/String;", "getStatus", "()Lcom/woolworths/scanlibrary/data/payment/PaymentStatus;", "getReason", "getStoreId", "getBalanceDue", "()Ljava/math/BigDecimal;", "getMerchantTotal", "getTotalPrice", "getTotalGst", "getSavings", "getTotalSavings", "getTotalQuantity", "()I", "getRewardCardNumber", "getRewardsAccrued", "getDiscounts", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "getPaymentInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentResponse {
    public static final int $stable = 8;

    @SerializedName("balancedue")
    @NotNull
    private final BigDecimal balanceDue;

    @SerializedName("cartid")
    @NotNull
    private final String cartId;

    @SerializedName("discounts")
    @NotNull
    private final Map<String, BigDecimal> discounts;

    @SerializedName("items")
    @NotNull
    private final List<Item> items;

    @SerializedName("merchanttotal")
    @NotNull
    private final BigDecimal merchantTotal;

    @SerializedName("paymentInfo")
    @NotNull
    private final List<PaymentInformation> paymentInfo;

    @SerializedName("reason")
    @NotNull
    private final String reason;

    @SerializedName("rewardcardnumber")
    @NotNull
    private final String rewardCardNumber;

    @SerializedName("rewardsaccrued")
    @NotNull
    private final BigDecimal rewardsAccrued;

    @SerializedName("savings")
    @NotNull
    private final BigDecimal savings;

    @SerializedName("status")
    @NotNull
    private final PaymentStatus status;

    @SerializedName("storeid")
    @NotNull
    private final String storeId;

    @SerializedName("totalgst")
    @NotNull
    private final BigDecimal totalGst;

    @SerializedName("totalprice")
    @NotNull
    private final BigDecimal totalPrice;

    @SerializedName("totalquantity")
    private final int totalQuantity;

    @SerializedName("totalsavings")
    @NotNull
    private final BigDecimal totalSavings;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentResponse(@NotNull String cartId, @NotNull PaymentStatus status, @NotNull String reason, @NotNull String storeId, @NotNull BigDecimal balanceDue, @NotNull BigDecimal merchantTotal, @NotNull BigDecimal totalPrice, @NotNull BigDecimal totalGst, @NotNull BigDecimal savings, @NotNull BigDecimal totalSavings, int i, @NotNull String rewardCardNumber, @NotNull BigDecimal rewardsAccrued, @NotNull Map<String, ? extends BigDecimal> discounts, @NotNull List<Item> items, @NotNull List<PaymentInformation> paymentInfo) {
        Intrinsics.h(cartId, "cartId");
        Intrinsics.h(status, "status");
        Intrinsics.h(reason, "reason");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(balanceDue, "balanceDue");
        Intrinsics.h(merchantTotal, "merchantTotal");
        Intrinsics.h(totalPrice, "totalPrice");
        Intrinsics.h(totalGst, "totalGst");
        Intrinsics.h(savings, "savings");
        Intrinsics.h(totalSavings, "totalSavings");
        Intrinsics.h(rewardCardNumber, "rewardCardNumber");
        Intrinsics.h(rewardsAccrued, "rewardsAccrued");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(items, "items");
        Intrinsics.h(paymentInfo, "paymentInfo");
        this.cartId = cartId;
        this.status = status;
        this.reason = reason;
        this.storeId = storeId;
        this.balanceDue = balanceDue;
        this.merchantTotal = merchantTotal;
        this.totalPrice = totalPrice;
        this.totalGst = totalGst;
        this.savings = savings;
        this.totalSavings = totalSavings;
        this.totalQuantity = i;
        this.rewardCardNumber = rewardCardNumber;
        this.rewardsAccrued = rewardsAccrued;
        this.discounts = discounts;
        this.items = items;
        this.paymentInfo = paymentInfo;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final BigDecimal getTotalSavings() {
        return this.totalSavings;
    }

    /* renamed from: component11, reason: from getter */
    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getRewardCardNumber() {
        return this.rewardCardNumber;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final BigDecimal getRewardsAccrued() {
        return this.rewardsAccrued;
    }

    @NotNull
    public final Map<String, BigDecimal> component14() {
        return this.discounts;
    }

    @NotNull
    public final List<Item> component15() {
        return this.items;
    }

    @NotNull
    public final List<PaymentInformation> component16() {
        return this.paymentInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PaymentStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BigDecimal getMerchantTotal() {
        return this.merchantTotal;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BigDecimal getTotalGst() {
        return this.totalGst;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BigDecimal getSavings() {
        return this.savings;
    }

    @NotNull
    public final PaymentResponse copy(@NotNull String cartId, @NotNull PaymentStatus status, @NotNull String reason, @NotNull String storeId, @NotNull BigDecimal balanceDue, @NotNull BigDecimal merchantTotal, @NotNull BigDecimal totalPrice, @NotNull BigDecimal totalGst, @NotNull BigDecimal savings, @NotNull BigDecimal totalSavings, int totalQuantity, @NotNull String rewardCardNumber, @NotNull BigDecimal rewardsAccrued, @NotNull Map<String, ? extends BigDecimal> discounts, @NotNull List<Item> items, @NotNull List<PaymentInformation> paymentInfo) {
        Intrinsics.h(cartId, "cartId");
        Intrinsics.h(status, "status");
        Intrinsics.h(reason, "reason");
        Intrinsics.h(storeId, "storeId");
        Intrinsics.h(balanceDue, "balanceDue");
        Intrinsics.h(merchantTotal, "merchantTotal");
        Intrinsics.h(totalPrice, "totalPrice");
        Intrinsics.h(totalGst, "totalGst");
        Intrinsics.h(savings, "savings");
        Intrinsics.h(totalSavings, "totalSavings");
        Intrinsics.h(rewardCardNumber, "rewardCardNumber");
        Intrinsics.h(rewardsAccrued, "rewardsAccrued");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(items, "items");
        Intrinsics.h(paymentInfo, "paymentInfo");
        return new PaymentResponse(cartId, status, reason, storeId, balanceDue, merchantTotal, totalPrice, totalGst, savings, totalSavings, totalQuantity, rewardCardNumber, rewardsAccrued, discounts, items, paymentInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentResponse)) {
            return false;
        }
        PaymentResponse paymentResponse = (PaymentResponse) other;
        return Intrinsics.c(this.cartId, paymentResponse.cartId) && this.status == paymentResponse.status && Intrinsics.c(this.reason, paymentResponse.reason) && Intrinsics.c(this.storeId, paymentResponse.storeId) && Intrinsics.c(this.balanceDue, paymentResponse.balanceDue) && Intrinsics.c(this.merchantTotal, paymentResponse.merchantTotal) && Intrinsics.c(this.totalPrice, paymentResponse.totalPrice) && Intrinsics.c(this.totalGst, paymentResponse.totalGst) && Intrinsics.c(this.savings, paymentResponse.savings) && Intrinsics.c(this.totalSavings, paymentResponse.totalSavings) && this.totalQuantity == paymentResponse.totalQuantity && Intrinsics.c(this.rewardCardNumber, paymentResponse.rewardCardNumber) && Intrinsics.c(this.rewardsAccrued, paymentResponse.rewardsAccrued) && Intrinsics.c(this.discounts, paymentResponse.discounts) && Intrinsics.c(this.items, paymentResponse.items) && Intrinsics.c(this.paymentInfo, paymentResponse.paymentInfo);
    }

    @NotNull
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    public final String getCartId() {
        return this.cartId;
    }

    @NotNull
    public final Map<String, BigDecimal> getDiscounts() {
        return this.discounts;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final BigDecimal getMerchantTotal() {
        return this.merchantTotal;
    }

    @NotNull
    public final List<PaymentInformation> getPaymentInfo() {
        return this.paymentInfo;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getRewardCardNumber() {
        return this.rewardCardNumber;
    }

    @NotNull
    public final BigDecimal getRewardsAccrued() {
        return this.rewardsAccrued;
    }

    @NotNull
    public final BigDecimal getSavings() {
        return this.savings;
    }

    @NotNull
    public final PaymentStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStoreId() {
        return this.storeId;
    }

    @NotNull
    public final BigDecimal getTotalGst() {
        return this.totalGst;
    }

    @NotNull
    public final BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    public final BigDecimal getTotalSavings() {
        return this.totalSavings;
    }

    public int hashCode() {
        return this.paymentInfo.hashCode() + b.d(d.d(this.discounts, a.c(this.rewardsAccrued, b.c(b.a(this.totalQuantity, a.c(this.totalSavings, a.c(this.savings, a.c(this.totalGst, a.c(this.totalPrice, a.c(this.merchantTotal, a.c(this.balanceDue, b.c(b.c((this.status.hashCode() + (this.cartId.hashCode() * 31)) * 31, 31, this.reason), 31, this.storeId), 31), 31), 31), 31), 31), 31), 31), 31, this.rewardCardNumber), 31), 31), 31, this.items);
    }

    @NotNull
    public String toString() {
        String str = this.cartId;
        PaymentStatus paymentStatus = this.status;
        String str2 = this.reason;
        String str3 = this.storeId;
        BigDecimal bigDecimal = this.balanceDue;
        BigDecimal bigDecimal2 = this.merchantTotal;
        BigDecimal bigDecimal3 = this.totalPrice;
        BigDecimal bigDecimal4 = this.totalGst;
        BigDecimal bigDecimal5 = this.savings;
        BigDecimal bigDecimal6 = this.totalSavings;
        int i = this.totalQuantity;
        String str4 = this.rewardCardNumber;
        BigDecimal bigDecimal7 = this.rewardsAccrued;
        Map<String, BigDecimal> map = this.discounts;
        List<Item> list = this.items;
        List<PaymentInformation> list2 = this.paymentInfo;
        StringBuilder sb = new StringBuilder("PaymentResponse(cartId=");
        sb.append(str);
        sb.append(", status=");
        sb.append(paymentStatus);
        sb.append(", reason=");
        androidx.constraintlayout.core.state.a.B(sb, str2, ", storeId=", str3, ", balanceDue=");
        sb.append(bigDecimal);
        sb.append(", merchantTotal=");
        sb.append(bigDecimal2);
        sb.append(", totalPrice=");
        sb.append(bigDecimal3);
        sb.append(", totalGst=");
        sb.append(bigDecimal4);
        sb.append(", savings=");
        sb.append(bigDecimal5);
        sb.append(", totalSavings=");
        sb.append(bigDecimal6);
        sb.append(", totalQuantity=");
        androidx.compose.ui.input.pointer.a.u(i, ", rewardCardNumber=", str4, ", rewardsAccrued=", sb);
        sb.append(bigDecimal7);
        sb.append(", discounts=");
        sb.append(map);
        sb.append(", items=");
        sb.append(list);
        sb.append(", paymentInfo=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
