package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00107\u001a\u00020\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003JÂ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\fHÖ\u0001J\t\u0010D\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0002\u0010\u0019R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0004\u0010\u0019R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0016\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010,R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010,R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010,\"\u0004\b-\u0010.¨\u0006E"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutUnavailableProduct;", "", "isForCollection", "", "isForDelivery", "quantity", "", "minQuantity", "supplyLimit", "price", "subtotal", "productGroupSupplyLimit", "", "articleId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "volumeSize", "errorMessage", "imagePath", "isAvailable", "isRestricted", "isWeighted", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQuantity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMinQuantity", "getSupplyLimit", "getPrice", "getSubtotal", "getProductGroupSupplyLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getArticleId", "()J", "getName", "()Ljava/lang/String;", "getVolumeSize", "getErrorMessage", "getImagePath", "()Z", "setWeighted", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lau/com/woolworths/checkout/common/responsemodels/CheckoutUnavailableProduct;", "equals", "other", "hashCode", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutUnavailableProduct {

    @SerializedName("Stockcode")
    private final long articleId;

    @SerializedName("CheckoutErrorMessage")
    @Nullable
    private final String errorMessage;

    @SerializedName("ImagePath")
    @NotNull
    private final String imagePath;

    @SerializedName("IsAvailable")
    private final boolean isAvailable;

    @SerializedName("IsForCollection")
    @Nullable
    private final Boolean isForCollection;

    @SerializedName("IsForDelivery")
    @Nullable
    private final Boolean isForDelivery;

    @SerializedName("IsRestricted")
    private final boolean isRestricted;
    private boolean isWeighted;

    @SerializedName("MinQuantity")
    @Nullable
    private final Float minQuantity;

    @SerializedName("Name")
    @NotNull
    private final String name;

    @SerializedName("Price")
    @Nullable
    private final Float price;

    @SerializedName("ProductGroupSupplyLimit")
    @Nullable
    private final Integer productGroupSupplyLimit;

    @SerializedName("Quantity")
    @Nullable
    private final Float quantity;

    @SerializedName("Subtotal")
    @Nullable
    private final Float subtotal;

    @SerializedName("SupplyLimit")
    @Nullable
    private final Float supplyLimit;

    @SerializedName("VolumeSize")
    @Nullable
    private final String volumeSize;

    public CheckoutUnavailableProduct(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Integer num, long j, @NotNull String name, @Nullable String str, @Nullable String str2, @NotNull String imagePath, boolean z, boolean z2, boolean z3) {
        Intrinsics.h(name, "name");
        Intrinsics.h(imagePath, "imagePath");
        this.isForCollection = bool;
        this.isForDelivery = bool2;
        this.quantity = f;
        this.minQuantity = f2;
        this.supplyLimit = f3;
        this.price = f4;
        this.subtotal = f5;
        this.productGroupSupplyLimit = num;
        this.articleId = j;
        this.name = name;
        this.volumeSize = str;
        this.errorMessage = str2;
        this.imagePath = imagePath;
        this.isAvailable = z;
        this.isRestricted = z2;
        this.isWeighted = z3;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsForCollection() {
        return this.isForCollection;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getVolumeSize() {
        return this.volumeSize;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsRestricted() {
        return this.isRestricted;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsWeighted() {
        return this.isWeighted;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsForDelivery() {
        return this.isForDelivery;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getMinQuantity() {
        return this.minQuantity;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getSupplyLimit() {
        return this.supplyLimit;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getSubtotal() {
        return this.subtotal;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getProductGroupSupplyLimit() {
        return this.productGroupSupplyLimit;
    }

    /* renamed from: component9, reason: from getter */
    public final long getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final CheckoutUnavailableProduct copy(@Nullable Boolean isForCollection, @Nullable Boolean isForDelivery, @Nullable Float quantity, @Nullable Float minQuantity, @Nullable Float supplyLimit, @Nullable Float price, @Nullable Float subtotal, @Nullable Integer productGroupSupplyLimit, long articleId, @NotNull String name, @Nullable String volumeSize, @Nullable String errorMessage, @NotNull String imagePath, boolean isAvailable, boolean isRestricted, boolean isWeighted) {
        Intrinsics.h(name, "name");
        Intrinsics.h(imagePath, "imagePath");
        return new CheckoutUnavailableProduct(isForCollection, isForDelivery, quantity, minQuantity, supplyLimit, price, subtotal, productGroupSupplyLimit, articleId, name, volumeSize, errorMessage, imagePath, isAvailable, isRestricted, isWeighted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutUnavailableProduct)) {
            return false;
        }
        CheckoutUnavailableProduct checkoutUnavailableProduct = (CheckoutUnavailableProduct) other;
        return Intrinsics.c(this.isForCollection, checkoutUnavailableProduct.isForCollection) && Intrinsics.c(this.isForDelivery, checkoutUnavailableProduct.isForDelivery) && Intrinsics.c(this.quantity, checkoutUnavailableProduct.quantity) && Intrinsics.c(this.minQuantity, checkoutUnavailableProduct.minQuantity) && Intrinsics.c(this.supplyLimit, checkoutUnavailableProduct.supplyLimit) && Intrinsics.c(this.price, checkoutUnavailableProduct.price) && Intrinsics.c(this.subtotal, checkoutUnavailableProduct.subtotal) && Intrinsics.c(this.productGroupSupplyLimit, checkoutUnavailableProduct.productGroupSupplyLimit) && this.articleId == checkoutUnavailableProduct.articleId && Intrinsics.c(this.name, checkoutUnavailableProduct.name) && Intrinsics.c(this.volumeSize, checkoutUnavailableProduct.volumeSize) && Intrinsics.c(this.errorMessage, checkoutUnavailableProduct.errorMessage) && Intrinsics.c(this.imagePath, checkoutUnavailableProduct.imagePath) && this.isAvailable == checkoutUnavailableProduct.isAvailable && this.isRestricted == checkoutUnavailableProduct.isRestricted && this.isWeighted == checkoutUnavailableProduct.isWeighted;
    }

    public final long getArticleId() {
        return this.articleId;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getImagePath() {
        return this.imagePath;
    }

    @Nullable
    public final Float getMinQuantity() {
        return this.minQuantity;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getProductGroupSupplyLimit() {
        return this.productGroupSupplyLimit;
    }

    @Nullable
    public final Float getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final Float getSubtotal() {
        return this.subtotal;
    }

    @Nullable
    public final Float getSupplyLimit() {
        return this.supplyLimit;
    }

    @Nullable
    public final String getVolumeSize() {
        return this.volumeSize;
    }

    public int hashCode() {
        Boolean bool = this.isForCollection;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isForDelivery;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.quantity;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.minQuantity;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.supplyLimit;
        int iHashCode5 = (iHashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.price;
        int iHashCode6 = (iHashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.subtotal;
        int iHashCode7 = (iHashCode6 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Integer num = this.productGroupSupplyLimit;
        int iC = b.c(b.b((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31, 31, this.articleId), 31, this.name);
        String str = this.volumeSize;
        int iHashCode8 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        return Boolean.hashCode(this.isWeighted) + b.e(b.e(b.c((iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.imagePath), 31, this.isAvailable), 31, this.isRestricted);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @Nullable
    public final Boolean isForCollection() {
        return this.isForCollection;
    }

    @Nullable
    public final Boolean isForDelivery() {
        return this.isForDelivery;
    }

    public final boolean isRestricted() {
        return this.isRestricted;
    }

    public final boolean isWeighted() {
        return this.isWeighted;
    }

    public final void setWeighted(boolean z) {
        this.isWeighted = z;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isForCollection;
        Boolean bool2 = this.isForDelivery;
        Float f = this.quantity;
        Float f2 = this.minQuantity;
        Float f3 = this.supplyLimit;
        Float f4 = this.price;
        Float f5 = this.subtotal;
        Integer num = this.productGroupSupplyLimit;
        long j = this.articleId;
        String str = this.name;
        String str2 = this.volumeSize;
        String str3 = this.errorMessage;
        String str4 = this.imagePath;
        boolean z = this.isAvailable;
        boolean z2 = this.isRestricted;
        boolean z3 = this.isWeighted;
        StringBuilder sb = new StringBuilder("CheckoutUnavailableProduct(isForCollection=");
        sb.append(bool);
        sb.append(", isForDelivery=");
        sb.append(bool2);
        sb.append(", quantity=");
        sb.append(f);
        sb.append(", minQuantity=");
        sb.append(f2);
        sb.append(", supplyLimit=");
        sb.append(f3);
        sb.append(", price=");
        sb.append(f4);
        sb.append(", subtotal=");
        sb.append(f5);
        sb.append(", productGroupSupplyLimit=");
        sb.append(num);
        sb.append(", articleId=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        a.B(sb, ", volumeSize=", str2, ", errorMessage=", str3);
        sb.append(", imagePath=");
        sb.append(str4);
        sb.append(", isAvailable=");
        sb.append(z);
        sb.append(", isRestricted=");
        sb.append(z2);
        sb.append(", isWeighted=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
