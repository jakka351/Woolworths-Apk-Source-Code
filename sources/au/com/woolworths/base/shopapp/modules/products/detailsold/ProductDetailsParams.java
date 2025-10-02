package au.com.woolworths.base.shopapp.modules.products.detailsold;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/products/detailsold/ProductDetailsParams;", "Landroid/os/Parcelable;", "Lau/com/woolworths/base/shopapp/modules/products/detailsold/ProductDetailsData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductDetailsParams implements Parcelable, ProductDetailsData {

    @NotNull
    public static final Parcelable.Creator<ProductDetailsParams> CREATOR = new Creator();
    public final String d;
    public final int e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductDetailsParams> {
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsParams createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductDetailsParams(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductDetailsParams[] newArray(int i) {
            return new ProductDetailsParams[i];
        }
    }

    public ProductDetailsParams(String articleId, int i) {
        Intrinsics.h(articleId, "articleId");
        this.d = articleId;
        this.e = i;
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsParams)) {
            return false;
        }
        ProductDetailsParams productDetailsParams = (ProductDetailsParams) obj;
        return Intrinsics.c(this.d, productDetailsParams.d) && this.e == productDetailsParams.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.p("ProductDetailsParams(articleId=", this.e, this.d, ", launchModule=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e);
    }
}
