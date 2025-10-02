package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutInStorePrice;", "", "priceGst", "", "cupUom", "", "cupSize", "cupPrice", "uon", "<init>", "(FLjava/lang/String;FFLjava/lang/String;)V", "getPriceGst", "()F", "getCupUom", "()Ljava/lang/String;", "getCupSize", "getCupPrice", "getUon", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutInStorePrice {

    @SerializedName("CupPrice")
    private final float cupPrice;

    @SerializedName("CupSize")
    private final float cupSize;

    @SerializedName("CupUom")
    @NotNull
    private final String cupUom;

    @SerializedName("PriceGst")
    private final float priceGst;

    @SerializedName("Uom")
    @NotNull
    private final String uon;

    public CheckoutInStorePrice(float f, @NotNull String cupUom, float f2, float f3, @NotNull String uon) {
        Intrinsics.h(cupUom, "cupUom");
        Intrinsics.h(uon, "uon");
        this.priceGst = f;
        this.cupUom = cupUom;
        this.cupSize = f2;
        this.cupPrice = f3;
        this.uon = uon;
    }

    public static /* synthetic */ CheckoutInStorePrice copy$default(CheckoutInStorePrice checkoutInStorePrice, float f, String str, float f2, float f3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = checkoutInStorePrice.priceGst;
        }
        if ((i & 2) != 0) {
            str = checkoutInStorePrice.cupUom;
        }
        if ((i & 4) != 0) {
            f2 = checkoutInStorePrice.cupSize;
        }
        if ((i & 8) != 0) {
            f3 = checkoutInStorePrice.cupPrice;
        }
        if ((i & 16) != 0) {
            str2 = checkoutInStorePrice.uon;
        }
        String str3 = str2;
        float f4 = f2;
        return checkoutInStorePrice.copy(f, str, f4, f3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getPriceGst() {
        return this.priceGst;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCupUom() {
        return this.cupUom;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCupSize() {
        return this.cupSize;
    }

    /* renamed from: component4, reason: from getter */
    public final float getCupPrice() {
        return this.cupPrice;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUon() {
        return this.uon;
    }

    @NotNull
    public final CheckoutInStorePrice copy(float priceGst, @NotNull String cupUom, float cupSize, float cupPrice, @NotNull String uon) {
        Intrinsics.h(cupUom, "cupUom");
        Intrinsics.h(uon, "uon");
        return new CheckoutInStorePrice(priceGst, cupUom, cupSize, cupPrice, uon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutInStorePrice)) {
            return false;
        }
        CheckoutInStorePrice checkoutInStorePrice = (CheckoutInStorePrice) other;
        return Float.compare(this.priceGst, checkoutInStorePrice.priceGst) == 0 && Intrinsics.c(this.cupUom, checkoutInStorePrice.cupUom) && Float.compare(this.cupSize, checkoutInStorePrice.cupSize) == 0 && Float.compare(this.cupPrice, checkoutInStorePrice.cupPrice) == 0 && Intrinsics.c(this.uon, checkoutInStorePrice.uon);
    }

    public final float getCupPrice() {
        return this.cupPrice;
    }

    public final float getCupSize() {
        return this.cupSize;
    }

    @NotNull
    public final String getCupUom() {
        return this.cupUom;
    }

    public final float getPriceGst() {
        return this.priceGst;
    }

    @NotNull
    public final String getUon() {
        return this.uon;
    }

    public int hashCode() {
        return this.uon.hashCode() + a.b(this.cupPrice, a.b(this.cupSize, b.c(Float.hashCode(this.priceGst) * 31, 31, this.cupUom), 31), 31);
    }

    @NotNull
    public String toString() {
        float f = this.priceGst;
        String str = this.cupUom;
        float f2 = this.cupSize;
        float f3 = this.cupPrice;
        String str2 = this.uon;
        StringBuilder sb = new StringBuilder("CheckoutInStorePrice(priceGst=");
        sb.append(f);
        sb.append(", cupUom=");
        sb.append(str);
        sb.append(", cupSize=");
        sb.append(f2);
        sb.append(", cupPrice=");
        sb.append(f3);
        sb.append(", uon=");
        return YU.a.o(sb, str2, ")");
    }
}
