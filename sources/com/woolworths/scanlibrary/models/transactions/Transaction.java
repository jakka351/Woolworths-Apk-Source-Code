package com.woolworths.scanlibrary.models.transactions;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003Jl\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\rHÖ\u0001J\t\u00101\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u00062"}, d2 = {"Lcom/woolworths/scanlibrary/models/transactions/Transaction;", "", "totalGST", "", "totalPrice", "balanceDue", "Ljava/math/BigDecimal;", "cartId", "", "storeName", "txnTime", "Ljava/util/Date;", "storeId", "", "totalQuantity", "txnId", "<init>", "(DDLjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;ILjava/lang/String;)V", "getTotalGST", "()D", "getTotalPrice", "getBalanceDue", "()Ljava/math/BigDecimal;", "getCartId", "()Ljava/lang/String;", "getStoreName", "getTxnTime", "()Ljava/util/Date;", "getStoreId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalQuantity", "()I", "getTxnId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDLjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;ILjava/lang/String;)Lcom/woolworths/scanlibrary/models/transactions/Transaction;", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Transaction {
    public static final int $stable = 8;

    @SerializedName("balancedue")
    @Nullable
    private final BigDecimal balanceDue;

    @SerializedName("cartid")
    @NotNull
    private final String cartId;

    @SerializedName("storeid")
    @Nullable
    private final Integer storeId;

    @SerializedName("storeName")
    @NotNull
    private final String storeName;

    @SerializedName("totalgst")
    private final double totalGST;

    @SerializedName("totalprice")
    private final double totalPrice;

    @SerializedName("totalquantity")
    private final int totalQuantity;

    @SerializedName("txnid")
    @NotNull
    private final String txnId;

    @SerializedName("txntime")
    @NotNull
    private final Date txnTime;

    public Transaction(double d, double d2, @Nullable BigDecimal bigDecimal, @NotNull String cartId, @NotNull String storeName, @NotNull Date txnTime, @Nullable Integer num, int i, @NotNull String txnId) {
        Intrinsics.h(cartId, "cartId");
        Intrinsics.h(storeName, "storeName");
        Intrinsics.h(txnTime, "txnTime");
        Intrinsics.h(txnId, "txnId");
        this.totalGST = d;
        this.totalPrice = d2;
        this.balanceDue = bigDecimal;
        this.cartId = cartId;
        this.storeName = storeName;
        this.txnTime = txnTime;
        this.storeId = num;
        this.totalQuantity = i;
        this.txnId = txnId;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, double d, double d2, BigDecimal bigDecimal, String str, String str2, Date date, Integer num, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = transaction.totalGST;
        }
        return transaction.copy(d, (i2 & 2) != 0 ? transaction.totalPrice : d2, (i2 & 4) != 0 ? transaction.balanceDue : bigDecimal, (i2 & 8) != 0 ? transaction.cartId : str, (i2 & 16) != 0 ? transaction.storeName : str2, (i2 & 32) != 0 ? transaction.txnTime : date, (i2 & 64) != 0 ? transaction.storeId : num, (i2 & 128) != 0 ? transaction.totalQuantity : i, (i2 & 256) != 0 ? transaction.txnId : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTotalGST() {
        return this.totalGST;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Date getTxnTime() {
        return this.txnTime;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTxnId() {
        return this.txnId;
    }

    @NotNull
    public final Transaction copy(double totalGST, double totalPrice, @Nullable BigDecimal balanceDue, @NotNull String cartId, @NotNull String storeName, @NotNull Date txnTime, @Nullable Integer storeId, int totalQuantity, @NotNull String txnId) {
        Intrinsics.h(cartId, "cartId");
        Intrinsics.h(storeName, "storeName");
        Intrinsics.h(txnTime, "txnTime");
        Intrinsics.h(txnId, "txnId");
        return new Transaction(totalGST, totalPrice, balanceDue, cartId, storeName, txnTime, storeId, totalQuantity, txnId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) other;
        return Double.compare(this.totalGST, transaction.totalGST) == 0 && Double.compare(this.totalPrice, transaction.totalPrice) == 0 && Intrinsics.c(this.balanceDue, transaction.balanceDue) && Intrinsics.c(this.cartId, transaction.cartId) && Intrinsics.c(this.storeName, transaction.storeName) && Intrinsics.c(this.txnTime, transaction.txnTime) && Intrinsics.c(this.storeId, transaction.storeId) && this.totalQuantity == transaction.totalQuantity && Intrinsics.c(this.txnId, transaction.txnId);
    }

    @Nullable
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    public final String getCartId() {
        return this.cartId;
    }

    @Nullable
    public final Integer getStoreId() {
        return this.storeId;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    public final double getTotalGST() {
        return this.totalGST;
    }

    public final double getTotalPrice() {
        return this.totalPrice;
    }

    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    public final String getTxnId() {
        return this.txnId;
    }

    @NotNull
    public final Date getTxnTime() {
        return this.txnTime;
    }

    public int hashCode() {
        int iA = a.a(this.totalPrice, Double.hashCode(this.totalGST) * 31, 31);
        BigDecimal bigDecimal = this.balanceDue;
        int iHashCode = (this.txnTime.hashCode() + b.c(b.c((iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.cartId), 31, this.storeName)) * 31;
        Integer num = this.storeId;
        return this.txnId.hashCode() + b.a(this.totalQuantity, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        double d = this.totalGST;
        double d2 = this.totalPrice;
        BigDecimal bigDecimal = this.balanceDue;
        String str = this.cartId;
        String str2 = this.storeName;
        Date date = this.txnTime;
        Integer num = this.storeId;
        int i = this.totalQuantity;
        String str3 = this.txnId;
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "Transaction(totalGST=", ", totalPrice=");
        sbN.append(d2);
        sbN.append(", balanceDue=");
        sbN.append(bigDecimal);
        androidx.constraintlayout.core.state.a.B(sbN, ", cartId=", str, ", storeName=", str2);
        sbN.append(", txnTime=");
        sbN.append(date);
        sbN.append(", storeId=");
        sbN.append(num);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i, ", totalQuantity=", ", txnId=", str3, sbN);
        sbN.append(")");
        return sbN.toString();
    }

    public /* synthetic */ Transaction(double d, double d2, BigDecimal bigDecimal, String str, String str2, Date date, Integer num, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, bigDecimal, str, str2, date, (i2 & 64) != 0 ? null : num, i, str3);
    }
}
