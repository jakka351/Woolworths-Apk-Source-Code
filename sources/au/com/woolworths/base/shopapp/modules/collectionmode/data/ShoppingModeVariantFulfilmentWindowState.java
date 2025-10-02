package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.fulfilment.FulfilmentWindowState;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantFulfilmentWindowState;", "Lau/com/woolworths/base/shopapp/modules/fulfilment/FulfilmentWindowState;", "Landroid/os/Parcelable;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeVariantFulfilmentWindowState implements FulfilmentWindowState, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShoppingModeVariantFulfilmentWindowState> CREATOR = new Creator();
    public final String d;
    public final TextWithAltApiData e;
    public final ButtonApiData f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShoppingModeVariantFulfilmentWindowState> {
        @Override // android.os.Parcelable.Creator
        public final ShoppingModeVariantFulfilmentWindowState createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ShoppingModeVariantFulfilmentWindowState(parcel.readString(), parcel.readInt() == 0 ? null : TextWithAltApiData.CREATOR.createFromParcel(parcel), ButtonApiData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShoppingModeVariantFulfilmentWindowState[] newArray(int i) {
            return new ShoppingModeVariantFulfilmentWindowState[i];
        }
    }

    public ShoppingModeVariantFulfilmentWindowState(String title, TextWithAltApiData textWithAltApiData, ButtonApiData button) {
        Intrinsics.h(title, "title");
        Intrinsics.h(button, "button");
        this.d = title;
        this.e = textWithAltApiData;
        this.f = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeVariantFulfilmentWindowState)) {
            return false;
        }
        ShoppingModeVariantFulfilmentWindowState shoppingModeVariantFulfilmentWindowState = (ShoppingModeVariantFulfilmentWindowState) obj;
        return Intrinsics.c(this.d, shoppingModeVariantFulfilmentWindowState.d) && Intrinsics.c(this.e, shoppingModeVariantFulfilmentWindowState.e) && Intrinsics.c(this.f, shoppingModeVariantFulfilmentWindowState.f);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        TextWithAltApiData textWithAltApiData = this.e;
        return this.f.hashCode() + ((iHashCode + (textWithAltApiData == null ? 0 : textWithAltApiData.hashCode())) * 31);
    }

    public final String toString() {
        return "ShoppingModeVariantFulfilmentWindowState(title=" + this.d + ", subtitle=" + this.e + ", button=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        TextWithAltApiData textWithAltApiData = this.e;
        if (textWithAltApiData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textWithAltApiData.writeToParcel(dest, i);
        }
        this.f.writeToParcel(dest, i);
    }
}
