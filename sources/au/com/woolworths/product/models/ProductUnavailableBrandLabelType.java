package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/product/models/ProductUnavailableBrandLabelType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "<init>", "()V", "backgroundColour", "", "getBackgroundColour", "()I", "borderColour", "getBorderColour", "textColourAttr", "getTextColourAttr", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductUnavailableBrandLabelType implements BrandLabelType {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductUnavailableBrandLabelType> CREATOR = new Creator();
    private final int backgroundColour = R.color.color_black_50;
    private final int borderColour = R.color.color_black_50;
    private final int textColourAttr = android.R.attr.textColorSecondary;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductUnavailableBrandLabelType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductUnavailableBrandLabelType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            parcel.readInt();
            return new ProductUnavailableBrandLabelType();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductUnavailableBrandLabelType[] newArray(int i) {
            return new ProductUnavailableBrandLabelType[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public int getBackgroundColour() {
        return this.backgroundColour;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public int getBorderColour() {
        return this.borderColour;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    @ColorRes
    public /* bridge */ /* synthetic */ int getTextColour() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public int getTextColourAttr() {
        return this.textColourAttr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(1);
    }
}
