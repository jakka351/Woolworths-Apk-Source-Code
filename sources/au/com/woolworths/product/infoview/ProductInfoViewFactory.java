package au.com.woolworths.product.infoview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/infoview/ProductInfoViewFactory;", "Lau/com/woolworths/product/infoview/InfoViewFactory;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductInfoViewFactory implements InfoViewFactory {

    @NotNull
    public static final Parcelable.Creator<ProductInfoViewFactory> CREATOR = new Creator();
    public final ProductCard d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductInfoViewFactory> {
        @Override // android.os.Parcelable.Creator
        public final ProductInfoViewFactory createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductInfoViewFactory(ProductCard.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductInfoViewFactory[] newArray(int i) {
            return new ProductInfoViewFactory[i];
        }
    }

    public ProductInfoViewFactory(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        this.d = productCard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
    }

    @Override // au.com.woolworths.product.infoview.InfoViewFactory
    public final ProductInfoView x1(FragmentActivity fragmentActivity) {
        ProductInfoView productInfoView = new ProductInfoView(fragmentActivity, null, 6, 0);
        productInfoView.setProductData(this.d);
        return productInfoView;
    }
}
