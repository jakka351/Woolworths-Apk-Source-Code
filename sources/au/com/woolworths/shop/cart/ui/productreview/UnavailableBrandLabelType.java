package au.com.woolworths.shop.cart.ui.productreview;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/UnavailableBrandLabelType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UnavailableBrandLabelType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<UnavailableBrandLabelType> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnavailableBrandLabelType> {
        @Override // android.os.Parcelable.Creator
        public final UnavailableBrandLabelType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            parcel.readInt();
            return new UnavailableBrandLabelType();
        }

        @Override // android.os.Parcelable.Creator
        public final UnavailableBrandLabelType[] newArray(int i) {
            return new UnavailableBrandLabelType[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public final int getBackgroundColour() {
        return R.color.color_black_50;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public final int getBorderColour() {
        return R.color.color_black_50;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public final int getTextColour() {
        return R.color.color_black_600;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(1);
    }
}
