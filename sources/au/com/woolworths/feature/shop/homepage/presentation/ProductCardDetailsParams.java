package au.com.woolworths.feature.shop.homepage.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.products.detailsold.ProductDetailsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/ProductCardDetailsParams;", "Landroid/os/Parcelable;", "Lau/com/woolworths/base/shopapp/modules/products/detailsold/ProductDetailsData;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductCardDetailsParams implements Parcelable, ProductDetailsData {

    @NotNull
    public static final Parcelable.Creator<ProductCardDetailsParams> CREATOR = new Creator();
    public final String d;
    public final int e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductCardDetailsParams> {
        @Override // android.os.Parcelable.Creator
        public final ProductCardDetailsParams createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductCardDetailsParams(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductCardDetailsParams[] newArray(int i) {
            return new ProductCardDetailsParams[i];
        }
    }

    public ProductCardDetailsParams(String productArticleId, int i) {
        Intrinsics.h(productArticleId, "productArticleId");
        this.d = productArticleId;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCardDetailsParams)) {
            return false;
        }
        ProductCardDetailsParams productCardDetailsParams = (ProductCardDetailsParams) obj;
        return Intrinsics.c(this.d, productCardDetailsParams.d) && this.e == productCardDetailsParams.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return android.support.v4.media.session.a.p("ProductCardDetailsParams(productArticleId=", this.e, this.d, ", detailsLaunchMode=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e);
    }
}
