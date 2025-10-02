package au.com.woolworths.android.onesite.models.products;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;", "Landroid/os/Parcelable;", "imageUrl", "", "title", "sellerName", "brandName", "lowestMarketPriceDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getTitle", "getSellerName", "getBrandName", "getLowestMarketPriceDescription", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListMarketplace implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductListMarketplace> CREATOR = new Creator();

    @SerializedName("brandName")
    @NotNull
    private final String brandName;

    @SerializedName("imageUrl")
    @NotNull
    private final String imageUrl;

    @SerializedName("lowestMarketPriceDescription")
    @Nullable
    private final String lowestMarketPriceDescription;

    @SerializedName("sellerName")
    @NotNull
    private final String sellerName;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductListMarketplace> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListMarketplace createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductListMarketplace(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListMarketplace[] newArray(int i) {
            return new ProductListMarketplace[i];
        }
    }

    public ProductListMarketplace(@NotNull String imageUrl, @NotNull String title, @NotNull String sellerName, @NotNull String brandName, @Nullable String str) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(sellerName, "sellerName");
        Intrinsics.h(brandName, "brandName");
        this.imageUrl = imageUrl;
        this.title = title;
        this.sellerName = sellerName;
        this.brandName = brandName;
        this.lowestMarketPriceDescription = str;
    }

    public static /* synthetic */ ProductListMarketplace copy$default(ProductListMarketplace productListMarketplace, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productListMarketplace.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = productListMarketplace.title;
        }
        if ((i & 4) != 0) {
            str3 = productListMarketplace.sellerName;
        }
        if ((i & 8) != 0) {
            str4 = productListMarketplace.brandName;
        }
        if ((i & 16) != 0) {
            str5 = productListMarketplace.lowestMarketPriceDescription;
        }
        String str6 = str5;
        String str7 = str3;
        return productListMarketplace.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSellerName() {
        return this.sellerName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getLowestMarketPriceDescription() {
        return this.lowestMarketPriceDescription;
    }

    @NotNull
    public final ProductListMarketplace copy(@NotNull String imageUrl, @NotNull String title, @NotNull String sellerName, @NotNull String brandName, @Nullable String lowestMarketPriceDescription) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(sellerName, "sellerName");
        Intrinsics.h(brandName, "brandName");
        return new ProductListMarketplace(imageUrl, title, sellerName, brandName, lowestMarketPriceDescription);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListMarketplace)) {
            return false;
        }
        ProductListMarketplace productListMarketplace = (ProductListMarketplace) other;
        return Intrinsics.c(this.imageUrl, productListMarketplace.imageUrl) && Intrinsics.c(this.title, productListMarketplace.title) && Intrinsics.c(this.sellerName, productListMarketplace.sellerName) && Intrinsics.c(this.brandName, productListMarketplace.brandName) && Intrinsics.c(this.lowestMarketPriceDescription, productListMarketplace.lowestMarketPriceDescription);
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLowestMarketPriceDescription() {
        return this.lowestMarketPriceDescription;
    }

    @NotNull
    public final String getSellerName() {
        return this.sellerName;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(b.c(b.c(this.imageUrl.hashCode() * 31, 31, this.title), 31, this.sellerName), 31, this.brandName);
        String str = this.lowestMarketPriceDescription;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.sellerName;
        String str4 = this.brandName;
        String str5 = this.lowestMarketPriceDescription;
        StringBuilder sbV = a.v("ProductListMarketplace(imageUrl=", str, ", title=", str2, ", sellerName=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", brandName=", str4, ", lowestMarketPriceDescription=");
        return a.o(sbV, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.title);
        dest.writeString(this.sellerName);
        dest.writeString(this.brandName);
        dest.writeString(this.lowestMarketPriceDescription);
    }
}
