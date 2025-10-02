package au.com.woolworths.feature.shop.homepage.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.fulfilment.FulfilmentWindowState;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeFulfilmentWindowState;", "Lau/com/woolworths/base/shopapp/modules/fulfilment/FulfilmentWindowState;", "Landroid/os/Parcelable;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomeFulfilmentWindowState implements FulfilmentWindowState, Parcelable {

    @NotNull
    public static final Parcelable.Creator<HomeFulfilmentWindowState> CREATOR = new Creator();
    public final String d;
    public final TextWithAltApiData e;
    public final ButtonApiData f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HomeFulfilmentWindowState> {
        @Override // android.os.Parcelable.Creator
        public final HomeFulfilmentWindowState createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new HomeFulfilmentWindowState(parcel.readString(), (TextWithAltApiData) parcel.readParcelable(HomeFulfilmentWindowState.class.getClassLoader()), (ButtonApiData) parcel.readParcelable(HomeFulfilmentWindowState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HomeFulfilmentWindowState[] newArray(int i) {
            return new HomeFulfilmentWindowState[i];
        }
    }

    public HomeFulfilmentWindowState(String title, TextWithAltApiData textWithAltApiData, ButtonApiData button) {
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
        if (!(obj instanceof HomeFulfilmentWindowState)) {
            return false;
        }
        HomeFulfilmentWindowState homeFulfilmentWindowState = (HomeFulfilmentWindowState) obj;
        return Intrinsics.c(this.d, homeFulfilmentWindowState.d) && Intrinsics.c(this.e, homeFulfilmentWindowState.e) && Intrinsics.c(this.f, homeFulfilmentWindowState.f);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        TextWithAltApiData textWithAltApiData = this.e;
        return this.f.hashCode() + ((iHashCode + (textWithAltApiData == null ? 0 : textWithAltApiData.hashCode())) * 31);
    }

    public final String toString() {
        return "HomeFulfilmentWindowState(title=" + this.d + ", subtitle=" + this.e + ", button=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
