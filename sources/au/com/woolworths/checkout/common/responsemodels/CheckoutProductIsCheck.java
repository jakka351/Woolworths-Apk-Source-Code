package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutProductIsCheck;", "", "liquor", "", "ranged", "weighed", "weightOnline", "tobacco", "meatStockLoss", "everydayPriceCut", "<init>", "(ZZZZZZZ)V", "getLiquor", "()Z", "getRanged", "getWeighed", "getWeightOnline", "getTobacco", "getMeatStockLoss", "getEverydayPriceCut", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutProductIsCheck {

    @SerializedName("EverydayPriceCut")
    private final boolean everydayPriceCut;

    @SerializedName("Liquor")
    private final boolean liquor;

    @SerializedName("MeatStockLoss")
    private final boolean meatStockLoss;

    @SerializedName("Ranged")
    private final boolean ranged;

    @SerializedName("Tobacco")
    private final boolean tobacco;

    @SerializedName("Weighed")
    private final boolean weighed;

    @SerializedName("WeightOnline")
    private final boolean weightOnline;

    public CheckoutProductIsCheck(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.liquor = z;
        this.ranged = z2;
        this.weighed = z3;
        this.weightOnline = z4;
        this.tobacco = z5;
        this.meatStockLoss = z6;
        this.everydayPriceCut = z7;
    }

    public static /* synthetic */ CheckoutProductIsCheck copy$default(CheckoutProductIsCheck checkoutProductIsCheck, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkoutProductIsCheck.liquor;
        }
        if ((i & 2) != 0) {
            z2 = checkoutProductIsCheck.ranged;
        }
        if ((i & 4) != 0) {
            z3 = checkoutProductIsCheck.weighed;
        }
        if ((i & 8) != 0) {
            z4 = checkoutProductIsCheck.weightOnline;
        }
        if ((i & 16) != 0) {
            z5 = checkoutProductIsCheck.tobacco;
        }
        if ((i & 32) != 0) {
            z6 = checkoutProductIsCheck.meatStockLoss;
        }
        if ((i & 64) != 0) {
            z7 = checkoutProductIsCheck.everydayPriceCut;
        }
        boolean z8 = z6;
        boolean z9 = z7;
        boolean z10 = z5;
        boolean z11 = z3;
        return checkoutProductIsCheck.copy(z, z2, z11, z4, z10, z8, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLiquor() {
        return this.liquor;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRanged() {
        return this.ranged;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWeighed() {
        return this.weighed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getWeightOnline() {
        return this.weightOnline;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTobacco() {
        return this.tobacco;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getMeatStockLoss() {
        return this.meatStockLoss;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEverydayPriceCut() {
        return this.everydayPriceCut;
    }

    @NotNull
    public final CheckoutProductIsCheck copy(boolean liquor, boolean ranged, boolean weighed, boolean weightOnline, boolean tobacco, boolean meatStockLoss, boolean everydayPriceCut) {
        return new CheckoutProductIsCheck(liquor, ranged, weighed, weightOnline, tobacco, meatStockLoss, everydayPriceCut);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutProductIsCheck)) {
            return false;
        }
        CheckoutProductIsCheck checkoutProductIsCheck = (CheckoutProductIsCheck) other;
        return this.liquor == checkoutProductIsCheck.liquor && this.ranged == checkoutProductIsCheck.ranged && this.weighed == checkoutProductIsCheck.weighed && this.weightOnline == checkoutProductIsCheck.weightOnline && this.tobacco == checkoutProductIsCheck.tobacco && this.meatStockLoss == checkoutProductIsCheck.meatStockLoss && this.everydayPriceCut == checkoutProductIsCheck.everydayPriceCut;
    }

    public final boolean getEverydayPriceCut() {
        return this.everydayPriceCut;
    }

    public final boolean getLiquor() {
        return this.liquor;
    }

    public final boolean getMeatStockLoss() {
        return this.meatStockLoss;
    }

    public final boolean getRanged() {
        return this.ranged;
    }

    public final boolean getTobacco() {
        return this.tobacco;
    }

    public final boolean getWeighed() {
        return this.weighed;
    }

    public final boolean getWeightOnline() {
        return this.weightOnline;
    }

    public int hashCode() {
        return Boolean.hashCode(this.everydayPriceCut) + b.e(b.e(b.e(b.e(b.e(Boolean.hashCode(this.liquor) * 31, 31, this.ranged), 31, this.weighed), 31, this.weightOnline), 31, this.tobacco), 31, this.meatStockLoss);
    }

    @NotNull
    public String toString() {
        boolean z = this.liquor;
        boolean z2 = this.ranged;
        boolean z3 = this.weighed;
        boolean z4 = this.weightOnline;
        boolean z5 = this.tobacco;
        boolean z6 = this.meatStockLoss;
        boolean z7 = this.everydayPriceCut;
        StringBuilder sbV = b.v("CheckoutProductIsCheck(liquor=", ", ranged=", ", weighed=", z, z2);
        a.D(sbV, z3, ", weightOnline=", z4, ", tobacco=");
        a.D(sbV, z5, ", meatStockLoss=", z6, ", everydayPriceCut=");
        return YU.a.k(")", sbV, z7);
    }
}
