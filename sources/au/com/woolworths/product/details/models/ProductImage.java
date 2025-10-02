package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/product/details/models/ProductImage;", "Landroid/os/Parcelable;", "largeUrl", "", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLargeUrl", "()Ljava/lang/String;", "getAltText", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductImage implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductImage> CREATOR = new Creator();

    @Nullable
    private final String altText;

    @Nullable
    private final String largeUrl;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductImage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductImage(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductImage[] newArray(int i) {
            return new ProductImage[i];
        }
    }

    public ProductImage(@Nullable String str, @Nullable String str2) {
        this.largeUrl = str;
        this.altText = str2;
    }

    public static /* synthetic */ ProductImage copy$default(ProductImage productImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productImage.largeUrl;
        }
        if ((i & 2) != 0) {
            str2 = productImage.altText;
        }
        return productImage.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLargeUrl() {
        return this.largeUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @NotNull
    public final ProductImage copy(@Nullable String largeUrl, @Nullable String altText) {
        return new ProductImage(largeUrl, altText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImage)) {
            return false;
        }
        ProductImage productImage = (ProductImage) other;
        return Intrinsics.c(this.largeUrl, productImage.largeUrl) && Intrinsics.c(this.altText, productImage.altText);
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final String getLargeUrl() {
        return this.largeUrl;
    }

    public int hashCode() {
        String str = this.largeUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.altText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.j("ProductImage(largeUrl=", this.largeUrl, ", altText=", this.altText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.largeUrl);
        dest.writeString(this.altText);
    }
}
